
void setup() {
    size(1000, 1000);
    fill(#3E2A00);
    ellipse(500, 500, 800, 800);
    fill(#AD1D00);
    ellipse(500, 500, 700, 700);
    fill(#EA4524);
}
void draw() {
    
    if (mousePressed) {
      ellipse(mouseX, mouseY, 20, 20);
      
      
    }
}
