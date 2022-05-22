package com.harish.Tospringframework.game;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class MarioGame implements GamingConsole {

    @Override
    public void up(){
        System.out.println("Jump");
    }

    @Override
    public void down(){
        System.out.println("Go to Hole");
    }

    @Override
    public void right(){
        System.out.println("Faster");
    }
    @Override
    public void left(){
        System.out.println("Stop");
    }

    @Component
    public static class GameRunner {
    @Autowired
        private GamingConsole game;
        public GameRunner(GamingConsole game) {
            this.game = game;
        }

        public void runGame(){
            game.up();
            game.down();
            game.right();
            game.left();
        }
    }
}
