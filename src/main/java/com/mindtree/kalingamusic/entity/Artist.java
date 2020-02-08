package com.mindtree.kalingamusic.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Artist {
	@Id
	private int artistId;

	private String artistName;
	@ManyToMany(mappedBy = "artists",cascade = CascadeType.PERSIST,fetch = FetchType.LAZY)
	private List<Song> songs;

	public int getArtistId() {
		return artistId;
	}

	public void setArtistId(int artistId) {
		this.artistId = artistId;
	}

	public String getArtistName() {
		return artistName;
	}

	public void setArtistName(String artistName) {
		this.artistName = artistName;
	}

	public List<Song> getSongs() {
		return songs;
	}

	public void setSongs(List<Song> songs) {
		this.songs = songs;
	}

	public Artist(int artistId, String artistName, List<Song> songs) {
		super();
		this.artistId = artistId;
		this.artistName = artistName;
		this.songs = songs;
	}

	public Artist() {
		super();
	}

	@Override
	public String toString() {
		return "Artist [artistId=" + artistId + ", artistName=" + artistName + ", songs=" + songs + "]";
	}

}
