package rover.state.direction;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import rover.models.CardinalDirection;
import rover.utils.DirectionUtils;

public class DirectionWestTest {

	@Test
	public void shouldReturnGetHeading() {
		Direction directionWest = DirectionUtils.createDirection(new DirectionWest());
		CardinalDirection expectedGetHeading = CardinalDirection.W;
		assertEquals(expectedGetHeading, directionWest.getHeading());
	}

	@Test
	public void shouldReturnTurnLeft() {
		Direction directionWest = DirectionUtils.createDirection(new DirectionWest());
		CardinalDirection expectedGetHeading = CardinalDirection.S;
		assertEquals(expectedGetHeading, directionWest.turnLeft());
	}

	@Test
	public void shouldReturnTurnRight() {
		Direction directionWest = DirectionUtils.createDirection(new DirectionWest());
		CardinalDirection expectedGetHeading = CardinalDirection.N;
		assertEquals(expectedGetHeading, directionWest.turnRight());
	}

}
