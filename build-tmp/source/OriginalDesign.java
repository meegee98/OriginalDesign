import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class OriginalDesign extends PApplet {

//int ballX=500;
int houseX=150;
int houseY= 250;
int treeX=50;
int treeY=400;

public void setup()
{
	size (600, 600);
	
}

public void draw () 
{
  		

  		mouseClicked();
  		background(0,0,0);
	  night();
  		
  		
}
	  
	  
	  
	

public void mouseClicked()
{	
	background(0, 200, 255);
  	fill(0, 255, 0);
 	rect(0, 400, 600, 200);
  	trees();
  	house();
	
	}	

public void night()
{
	frameRate(10);
	int starX= (int)(Math.random()*595);
	int starY= (int)(Math.random()*595);
		noStroke();
		fill(255, 255, 200, 60);
		ellipse(starX, starY, 10, 10);
		fill(255, 255, 200);
		ellipse(500, 90, 150, 150);
}
public void trees()
{
	fill(139, 69, 19);
	rect(treeX-25, treeY, 75, 100);
	rect(treeX+460, treeY, 75, 100);

	fill(0, 200, 0);
	triangle (treeX-100, treeY, treeX+20, treeY-150, treeX+150, treeY);
	triangle (treeX-100, treeY-100, treeX+20, treeY-250, treeX+150, treeY-100);
	triangle (treeX-100, treeY-200, treeX+20, treeY-350, treeX+150, treeY-200);

	
	triangle (treeX+350, treeY, treeX+475, treeY-150, treeX+650, treeY);
	triangle (treeX+350, treeY-100, treeX+475, treeY-250, treeX+650, treeY-100);
	triangle (treeX+350, treeY-200, treeX+475, treeY-350, treeX+650, treeY-200);
}
public void house()
{
	noStroke();
	fill(255, 228, 196);
	rect(houseX, houseY, 325, 300);
	fill(205, 92, 92);
	triangle(houseX-50, houseY, houseX+165, houseY-150, houseX+375, houseY);
	fill(255, 192, 203);
	rect(houseX+100, houseY+50, houseX+25, 250);
	fill(0,0,0);
	ellipse(400, 400, 25, 25);
}



  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "OriginalDesign" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
