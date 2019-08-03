int birdX = 200;
int birdY = 500;
int birdYVelocity = 100;
int gravity = 2;
int rectX = 700;
int upperHeight = 400;
int upperY = 0;
int lowerY;
int pipeGap = 200;
int pipeWidth = 100;

void draw(){
  background(150,150,255);
  fill(200,200,0);
  stroke(0);
  ellipse(birdX,birdY,50,50); 
  birdY += gravity;
  fill(100,255,150);
  rect(rectX,upperY,pipeWidth,upperHeight);
  rect(rectX,lowerY,pipeWidth,800);
  teleportPipes();
  boolean dead = intersectsPipes();
  if(dead){
  fill(255,255,255);
  ellipse(400,500,10000,10000);
  }
}

void setup(){
  size(800,1000); 
}

void mousePressed(){
  birdY -= birdYVelocity; 
}

void teleportPipes(){
  rectX -= 2;
  lowerY = upperY + upperHeight + pipeGap;
  if(rectX<birdX-100){
    rectX = 700;
    upperHeight = (int) random(100, 400);
  }
}

boolean intersectsPipes() { 
     if (birdY < upperHeight && birdX > rectX && birdX < (rectX+pipeWidth)){
          return true; }
     else if (birdY>lowerY && birdX > rectX && birdX < (rectX+pipeWidth)) {
          return true; }
     else { return false; }
}
