package abstractfactory.factory;

import abstractfactory.product.flower.AbstractFlower;
import abstractfactory.product.tree.AbstractTree;

public abstract class AbstractGardenCreator {
    public abstract AbstractFlower createFlower();

    public abstract AbstractTree createTree();
}
