package com.beans.erp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.beans.erp.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByUsernameAndPassword(String username, String password);

    User findByUsername(String username);

    // 이 부분을 추가
    User findByEmail(String email);
}
