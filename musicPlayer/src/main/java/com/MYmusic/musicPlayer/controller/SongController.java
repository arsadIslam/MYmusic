package com.MYmusic.musicPlayer.controller;

import org.hibernate.mapping.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;


import com.MYmusic.musicPlayer.entity.Song;
import com.MYmusic.musicPlayer.service.SongService;

@RestController
@RequestMapping("/api/songs")
public class SongController {
    @Autowired
    private SongService songService;

    @PostMapping
    public ResponseEntity<Song> uploadSong(@RequestBody Song song) {
        return ResponseEntity.ok(songService.saveSong(song));
    }

    @GetMapping
    public List<Song> getAllSongs() {
        return songService.getAllSongs();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Song> getSongById(@PathVariable Long id) {
        return songService.getSongById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public void deleteSong(@PathVariable Long id) {
        songService.deleteSong(id);
    }
}

