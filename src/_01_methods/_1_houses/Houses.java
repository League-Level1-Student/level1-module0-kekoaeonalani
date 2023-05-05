package _01_methods._1_houses;

import java.awt.Color;
import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

/*
 *    Copyright (c) The League of Amazing Programmers 2013-2021
 *    Level 1
 */
public class Houses {
	static Robot rob = new Robot();
	
	public void run() {
		// Check the recipe to find out what code to put here
		
		
		Random gen = new Random();
		rob.setX(0);
		rob.setY(500);
		for(int i = 0; i < 10; i++) {
			 int number = gen.nextInt(3);
			 //int color = gen.nextInt(3);
			 Color c  = null;
			 String size = "small";
			 
			 if (number == 0) {
				 size = "small";
				 c = Color.MAGENTA;
				 
			 }
			 if (number == 1) {
				 size = "medium";
				 c = Color.CYAN;
			 }
			 if (number == 2) {
				 size = "large";
				 c = Color.PINK;
			 }
			 
			 drawHouse(size, c);
			 
			// if (size.equals("large")) {
			//		drawFlatRoof(size, c );
			//}
		//	 if (size.equals("medium") || size.equals("small")) {
			//	 drawPointyRoof(size);
			// }
			 
			
			 
		}
		
		

	}
	static void drawHouse(String size, Color color) {
		Random gen = new Random();
		int i  = 0;
		if (size.equals("small")) {
			i = 60;
		}
		if (size.equals("medium")) {
			i = 120;
		}
		if (size.equals("large")) {
			i = 255;
		}
		rob.setPenColor(color);
		 
		 rob.setSpeed(20);
			//rob.setSpeed(100);
			rob.penDown();
			rob.setPenWidth(50);
			rob.move(i);
			//
			if (size.equals("small")) {
				drawPointyRoof();
			}
			if (size.equals("medium")) {
				drawPointyRoof();
			}
			if (size.equals("large")) {
				drawFlatRoof();
			}
			
			
			rob.move(i);
			rob.setAngle(90);
			rob.setPenColor(0,255,0);
			rob.move(40);
			rob.turn(270);
	}
	
	
static void drawFlatRoof () {
	rob.turn(90);
	rob.move(40);
	rob.turn(90);
}
	
		
		

static void drawPointyRoof() {
	rob.turn(60);
	rob.move(30);
	rob.turn(60);
	rob.move(30);
	rob.setAngle(180);
}

}