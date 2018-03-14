package section2;

import org.jointheleague.graphical.robot.Robot;

public class Spiral {

	public static void main(String[] args) {
		Robot bob = new Robot(); // 1. Create a new Robot
bob.penDown();
		// 5. Set your robot's pen down

		bob.setSpeed(100); // 3. Set the robot to go at max speed (10)

		for (int i = 0; i < 75; i++) { // 4. Use a for loop to repeat steps #7 to #8, 75 times

			bob.move(5 * i);
			bob.setRandomPenColor();
		 // 7. Change the pen color to random

		;// 6. Move the robot 5 times the current line number you are drawing (5*i)

		bob.turn(360 / 7); // 2. Turn the robot 360/7 degrees to the right

		bob.setPenWidth(i);	}// 8. Set the pen width to i 

	}
}
