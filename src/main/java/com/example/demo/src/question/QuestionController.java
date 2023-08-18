package com.example.demo.src.question;

import com.example.demo.config.BaseResponse;
import com.example.demo.src.question.dto.AnswerDto;
import com.example.demo.src.question.dto.QuestionRes;
import io.swagger.annotations.Api;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/questions")
@Api(tags = "질문 받기")
public class QuestionController {
    private final QuestionService questionService;
    private final QuestionRepository questionRepository;
    private final AnswerService answerService;

    @GetMapping("/{userId}")
    public BaseResponse<QuestionRes> sendQuestion(@PathVariable Long userId) {
        QuestionRes questionRes = questionService.sendQuestion(userId);
        return new BaseResponse<>(questionRes);
    }

    @PostMapping("/{userId}")
    public BaseResponse<String> getResult (@RequestBody AnswerDto answerDto, @PathVariable("userId") Long userId){
        answerService.postResult(answerDto, userId);
        return new BaseResponse<>(answerDto.getQuestionId() + "번 응답 완료");
    }

}
