package prototype.shape;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RectangleTest {
    @Test
    void whenCloningARectangle_returnedObjectShouldBeEqualToInitialObject() {
        // Given
        Rectangle initialRectangle = new Rectangle();

        // When
        Shape clonedRectangle = initialRectangle.clone();

        // Then
        assertEquals(initialRectangle, clonedRectangle);
    }
}
