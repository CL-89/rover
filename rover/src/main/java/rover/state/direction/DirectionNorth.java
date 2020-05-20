package rover.state.direction;

/**
 * @author Cécile Legaz
 * @version 20.05.2020
 *
 */
import rover.models.CardinalDirection;
import rover.state.impl.HeadingState;

public class DirectionNorth implements HeadingState {

	/**
	 * This method returns actual direction
	 * 
	 * @return CardinalDirection
	 */
	@Override
	public CardinalDirection getHeading(Direction context) {
		return CardinalDirection.N;
	}

	/**
	 * This method returns actual direction after turn left
	 * 
	 * @return CardinalDirection
	 */
	@Override
	public CardinalDirection turnLeft(Direction context) {
		return CardinalDirection.W;
	}

	/**
	 * This method returns actual direction after turn right
	 * 
	 * @return CardinalDirection
	 */
	@Override
	public CardinalDirection turnRight(Direction context) {
		return CardinalDirection.E;
	}
}
