package rover.utils;

import rover.state.direction.Direction;
import rover.state.direction.DirectionEast;
import rover.state.direction.DirectionNorth;
import rover.state.direction.DirectionSouth;
import rover.state.direction.DirectionWest;
import rover.state.impl.HeadingState;

public class DirectionUtils {
	
    private DirectionUtils() {
        /*empty constructor*/
    }

    public static Direction createDirection(HeadingState headingState){
    	Direction direction = new Direction();
    	direction.setState(headingState);
        return direction;
    }

	public static Direction getDirection(String s) {
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
