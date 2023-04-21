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
		for(int i = 0; i < 10; i++) {
			int x  = gen.nextInt(200)+100;
			drawHouse(x);
		}
		

	}
static void drawHouse (int height) {
	
	rob.setPenColor(231,121,321);
	//rob.setSpeed(100);
	rob.setX(80);
	rob.setY(500);
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
	
	
}
}
