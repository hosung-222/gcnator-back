package com.example.demo.src.question;

import com.example.demo.src.question.entity.Category;
import com.example.demo.src.question.entity.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@Repository
@EnableJpaRepositories
public interface CategoryRepository extends JpaRepository<Category,Long> {
}
