package com.mindtree.kalingamusic.serviceimplimentation;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.kalingamusic.dto.AlbumDto;
import com.mindtree.kalingamusic.dto.ArtistDto;
import com.mindtree.kalingamusic.dto.SongDto;
import com.mindtree.kalingamusic.entity.Album;
import com.mindtree.kalingamusic.entity.Artist;
import com.mindtree.kalingamusic.entity.Song;
import com.mindtree.kalingamusic.repository.AlbumRepository;
import com.mindtree.kalingamusic.repository.ArtistRepository;
import com.mindtree.kalingamusic.repository.SongRepository;
import com.mindtree.kalingamusic.serviceinterface.KalingaMusicServiceInterface;

@Service
public class KalingaMusicImplimentation implements KalingaMusicServiceInterface {
	@Autowired
	AlbumRepository albumRepository;

	@Autowired
	SongRepository songRepository;

	@Autowired
	ArtistRepository artistRepository;

	@Override
	public void addAlbum(AlbumDto albumDto) {
		// TODO Auto-generated method stub
		Album album = new Album();
		ModelMapper modelMapper = new ModelMapper();
		album = modelMapper.map(albumDto, Album.class);
		albumRepository.save(album);

	}

	@Override
	public void addSong(SongDto songDto, int albumId) {
		// TODO Auto-generated method stub
		Album album = new Album();
		Song song = new Song();
		ModelMapper modelMapper = new ModelMapper();
		song = modelMapper.map(songDto, Song.class);
		album = albumRepository.getOne(albumId);
		song.setAlbum(album);
		songRepository.save(song);
	}

	@Override
	public void addArtist(ArtistDto artistDto, int songId) {
		// TODO Auto-generated method stub
//
//		Album album = new Album();
//		Song song = new Song();
//		List<Song> songs = new ArrayList<Song>();
//		Artist artist = new Artist();
//		List<Artist> artists = new ArrayList<Artist>();
//		ModelMapper modelMapper = new ModelMapper();
//		artist = modelMapper.map(artistDto, Artist.class);
//		song = songRepository.getOne(songId);
//		songs.add(song);
//		album = albumRepository.getOne(song.getAlbum().getAlbumId());
//		artistRepository.save(artist);
//		artist.setSongs(songs);
//		artists.add(artist);
//		song.setArtists(artists);
//		songRepository.deleteById(songId);
//		albumRepository.deleteById(song.getAlbum().getAlbumId());
//		albumRepository.save(album);
//		songRepository.save(song);

		Song song = new Song();
		List<Song> songs = new ArrayList<Song>();
		Artist artist = new Artist();
		List<Artist>prevArtists=new ArrayList<Artist>();
		ModelMapper modelMapper = new ModelMapper();
		artist = modelMapper.map(artistDto, Artist.class);
		artistRepository.save(artist);
		song=songRepository.getOne(songId);
		prevArtists=song.getArtists();	
		prevArtists.add(artist);		
		song.setArtists(prevArtists);
		songs.add(song);
		artist.setSongs(songs);			
		songRepository.save(song);
		
	}

	@Override
	public void addSongAlone(SongDto songDto, int albumId) {
		// TODO Auto-generated method stub
		Album album = new Album();
		Song song = new Song();
		ModelMapper modelMapper = new ModelMapper();
		song = modelMapper.map(songDto, Song.class);
		album = albumRepository.getOne(albumId);
		song.setAlbum(album);
		songRepository.save(song);

	}

	@Override
	public void addArtistAlone(ArtistDto artistDto, int songId) {

		Song song = new Song();
		List<Song> songs = new ArrayList<Song>();
		Artist artist = new Artist();
		List<Artist>prevArtists=new ArrayList<Artist>();
		ModelMapper modelMapper = new ModelMapper();
		artist = modelMapper.map(artistDto, Artist.class);
		artistRepository.save(artist);
		song=songRepository.getOne(songId);
		prevArtists=song.getArtists();	
		prevArtists.add(artist);		
		song.setArtists(prevArtists);
		songs.add(song);
		artist.setSongs(songs);			
		songRepository.save(song);
		

	}

	@Override
	public List<SongDto> getAllSongs() {
		// TODO Auto-generated method stub
		List<SongDto> songDtos = new ArrayList<SongDto>();
		SongDto songDto = new SongDto();
		AlbumDto albumDto = new AlbumDto();
		List<Song> songs = new ArrayList<Song>();
		List<Artist> artists = artistRepository.findAll();
		ModelMapper modelMapper = new ModelMapper();
		songs = songRepository.findAll();
		for (Song song : songs) {
			songDto = modelMapper.map(song, SongDto.class);
			albumDto = modelMapper.map(song.getAlbum(), AlbumDto.class);
			songDto.setAlbum(albumDto);
			List<ArtistDto> artistDtos = new ArrayList<ArtistDto>();
			for (Artist artist : song.getArtists()) {
				ArtistDto artistDto = modelMapper.map(artist, ArtistDto.class);
				artistDtos.add(artistDto);
				songDto.setArtists(artistDtos);
//				songDtos.add(songDto);
			}
			songDtos.add(songDto);
		}
//		songDtos.add(songDto);

		return songDtos;
	}

}
