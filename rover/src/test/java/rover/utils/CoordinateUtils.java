package rover.utils;

import rover.models.CardinalDirection;
import rover.models.Coordinate;

public class CoordinateUtils {
	
    private CoordinateUtils() {
        /*empty constructor*/
    }

    public static Coordinate createCoordinate(int x, int y, CardinalDirection heading){
    	Coordinate coordinate = new Coordinate();
    	coordinate.setX(x);
    	coordinate.setY(y);
    	coordinate.setHeading(heading);
        return coordinate;
    }

}
