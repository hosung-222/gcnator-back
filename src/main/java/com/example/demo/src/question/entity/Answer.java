package com.example.demo.src.question.entity;

import com.example.demo.src.user.entity.User;
import com.example.demo.utils.entity.BaseEntity;
import lombok.Getter;
import lombok.Setter;
import org.jetbrains.annotations.NotNull;

import javax.persistence.*;

@Entity(name = "answer")
@Getter @Setter
public class Answer extends BaseEntity {
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id") @NotNull
    private User user;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "category_id") @NotNull
    private Category category;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "question_id") @NotNull
    private Question question;
}
