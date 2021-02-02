package com.example.study.repository;

import com.example.study.model.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
//따로 쿼리문 작성하지 않아도 기본적인 CRUD 실행가능
public interface UserRepository extends JpaRepository<User, Long> {
    
}
