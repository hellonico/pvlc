import net.hellonico.pvlc.*;

pvlcLibrary vlc;

void setup() {
  size(400,400);
  smooth();
    
  PFont font = createFont("",40);
  textFont(font);
  
  vlc = new pvlcLibrary(this);
  vlc.play(dataPath("fckindidit.mp3"));
  
}

void draw() {
  background(0);
  fill(255);
  
  text("hello", mouseX, mouseY);
}

