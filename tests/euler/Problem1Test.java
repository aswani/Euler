package euler;

import static org.junit.Assert.*;

import org.junit.Test;

import euler.prblem1.Problem1;

public class Problem1Test {

	@Test
	public void testDevidedBy() {
		assertEquals(5, Problem1.devidedBy(5, 9));
		assertEquals(18, Problem1.devidedBy(3, 9));
	}

}
