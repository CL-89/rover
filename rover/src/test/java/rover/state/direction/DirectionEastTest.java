package rover.state.direction;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import rover.models.CardinalDirection;
import rover.utils.DirectionUtils;

public class DirectionEastTest {

	@Test
	public void shouldReturnGetHeading() {
		Direction directionEast = DirectionUtils.createDirection(new DirectionEast());
		CardinalDirection expectedGetHeading = CardinalDirection.E;
		assertEquals(expectedGetHeading, directionEast.getHeading());
	}

	@Test
	public void shouldReturnTurnLeft() {
		Direction directionEast = DirectionUtils.createDirection(new DirectionEast());
		CardinalDirection expectedGetHeading = CardinalDirection.N;
		assertEquals(expectedGetHeading, directionEast.turnLeft());
	}

	@Test
	public void shouldReturnTurnRight() {
		Direction directionEast = DirectionUtils.createDirection(new DirectionEast());
		CardinalDirection expectedGetHeading = CardinalDirection.S;
		assertEquals(expectedGetHeading, directionEast.turnRight());
	}

}
