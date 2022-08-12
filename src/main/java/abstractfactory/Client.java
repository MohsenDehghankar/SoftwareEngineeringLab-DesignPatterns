package abstractfactory;

import abstractfactory.factory.AbstractGardenCreator;
import abstractfactory.product.flower.AbstractFlower;
import abstractfactory.product.tree.AbstractTree;

public class Client {
    private AbstractGardenCreator gardenCreator;
    private AbstractTree tree;
    private AbstractFlower flower;

    public Client(AbstractGardenCreator gardenCreator) {
        this.gardenCreator = gardenCreator;
    }

    private void initGarden() {
        throw new RuntimeException();
    }

    public AbstractFlower getFlower() {
        return flower;
    }

    public AbstractTree getTree() {
        return tree;
    }
}
