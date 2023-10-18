package com.backend.preonboarding.controller;

import com.backend.preonboarding.service.RecruitmentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Map;

@Controller
@RequiredArgsConstructor
public class RecruitmentController {


    private final RecruitmentService recruitmentService;

    @PostMapping("/job")
    public ResponseEntity<String> postJobOffer(@RequestParam Map<String, Object> paramMap) throws Exception {
        recruitmentService.RecruitmentPost(paramMap);
        return ResponseEntity.ok("success");

    }

    @PostMapping("/job/update")
    public ResponseEntity<String> updateJobOffer(@RequestParam Map<String, Object> paramMap) throws Exception {
        recruitmentService.RecruitmentUpdate(paramMap);
        return ResponseEntity.ok("success");
    }

    @PostMapping("/job/delete")
    public ResponseEntity<String> deleteJobOffer(@RequestParam(name = "CompanyId") Long companyId) throws Exception {
        recruitmentService.RecruitmentDelete(companyId);
        return ResponseEntity.ok("success");
    }
    // 사용자 채용공고
 /*   @GetMapping("/recruit")
    public ResponseEntity<List<String>> getRecruitList() {
        *//*recruitmentService.*//*
    }*/
}
