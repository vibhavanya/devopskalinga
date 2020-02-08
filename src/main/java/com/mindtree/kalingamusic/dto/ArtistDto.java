package com.mindtree.kalingamusic.dto;

import java.util.List;

public class ArtistDto {
	private int artistId;

	private String artistName;

	private List<SongDto> songDtos;

	public ArtistDto(int artistId, String artistName, List<SongDto> songDtos) {
		super();
		this.artistId = artistId;
		this.artistName = artistName;
		this.songDtos = songDtos;
	}

	public ArtistDto() {
		super();
	}

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

	public List<SongDto> getSongs() {
		return songDtos;
	}

	public void setSongs(List<SongDto> songDtos) {
		this.songDtos = songDtos;
	}

	@Override
	public String toString() {
		return "ArtistDto [artistId=" + artistId + ", artistName=" + artistName + ", songDtos=" + songDtos + "]";
	}
	
}
