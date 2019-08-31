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
  
  Car joe1 = new Car(50,100,100,5);
  joe1.display();
  Car joe2 = new Car(50,200,100,10);
  joe2.display();
  Car joe3 = new Car(50,300,100,7);
  joe3.display();
  Car joe4 = new Car(50,400,100,3);
  joe4.display();
  
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
  
 public Car(int carX, int carY, int carSize, int carSpeed){
   
    
     this.carX=carX;
     this.carY=carY;
     this.carSize=carSize;
     this.carSpeed=carSpeed;
  }
 
 
  public void display() 
  {
        fill(carX+50,carY+50,carX+35);
        rect(carX , carY, carSize, 50);
  }
  
  
  
  

}

  //public int getX(){
  //   return carX;
  //}
  //public int getY(){
  //   return carY;
  //}
  //public int getSize(){
  //   return carSize;
  //}
  //public int getSpeed(){
  //   return carSpeed;
  //}
