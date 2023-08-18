package com.example.demo.src.question;

import io.swagger.annotations.Api;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/questions")
@Api(tags = "질문 받기")
public class QuestionController {
    private final QuestionService questionService;
    private final QuestionRepository questionRepository;
}
