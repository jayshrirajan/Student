package com.example.Student.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Student.Entity.Permission;

@Repository
public interface PermissionRepository extends JpaRepository<Permission, Integer> {

	
}