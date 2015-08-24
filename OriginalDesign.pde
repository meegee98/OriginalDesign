int ballX=500;
int bodyX-250;
void setup()
{
	size (600, 600);
}
void draw()
{
  background(0, 100, 255);
  idk();
  ball();
}
void idk()
{
	fill(255, 255, 255);
	stroke(0, 0, 0);
	ellipse(bodyX, 400, 250, 325);
	ellipse (bodyX, 250, 200, 150);
	arc(550, 575, 50, 50, 0, PI);

}
void ball()
{
	fill(0,0,0);
	ellipse(ballX, 500, 100, 100);
}

