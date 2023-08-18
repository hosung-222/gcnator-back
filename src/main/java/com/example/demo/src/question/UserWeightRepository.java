package com.example.demo.src.question;

import com.example.demo.src.question.entity.Category;
import com.example.demo.src.question.entity.Question;
import com.example.demo.src.question.entity.UserWeight;
import com.example.demo.src.user.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@Repository
@EnableJpaRepositories
public interface UserWeightRepository extends JpaRepository<UserWeight,Long> {
    Boolean existsByUserIdAndCategory(Long userId, Category category);


    UserWeight findByUserAndCategory(User user, Category category);
}
