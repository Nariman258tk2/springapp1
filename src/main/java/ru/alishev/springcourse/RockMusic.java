package ru.alishev.springcourse;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class RockMusic implements Music {
    private List<String> musicList = new ArrayList<>();
    {
        musicList.add("running wild - pile of skulls");
        musicList.add("dire straits - money for nothing");
        musicList.add("accept - crossroads");
    }
    @Override
    public List<String> GetSong() { return musicList; }
}
