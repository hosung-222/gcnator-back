package com.example.demo.src.dropout.entity;

import com.example.demo.utils.entity.BaseEntity;
import lombok.Getter;
import lombok.Setter;
import org.jetbrains.annotations.NotNull;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity(name = "dropout")
@Getter @Setter
public class Dropout extends BaseEntity {
    @NotNull
    private String letter;
}
