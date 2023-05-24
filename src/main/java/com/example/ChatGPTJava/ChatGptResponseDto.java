package com.example.ChatGPTJava;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

@Getter
@NoArgsConstructor
public class ChatGptResponseDto implements Serializable {

    private String model;
    private List<Choice> choices;

    @Builder
    public ChatGptResponseDto(String model,
                              List<Choice> choices) {
        this.model = model;
        this.choices = choices;
    }
}