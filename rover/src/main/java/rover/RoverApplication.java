package rover;

import java.io.IOException;
import java.util.List;

import rover.models.Coordinate;
import tools.CommandUtils;
import tools.CoordinateUtils;
import tools.ReadFile;
import tools.Validator;

/**
 * @author Cécile Legaz
 * @version 20.05.2020
 *
 */
public class RoverApplication {

	public static void main(String[] arg) throws IOException {

		ReadFile readText = new ReadFile();
		List<String> textList = readText.readInput();

		Validator validator = new Validator();
		CoordinateUtils coordinateUtils = new CoordinateUtils();
		CommandUtils commandUtils = new CommandUtils();

		Coordinate outputCoordinate = new Coordinate();

		for (String readLine : textList) {
			if (validator.coordinatateAndCardinalDirectionValidator(readLine)) {
				outputCoordinate = coordinateUtils.splitCoordinate(readLine);
			} else if (validator.commandValidator(readLine)) {
				commandUtils.splitCommand(readLine, outputCoordinate);
				System.out.println(outputCoordinate);
			}
		}

	}

}
