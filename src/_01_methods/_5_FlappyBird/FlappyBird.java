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
    
    int PipeX = 800;
    

    int pipeGap = 150;
    int upperPipeHeight = (int) random(100, 400);
    int lowerY = upperPipeHeight + pipeGap;
    
    int floorX = 0;
    int floorY = 550;
    
    int score = 0;
    @Override
    public void settings() {
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
    	
    }

    @Override
    public void draw() {
    	
    	if(intersectsPipes() == false && touchFloor() == false) {
    	background(13, 166, 255);
    	fill(44,176,26);
    	//top pipe
    	rect(PipeX, 0, 50, upperPipeHeight);
    	PipeX -= 5;
    	teleportPipe();
    	
    	// bottom pipe
    	rect(PipeX, lowerY, 50, 600);
    	
    	//floor shape
    	fill(43, 143, 43);
    	rect(0, 550, 800,50);
 
    	fill(255, 231, 13);
    	stroke(200,213,231);
    	ellipse(birdX, birdY, 50,50);  
    	birdYVelocity += gravity;
    	birdY += birdYVelocity; 
    	
    	// text for the score
    	textSize(20);
    	text("Your score:" + score, 20,597);
    	}	
    	else if(intersectsPipes() == true || touchFloor() == true) {
    		background(13, 166, 255);
    		textSize(40);
    		text("Game over \n Your score: " + score, WIDTH / 2 - 100, HEIGHT / 2);
    	}
    }

    public void mousePressed(){
    	birdYVelocity = -15;
    }
    
    public void teleportPipe() {
    	if (PipeX < 0) {
    		PipeX  = 850;
    	    upperPipeHeight = (int) random(100, 400);
    	    lowerY = upperPipeHeight + pipeGap;
			score +=1;

    	}

    }
    
    boolean intersectsPipes() { 
        if (birdY < upperPipeHeight && birdX > PipeX && birdX < (PipeX+50)){
           return true; }
       else if (birdY>lowerY && birdX > PipeX && birdX < (PipeX+50)) {
           return true; }
       else { return false;}
}
    
    boolean touchFloor() {
    	if (birdX >floorX && birdX < floorX + 800 && birdY > floorY && birdY < floorY + 100 ) {
    		return true;}
    	
    	else { return false; }
    		
    	
}

    static public void main(String[] args) {
        PApplet.main(FlappyBird.class.getName());
    }
    }
