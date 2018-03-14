//package section2;
//
//import javax.swing.JOptionPane;
//import org.jointheleague.graphical.robot.Robot;
//
//public class FourSquare {
//
//	Robot bob = new Robot();
//
//	void go() {
//		bob.setSpeed(100);
//		bob.sparkle();
//		bob.setPenWidth(5);
//		int posX = 200;
//		int posY = 200;
//		bob.penDown();
//		for (int i = 0; i < 11; i++) {
//			posX = posX + 10;
//			posY = posY + 10;
//			bob.setRandomPenColor();
//			bob.moveTo(posX, posY);
//			drawSquare();
//
//			// 7. Set the pen color to random
//
//			// 1. Call the drawSquare() method
//
//			// 8. Turn the robot 90 degrees to the right
//			bob.turn(90);
//		}
//
//	}
//
//	/* 3. Fill in the code to draw a square inside the method below. */
//	void drawSquare() {
//		for (int i = 0; i < 4; i++) {
//			bob.move(100);
//			bob.turn(90);
//		}
//
//	}
//
//	public static void main(String[] args) {
//		new FourSquare().go();
//	}
//
//}

