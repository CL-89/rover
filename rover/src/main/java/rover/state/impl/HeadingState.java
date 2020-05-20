package rover.state.impl;
/**
 * @author Cécile Legaz
 * @version 20.05.2020
 *
 */
import rover.models.CardinalDirection;
import rover.state.direction.Direction;

public interface HeadingState {
	
	CardinalDirection getHeading(Direction context);
	
	CardinalDirection turnLeft(Direction context);
	
	CardinalDirection turnRight(Direction context);

}
