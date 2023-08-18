package com.example.demo.src.question.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
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

    public void setQuestion(String question) {

        this.question = question;
    }
}
