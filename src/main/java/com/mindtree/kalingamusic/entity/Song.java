package com.mindtree.kalingamusic.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.JoinColumn;

@Entity
public class Song {
	@Id
	private int songId;
	private String songName;
	@ManyToOne
	private Album album;
	@ManyToMany(cascade = CascadeType.PERSIST,fetch = FetchType.LAZY)
	@JoinTable(joinColumns = { @JoinColumn(name = "songId") }, inverseJoinColumns = {
			@JoinColumn(name = "artistId") })
	List<Artist> artists;

	public Song(int songId, String songName, Album album, List<Artist> artists) {
		super();
		this.songId = songId;
		this.songName = songName;
		this.album = album;
		this.artists = artists;
	}

	public Song() {
		super();
	}

	public int getSongId() {
		return songId;
	}

	public void setSongId(int songId) {
		this.songId = songId;
	}

	public String getSongName() {
		return songName;
	}

	public void setSongName(String songName) {
		this.songName = songName;
	}

	public Album getAlbum() {
		return album;
	}

	public void setAlbum(Album album) {
		this.album = album;
	}

	public List<Artist> getArtists() {
		return artists;
	}

	public void setArtists(List<Artist> artists) {
		this.artists = artists;
	}

	@Override
	public String toString() {
		return "Song [songId=" + songId + ", songName=" + songName + ", album=" + album + ", artists=" + artists + "]";
	}

}
