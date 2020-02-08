package com.mindtree.kalingamusic.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.mindtree.kalingamusic.dto.AlbumDto;
import com.mindtree.kalingamusic.dto.ArtistDto;
import com.mindtree.kalingamusic.dto.SongDto;
import com.mindtree.kalingamusic.serviceinterface.KalingaMusicServiceInterface;

@Controller
public class KalingaMusicController {
	private int albumid;
	private int songid;
	@Autowired
	KalingaMusicServiceInterface kalingaMusicServiceInterface;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String menu() {
		
		return "menu";
	}
	@RequestMapping("/addalbum")
	public String addAlbum()
	{
		return "addalbum";
	}
	@RequestMapping("/addsong")
	public String addSong()
	{
		return "addsong";
	}
	@RequestMapping("/addartist")
	public String addArtist()
	{
		return "addartist";
	}
	@RequestMapping("/addartistalone")
	public String addArtistAlone()
	{
		return "addartistalone";
	}
	@RequestMapping("/addsongalone")
	public String addSongAlone()
	{
		return "addsongalone";
	}
	@RequestMapping("/allsongs")
	public String getAllSongs()
	{
		return "allsongs";
	}
	
	@PostMapping("/addalbum")
	public String addAlbum(AlbumDto albumDto) {
		kalingaMusicServiceInterface.addAlbum(albumDto);
		albumid=albumDto.getAlbumId();
		return "addsong";
	}	
	@PostMapping("/addsong")
	public String addSong(SongDto songDto) {
		kalingaMusicServiceInterface.addSong(songDto,albumid);
		songid=songDto.getSongId();
		return "addartist";
	}
		@PostMapping("/addartist")
	public String addArtist(ArtistDto artistDto) {
			kalingaMusicServiceInterface.addArtist(artistDto,songid);
			return "menu";
		
	}
		@PostMapping("/addsongalone")
		public String addSongAlone(SongDto songDto,@RequestParam("albumId") int albumId ) {
			kalingaMusicServiceInterface.addSongAlone(songDto,albumId);
			return "menu";
		}
			@PostMapping("/addartistalone")
		public String addArtistAlone(ArtistDto artistDto, @RequestParam("songId") int songId) {
				kalingaMusicServiceInterface.addArtistAlone(artistDto,songId);
				return "menu";
			
		}
			@GetMapping("/allsongs")
			public String getAllSongs(Model model) {
				List<SongDto>songDtos=kalingaMusicServiceInterface.getAllSongs();
				model.addAttribute("songDtos", songDtos);
				return "allsongs";
				
			}
}
