package rover.models;


import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CardinalDirectionTest {

	@Test
    public void shouldReturnCadinalDirection() {
		assertEquals("E", CardinalDirection.E.name());
		assertEquals("N", CardinalDirection.N.name());
		assertEquals("S", CardinalDirection.S.name());
		assertEquals("W", CardinalDirection.W.name());
    }
}
