package com.projectA.testService1.controllers;

import com.projectA.testService1.payloads.Data;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class Test {

    @RequestMapping(path = "/get", method = RequestMethod.GET)
    public Data getTestData(){

        Data payload = new Data(15, "test_string");
        return payload;
    }

}
