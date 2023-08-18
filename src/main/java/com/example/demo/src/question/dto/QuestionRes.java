package com.example.demo.src.question.dto;

import lombok.Getter;

@Getter
public class QuestionRes {
    private Long questionId;
    private Long userId;
    private String question;
    private Boolean lastQuestion;

    public QuestionRes(Long id, String question, boolean lastQuestion, Long userId) {
        this.questionId = id;
        this.question = question;
        this.lastQuestion = lastQuestion;
        this.userId = userId;
    }
}
