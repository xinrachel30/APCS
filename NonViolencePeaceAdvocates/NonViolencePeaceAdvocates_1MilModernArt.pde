/*
NonViolencePeace :: Jeffery Tang, Xinqing Lin, May Qiu
APCS pd 06
HW105 -- 'Tis Hard to Search for 'Processing'
2022-05-23
time spent: .75 hr
*/

void setup() {
  size(480, 480);
}

void draw() {
  if (mousePressed) {
    fill(255);
  } else {
    fill(0);
  }
  square(mouseX, mouseY, 80);
  ellipse(mouseX,mouseY, mouseX, 80);
  triangle(mouseX,mouseY,mouseY,mouseX,mouseX,80);
}
