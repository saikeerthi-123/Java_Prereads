import processing.core.PApplet;

public class TryProcessing extends PApplet {

    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;
    public static final int DIAMETER = 10;
    public static int position = 0;

    public static void main(String[] args) {
        PApplet.main("TryProcessing", args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH,  HEIGHT);
    }

    @Override
    public void setup() {
       // ellipse(WIDTH/2,HEIGHT/2,100,100);
    }

    @Override
    public void draw() {
        for (int speed = 1; speed <= 4; speed++) {
            ball(speed*position,speed*HEIGHT/5);
        }
        position +=1;
    }

    private void ball(int positionX, int height) {
        ellipse(positionX,height,DIAMETER, DIAMETER);
    }


}