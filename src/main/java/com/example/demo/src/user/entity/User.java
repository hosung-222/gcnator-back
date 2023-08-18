package com.example.demo.src.user.entity;

import com.example.demo.src.user.dto.LoginDto;
import com.example.demo.utils.entity.BaseEntity;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.jetbrains.annotations.NotNull;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Getter
public class User extends BaseEntity {
    private String userName;
    private int student_num;
    private String department;
    private String university;

    public void setUser(LoginDto loginDto){
        userName = loginDto.getUserName();
        student_num = loginDto.getStudentNum();
        department = loginDto.getDepartment();
        university = "가천대학교";
    }
}

