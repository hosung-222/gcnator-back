package com.example.demo.src.question.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AnswerDto {
    private Long questionId;
    private int score;
    private Long categoryId;
}
