package org.codenova.jsdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/fetch")
public class FetchController {


    @GetMapping("/intro")
    public String intro() {
        return "fetch/intro";
    }
    
    // 이 경로는 사용자에게 공개되는 endPoint 처리용은 , javascript 통신 처리용 (@ResponseBody 라고 설정)
    @GetMapping("/destination")
    @ResponseBody
    public String destination() throws InterruptedException {
        Thread.sleep(4000);
        if(Math.random()<0.5) {
            return "success";
        }else {
            return "failed";
        }

    }
    
    
    
}
