package com.example.demo.src.question;

import com.example.demo.src.question.entity.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
@EnableJpaRepositories
public interface QuestionRepository extends JpaRepository<Question,Long> {
}
