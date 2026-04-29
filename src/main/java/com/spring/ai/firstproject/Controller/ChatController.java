package com.spring.ai.firstproject.Controller;


import com.spring.ai.firstproject.Service.ChatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ChatController {

    private ChatService chatservice;

    public ChatController(ChatService chatservice) {
        this.chatservice = chatservice;
    }

    @GetMapping("/chat")
    public String chat(@RequestParam String message) {
        return chatservice.getResponse(message);

    }

}}