package prototype.shape;

public class Rectangle extends Shape {
    private final double width;
    private final double height;

    public Rectangle() {
        this.width = Math.random();
        this.height = Math.random();
    }

    public Rectangle(Rectangle prototype) {
        this.width = prototype.width;
        this.height = prototype.height;
    }

    @Override
    public Shape clone() {
        return new Rectangle(this);
    }

    @Override
    public boolean equals(Shape obj) {
        return obj instanceof Rectangle &&
                ((Rectangle) obj).height == this.height &&
                ((Rectangle) obj).width == this.width;
    }
}
