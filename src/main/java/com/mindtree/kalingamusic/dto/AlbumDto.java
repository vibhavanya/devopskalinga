package com.mindtree.kalingamusic.dto;

import java.util.List;



public class AlbumDto {
	private int albumId;
	private String albumName;	
	private List<SongDto>songDtos;

	public int getAlbumId() {
		return albumId;
	}

	public void setAlbumId(int albumId) {
		this.albumId = albumId;
	}

	public String getAlbumName() {
		return albumName;
	}

	public void setAlbumName(String albumName) {
		this.albumName = albumName;
	}

	public List<SongDto> getSongs() {
		return songDtos;
	}

	public void setSongs(List<SongDto> songDtos) {
		this.songDtos = songDtos;
	}

	public AlbumDto(int albumId, String albumName, List<SongDto> songDtos) {
		super();
		this.albumId = albumId;
		this.albumName = albumName;
		this.songDtos = songDtos;
	}

	public AlbumDto() {
		super();
	}

	@Override
	public String toString() {
		return "AlbumDto [albumId=" + albumId + ", albumName=" + albumName + ", songDtos=" + songDtos + "]";
	}
	
}
