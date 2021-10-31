package com.example.webmusicsheet.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RequiredArgsConstructor
@RestController
public class MainController {

    @GetMapping({"", "/"})
    public String heartBeat() {

        return "server is alive!!!!";
    }
}