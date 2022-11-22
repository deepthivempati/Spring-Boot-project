package com.deepthi.practice;


import com.deepthi.practice.Games.PacManGame;
import com.deepthi.practice.GamesRunner.GameRunner;
import com.deepthi.practice.GamesRunner.MarioGameRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Game {

    public static void main(String[] args) {
      ConfigurableApplicationContext context =   SpringApplication.run(Game.class, args);


        /*MarioGame marioGame = new MarioGame();
        MarioGameRunner runner = new MarioGameRunner(marioGame); // MarioGameRunner class providing the implementation for MarioGame class
        runner.run();*/

        // VideoGames videoGames = new MarioGame(); //since MarioGame class is implements VideoGames interface. so MarioGame class provides the implementation for  VideoGames interface abstract methods[An abstract method do not have a body (implementation), they just have a method signature (declaration)].

        /*PacManGame videoGames = new PacManGame();
        GameRunner runner = new GameRunner(videoGames);
        runner.run();*/

        // Instead of manually creating the class and managing dependencies we can give that responsibility of creating instances of PacManGame class and GameRunner to the spring framework by using @Component annotation
        /*VideoGames videoGame = new PacManGame();
        GameRunner runner = new GameRunner(videoGame);*/

 GameRunner runner =context.getBean(GameRunner.class); // since @component is annotated to PacMan class that class instance is created by bean and giving us that PacMan class implementation even without creating objects explicitly as commented code in 28 29 lines
        runner.run();
    }
}