package com.example.demo.src.question.entity;

import com.example.demo.utils.entity.BaseEntity;
import lombok.Getter;
import lombok.Setter;
import org.jetbrains.annotations.NotNull;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity(name = "category")
@Getter @Setter
public class Category extends BaseEntity {
    @NotNull
    private String category;
}
