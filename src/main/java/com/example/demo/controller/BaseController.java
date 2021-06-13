package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BaseController {
    @GetMapping("/")
    public String index()
    {
     return "hello world";
    }

    //region test
    @GetMapping("/test")
    public String test()
    {
        return "test";
    }
    //endregion
}
