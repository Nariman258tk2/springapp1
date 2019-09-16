package ru.alishev.springcourse;

import java.util.List;
import java.util.ArrayList;

public class MusicPlayer {
    private Music music;

    public List<Music> getMusicList() {
        return musicList;
    }

    public void setMusicList(List<Music> musicList) {
        this.musicList = musicList;
    }

    private List<Music> musicList = new ArrayList<Music>();


    private String name;
    private int volume;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    // IoC
    public MusicPlayer(Music music)
    {
        this.music = music;
    }

    public MusicPlayer(){}

    public void setMusic(Music music){
        this.music = music;
    }

    public void playMusic()
    {
        //System.out.println("Playing: " + music.GetSong());
        musicList.forEach(m -> System.out.println(m.GetSong()));
    }
}
