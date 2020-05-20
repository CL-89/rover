package tools;

/**
 * @author Cécile Legaz
 * @version 20.05.2020
 *
 */
import rover.state.direction.Direction;
import rover.state.direction.DirectionEast;
import rover.state.direction.DirectionNorth;
import rover.state.direction.DirectionSouth;
import rover.state.direction.DirectionWest;

public class DirectionUtils {

	public DirectionUtils() {
//		empty constructor
	}

	/**
	 * This method enables to switch direction : North, South, East or West
	 * 
	 * @param s
	 * @return Direction
	 */
	public Direction getDirection(String s) {
		Direction direction = new Direction();

		if (s.equals("N")) {
			direction.setState(new DirectionNorth());
		} else if (s.equals("S")) {
			direction.setState(new DirectionSouth());
		} else if (s.equals("E")) {
			direction.setState(new DirectionEast());
		} else if (s.equals("W")) {
			direction.setState(new DirectionWest());
		}
		return direction;
	}

}
