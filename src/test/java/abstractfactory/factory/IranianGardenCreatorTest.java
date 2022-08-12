package abstractfactory.factory;

import abstractfactory.product.flower.AbstractFlower;
import abstractfactory.product.flower.KhatmiFlower;
import abstractfactory.product.tree.AbstractTree;
import abstractfactory.product.tree.ChenarTree;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class IranianGardenCreatorTest {
    @Test
    void whenCallingCreateTreeMethod_shouldReturnCorrectTreeType() {
        // Given
        IranianGardenCreator iranianGardenCreator = new IranianGardenCreator();

        // When
        AbstractTree createdTree = iranianGardenCreator.createTree();

        // Then
        assertInstanceOf(ChenarTree.class, createdTree);
    }

    @Test
    void whenCallingCreateFlowerMethod_shouldReturnCorrectFlowerType() {
        // Given
        IranianGardenCreator iranianGardenCreator = new IranianGardenCreator();

        // When
        AbstractFlower createdFlower = iranianGardenCreator.createFlower();

        // Then
        assertInstanceOf(KhatmiFlower.class, createdFlower);
    }
}
