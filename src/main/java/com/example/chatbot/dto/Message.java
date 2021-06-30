package com.example.chatbot.dto;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter

public class Message {
	private MessageType type;
    private String content;
    private String sender;
    
    public enum MessageType {
        CHAT, JOIN, LEAVE
    }
}
