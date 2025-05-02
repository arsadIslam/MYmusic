package com.MYmusic.musicPlayer.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "songs")
public class Song {
    @Id @GeneratedValue
    private Long id;
    private String title;
    @ManyToOne
    @JoinColumn(name = "artist_id")
    private Artist artist;
    private String genre;
    private String audioUrl;
    private Long duration;
    private LocalDateTime uploadedAt;
}
