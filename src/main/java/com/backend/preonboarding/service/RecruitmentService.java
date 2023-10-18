package com.backend.preonboarding.service;

import com.backend.preonboarding.domain.Recruitment;
import com.backend.preonboarding.dto.RecruitmentDTO;
import com.backend.preonboarding.repository.RecruitmentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@Service
@RequiredArgsConstructor
public class RecruitmentService {

    private final RecruitmentRepository recruitmentRepository;
    public void RecruitmentPost(@RequestParam Map<String, Object> paramMap) {
        String amount = (String)paramMap.get("Amount");

        Recruitment recruitment = new Recruitment();
        recruitment.setRecruitmentPosition((String)paramMap.get("Position"));
        recruitment.setRecruitmentAmount(Long.parseLong(amount));
        recruitment.setRecruitmentContent((String)paramMap.get("Content"));
        recruitment.setLanguage((String)paramMap.get("Language"));

        recruitmentRepository.save(recruitment);
    }

/*    public void RecruitmentUpdate(@RequestParam Map<String,Object> paramMap) {
        (String) paramMap.get("")
        recruitmentRepository.findById();
    }*/
}
