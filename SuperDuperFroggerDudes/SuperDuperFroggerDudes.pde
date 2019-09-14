int moveX = 50;
int moveY = 50;
int frogX = 400;
int frogY = 550;
int joe1X = 50;
int joe1Speed = 5;
int joe2X = width-=50;
int joe2Speed = 10;
int joe3X = 50;
int joe3Speed = 7;
int joe4X = width-=50;
int joe4Speed = 3;
boolean j1;
boolean j2;
boolean j3;
boolean j4;


void setup() {
  size(800, 600);
}

void draw() {
  background(50, 50, 50);
  fill(0, 100, 0);
  ellipse(frogX, frogY, 35, 35);

  Car joe1 = new Car(joe1X, 100, 100, joe1Speed);
  joe1.display();
  joe1X += joe1Speed;
  if (joe1X>=width) {
    joe1X=0;
  }
  j1 = joe1.intersects(joe1);
  Car joe2 = new Car(joe2X, 200, 100, joe2Speed);
  joe2.display();
  joe2X -= joe2Speed;
  if (joe2X<=0) {
    joe2X=width;
  }
  j2 = joe2.intersects(joe2);
  Car joe3 = new Car(joe3X, 300, 100, joe3Speed);
  joe3.display();
  joe3X += joe3Speed;
  if (joe3X>=width) {
    joe3X=0;
  }
  j3 = joe3.intersects(joe3);
  Car joe4 = new Car(joe4X, 400, 100, joe4Speed);
  joe4.display();
  joe4X -= joe4Speed;
  if (joe4X<=0) {
    joe4X=width;
  }
  j4 = joe4.intersects(joe4);
  if (frogY>=599||frogY<=1||frogX>=799||frogX<=1) {
    frogY = 550;
    frogX = 400;
  }
  if(j1){
    stop();
  }
  if(j2){
    stop();
  }
  if(j3){
    stop();
  }
  if(j4){
    stop();
  }
  
}

void keyPressed()
{
  if (key == CODED) {
    if (keyCode == UP)
    {
      frogY -= moveY;
      //Frog Y position goes up
    } else if (keyCode == DOWN)
    {
      frogY += moveY;
      //Frog Y position goes down
    } else if (keyCode == RIGHT)
    {
      frogX += moveX;
      //Frog X position goes right
    } else if (keyCode == LEFT)
    {
      frogX -= moveX;
      //Frog X position goes left
    }
  }
}

class Car {
  private int carX;
  private int carY;
  private int carSize;
  private int carSpeed;

  public int getX() {
    return carX;
  }
  public int getY() {
    return carY;
  }
  public int getSize() {
    return carSize;
  }


  boolean intersects(Car car) {
    if ((frogY > car.getY() && frogY < car.getY()+50) && (frogX > car.getX() && frogX < car.getX()+car.getSize()))
    {
      return true;
    } else
    {
      return false;
    }
  }

  public Car(int carX, int carY, int carSize, int carSpeed) {


    this.carX=carX;
    this.carY=carY;
    this.carSize=carSize;
    this.carSpeed=carSpeed;
  }


  public void display() 
  {
    fill(carX+50, carY+50, carX+35);
    rect(carX, carY, carSize, 50);
  }
}
