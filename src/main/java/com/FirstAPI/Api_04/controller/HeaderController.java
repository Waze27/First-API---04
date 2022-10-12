package com.FirstAPI.Api_04.controller;

import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/headers")
public class HeaderController {

    @GetMapping(value = "")
    public String headers(@RequestHeader(HttpHeaders.HOST) String host, @RequestHeader(HttpHeaders.USER_AGENT) String user) {
        return "Host port: " + host + " Host name: " + user;
    }
}
