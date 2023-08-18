package com.example.demo.src.question.entity;

import com.example.demo.utils.entity.BaseEntity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class Question extends BaseEntity {
    @Id
    private Long id;

    private String question;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "category_id")
    private Category category;
    private int weight;

}
