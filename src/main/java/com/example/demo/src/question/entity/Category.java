package com.example.demo.src.question.entity;

import com.example.demo.utils.entity.BaseEntity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;

@Entity
@Getter
@Setter
public class Category extends BaseEntity {
    private String category;
}
