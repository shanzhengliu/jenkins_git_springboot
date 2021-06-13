package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

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

    //region test
    @GetMapping("/var")
    public String var()
    {
        ArrayList<String> strings = new ArrayList<>();

        return "test";
    }
    //endregion



}
