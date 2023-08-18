package com.example.demo.src.user;

import com.example.demo.src.user.dto.LoginDto;
import com.example.demo.src.user.entity.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class UserService {
    private final UserRepository userRepository;

    @Transactional
    public void login(LoginDto loginDto) {
        User user = new User();
        user.setUser(loginDto);
        userRepository.save(user);
    }
}