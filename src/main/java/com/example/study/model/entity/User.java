package com.example.study.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@Entity // == table
//@Table(name = "user")   //class이름 == DB Table이름 이라면 JPA에서 자동매칭해줌
public class User {
    @Id //식별자
    @GeneratedValue(strategy = GenerationType.IDENTITY) //어떤식으로 관리할 것인지에 대한 전략옵션
    private Long id;

    //@Column(name = "account")   //변수명 == column 이름 동일하다면 자동매칭
    private String account;

    private String email;

    private String phoneNumber;

    private LocalDateTime createdAt;

    private String createdBy;

    private LocalDateTime updatedAt;

    private String updatedBy;

    public User() {

    }
}
