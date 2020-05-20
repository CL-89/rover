package tools;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import rover.models.CardinalDirection;
import rover.models.Command;
import rover.models.Coordinate;
import rover.state.direction.Direction;
import rover.state.direction.DirectionNorth;
import rover.utils.CoordinateUtils;
import rover.utils.DirectionUtils;

public class CommandUtilsTest {

	@Test
	public void shouldReturnCoordinateByMoveWithECardinalDirection() {
		CommandUtils commandUtils = new CommandUtils();
		Coordinate coordinateBeforeMoveWithECardinalDirection = CoordinateUtils.createCoordinate(1, 1,
				CardinalDirection.E);
		Coordinate expectedCoordinateAfterMoveWithECardinalDirection = CoordinateUtils.createCoordinate(2, 1,
				CardinalDirection.E);
		Coordinate coordinateAfterMoveWithECardinalDirection = commandUtils
				.move(coordinateBeforeMoveWithECardinalDirection);
		assertEquals(expectedCoordinateAfterMoveWithECardinalDirection.getX(),
				coordinateAfterMoveWithECardinalDirection.getX());
		assertEquals(expectedCoordinateAfterMoveWithECardinalDirection.getY(),
				coordinateAfterMoveWithECardinalDirection.getY());
		assertEquals(expectedCoordinateAfterMoveWithECardinalDirection.getHeading(),
				coordinateAfterMoveWithECardinalDirection.getHeading());
	}

	@Test
	public void shouldReturnCoordinateByMoveWithNCardinalDirection() {
		CommandUtils commandUtils = new CommandUtils();
		Coordinate coordinateBeforeMoveWithNCardinalDirection = CoordinateUtils.createCoordinate(1, 1,
				CardinalDirection.N);
		Coordinate expectedCoordinateAfterMoveWithNCardinalDirection = CoordinateUtils.createCoordinate(1, 2,
				CardinalDirection.N);
		Coordinate coordinateAfterMoveWithNCardinalDirection = commandUtils
				.move(coordinateBeforeMoveWithNCardinalDirection);
		assertEquals(expectedCoordinateAfterMoveWithNCardinalDirection.getX(),
				coordinateAfterMoveWithNCardinalDirection.getX());
		assertEquals(expectedCoordinateAfterMoveWithNCardinalDirection.getY(),
				coordinateAfterMoveWithNCardinalDirection.getY());
		assertEquals(expectedCoordinateAfterMoveWithNCardinalDirection.getHeading(),
				coordinateAfterMoveWithNCardinalDirection.getHeading());
	}

	@Test
	public void shouldReturnCoordinateByMoveWithSCardinalDirection() {
		CommandUtils commandUtils = new CommandUtils();
		Coordinate coordinateBeforeMoveWithSCardinalDirection = CoordinateUtils.createCoordinate(1, 1,
				CardinalDirection.S);
		Coordinate expectedCoordinateAfterMoveWithSCardinalDirection = CoordinateUtils.createCoordinate(1, 0,
				CardinalDirection.S);
		Coordinate coordinateAfterMoveWithSCardinalDirection = commandUtils
				.move(coordinateBeforeMoveWithSCardinalDirection);
		assertEquals(expectedCoordinateAfterMoveWithSCardinalDirection.getX(),
				coordinateAfterMoveWithSCardinalDirection.getX());
		assertEquals(expectedCoordinateAfterMoveWithSCardinalDirection.getY(),
				coordinateAfterMoveWithSCardinalDirection.getY());
		assertEquals(expectedCoordinateAfterMoveWithSCardinalDirection.getHeading(),
				coordinateAfterMoveWithSCardinalDirection.getHeading());
	}

