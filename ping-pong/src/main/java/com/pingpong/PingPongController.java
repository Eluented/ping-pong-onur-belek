package com.pingpong;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PingPongController {
    
    @RequestMapping("/ping")
    public String pong(){
        return "Pong";
    }
}
