package com.backend.preonboarding.controller;

import com.backend.preonboarding.service.RecruitmentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@Controller
public class RecruitmentController {

    private RecruitmentService recruitmentService;
    @PostMapping("/job")
    public ResponseEntity<String> postJobOffer(@RequestParam Map<String, Object> paramMap) {
        try {
            // 등록서비스
            recruitmentService.RecruitmentPost(paramMap);
            return ResponseEntity.ok("success");
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error: " + e.getMessage());
        }
    }

}
