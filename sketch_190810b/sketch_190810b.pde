int frogX = 400;
int frogY = 550;

void draw(){
  background(50,50,50);
  fill(0,150,0);
  ellipse(frogX,frogY,40,40);
}

void setup(){
  size(800,600);
  
}

void keyPressed()
{
      if(key == CODED){
            if(keyCode == UP)
            {
              frogY-=50;
                  //Frog Y position goes up
            }
            else if(keyCode == DOWN)
            {
              frogY+=50;
                  //Frog Y position goes down 
            }
            
            else if(keyCode == RIGHT)
            {
              frogX+=50;
                  //Frog X position goes right
            }
            else if(keyCode == LEFT)
            {
              frogX-=50;
                  //Frog X position goes left
            }
      }
}

void touchingCanvas(){
 
}
