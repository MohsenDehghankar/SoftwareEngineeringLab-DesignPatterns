package prototype;

import prototype.shape.Shape;

import java.util.ArrayList;
import java.util.List;

public class Client {
    private List<Shape> initialShapes;

    public Client() {
        this.initialShapes = new ArrayList<>();
    }

    public List<Shape> getInitialShapes() {
        return initialShapes;
    }

    public List<Shape> operation() {
        throw new RuntimeException();
    }
}
