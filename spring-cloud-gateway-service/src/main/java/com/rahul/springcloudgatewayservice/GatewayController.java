package com.rahul.springcloudgatewayservice;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

/**
 * @author Micgogi
 * on 6/3/2020  3:59 PM
 * Rahul Gogyani
 */

@RestController
public class GatewayController {
    @RequestMapping("/countriesfallback")
    public Mono<String> countries() {
        return Mono.just("Countries API is taking too long to respond or is down. Please try again later");
    }
    @RequestMapping("/jokefallback")
    public Mono<String> joke(){
        return Mono.just("Joke API is taking too long to respond or is down. Please try again later");
    }
}
