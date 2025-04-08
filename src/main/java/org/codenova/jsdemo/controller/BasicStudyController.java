package org.codenova.jsdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/basic")
public class BasicStudyController {

    @GetMapping("/intro")
    public String introHandle(){

        return "basic/intro";
    }

    @GetMapping("/example01")
    public String example01Handle(){

        return "basic/example01";
    }

    @GetMapping("/example02")
    public String example02Handel(){

        return "basic/example02";
    }

    @GetMapping("/example03")
    public String example03Handel(){

        return "basic/example03";
    }

    @GetMapping("/example04")
    public String example04Handel(){

        return "basic/example04";
    }

    @GetMapping("/example05")
    public String example05Handel(){

        return "basic/example05";
    }

    @GetMapping("/example06")
    public String example06Handel(){

        return "basic/example06";
    }

}
