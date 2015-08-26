//int ballX=500;
int houseX=150;
int houseY= 250;
int treeX=50;
int treeY=400;
void setup()
{
	size (600, 600);
}
void draw() if (mouseisPressed == true)
{
	background(0,0,0);
}
else
{
  background(0, 200, 255);
  fill(0, 255, 0);
  rect(0, 400, 600, 200);
  trees();
  house();

  //ball();
}
void trees()
{
	fill(100, 100, 100);
	rect(treeX-25, treeY, 75, 100);
	triangle (treeX-100, treeY, treeX+20, treeY-150, treeX+150, treeY);
	triangle (treeX-100, treeY-100, treeX+20, treeY-250, treeX+150, treeY-100);
	triangle (treeX-100, treeY-200, treeX+20, treeY-350, treeX+150, treeY-200);

	rect(treeX+460, treeY, 75, 100);
	triangle (treeX+350, treeY, treeX+475, treeY-150, treeX+650, treeY);
	triangle (treeX+350, treeY-100, treeX+475, treeY-250, treeX+650, treeY-100);
	triangle (treeX+350, treeY-200, treeX+475, treeY-350, treeX+650, treeY-200);
}
void house()
{
	noStroke();
	fill(200, 20, 30);
	rect(houseX, houseY, 325, 300);
	fill(0, 105, 255);
	triangle(houseX-50, houseY, houseX+165, houseY-150, houseX+375, houseY);
}

/*void ball()
{
	fill(0,0,0);
	ellipse(ballX, 500, 100, 100);
}*/
/*void draw() if (mouseisPressed == true)
{background ()
} 
else 
{
	background }
	*/
