package guimodule;

import processing.core.PApplet;


public class MyDisplay extends PApplet {
	
	public void setup () {
		size(400, 400); 		// size of the canvas
		background(200, 200, 200);	// color of the canvas
	}
	
	// run every time the GUI is called
	public void draw () {
		fill(255, 155, 0);
		ellipse(200, 200, 300, 300);		// draw an ellipse
		
		fill(0, 0, 0);
		ellipse(140, 140, 40, 60);
		ellipse(270, 140, 40, 60);
		
		arc(200, 260, 100, 100, 0, PI);
		
	}

}
