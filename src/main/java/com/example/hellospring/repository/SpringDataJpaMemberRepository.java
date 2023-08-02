package com.example.hellospring.repository;

import com.example.hellospring.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface SpringDataJpaMemberRepository extends JpaRepository<Member, Long>, MemberRepository { // 인터페이스가 인터페이스를 상속 받을 때는 extends를 붙인다.

    // JPQL :  select m from Member m where m.name = ?
    // 메소드명이 findByXXXX 로 해두면 Spring Data Jpa에서 JPQL로 쿼리를 만들어서 조회해온다.
    @Override
    Optional<Member> findByName(String name);
}
