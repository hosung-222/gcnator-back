package com.example.demo.src.dropout;

import io.swagger.annotations.Api;
import lombok.RequiredArgsConstructor;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/dropout")
@Api(tags = "자퇴서")
public class DropoutController {
    private final DropoutService dropoutService;


    /**
     * 자퇴서 반환 API
     */
//    public String getDropout(int )




}
