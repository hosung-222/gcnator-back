package com.example.demo.src.chatGPT;

import com.example.demo.config.BaseException;
import com.example.demo.config.BaseResponse;
import com.example.demo.src.chatGPT.dto.ChatGPTRes;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
@RequiredArgsConstructor
@RequestMapping("/gpt")
public class ChatGPTController {

    private final ChatGPTService chatGPTService;

    /* ChatGPT API 연동 */
    @GetMapping("/")
    public String index() {
        return "index";
    }

    @PostMapping("/dropout")
    public BaseResponse<ChatGPTRes> getDropout(@RequestParam String question) {
        try {
            ChatGPTRes chatGPTRes = chatGPTService.getDropout(question);
            return new BaseResponse<>(chatGPTRes);
        } catch (BaseException exception) {
            return new BaseResponse<>(exception.getStatus());
        }
    }
}
