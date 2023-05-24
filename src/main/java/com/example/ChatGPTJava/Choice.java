package com.example.ChatGPTJava;

import lombok.*;

@Data
@AllArgsConstructor
public class Choice {
    private Message message;

    public Choice() {}
}