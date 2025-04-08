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


}
