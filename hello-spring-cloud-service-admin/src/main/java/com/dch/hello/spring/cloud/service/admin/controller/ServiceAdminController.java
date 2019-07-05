package com.dch.hello.spring.cloud.service.admin.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceAdminController {

    @RequestMapping(value = "hi", method = RequestMethod.GET)
    public String sayHi(String message) {
        return String.format("message is %s", message);
    }
}
