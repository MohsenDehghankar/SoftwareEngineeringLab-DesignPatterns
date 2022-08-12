package abstractfactory.factory;

import abstractfactory.product.flower.AbstractFlower;
import abstractfactory.product.flower.JapaneseFlower;
import abstractfactory.product.tree.AbstractTree;
import abstractfactory.product.tree.JapaneseTree;

public class JapaneseGardenCreator extends AbstractGardenCreator {
    @Override
    public AbstractFlower createFlower() {
        return new JapaneseFlower();
    }

    @Override
    public AbstractTree createTree() {
        return new JapaneseTree();
    }
}
