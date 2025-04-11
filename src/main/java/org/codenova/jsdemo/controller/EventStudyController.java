package org.codenova.jsdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/event")
public class EventStudyController {

    @GetMapping("/intro")
    public String intro() {
        return "event/intro";
    }

    @GetMapping("/example01")
    public String example01() {
        return "event/example01";
    }

    @GetMapping("/example02")
    public String example02() {
        return "event/example02";
    }


}
