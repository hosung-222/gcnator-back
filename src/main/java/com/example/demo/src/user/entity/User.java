package com.example.demo.src.user.entity;

import com.example.demo.utils.entity.BaseEntity;
import lombok.Data;

import javax.persistence.Entity;

@Entity
@Data
public class User extends BaseEntity {
    private int student_num;
    private String department;
    private String university;
}
