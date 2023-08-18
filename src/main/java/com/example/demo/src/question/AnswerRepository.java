package com.example.demo.src.question;

import com.example.demo.src.question.entity.Answer;
import com.example.demo.src.question.entity.Question;
import com.example.demo.utils.entity.Status;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@EnableJpaRepositories
public interface AnswerRepository extends JpaRepository<Answer,Long> {
    List<Answer> findByUserIdAndStatus(Long userId, Status status);
}
