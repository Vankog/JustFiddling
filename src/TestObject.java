import processing.core.PApplet;
import processing.core.PVector;

/**
 * Created by danie on 15.12.2016.
 */
public class TestObject {
    Main sketch;
    PVector loc;

    TestObject(Main sketch){
        this.sketch = sketch;
        loc = new PVector(sketch.width/2, sketch.height/2);
    }
    public void draw() {
        sketch.stroke(255);
        sketch.strokeWeight(2);
        sketch.fill(150);
        sketch.ellipse(loc.x, loc.y, 30, 40);
    }

    public void update() {
        loc.add((float)1,(float)0.1);
    }
}
