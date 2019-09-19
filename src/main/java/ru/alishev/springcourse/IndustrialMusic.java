package ru.alishev.springcourse;

import java.util.List;

public class IndustrialMusic implements Music {
    private List<String> musicList;

    @Override
    public List<String> GetSong() { return musicList; }
}
