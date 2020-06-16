package com.rahul.covid19api;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.Collections;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.*;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

/** @author Micgogi on 6/5/2020 4:45 PM Rahul Gogyani */
@Component
public class CovidRestClient {
  @Value("${rapidapi.covid.url}")
  String covidUrl;

  @Value("${rapidapi.key.name}")
  String apiKeyName;

  @Value("${rapidapi.key.value}")
  String apiKeyValue;

  @Value("${rapidapi.host.name}")
  String hostName;

  @Value("${rapidapi.host.covid.value}")
  String hostValue;

  RestTemplate restTemplate;

  public CovidRestClient(RestTemplateBuilder restTemplateBuilder) {
    restTemplate = restTemplateBuilder.build();
  }

  public Covid19Data getTotal() {
    Covid19Data total = null;
    try {
      URI uri = new URI(covidUrl);
      HttpHeaders header = new HttpHeaders();
      header.set(apiKeyName, apiKeyValue);
      header.set(hostName, hostValue);
      header.setContentType(MediaType.APPLICATION_JSON);
      header.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
      HttpEntity<String> request = new HttpEntity<String>(header);
      ResponseEntity<Covid19Data[]> totalEntity =
          restTemplate.exchange(uri, HttpMethod.GET, request, Covid19Data[].class);
      total = totalEntity.getBody()[0];

    } catch (URISyntaxException e) {

    }
    return total;
  }
}
