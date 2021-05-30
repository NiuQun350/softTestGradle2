package nl.tudelft.jpacman.board;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Test suite to confirm that {@link Unit}s correctly (de)occupy squares.
 *
 * @author Jeroen Roosen 
 *
 */
class OccupantTest {

    /**
     * The unit under test.
     */
    private Unit unit;

    /**
     * Resets the unit under test.
     */
    @BeforeEach
    void setUp() {
        unit = new BasicUnit();
    }

    /**
     * Asserts that a unit has no square to start with.
     */
    @Test
    void noStartSquare() {
        // Remove the following placeholder:
        // assertThat(unit).isNotNull();
        assertThat(unit.hasSquare()).isEqualTo(false);
    }

    /**
     * Tests that the unit indeed has the target square as its base after
     * occupation.
     */
    @Test
    void testOccupy() {
        // Remove the following placeholder:
        // assertThat(unit).isNotNull();
        Square square = new BasicSquare();
        unit.occupy(square);
        assertThat(unit.getSquare()).isEqualTo(square);
    }

    /**
     * Test that the unit indeed has the target square as its base after
     * double occupation.
     */
    @Test
    void testReoccupy() {
        // Remove the following placeholder:
        // assertThat(unit).isNotNull();
        Square square = new BasicSquare();
        Square square1 = new BasicSquare();

        unit.occupy(square);
        assertThat(unit.getSquare()).isEqualTo(square);

        unit.occupy(square1);
        Assertions.assertFalse(square.getOccupants().contains(unit));
        assertThat(unit.getSquare()).isEqualTo(square1);
    }
}
