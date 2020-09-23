package chapter4.exercise1;

import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;

class CalcTest {

	@Test
	void testAdd() {
		assertTrue("Addition Test", Calc.add(1, 2) == 3);
	}
	@Test
	void testSubstract() {
		assertTrue("Substraction Test", Calc.substract(2, 1) == 1);
	}
	@Test
	void testMultiply() {
		assertTrue("Multiplication Test", Calc.multiply(2, 2) == 4);
	}
	@Test
	void testDivide() {
		assertTrue("Division For Zero", Calc.divide(5, 0) == Integer.MAX_VALUE+1);
		assertTrue("Division Test 1", Calc.divide(5, 1) == 5);
		assertTrue("Division Test 2", Calc.divide(5, 2) == 2);
		assertTrue("Division Test 3", Calc.divide(6, 2) == 3);
		assertTrue("Division Test 4", Calc.divide(0, 2) == 0);
	}
}
