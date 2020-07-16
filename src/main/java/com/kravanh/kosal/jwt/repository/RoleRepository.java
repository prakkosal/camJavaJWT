package com.kravanh.kosal.jwt.repository;

import com.kravanh.kosal.jwt.models.ERole;
import com.kravanh.kosal.jwt.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(ERole name);
}