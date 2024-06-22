package com.loa.moabackend.chat.controller;

import com.loa.moabackend.chat.model.domain.Message;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class ChatController {

    @MessageMapping("/chat.sendMessage") // Defines the endpoint ("/app/chat.sendMessage") for sending messages
    @SendTo("/topic/public") // Sends the response to clients subscribed to "/topic/public"
    public Message sendMessage(Message message) {
        return message;
    }

    @MessageMapping("/chat.addUser") // Defines the endpoint ("/app/chat.addUser") for adding users
    @SendTo("/topic/public") // Sends the response to clients subscribed to "/topic/public"
    public Message addUser(Message message) {
        return message;
    }
}