package rover.models;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CommandTest {
	
	@Test
    public void shouldReturnCommand() {
		assertEquals("LEFT", Command.LEFT.name());
		assertEquals("RIGHT", Command.RIGHT.name());
		assertEquals("MOVE", Command.MOVE.name());
    }
	
	@Test
    public void shouldReturnCommandShortName() {
		assertEquals("L", Command.LEFT.getShortName());
		assertEquals("R", Command.RIGHT.getShortName());
		assertEquals("M", Command.MOVE.getShortName());
    }

}