	@Test
	public void shouldReturnCoordinateByMoveWithWCardinalDirection() {
		CommandUtils commandUtils = new CommandUtils();
		Coordinate coordinateBeforeMoveWithWCardinalDirection = CoordinateUtils.createCoordinate(1, 1,
				CardinalDirection.W);
		Coordinate expectedCoordinateAfterMoveWithWCardinalDirection = CoordinateUtils.createCoordinate(0, 1,
				CardinalDirection.W);
		Coordinate coordinateAfterMoveWithWCardinalDirection = commandUtils
				.move(coordinateBeforeMoveWithWCardinalDirection);
		assertEquals(expectedCoordinateAfterMoveWithWCardinalDirection.getX(),
				coordinateAfterMoveWithWCardinalDirection.getX());
		assertEquals(expectedCoordinateAfterMoveWithWCardinalDirection.getY(),
				coordinateAfterMoveWithWCardinalDirection.getY());
		assertEquals(expectedCoordinateAfterMoveWithWCardinalDirection.getHeading(),
				coordinateAfterMoveWithWCardinalDirection.getHeading());

	}

	@Test
	public void shouldReturnDirectionBySelectDirectionOrMoveIfCommandLeft() {
		Coordinate coordinate = CoordinateUtils.createCoordinate(1, 1, CardinalDirection.N);
		Direction direction = DirectionUtils.createDirection(new DirectionNorth());
		Coordinate expectedCoordinateAfterTurnLeft = CoordinateUtils.createCoordinate(1, 1, CardinalDirection.W);
		String s = "L";
		assertNotNull(s);
		CommandUtils commandUtils = new CommandUtils();
		commandUtils.splitCommand(s, coordinate);
		Direction expectedDirection = DirectionUtils.getDirection(String.valueOf(coordinate.getHeading()));
		assertEquals(expectedCoordinateAfterTurnLeft.getHeading(), coordinate.getHeading());
		assertEquals(expectedDirection.getHeading(), direction.turnLeft());
		assertEquals(s, Command.LEFT.getShortName());
	}

	@Test
	public void shouldReturnDirectionBySelectDirectionOrMoveIfCommandRight() {
		Coordinate coordinate = CoordinateUtils.createCoordinate(1, 1, CardinalDirection.N);
		Direction direction = DirectionUtils.createDirection(new DirectionNorth());
		Coordinate expectedCoordinateAfterTurnRight = CoordinateUtils.createCoordinate(1, 1, CardinalDirection.E);
		String s = "R";
		assertNotNull(s);
		CommandUtils commandUtils = new CommandUtils();
		commandUtils.splitCommand(s, coordinate);
		Direction expectedDirection = DirectionUtils.getDirection(String.valueOf(coordinate.getHeading()));
		assertEquals(expectedCoordinateAfterTurnRight.getHeading(), coordinate.getHeading());
		assertEquals(expectedDirection.getHeading(), direction.turnRight());
		assertEquals(s, Command.RIGHT.getShortName());
	}

	@Test
	public void shouldReturnDirectionBySelectDirectionOrMoveIfCommandMove() {
		Coordinate coordinate = CoordinateUtils.createCoordinate(1, 1, CardinalDirection.N);
		Direction direction = DirectionUtils.createDirection(new DirectionNorth());
		Coordinate expectedCoordinateAfterMove = CoordinateUtils.createCoordinate(1, 2, CardinalDirection.N);
		String s = "M";
		assertNotNull(s);
		CommandUtils commandUtils = new CommandUtils();
		commandUtils.splitCommand(s, coordinate);
		Direction expectedDirection = DirectionUtils.getDirection(String.valueOf(coordinate.getHeading()));
		assertEquals(expectedCoordinateAfterMove.getHeading(), coordinate.getHeading());
		assertEquals(expectedDirection.getHeading(), direction.getHeading());
		assertEquals(s, Command.MOVE.getShortName());
	}

	@Test
	public void shouldReturnDirectionBySplitCommand() {
		Coordinate coordinate = CoordinateUtils.createCoordinate(1, 1, CardinalDirection.N);
		Direction direction = DirectionUtils.createDirection(new DirectionNorth());
		Coordinate expectedCoordinate = CoordinateUtils.createCoordinate(1, 2, CardinalDirection.N);
		String s = "LRM";
		assertNotNull(s);
		CommandUtils commandUtils = new CommandUtils();
		commandUtils.splitCommand(s, coordinate);
		Direction expectedDirection = DirectionUtils.getDirection(String.valueOf(coordinate.getHeading()));
		assertEquals(expectedCoordinate.getHeading(), coordinate.getHeading());
		assertEquals(expectedDirection.getHeading(), direction.getHeading());
	}

}
