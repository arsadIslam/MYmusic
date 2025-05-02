package com.MYmusic.musicPlayer.service;

import java.util.Optional;

import org.hibernate.mapping.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.MYmusic.musicPlayer.Repositry.SongRepository;
import com.MYmusic.musicPlayer.entity.Song;

@Service
public class SongService {
    @Autowired
    private SongRepository songRepository;

    public Song saveSong(Song song) {
        return songRepository.save(song);
    }

    public List<Song> getAllSongs() {
        return songRepository.findAll();
    }

    public Optional<Song> getSongById(Long id) {
        return songRepository.findById(id);
    }

    public void deleteSong(Long id) {
        songRepository.deleteById(id);
    }
}

