package prototype;

import org.junit.jupiter.api.Test;
import prototype.shape.Shape;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class ClientTest {
    @Test
    void whenCallingTheOperation_aCopyOfAllShapesShouldBeReturned() {
        // Given
        Client client = new Client();

        // When
        List<Shape> operationResult = client.operation();

        // Then
        assertNotEquals(client.getInitialShapes(), operationResult); // Assert that the exact objects are not returned (a cloned object should be returned)
        for (int i = 0; i < client.getInitialShapes().size(); i++) {
            assert client.getInitialShapes().get(i).equals(operationResult.get(i)); // Assert that the fields of prototypes are equal to the initial object
        }
    }
}
