package tools;

/**
 * @author Cécile Legaz
 * @version 20.05.2020
 *
 */
import rover.models.Coordinate;
import rover.state.direction.Direction;

public class CoordinateUtils {

	DirectionUtils directionUtils = new DirectionUtils();

	public CoordinateUtils() {
//		empty constructor
	}

	/**
	 * This method enables to split the coordinate string to character
	 * 
	 * @param s
	 * @return Coordinate
	 */
	public Coordinate splitCoordinate(String s) {

		Coordinate coordinate = new Coordinate();

		int x = Integer.parseInt(String.valueOf(s.charAt(0)));
		coordinate.setX(x);

		int y = Integer.parseInt(String.valueOf(s.charAt(2)));
		coordinate.setY(y);

		Direction direction = directionUtils.getDirection(String.valueOf(s.charAt(4)));
		coordinate.setHeading(direction.getHeading());

		return coordinate;
	}

}
