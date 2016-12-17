/* Processing in IntelliJ: http://proto.ink/2016/06/03/processing-in-intellij-combining-proper-java-with-processing/
 */
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
        obj = new TestObject(this);

    }

    public void draw(){
        background(0);
        obj.update();
        obj.draw();

    }
}
