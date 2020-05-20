package rover.models;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import rover.utils.CoordinateUtils;

public class CoordinateTest {
	
	@Test
    public void shouldReturnCoordinate() {
		Coordinate coordinate = CoordinateUtils.createCoordinate(1, 1, CardinalDirection.N);
		assertEquals(1, coordinate.getX());
		assertEquals(1, coordinate.getY());
		assertEquals(CardinalDirection.N, coordinate.getHeading());
    }
	
	@Test
    public void shouldReturnCoordinateToString() {
		Coordinate coordinate = CoordinateUtils.createCoordinate(2, 2, CardinalDirection.S);
		String expectedToString = coordinate.getX()+" "+coordinate.getY()+" "+coordinate.getHeading();
		assertEquals(expectedToString, coordinate.toString());
    }

}
