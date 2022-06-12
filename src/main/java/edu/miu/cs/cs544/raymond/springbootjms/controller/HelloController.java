package edu.miu.cs.cs544.raymond.springbootjms.controller;

import edu.miu.cs.cs544.raymond.springbootjms.jms.Sender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {

    @Autowired
    private Sender sender;

    @GetMapping("/send/{text}")
    public void sendMessage(@PathVariable String text){
        sender.send(text);
    }
}
