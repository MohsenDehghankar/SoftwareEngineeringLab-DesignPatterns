package prototype.shape;

public class Circle extends Shape {
    private final double radius;

    public Circle(Circle prototype) {
        this.radius = prototype.radius;
    }

    public Circle() {
        this.radius = Math.random();
    }

    @Override
    public Shape clone() {
        return new Circle(this);
    }

    @Override
    public boolean equals(Shape obj) {
        return obj instanceof Circle &&
                ((Circle) obj).radius == this.radius;
    }
}
