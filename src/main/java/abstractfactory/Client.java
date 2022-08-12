package abstractfactory;

import abstractfactory.factory.AbstractGardenCreator;
import abstractfactory.product.flower.AbstractFlower;
import abstractfactory.product.tree.AbstractTree;

public class Client {
    private final AbstractGardenCreator gardenCreator;
    private AbstractTree tree;
    private AbstractFlower flower;

    public Client(AbstractGardenCreator gardenCreator) {
        this.gardenCreator = gardenCreator;

        // Create garden
        this.initGarden();
    }

    private void initGarden() {
        this.tree = this.gardenCreator.createTree();
        this.flower = this.gardenCreator.createFlower();
    }

    public AbstractFlower getFlower() {
        return flower;
    }

    public AbstractTree getTree() {
        return tree;
    }
}
