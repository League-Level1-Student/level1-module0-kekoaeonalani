package _01_methods._5_FlappyBird;

import processing.core.PApplet;
import processing.core.PImage;

public class FlappyBird extends PApplet {
    static final int WIDTH = 800;
    static final int HEIGHT = 600;
    int birdY = 300;
    int birdX = 200;
    int birdYVelocity = -10;
    int gravity = 1;
    
    int pipeX = 800;
    int pipeGap = 100;
    int upperPipeHeight = (int) random(100, 400);
    @Override
    public void settings() {
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
    	
    }

    @Override
    public void draw() {
    	background(13, 166, 255);
    	fill(44,176,26);
    	rect(pipeX, 0, 50, upperPipeHeight);
    	pipeX -= 5;
    	teleportPipe();
    	
    	fill(255, 231, 13);
    	stroke(200,213,231);
    	ellipse(birdX, birdY, 50,50);  
    	birdYVelocity += gravity;
    	birdY += birdYVelocity; 
    }

    public void mousePressed(){
    	birdYVelocity = -15;
    }
    
    public void teleportPipe() {
    	if (pipeX < 0) {
    		pipeX  = 850;
    	    upperPipeHeight = (int) random(100, 400);

    	}

    }
    static public void main(String[] args) {
        PApplet.main(FlappyBird.class.getName());
    }
}
