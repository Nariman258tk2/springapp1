package ru.alishev.springcourse;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component()
public class ClassicalMusic implements Music {
    private List<String> musicList = new ArrayList<>();
    {
        musicList.add("Hungarian Rhapsody");
        musicList.add("chaikovskiy - chiki briki");
        musicList.add("bach - tocatta and fugue");
    }

    public void doMyInit(){
        System.out.println("initialization");
    }

    public void doMyDestroy(){
        System.out.println("destroying");
    }

    //public static ClassicalMusic getClassicalMusic(){
    //    return new ClassicalMusic();
    //}

    //public void doMyInit(){
    //    System.out.println("do my initialization");
    //}

    //public void doMyDestroy(){
    //       System.out.println("doing my destruction");
    //}

    @Override
    public List<String> GetSong() {
        return musicList;
    }
}
