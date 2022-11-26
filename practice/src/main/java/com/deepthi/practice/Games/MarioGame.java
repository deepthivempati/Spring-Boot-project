package com.deepthi.practice.Games;


import com.deepthi.practice.VideoGames;

//@Component
//@Primary // since @Component is annotated for both pacManGame and MarioGame classes and their Runner classes @Primary annotation helps in picking the bean of class that should be implemented.
public class MarioGame implements VideoGames {
    public void up(){System.out.println("Mario Move up");}
    public void down(){System.out.println("Mario Move Down");}
    public void left(){
        System.out.println("Mario Move Left");
    }
    public void right(){
        System.out.println("Mario Move Right");
    }
}
