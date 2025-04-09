package org.codenova.jsdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/dive")
public class DiveStudyController {

    @GetMapping("/example01")
    public String example01(){
        return "dive/example01";
    }

    @GetMapping("/example02")
    public String example02(){
        return "dive/example02";
    }

    @GetMapping("/example03")
    public String example03(){
        return "dive/example03";
    }

    @GetMapping("/example04")
    public String example04(){
        return "dive/example04";
    }

    @GetMapping("/example05")
    public String example05(){
        return "dive/example05";
    }

    @GetMapping("/example06")
    public String example06(){
        return "dive/example06";
    }

    @GetMapping("/example07")
    public String example07(){
        return "dive/example07";
    }

    @GetMapping("/example08")
    public String example08(){
        return "dive/example08";
    }

    @GetMapping("/example09")
    public String example09(){
        return "dive/example09";
    }

}
