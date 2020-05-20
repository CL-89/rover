package rover;

import static org.junit.Assert.assertEquals;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import tools.ReadFile;

public class RoverApplicationTests {

	@Test
	void contextLoads() throws IOException {

		ReadFile readText = new ReadFile();
		List<String> textList = readText.readInput();

		List<String> expectedTextList = new ArrayList<String>();

		for (String readLine : textList) {
			expectedTextList.add(readLine);
		}

		assertEquals(expectedTextList, textList);

	}

}
