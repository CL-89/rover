package tools;

/**
 * @author Cécile Legaz
 * @version 20.05.2020
 *
 */
import java.util.regex.Pattern;

public class Validator {

	String coordinateRegex = "[0-9]*\\s[0-9]\\s[N|S|E|W]";
	String moveRegex = "[L|R|M]*";

	public Validator() {
//			empty constructor
	}

	/**
	 * This method checks if a line is a Coordinate with a CardinalDirection by
	 * coordinateRegex
	 * 
	 * @param s
	 * @return boolean
	 */
	public boolean coordinatateAndCardinalDirectionValidator(String s) {
		return Pattern.matches(coordinateRegex, s);
	}

	/**
	 * This method checks if a line is a Command by moveRegex
	 * 
	 * @param s
	 * @return boolean
	 */
	public boolean commandValidator(String s) {
		return Pattern.matches(moveRegex, s);
	}

}
