package tools;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class ReadFileTest {

	@Test
	public void shouldReturnStringList() throws IOException {
		String readLine = "";
		List<String> textList = new ArrayList<String>();
		BufferedReader bReader = new BufferedReader(new StringReader("TEST 1\nTEST 2\nTEST 3"));
		while ((readLine = bReader.readLine()) != null) {
			textList.add(readLine);
		}
		Assert.assertEquals(Arrays.asList("TEST 1", "TEST 2", "TEST 3"), textList);
	}

}
