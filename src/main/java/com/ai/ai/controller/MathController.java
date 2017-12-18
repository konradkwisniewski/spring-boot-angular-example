package com.ai.ai.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/math")
public class MathController {

    @RequestMapping(value = "/add/{s1}/{s2}" , method = RequestMethod.GET)
    Integer sumowanie(@PathVariable("s1") Integer skladnikPierwszy, @PathVariable("s2") Integer skladnikDrugi) {
        return skladnikPierwszy + skladnikDrugi;
    }

    @RequestMapping(value = "/sub/{s1}/{s2}" , method = RequestMethod.GET)
    Integer odejmowanie(@PathVariable("s1") Integer skladnikPierwszy, @PathVariable("s2") Integer skladnikDrugi) {
        return skladnikPierwszy - skladnikDrugi;
    }
}
