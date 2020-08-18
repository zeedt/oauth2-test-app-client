package com.zeed.test.oauth2.client.test.app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyRestController {

    @GetMapping("/message")
    public String heyMessage() {
        return "Hey";
    }

}
