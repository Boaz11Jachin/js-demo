package org.codenova.jsdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/dom")
public class DomStudyController {

    @GetMapping("/intro")
    public String introHandle(){
        return "dom/intro";
    }

    @GetMapping("/traverse1")
    public String domTraverseHandle(){
        return "dom/traverse1";
    }

    @GetMapping("/traverse2")
    public String domTraverse2Handle(){
        return "dom/traverse2";
    }

}
