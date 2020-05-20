package tools;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import rover.models.CardinalDirection;
import rover.state.direction.Direction;
import rover.state.direction.DirectionEast;
import rover.state.direction.DirectionNorth;
import rover.state.direction.DirectionSouth;
import rover.state.direction.DirectionWest;

public class DirectionUtilsTest {

	@Test
	public void shouldReturnDirectionNorthIfNCardinalDirection() {
		Direction direction = new Direction();
		direction.setState(new DirectionNorth());
		assertEquals(CardinalDirection.N, direction.getHeading());
	}
	
	@Test
	public void shouldReturnDirectionSouthIfSCardinalDirection() {
		Direction direction = new Direction();
		direction.setState(new DirectionSouth());
		assertEquals(CardinalDirection.S, direction.getHeading());
	}
	
	@Test
	public void shouldReturnDirectionWestIfWCardinalDirection() {
		Direction direction = new Direction();
		direction.setState(new DirectionWest());
		assertEquals(CardinalDirection.W, direction.getHeading());
	}
	
	@Test
	public void shouldReturnDirectionEastIfECardinalDirection() {
		Direction direction = new Direction();
		direction.setState(new DirectionEast());
		assertEquals(CardinalDirection.E, direction.getHeading());
	}
		
		
}
