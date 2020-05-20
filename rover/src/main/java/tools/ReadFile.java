package tools;

/**
 * @author Cécile Legaz
 * @version 20.05.2020
 *
 */
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class ReadFile {

	/**
	 * This method returns input reading into a list of string
	 * 
	 * @return List<String>
	 * @throws IOException
	 */
	public List<String> readInput() throws IOException {

//		input location during developpement
		String fileNameDev = "src/input.txt";
//		input location for prod
		String fileNameProd = "input.txt";

		String readLine = "";
		List<String> textList = null;

		try (BufferedReader bReader = new BufferedReader(new InputStreamReader(new FileInputStream(fileNameProd)))) {
			textList = new ArrayList<>();
			while ((readLine = bReader.readLine()) != null) {
				textList.add(readLine);
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
		return textList;
	}

}