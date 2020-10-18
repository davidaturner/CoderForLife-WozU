package com.fullstackproject.auth;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserData, Long> {
  UserData findByUsername(String username);
}
