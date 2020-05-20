package rover.models;

/**
 * @author Cécile Legaz
 * @version 20.05.2020
 *
 */
public enum Command {
	LEFT("L"), RIGHT("R"), MOVE("M");

	private String shortName;

	Command(String shortName) {
		this.shortName = shortName;
	}

	public String getShortName() {
		return shortName;
	}

}
