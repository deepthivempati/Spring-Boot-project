package com.deepthi.practice.GamesRunner;


import com.deepthi.practice.Games.MarioGame;
//@Component
public class MarioGameRunner {
    private MarioGame marioGame; // only specific to MarioGame so it is tightly coupled.
    public MarioGameRunner(MarioGame marioGame) {
        this.marioGame=marioGame;
    }

    public void run() {
        System.out.println("Game Starts");
       marioGame.up();
       marioGame.down();
       marioGame.left();
       marioGame.right();
    }
}
