package tools;

/**
 * @author Cécile Legaz
 * @version 20.05.2020
 *
 */
import java.util.stream.Stream;

import rover.models.CardinalDirection;
import rover.models.Command;
import rover.models.Coordinate;
import rover.state.direction.Direction;

public class CommandUtils {

	DirectionUtils directionUtils = new DirectionUtils();

	public CommandUtils() {
//		empty constructor
	}

	/**
	 * This method enables to split the command string to character
	 * 
	 * @param s
	 * @param coordinate
	 * @return Direction
	 */
	public Direction splitCommand(String s, Coordinate coordinate) {

		Direction direction = new Direction();
		Stream<Character> characterStream = null;

		try {
			characterStream = s.chars().mapToObj(c -> (char) c);
			characterStream.forEach(c -> selectDirectionOrMove(String.valueOf(c), coordinate));
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (characterStream != null) {
				characterStream.close();
			}
		}

		return direction;
	}

	/**
	 * This method enables to switch according to command : left, right or move
	 * 
	 * @param s
	 * @param coordinate
	 * @return Direction
	 */
	public Direction selectDirectionOrMove(String s, Coordinate coordinate) {
		Direction direction = directionUtils.getDirection(String.valueOf(coordinate.getHeading()));

		if (s.equals(Command.LEFT.getShortName())) {
			coordinate.setHeading(direction.turnLeft());

		} else if (s.equals(Command.RIGHT.getShortName())) {
			coordinate.setHeading(direction.turnRight());
		} else {
			move(coordinate);
		}
		return direction;
	}

	/**
	 * This method returns coordinate after command to move
	 * 
	 * @param coordinate
	 * @return Coordinate
	 */
	public Coordinate move(Coordinate coordinate) {
		if (coordinate.getHeading() == CardinalDirection.E) {
			coordinate.setX(coordinate.getX() + 1);
		} else if (coordinate.getHeading() == CardinalDirection.W) {
			if (coordinate.getX() <= 0) {
				coordinate.setX(0);
			} else {
				coordinate.setX(coordinate.getX() - 1);
			}
		} else if (coordinate.getHeading() == CardinalDirection.N) {
			coordinate.setY(coordinate.getY() + 1);
		} else {
			if (coordinate.getY() <= 0) {
				coordinate.setY(0);
			} else {
				coordinate.setY(coordinate.getY() - 1);
			}
		}
		return coordinate;
	}

}
