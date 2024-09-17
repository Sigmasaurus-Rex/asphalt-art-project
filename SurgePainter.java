import org.code.neighborhood.*;

public class SurgePainter extends PainterPlus{
    //calls all of the ethods that draws surge 
  public void drawSurge(){
    drawLeftEar();
    drawRightEar();
    drawHair();
    drawHead();
    
  }
  //draws the face of surge
  public void drawHead(){
    move();
    turnLeft();
    move();
    move();
    move();
    move();
    move();
    setPaint(7);
    paintToEmpty("red");
    turnLeft();
    move();
    turnLeft();
    move();
    setPaint(5);
    paintToEmpty("red");
    turnRight();
    move();
    turnRight();
    move();
    setPaint(3);
    paintToEmpty("white");
    setPaint(2);
    paintToEmpty("black");
    turnLeft();
    move();
    turnLeft();
    move();
    setPaint(1);
    paintToEmpty("black");
    setPaint(1);
    paintToEmpty("white");
    setPaint(3);
    paintToEmpty("black");
    turnRight();
    move();
    turnRight();
    move();
    setPaint(4);
    paintToEmpty("white");
    setPaint(1);
    paint("black");
    turnLeft();
    move();
    turnLeft();
    setPaint(5);
    paintToEmpty("black");
    turnRight();
    move();
    turnRight();
    move();
    setPaint(4);
    paintToEmpty("white");
    setPaint(1);
    paint("black");
    turnLeft();
    move();
    turnLeft();
    setPaint(1);
    paint("black");
    move();
    setPaint(4);
    paintToEmpty("white");
      turnRight();
    move();
    turnRight();
    move();
    setPaint(3);
    paintToEmpty("black");
    setPaint(4);
    paint("white");
    move();
    paint("black");
    turnLeft();
    move();
    turnLeft();
    paint("black");
    move();
    paint("black");
    move();
    setPaint(3);
    paintToEmpty("white");
    move();
    turnRight();
    move();
    turnRight();
    setPaint(5);
    move();
    move();
    paintToEmpty("red");
    turnLeft();
    move();
    turnLeft();
    move();
    setPaint(7);
    paintToEmpty("red");
    
    turnLeft();
    turnLeft();
    move();
    move();
    move();
    move();
    move();
    move();
    move();
    move();
    turnRight();
    move();
    setPaint(10);
    paintToEmpty("gray");
    
    
  }
  //draws the top of surges hair 
  public void drawHair(){
    move();
    turnLeft();
    move();
    move();
    move();
    move();
    move();
    move();
    move();
    setPaint(1);
    paintToEmpty("gold");
    move();
    turnRight();
    move();
    turnRight();
    setPaint(1);
    paintToEmpty("gold");
    setPaint(1);
    paintToEmpty("yellow");
    setPaint(1);
    paintToEmpty("gold");
    setPaint(1);
    paintToEmpty("yellow");
    setPaint(2);
    paintToEmpty("gold");
    turnLeft();
    move();
    turnLeft();
    setPaint(8);
      paintToEmpty("orange");
    
  }
  //draws the left ear of surge 
  public void drawLeftEar(){
    turnRight();
    move();
    move();
    move();
    move();
    setPaint(7);
    paintToEmpty("gold");

    turnLeft();
    move();
    turnLeft();
    move();
    setPaint(7);
    paintToEmpty("gold");
  }
  //draws the right ear of surge 
  public void drawRightEar(){
    turnRight();
    while(canMove()){
      move();
    }
   turnRight();
    move();
    setPaint(7);
    paintToEmpty("gold");
    turnRight();
    move();
    turnRight();
    move();
    setPaint(7);
    paintToEmpty("gold");
  }
}


  
