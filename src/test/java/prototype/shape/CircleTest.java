package prototype.shape;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CircleTest {
    @Test
    void whenCloningTheCircle_returnedObjectShouldBeEqualToInitialObject() {
        // Given
        Circle initialCircle = new Circle();

        // When
        Shape clonedCircle = initialCircle.clone();

        // Then
        assert initialCircle.equals(clonedCircle);
    }
}
