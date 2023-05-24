package com.example.ChatGPTJava;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/chat-gpt")
public class ChatGptController {
    private final ChatGptService chatGptService;

    public ChatGptController(ChatGptService chatGptService) {
        this.chatGptService = chatGptService;
    }

    @PostMapping("/question")
    public List<ChatGptResponseDto> sendQuestion(@RequestBody String question) {
        List<ChatGptResponseDto> chatGptResponseDtos = new ArrayList<>();
        chatGptResponseDtos.add(chatGptService.askQuestion(question));
        return chatGptResponseDtos;
    }
}