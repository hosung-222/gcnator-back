package com.example.demo.src.question;

import com.example.demo.src.question.dto.AnswerDto;
import com.example.demo.src.question.entity.Answer;
import com.example.demo.src.question.entity.Question;
import com.example.demo.src.question.entity.UserWeight;
import com.example.demo.src.user.UserRepository;
import com.example.demo.src.user.entity.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AnswerService {
    private final AnswerRepository answerRepository;
    private final CategoryRepository categoryRepository;
    private final UserWeightRepository userWeightRepository;
    private final QuestionRepository questionRepository;
    private final UserRepository userRepository;

    public void postResult(AnswerDto answerDto, Long userId) {

        // 응답 중복 방지 저장용 테이블에 추가
        Answer answer = new Answer();
        Question question = questionRepository.getReferenceById(answerDto.getQuestionId());
        answer.setQuestion(question);
        User user = userRepository.getReferenceById(userId);
        answer.setUser(user);
        answer.setCategory(question.getCategory());

        //유저 카테고리별 가중치 추가
        Boolean existsWeight = userWeightRepository.existsByUserIdAndCategory(userId, question.getCategory());
        // 해당 카테고리에 대한 가중치가 이미 있다면
        if(existsWeight) {
            UserWeight userWeight = userWeightRepository.findByUserAndCategory(user, question.getCategory());
            userWeight.addWeight(answerDto.getScore());
            userWeightRepository.save(userWeight);
        }
        // 해당 카테고리 가중치가 없다면 생성해주기
        else {
            UserWeight userWeight = new UserWeight();
            userWeight.setWeight(answerDto.getScore());
            userWeight.setCategory(question.getCategory());
            userWeight.setUser(user);
            userWeightRepository.save(userWeight);
        }
        answerRepository.save(answer);

    }
}
