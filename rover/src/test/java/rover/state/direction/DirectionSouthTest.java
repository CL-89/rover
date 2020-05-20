package rover.state.direction;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import rover.models.CardinalDirection;
import rover.utils.DirectionUtils;

public class DirectionSouthTest {

	@Test
	public void shouldReturnGetHeading() {
		Direction directionSouth = DirectionUtils.createDirection(new DirectionSouth());
		CardinalDirection expectedGetHeading = CardinalDirection.S;
		assertEquals(expectedGetHeading, directionSouth.getHeading());
	}

	@Test
	public void shouldReturnTurnLeft() {
		Direction directionSouth = DirectionUtils.createDirection(new DirectionSouth());
		CardinalDirection expectedGetHeading = CardinalDirection.E;
		assertEquals(expectedGetHeading, directionSouth.turnLeft());
	}

	@Test
	public void shouldReturnTurnRight() {
		Direction directionSouth = DirectionUtils.createDirection(new DirectionSouth());
		CardinalDirection expectedGetHeading = CardinalDirection.W;
		assertEquals(expectedGetHeading, directionSouth.turnRight());
	}

}
