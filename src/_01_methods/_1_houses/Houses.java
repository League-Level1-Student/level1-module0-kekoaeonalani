package _01_methods._1_houses;

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
			 String size = "small";
			 if (number == 0) {
				 size = "small";
			 }
			 if (number == 1) {
				 size = "medium";
			 }
			 if (number == 2) {
				 size = "large";
			 }
			 if (size.equals("large")) {
					drawFlatRoof(255);
			}
			 if (size.equals("medium") && size.equals("small")) {
				 drawPointyRoof(size);
			 }
		}
		
		

	}
static void drawFlatRoof (String size) {
	int height  = 0;
	if (size.equals("small")) {
		height = 60;
	}
	if (size.equals("medium")) {
		height = 120;
	}
	if (size.equals("large")) {
		height = 255;
	}
	rob.setSpeed(20);
	
	rob.setPenColor(231,121,321);
	//rob.setSpeed(100);
	rob.penDown();
	rob.setPenWidth(50);
	rob.move(height);
	rob.turn(90);
	rob.move(40);
	rob.turn(90);
	rob.move(height);
	rob.turn(270);
	rob.setPenColor(0,255,0);
	rob.move(40);
	rob.turn(270);
}
static void drawPointyRoof(String size) {
	
	int height  = 0;
	if (size.equals("small")) {
		height = 60;
	}
	if (size.equals("medium")) {
		height = 120;
	}
	if (size.equals("large")) {
		height = 255;
	}
	rob.setPenColor(231,121,321);
	rob.setSpeed(20);
	rob.penDown();
	rob.setPenWidth(50);
	rob.move(height);
	rob.turn(60);
	rob.move(30);
	rob.turn(60);
	rob.move(30);
	rob.setAngle(180);
	rob.move(height);
	rob.turn(270);
	rob.setPenColor(0,255,0);
	rob.move(40);
	rob.turn(270);
}
}