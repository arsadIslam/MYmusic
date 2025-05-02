package com.MYmusic.musicPlayer.Repositry;

import org.springframework.data.jpa.repository.JpaRepository;

import com.MYmusic.musicPlayer.entity.Artist;
import com.MYmusic.musicPlayer.entity.Song;

public interface UserRepository {
	//public interface UserRepository extends JpaRepository<User, Long> { }
	public interface SongRepository extends JpaRepository<Song, Long> { }
	public interface ArtistRepository extends JpaRepository<Artist, Long> { }

}
