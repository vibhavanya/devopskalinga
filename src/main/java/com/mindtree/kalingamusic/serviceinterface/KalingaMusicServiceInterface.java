package com.mindtree.kalingamusic.serviceinterface;

import java.util.List;

import org.springframework.stereotype.Service;

import com.mindtree.kalingamusic.dto.AlbumDto;
import com.mindtree.kalingamusic.dto.ArtistDto;
import com.mindtree.kalingamusic.dto.SongDto;
@Service
public interface KalingaMusicServiceInterface {

	public void addAlbum(AlbumDto albumDto);

	public void addSong(SongDto songDto, int albumid);

	public void addArtist(ArtistDto artistDto, int songid);

	public void addSongAlone(SongDto songDto, int albumId);

	public void addArtistAlone(ArtistDto artistDto, int songId);

	public List<SongDto> getAllSongs();

}
