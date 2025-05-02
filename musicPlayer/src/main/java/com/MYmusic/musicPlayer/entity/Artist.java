package com.MYmusic.musicPlayer.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "artists")
public class Artist {
    @Id @GeneratedValue
    private Long id;
    private String name;
    private String bio;
    private String imageUrl;
}
