package com.tatsuaki.study.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EntranceController {

    @GetMapping
    public String entrance() {
        return "entrance";
    }

}
