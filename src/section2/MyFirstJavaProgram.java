package section2;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {

	public static void main(String[] args) {

		Robot bob = new Robot();
		// bob.sparkle();
		// bob.miniaturize();
		// bob.setRandomPenColor();
		// bob.penDown();
		// bob.setSpeed(1000);
		// bob.move(100);
		// bob.turn(360);
		// bob.expand();
		 bob.sparkle();
		// bob.penDown();
		// bob.setSpeed(100);
		// bob.move(100);
		// bob.turn(90);
		// bob.move(100);
		// bob.turn(90);
		// bob.move(100);
		// bob.turn(90);
		// bob.move(100);
		// bob.turn(90);
		bob.setSpeed(100);
		bob.penDown();
		for (int i = 0; i < 4; i++) {
			bob.move(100);
			bob.turn(90);

		}

	}
}