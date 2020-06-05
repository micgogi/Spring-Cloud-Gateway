package com.rahul.covid19api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Micgogi
 * on 6/5/2020  5:00 PM
 * Rahul Gogyani
 */
@RestController
public class CovidRestController {

    @Autowired
    CovidRestClient covidRestClient;
    @RequestMapping(value = "/getdata",method = RequestMethod.GET,produces =  { "application/json" })
    public ResponseEntity<Covid19Data> getdata(){
         return  new ResponseEntity<Covid19Data>(covidRestClient.getTotal(), HttpStatus.OK);
     }
}
