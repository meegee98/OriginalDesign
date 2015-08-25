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
int treeX= 50;
int treeY= 500;
public void setup()
{
	size (600, 600);
}
public void draw()
{
  background(0, 200, 255);
  fill(0, 255, 0);
  rect(0, 400, 600, 200);
  trees();
  house();
  //ball();
}
public void trees()
{
	fill(100, 100, 100);
	rect(treeX-25, treeY, 75, 100);
	triangle (treeX-100, treeY, treeX+30, treeY-100, treeX+150, treeY);
}
public void house()
{
	noStroke();
	fill(200, 20, 30);
	rect(houseX, houseY, 350, 300);
	triangle(houseX-50, houseY, houseX+175, houseY-150, houseX+400, houseY);
}

/*void ball()
{
	fill(0,0,0);
	ellipse(ballX, 500, 100, 100);
}*/

  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "OriginalDesign" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
