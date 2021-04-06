import processing.core.PApplet;
public class TryProcessing extends PApplet{


    public static final int WIDTH = 500;
    public static final int HEIGHT = 500;
    int k=0;
    public static void main(String[] args) {
        PApplet.main("TryProcessing", args);

    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
        super.setup();
    }

    @Override
    public void draw() {
       // super.draw();
        //background(255);
        drawCircle();
    }

    private void drawCircle() {
        ellipse(k,height/5,10,10);
        ellipse(k*2,height*2/5,10,10);
        ellipse(k*3,height*3/5,10,10);
        ellipse(k*4,height*4/5,10,10);
        k++;
    }

}
