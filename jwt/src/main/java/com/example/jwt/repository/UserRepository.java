package com.example.jwt.repository;

import com.example.jwt.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity, Integer> {

    //exists는 특정 조건을 만족하는 데이터가 존재하는지 확인할 때 사용
    Boolean existsByUsername(String username);

    //username을 받아 DB 테이블에서 회원을 조회하는 메소드 작성
    UserEntity findByUsername(String username);
}
