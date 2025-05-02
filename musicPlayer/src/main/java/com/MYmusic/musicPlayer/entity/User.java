package com.MYmusic.musicPlayer.entity;

import java.time.LocalDateTime;

import org.springframework.data.annotation.Id;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Table;

@Entity
@Table(name = "users")
public class User {
    @Id @GeneratedValue
    private Long id;
    private String username;
    private String email;
    private String passwordHash;
    private LocalDateTime createdAt;
}
