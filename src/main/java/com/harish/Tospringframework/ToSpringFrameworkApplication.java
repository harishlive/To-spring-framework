package com.harish.Tospringframework;

import com.harish.Tospringframework.game.GameRunner;
import com.harish.Tospringframework.game.MarioGame;
import com.harish.Tospringframework.game.SuperContraGame;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class ToSpringFrameworkApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context =
				SpringApplication.run( ToSpringFrameworkApplication.class, args );
		GameRunner runner = context.getBean( GameRunner.class );

		MarioGame game = new MarioGame();
//		SuperContraGame game = new SuperContraGame();
//		GameRunner runner = new GameRunner(game);
		runner.runGame();
	}

}
