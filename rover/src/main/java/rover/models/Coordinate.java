package rover.models;

/**
 * @author Cécile Legaz
 * @version 20.05.2020
 *
 */
public class Coordinate {

	private int x;
	private int y;
	private CardinalDirection heading;

	public Coordinate() {
//		empty constructor
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public CardinalDirection getHeading() {
		return heading;
	}

	public void setHeading(CardinalDirection heading) {
		this.heading = heading;
	}

	@Override
	public String toString() {
		return x + " " + y + " " + heading;
	}

}
