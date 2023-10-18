package com.backend.preonboarding.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "\"recruitment\"")
public class Recruitment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long recruitId;

    @Column(name = "position")
    private String recruitmentPosition;
    @Column(name = "amount")
    private Long recruitmentAmount;
    @Column(name = "content")
    private String recruitmentContent;
    @Column(name = "language")
    private String language;
}
