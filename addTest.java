package Icalculator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class addTest {

	@Test
	void testAdd() {
		operation test= new operation();
		assertEquals(10, test.add(5, 5));
		assertEquals(8,test.add(5, 3));
		assertEquals(0,test.add(-5, 5));
		assertEquals(-2, test.add(-4, 2));
		assertEquals(0, test.add(-1, 1));
		assertEquals(155, test.add(120,35));
		assertEquals(9900, test.add(10000,-100));
	}
	
}
