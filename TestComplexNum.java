/**
 * @author - Owen Senowitz
 * A class that test ComplexNum class using junit 3
 */
package assg4_senowitzo19;

import junit.framework.TestCase;

public class TestComplexNum extends TestCase {
	
	private ComplexNum x, y, z, a;
	
	protected void setUp() {
	x = new ComplexNum();
	y = new ComplexNum(7.5);
	z = new ComplexNum(-5.0, 3.0);
	a = new ComplexNum(-5.0, 3.0);
	}
	public void testDefaultConstructor() {
		assertEquals("ComplexNum real:", 0.0, x.getReal());
		assertEquals("ComplexNum real:", 0.0, x.getImaginary());
	}
	public void testOneParameterConstructor() {
		assertEquals("ComplexNum real:", 7.5, y.getReal());
		assertEquals("ComplexNum real:", 0.0, y.getImaginary());
	}
	public void testTwoParameterConstructor() {
		assertEquals("ComplexNum real:", -5.0, z.getReal());
		assertEquals("ComplexNum real:", 3.0, z.getImaginary());
	}
	public void testSetReal() {
		y.setReal(2.5);
		assertEquals("ComplexNum set real:", 2.5, y.getReal());
	}
	public void testSetImaginary() {
		y.setImaginary(2.5);
		assertEquals("ComplexNum set imaginary:", 2.5, y.getImaginary());
	}
	public void testAdd() {
		ComplexNum sum = y.add(z);
		assertEquals("ComplexNum add:", "2.5+3.0i", sum.toString());
	}
	public void testSub() {
		ComplexNum sub = y.sub(z);
		assertEquals("ComplexNum sub:", "12.5-3.0i", sub.toString());
	}
	public void testMul() {
		ComplexNum mul = y.mul(z);
		assertEquals("ComplexNum mul:", "-37.5+12.5i", mul.toString());
	}
	public void testNeg() {
		ComplexNum neg = y.neg();
		assertEquals("ComplexNum neg:", "-0.0i", neg.toString());
	}
	public void testFalse() {
		assertFalse("ComplexNum false:", y.equals(z));
	}
	public void testTrue() {
		assertTrue("ComplexNum true:", a.equals(z));
	}
}
