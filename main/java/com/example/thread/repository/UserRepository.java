package com.example.thread.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.thread.entity.User;

public interface UserRepository extends JpaRepository<User,Integer> {
}