package com.rahul.springcloudgatewayservice;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Micgogi
 * on 6/3/2020  3:43 PM
 * Rahul Gogyani
 */
@EnableHystrix
@Configuration
public class GatewayConfiguration {

    @Bean
    public RouteLocator myRoutes(RouteLocatorBuilder builder) {
        return builder.routes()
                .route(p -> p
                        .path("/all")
                        .filters(f ->
                                f.addRequestHeader("x-rapidapi-host", "restcountries-v1.p.rapidapi.com")
                                        .addRequestHeader("x-rapidapi-key", "77e546409emshd5e5ac01eb17b05p1d5036jsnb79d876bae91")
                                        .hystrix(config -> config.setName("countries-service")
                                                .setFallbackUri("forward:/countriesfallback"))
                        )
                        .uri("https://restcountries-v1.p.rapidapi.com")
                )
                .route(p -> p
                        .path("/v1/joke")
                        .filters(f ->
                                f.addRequestHeader("x-rapidapi-host", "joke3.p.rapidapi.com")
                                        .addRequestHeader("x-rapidapi-key", "77e546409emshd5e5ac01eb17b05p1d5036jsnb79d876bae91")
                                        .hystrix(config -> config.setName("joke-service")
                                                .setFallbackUri("forward:/jokefallback"))).uri("https://joke3.p.rapidapi.com")
                ).build();
    }
}
