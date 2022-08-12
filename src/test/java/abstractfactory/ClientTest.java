package abstractfactory;

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
