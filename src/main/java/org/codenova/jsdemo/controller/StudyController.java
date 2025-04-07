package org.codenova.jsdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/day01")
public class StudyController {

    @GetMapping("intro")
    public String introHandle(){

        return "day01/intro";
    }

    @GetMapping("example01")
    public String example01Handle(){

        return "day01/example01";
    }
}
