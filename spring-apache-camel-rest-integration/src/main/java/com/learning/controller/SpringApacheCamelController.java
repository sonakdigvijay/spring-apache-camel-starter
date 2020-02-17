package com.learning.controller;

import org.apache.camel.ProducerTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/camel")
public class SpringApacheCamelController {

    @Autowired
    private ProducerTemplate producerTemplate;

    @RequestMapping(value = "/marco")
    public String polo() {
        return "polo";
    }

    @RequestMapping(value = "/sendit")
    public void publishMessageToCamel(@RequestParam(name = "message")String message) {
        producerTemplate.sendBody("direct:commonCamelRoute", message);
    }
}
