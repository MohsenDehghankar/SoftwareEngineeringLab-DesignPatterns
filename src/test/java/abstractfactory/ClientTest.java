package abstractfactory;

import abstractfactory.factory.AbstractGardenCreator;
import abstractfactory.factory.IranianGardenCreator;
import abstractfactory.factory.JapaneseGardenCreator;
import abstractfactory.product.flower.JapaneseFlower;
import abstractfactory.product.flower.KhatmiFlower;
import abstractfactory.product.tree.ChenarTree;
import abstractfactory.product.tree.JapaneseTree;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ClientTest {
    @Test
    void whenCreatingANewClient_gardenShouldBeCreatedCorrectly() {
        // Given
        AbstractGardenCreator japaneseGardenCreator = new JapaneseGardenCreator();
        AbstractGardenCreator iranianGardenCreator = new IranianGardenCreator();

        // When
        Client clientWithJapaneseCreator = new Client(japaneseGardenCreator);
        Client clientWithIranianCreator = new Client(iranianGardenCreator);

        // Then
        assertInstanceOf(ChenarTree.class, clientWithIranianCreator.getTree());
        assertInstanceOf(KhatmiFlower.class, clientWithIranianCreator.getFlower());
        assertInstanceOf(JapaneseTree.class, clientWithJapaneseCreator.getTree());
        assertInstanceOf(JapaneseFlower.class, clientWithJapaneseCreator.getFlower());
    }
}
