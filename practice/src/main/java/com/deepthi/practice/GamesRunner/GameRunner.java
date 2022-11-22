package com.deepthi.practice.GamesRunner;

import com.deepthi.practice.VideoGames;
import org.springframework.stereotype.Component;

@Component
public class GameRunner {
    private VideoGames videoGames; // not specific to particular game since videoGames variable is of type interface . which ever class implements VideoGames(interface) that class can use this method calls. so this is loosely coupled
    public GameRunner(VideoGames videoGames) {
        this.videoGames=videoGames;
    }


    public void run() {
        videoGames.up();
        videoGames.down();
        videoGames.left();
        videoGames.right();
    }
}
