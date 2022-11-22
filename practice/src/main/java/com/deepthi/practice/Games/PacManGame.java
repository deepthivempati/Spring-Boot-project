package com.deepthi.practice.Games;

import com.deepthi.practice.VideoGames;
import org.springframework.stereotype.Component;

@Component
public class PacManGame implements VideoGames {
    public void up(){System.out.println("PacMan Move up");}
    public void down(){System.out.println("PacMan Move Down");}
    public void left(){
        System.out.println("PacMan Move Left");
    }
    public void right(){
        System.out.println("PacMan Move Right");
    }
}
