package com.example.chattingserver.Controller;

import org.apache.logging.log4j.message.Message;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class ChatController {
    @MessageMapping("/hello")
    @SendTo("/topic/roomId")
    public Message broadCast(Message message){
        return message;
    }
}
