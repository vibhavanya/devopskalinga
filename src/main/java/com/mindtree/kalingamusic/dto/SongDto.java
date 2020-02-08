package com.mindtree.kalingamusic.dto;

import java.util.List;

public class SongDto {
	
	private int songId;
	private String songName;
	
	private AlbumDto albumDto;

	List<ArtistDto>artistDtos;

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

	public AlbumDto getAlbum() {
		return albumDto;
	}

	public void setAlbum(AlbumDto albumDto) {
		this.albumDto = albumDto;
	}

	public List<ArtistDto> getArtists() {
		return artistDtos;
	}

	public void setArtists(List<ArtistDto> artistDtos) {
		this.artistDtos = artistDtos;
	}

	public SongDto(int songId, String songName, AlbumDto albumDto, List<ArtistDto> artistDtos) {
		super();
		this.songId = songId;
		this.songName = songName;
		this.albumDto = albumDto;
		this.artistDtos = artistDtos;
	}

	public SongDto() {
		super();
	}

	@Override
	public String toString() {
		return "SongDto [songId=" + songId + ", songName=" + songName + ", albumDto=" + albumDto + ", artistDtos=" + artistDtos
				+ "]";
	}
	
}
