int moveX = 50;
int moveY = 50;
int frogX = 400;
int frogY = 550;


void setup() {
  size(800, 600);
}

void draw() {
  background(50, 50, 50);
  fill(0, 100, 0);
  ellipse(frogX, frogY, 35, 35);
  display();



  if (frogY>=599||frogY<=1||frogX>=799||frogX<=1) {
    frogY = 550;
    frogX = 400;
  }
}

void keyPressed()
{
  if (key == CODED) {
    if (keyCode == UP)
    {
      frogY -= 50;
      //Frog Y position goes up
    } else if (keyCode == DOWN)
    {
      frogY += 50;
      //Frog Y position goes down
    } else if (keyCode == RIGHT)
    {
      frogX += 50;
      //Frog X position goes right
    } else if (keyCode == LEFT)
    {
      frogX -= 50;
      //Frog X position goes left
    }
  }
}

class Car {
  int carX;
  int carY;
  int carSize;
  int carSpeed;
  Car car;

  Car() {
    carX = 0;
    carY=0;
    carSize=35;
    carSpeed=1;
  }

  void display() 
  {
    fill(0, 255, 0);
    rect(carX, carY, carSize, 50);
  }
}
