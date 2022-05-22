package com.harish.Tospringframework.game;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component

public class SuperContraGame implements GamingConsole {

    public void up(){
        System.out.println("SuperContraGame Up");
    }

    public void down(){
        System.out.println("Down");
    }

    public void right(){
        System.out.println("Right");
    }
    public void left(){
        System.out.println("Left");
    }

}
