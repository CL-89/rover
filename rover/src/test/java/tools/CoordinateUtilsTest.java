package tools;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import rover.models.CardinalDirection;
import rover.models.Coordinate;
import rover.state.direction.Direction;
import rover.utils.CoordinateUtils;

public class CoordinateUtilsTest {

//	@Test
//	public void shouldReturnCoordinateBySplitCoordinate() {
//		DirectionUtils directionUtils = new DirectionUtils();
//		String s = "1 1 N";
//		Coordinate coordinate = new Coordinate();
//		Coordinate expectedCoordinate = CoordinateUtils.createCoordinate(1, 1, CardinalDirection.N);
//		int x = Integer.parseInt(String.valueOf(s.charAt(0)));
//		coordinate.setX(x);
//		int y = Integer.parseInt(String.valueOf(s.charAt(2)));
//		coordinate.setY(y);
//		Direction direction = directionUtils.getDirection(String.valueOf(s.charAt(4)));
//		coordinate.setHeading(direction.getHeading());
//		assertEquals(expectedCoordinate.getX(), coordinate.getX());
//		assertEquals(expectedCoordinate.getY(), coordinate.getY());
//		assertEquals(expectedCoordinate.getHeading(), coordinate.getHeading());
//	}
	
	@Test
	public void shouldReturnCoordinateBySplitCoordinate() {
		DirectionUtils directionUtils = new DirectionUtils();
		Coordinate coordinate = new Coordinate();
		Coordinate expectedCoordinate = CoordinateUtils.createCoordinate(1, 1, CardinalDirection.N);
		int x = Integer.parseInt("1");
		coordinate.setX(x);
		int y = Integer.parseInt("1");
		coordinate.setY(y);
		Direction direction = directionUtils.getDirection("N");
		coordinate.setHeading(direction.getHeading());
		assertEquals(expectedCoordinate.getX(), coordinate.getX());
		assertEquals(expectedCoordinate.getY(), coordinate.getY());
		assertEquals(expectedCoordinate.getHeading(), coordinate.getHeading());
	}
	
}
