package com.example.demo.src.chatGPT.dto;
;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class ChatGPTRes {
    private String dropout;

    public ChatGPTRes(String dropout) {
        this.dropout = dropout;
    }
}
