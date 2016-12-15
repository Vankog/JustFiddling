import processing.core.PApplet;

public class Main extends PApplet {
    TestObject obj;

    public static void main(String[] args) {
        PApplet.main("Main", args);
    }

    public void settings(){
        size(640, 480);
    }

    public void setup(){
        background(0);
        obj = new TestObject(this);

    }

    public void draw(){
        obj.update();
        obj.draw();

    }
}
