package com.example.demo.src.user;

import com.example.demo.src.question.QuestionService;
import io.swagger.annotations.Api;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/questions")
@Api(tags = "질문 받기")
public class UserController {
    private final UserService userService;
    private final UserRepository userRepository;
}
