package abstractfactory.factory;

import abstractfactory.product.flower.AbstractFlower;
import abstractfactory.product.tree.AbstractTree;

public class IranianGardenCreator extends AbstractGardenCreator{
    @Override
    public AbstractFlower createFlower() {
        throw new RuntimeException();
    }

    @Override
    public AbstractTree createTree() {
        throw new RuntimeException();
    }
}
