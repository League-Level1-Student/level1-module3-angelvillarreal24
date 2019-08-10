int birdX = 200;
int birdY = 500;
int birdYVelocity = 100;
int gravity = 4;
int rectX = 700;
int upperHeight = 400;
int upperY = 0;
int lowerY;
int pipeGap = 200;
int pipeWidth = 100;
int score;

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
  textSize(30);
  text("Score : " + score, 8,25);
  boolean dead2 = touchGround();
  boolean dead = intersectsPipes();
  if(dead || dead2){
  background(0);
  textSize(123);
  fill(150,0,0);
  text("YOU'RE DEAD",1,height/2);
 
  stop();
  }
}

void setup(){
  size(800,1000); 
}

void mousePressed(){
  birdY -= birdYVelocity; 
}

void teleportPipes(){
  rectX -= 10;
  lowerY = upperY + upperHeight + pipeGap;
  if(rectX<birdX-100){
    rectX = 700;
    upperHeight = (int) random(100, 400);
    score++;
  }
}

boolean intersectsPipes() { 
     if (birdY < upperHeight && birdX > rectX && birdX < (rectX+pipeWidth)){
          return true; }
     else if (birdY>lowerY && birdX > rectX && birdX < (rectX+pipeWidth)) {
          return true; }
     else { return false; }
}

boolean touchGround() { 
  if (birdY>height) {
    return true;
  }
  else {
   return false; 
  }
  
}
