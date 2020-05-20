package rover.state.direction;

/**
 * @author Cécile Legaz
 * @version 20.05.2020
 *
 */
import rover.models.CardinalDirection;
import rover.state.impl.HeadingState;

public class Direction {

	private HeadingState headingState;

	public void setState(HeadingState headingState) {
		this.headingState = headingState;
	}

	/**
	 * This method returns actual direction
	 * 
	 * @return CardinalDirection
	 */
	public CardinalDirection getHeading() {
		return headingState.getHeading(this);
	}

	/**
	 * This method returns actual direction after turn left
	 * 
	 * @return CardinalDirection
	 */
	public CardinalDirection turnLeft() {
		return headingState.turnLeft(this);
	}

	/**
	 * This method returns actual direction after turn right
	 * 
	 * @return CardinalDirection
	 */
	public CardinalDirection turnRight() {
		return headingState.turnRight(this);
	}

}
