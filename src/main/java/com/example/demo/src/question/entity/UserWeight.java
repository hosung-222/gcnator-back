package com.example.demo.src.question.entity;

import com.example.demo.src.user.entity.User;
import com.example.demo.utils.entity.BaseEntity;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.jetbrains.annotations.NotNull;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class UserWeight extends BaseEntity {
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "category_id")
    private Category category;

    private int weight;

    public void addWeight(int weight){
        this.weight += weight;
    }
}
