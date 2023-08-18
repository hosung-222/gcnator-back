package com.example.demo.src.user;

import com.example.demo.config.BaseResponse;
import com.example.demo.src.question.QuestionService;
import com.example.demo.src.user.dto.LoginDto;
import io.swagger.annotations.Api;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/users")
@Api(tags = "유저")
public class UserController {
    private final UserService userService;
    private final UserRepository userRepository;

    /**

     로그인 API
     @param loginDto
     @return*/
    @PostMapping("/login")
    public BaseResponse login (@RequestBody LoginDto loginDto){
        userService.login(loginDto);
        return new BaseResponse<>(loginDto.getUserName() + "님 환영합니다.");}



}