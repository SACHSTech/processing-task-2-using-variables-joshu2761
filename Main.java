import processing.core.PApplet;

/**
 * Draws an image with variables and proportions instead of coordinates
 * @JoshuaYin
 *
 */
class Main {
  public static void main(String[] args) {
    
    String[] processingArgs = {"MySketch"};
	  Sketch mySketch = new Sketch();
	  PApplet.runSketch(processingArgs, mySketch);
  }
  
}