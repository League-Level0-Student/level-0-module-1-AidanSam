
void setup() {
size(750, 750);
PImage face = loadImage("unnamed.png");
image(face, 100, 100);
}
void draw() {
  fill(#FF2D03);
if(mousePressed){
  ellipse(mouseX, mouseY, 40, 40);
  fill(#030303);
  ellipse(mouseX, mouseY, 10, 10);
  
}
}
