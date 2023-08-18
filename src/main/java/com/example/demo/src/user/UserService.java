package com.example.demo.src.user;

import com.example.demo.src.question.CategoryRepository;
import com.example.demo.src.question.UserWeightRepository;
import com.example.demo.src.question.entity.Category;
import com.example.demo.src.question.entity.UserWeight;
import com.example.demo.src.user.dto.LoginDto;
import com.example.demo.src.user.entity.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class UserService {
    private final UserRepository userRepository;
    private final UserWeightRepository userWeightRepository;
    private final CategoryRepository categoryRepository;

    @Transactional
    public void login(LoginDto loginDto) {
        User user = new User();
        user.setUser(loginDto);

        // 회원가입시 모든 카테고리에 대하여 가중치 다 0 으로 셋팅해야함
        List<Category> categories = categoryRepository.findAll();
        for (Category c :categories){
            UserWeight userWeight = new UserWeight();
            userWeight.setUser(user);
            userWeight.setWeight(0);
            userWeight.setCategory(c);
            userWeightRepository.save(userWeight);
        }
        userRepository.save(user);
    }
}