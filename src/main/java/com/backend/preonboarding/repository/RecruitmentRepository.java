package com.backend.preonboarding.repository;

import com.backend.preonboarding.dto.RecruitmentDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RecruitmentRepository extends JpaRepository<RecruitmentDTO, Long> {

}
