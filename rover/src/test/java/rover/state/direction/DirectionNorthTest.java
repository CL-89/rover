package rover.state.direction;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import rover.models.CardinalDirection;
import rover.utils.DirectionUtils;

public class DirectionNorthTest {

	@Test
	public void shouldReturnGetHeading() {
		Direction directionNorth = DirectionUtils.createDirection(new DirectionNorth());
		CardinalDirection expectedGetHeading = CardinalDirection.N;
		assertEquals(expectedGetHeading, directionNorth.getHeading());
	}

	@Test
	public void shouldReturnTurnLeft() {
		Direction directionNorth = DirectionUtils.createDirection(new DirectionNorth());
		CardinalDirection expectedGetHeading = CardinalDirection.W;
		assertEquals(expectedGetHeading, directionNorth.turnLeft());
	}

	@Test
	public void shouldReturnTurnRight() {
		Direction directionNorth = DirectionUtils.createDirection(new DirectionNorth());
		CardinalDirection expectedGetHeading = CardinalDirection.E;
		assertEquals(expectedGetHeading, directionNorth.turnRight());
	}

}
