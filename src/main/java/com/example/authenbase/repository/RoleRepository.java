package com.example.authenbase.repository;

import com.example.authenbase.constant.ERole;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.management.relation.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Role findByName(ERole name);
}
