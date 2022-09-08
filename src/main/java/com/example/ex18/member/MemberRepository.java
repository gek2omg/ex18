package com.example.ex18.member;

import com.example.ex18.member.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

// JpaRepository 는 기본적으로 CRUD 를 지원
public interface MemberRepository extends JpaRepository<Member, Long> {
}
