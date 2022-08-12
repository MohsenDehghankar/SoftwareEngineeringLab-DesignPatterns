package abstractfactory.product.tree;

public abstract class AbstractTree {
    protected long height;
    protected String leafShape;

    public long getHeight() {
        return height;
    }

    public String getLeafShape() {
        return leafShape;
    }
}
