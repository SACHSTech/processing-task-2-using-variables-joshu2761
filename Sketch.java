import processing.core.PApplet;

public class Sketch extends PApplet {
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
    size(500, 500);
  }

  public void setup() {

    background(77, 160, 255);
  }

  public void draw() {

    //Draws the sun
    fill(255, 136, 0);
    ellipse((float)(width), (float)(height * 0), (float)(width / 2.5), (float)(width / 2.5));

    //Draws the ground
    fill(29, 201, 2);
    strokeWeight(0);
    rect(0, (float)(height / 1.14), width, (float)(height / 8));
    
    //Draws base of the house
    fill(255, 222, 59);
    strokeWeight(0);
    rect((float)(width / 1.6), (float)(height / 1.6), (float)(width / 4), (float)(height / 4));

    //Draws door of the house
    fill(122, 81, 58);
    stroke(185, 122, 87);
    strokeWeight((float)(width / 80));
    rect((float)(width / 1.5), (float)(height / 1.33), (float)(width / 20), (float)(height / 8));

    //Draws window of the house
    fill(255, 255, 255);
    stroke(0, 0, 0);
    strokeWeight(2);
    rect((float)(width / 1.33), (float)(height / 1.33), (float)(width / 10), (float)(height / 10));

    //Draws the roof of the house
    fill(166, 0, 0);
    strokeWeight(0);
    triangle((float)(width / 1.6), (float)(height / 1.6), (float)(width / 1.33), (float)(height / 2), (float)(width / 1.14), (float)(height / 1.6));

    //Draws a tree
    //Stem:
    stroke(122, 81, 58);
    strokeWeight((float)(width/16));
    line((float)(width / 4), (float)(height / 1.14), (float)(width / 4), (float)(height / 1.6));
    //Leaves:
    strokeWeight(0);
    fill(4, 122, 0);
    ellipse((float)(width / 4), (float)(height / 2), (float)(width / 4), (float)(height / 4));

    //Clouds
    fill(255, 255, 255);
    stroke(255, 255, 255);
    //Cloud 1:
    ellipse((float)(width / 4), (float)(height / 4), (float)(width / 8), (float)(height / 8));
    ellipse((float)(width / 4) + (float)(width / 10), (float)(height / 4), (float)(width / 8), (float)(height / 8));
    ellipse((float)(width / 4) + (float)(width / 10) * 2, (float)(height / 4), (float)(width / 8), (float)(height / 8));
  }
}