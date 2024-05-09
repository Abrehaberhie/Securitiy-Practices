package com.binary.springSecurityPractise;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hi")
public class Controller {
    @GetMapping
    public String gethello()
    {
        return "this is spring security project plain";
    }
    @GetMapping("/one")
    public String gethelloOne()
    {
        return "this is spring security project one";
    }
    @GetMapping("/two")
    public String gethelloTwo()
    {
        return "this is spring security project two";
    }
    @GetMapping("/three")
    public String gethelloThree()
    {
        return "this is spring security project three";
    }
}
