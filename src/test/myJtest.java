package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.MathUtil;

import org.junit.jupiter.api.DisplayName;


@DisplayName ("Math Util")
class myJtest {

	@Test
	void test() {
		MathUtil calc = new MathUtil();             //fail("Not yet implemented");
	//Expected
		int expected = 2;
	//Actual
		int actual = calc.add(1, 1);
	//Verify
		assertEquals(actual, expected);
	}

	@Test
	@Display("isOdd return true for odd values")
	void testIsOdd() {
		MathUtil calc = new MathUtil();
	}
}
