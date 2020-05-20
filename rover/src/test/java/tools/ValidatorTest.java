package tools;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class ValidatorTest {
	
	@Test
    public void shouldReturnCoordinateValidatorTrue() {
		Validator validator = new Validator();
		assertTrue("1 2 N", validator.coordinatateAndCardinalDirectionValidator("1 2 N"));
    }
	
	@Test
    public void shouldReturnCoordinateValidatorFalse() {
		Validator validator = new Validator();
		assertFalse("1 2 ", validator.coordinatateAndCardinalDirectionValidator("1 2 "));
    }
	
	@Test
    public void shouldReturnCommandValidatorTrue() {
		Validator validator = new Validator();
		assertTrue("LMR", validator.commandValidator("LMR"));
    }
	
	@Test
    public void shouldReturnCommandValidatorFalse() {
		Validator validator = new Validator();
		assertFalse("LMF", validator.commandValidator("LMF"));
    }


}
