package abstractfactory.factory;

import abstractfactory.product.flower.AbstractFlower;
import abstractfactory.product.flower.KhatmiFlower;
import abstractfactory.product.tree.AbstractTree;
import abstractfactory.product.tree.ChenarTree;

public class IranianGardenCreator extends AbstractGardenCreator {
    @Override
    public AbstractFlower createFlower() {
        return new KhatmiFlower();
    }

    @Override
    public AbstractTree createTree() {
        return new ChenarTree();
    }
}
