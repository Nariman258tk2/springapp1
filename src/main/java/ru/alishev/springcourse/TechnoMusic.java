package ru.alishev.springcourse;

import java.util.List;

public class TechnoMusic implements Music {
    private List<String> musicList;
    @Override
    public List<String> GetSong() { return musicList; }

}
