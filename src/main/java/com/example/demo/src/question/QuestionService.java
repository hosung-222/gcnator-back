package com.example.demo.src.question;

import com.example.demo.config.BaseException;
import com.example.demo.config.BaseResponseStatus;
import com.example.demo.src.question.dto.QuestionRes;
import com.example.demo.src.question.entity.Answer;
import com.example.demo.src.question.entity.Question;
import com.example.demo.utils.entity.BaseEntity;
import com.example.demo.utils.entity.Status;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.*;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class QuestionService {
    private final QuestionRepository questionRepository;
    private final AnswerRepository answerRepository;

    public QuestionRes sendQuestion(Long userId) {
        List<Answer> userQuestion = answerRepository.findByUserIdAndStatus(userId, Status.A);
        ArrayList<Long> array = new ArrayList<>();
        for (Answer a : userQuestion){
            array.add(a.getQuestion().getId());
        }

        // 범위 내에서 랜덤 아이디를 가지고 옴
        Long length = questionRepository.count();
        Long questionId = null;
        while(true) {
            Random random = new Random();
            Long idx = Math.abs(random.nextLong() % length) + 1;

            if(!array.contains(idx)) {
                questionId = idx;
                break;
            }
        }

        Optional<Question> question = questionRepository.findById(questionId);
//        if(!question.isPresent()) throw new BaseException(BaseResponseStatus.SERVER_ERROR);

        Question q = question.get();
        return new QuestionRes(q.getId(), q.getQuestion(), true, userId);
    }
}
