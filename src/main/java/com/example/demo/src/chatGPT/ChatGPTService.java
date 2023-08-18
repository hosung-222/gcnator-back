package com.example.demo.src.chatGPT;

import com.example.demo.config.BaseException;
import com.example.demo.config.BaseResponseStatus;
import com.example.demo.src.chatGPT.dto.ChatGPTRes;
import io.github.flashvayne.chatgpt.service.ChatgptService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ChatGPTService {
    public final ChatgptService chatGPTInterface;

    public ChatGPTRes getDropout(String question) throws BaseException {
        try{
            String response = chatGPTInterface.sendMessage(question);
            System.out.println(response);


            return new ChatGPTRes(response);
        } catch (Exception exception) {
            throw new BaseException(BaseResponseStatus.SERVER_ERROR);
        }
    }

}
