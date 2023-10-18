package com.backend.preonboarding.service;

import com.backend.preonboarding.dto.RecruitmentDTO;
import com.backend.preonboarding.repository.RecruitmentRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@Service
public class RecruitmentService {

    private RecruitmentRepository recruitmentRepository;
    public void RecruitmentPost(@RequestParam Map<String, Object> paramMap) {

        RecruitmentDTO recruitment = new RecruitmentDTO();
        recruitment.setRecruitmentPosition((String)paramMap.get("position"));
        recruitment.setRecruitmentAmount((Long)paramMap.get("Amount"));
        recruitment.setRecruitmentContent((String)paramMap.get("Content"));
        recruitment.setLanguage((String)paramMap.get("Language"));
        recruitmentRepository.save(recruitment);
    }
}
