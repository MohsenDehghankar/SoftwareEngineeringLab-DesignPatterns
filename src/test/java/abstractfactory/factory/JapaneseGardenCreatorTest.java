package abstractfactory.factory;

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
