package com.example.Student.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Student.Entity.Screen;

public interface ScreenRepository extends JpaRepository<Screen, Integer> {
	
	public Screen findByName(String name);
}