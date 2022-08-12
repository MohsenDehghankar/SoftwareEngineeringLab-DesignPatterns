package prototype;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ClientTest {
    @Test
    void whenCallingTheOperation_aCopyOfAllShapesShouldBeReturned() {
        // Given
        Client client = new Client();

        // When
        List<Shape> operationResult = client.operation();

        // Then
        assertArrayEquals(client.initialShapes, operationResult);
    }
}
