package com.example.demo.repo;

import USER_VO.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MemberRepository extends JpaRepository<User, Long> {
    Optional<User> findByUsername(String username);
}
