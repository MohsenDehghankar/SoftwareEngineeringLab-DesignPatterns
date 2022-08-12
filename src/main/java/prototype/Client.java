package prototype;

import prototype.shape.Circle;
import prototype.shape.Rectangle;
import prototype.shape.Shape;

import java.util.ArrayList;
import java.util.List;

public class Client {
    private final List<Shape> initialShapes;

    public Client() {
        this.initialShapes = List.of(
                new Circle(),
                new Rectangle()
        );
    }

    public List<Shape> getInitialShapes() {
        return initialShapes;
    }

    public List<Shape> operation() {
        List<Shape> clonedShapes = new ArrayList<>();

        for (Shape initialShape : initialShapes) {
            clonedShapes.add(initialShape.clone());
        }

        return clonedShapes;
    }
}
