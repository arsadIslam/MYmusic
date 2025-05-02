package com.MYmusic.musicPlayer.Repositry;

import org.springframework.data.jpa.repository.JpaRepository;

import com.MYmusic.musicPlayer.entity.Song;
import com.MYmusic.musicPlayer.entity.User;

public interface ArtistRepository {
	public interface UserRepository extends JpaRepository<User, Long> { }
	public interface SongRepository extends JpaRepository<Song, Long> { }
	//public interface ArtistRepository extends JpaRepository<Artist, Long> { }

}
