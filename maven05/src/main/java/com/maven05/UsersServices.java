package com.maven05;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersServices extends JpaRepository<Users, Integer> {
}
