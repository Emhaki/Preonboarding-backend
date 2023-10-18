package com.backend.preonboarding.dto;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RecruitmentDTO {

    private Long companyId;
    private String recruitmentPosition;
    private Long recruitmentAmount;
    private String recruitmentContent;
    private String language;

}
