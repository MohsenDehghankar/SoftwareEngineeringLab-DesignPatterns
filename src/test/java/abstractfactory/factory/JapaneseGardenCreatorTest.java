package abstractfactory.factory;

import abstractfactory.product.flower.AbstractFlower;
import abstractfactory.product.flower.JapaneseFlower;
import abstractfactory.product.tree.AbstractTree;
import abstractfactory.product.tree.JapaneseTree;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class JapaneseGardenCreatorTest {
    @Test
    void whenCallingCreateTreeMethod_shouldReturnCorrectTreeType() {
        // Given
        JapaneseGardenCreator japaneseGardenCreator = new JapaneseGardenCreator();

        // When
        AbstractTree createdTree = japaneseGardenCreator.createTree();

        // Then
        assertInstanceOf(JapaneseTree.class, createdTree);
    }

    @Test
    void whenCallingCreateFlowerMethod_shouldReturnCorrectFlowerType() {
        // Given
        JapaneseGardenCreator japaneseGardenCreator = new JapaneseGardenCreator();

        // When
        AbstractFlower createdFlower = japaneseGardenCreator.createFlower();

        // Then
        assertInstanceOf(JapaneseFlower.class, createdFlower);
    }
}
