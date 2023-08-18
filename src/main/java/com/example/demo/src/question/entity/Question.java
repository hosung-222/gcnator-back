package com.example.demo.src.question.entity;

import com.example.demo.utils.entity.BaseEntity;
import lombok.Getter;
import lombok.Setter;
import org.jetbrains.annotations.NotNull;

import javax.persistence.*;

@Entity(name = "question")
@Getter @Setter
public class Question extends BaseEntity {
    @NotNull
    private String question;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "category_id") @NotNull
    private Category category;
    private int weight;

}
