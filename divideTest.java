package Icalculator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class divideTest {

	@Test
	void testDivide() {
		operation test= new operation();
		assertEquals(5, test.divide(25,5));
		assertEquals(-1.5, test.divide(-3,2));
		assertEquals(1.5, test.divide(3,2));
		assertEquals(0.8571428656578064, test.divide(6,7));
		assertEquals(6, test.divide(18,3));
		assertEquals(5.4285712242126465, test.divide(38,7));
		assertEquals(-0.5, test.divide(-3,6));
		assertEquals(29.33333396911621,test.divide(88,3));
		RuntimeException thrown = assertThrows(RuntimeException.class,() -> test.divide(5, 0));
		assertEquals("can not divide by zero", thrown.getMessage());
	}	
}
