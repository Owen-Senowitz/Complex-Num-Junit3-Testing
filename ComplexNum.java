/**
 * @author - Owen Senowitz
 * A class for complex numbers and imaginary numbers
 */
package assg4_senowitzo19;

public class ComplexNum {
	double real;
	double imaginary;
	/**
	 * Default constructor
	 */
	public ComplexNum() {
		real = 0.0;
		imaginary = 0.0;
	}
	/**
	 * Constructor initializes the real part and set imaginary part to 0
	 * @param the real number
	 */
	public ComplexNum(double real) {
		this.real = real;
		this.imaginary = 0;
	}
	/**
	 * Constructor in first part real second part imaginary
	 * @param real and imaginary number
	 */
	public ComplexNum(double real, double imaginary) {
		this.real = real;
		this.imaginary = imaginary;
	}
	/**
	 * @return a string object equivalent of the ComplexNum object
	 */
 	public String toString() {
		if (real == 0) {
			return real + "";
		}
		if (imaginary == 0) {
			return imaginary + "i";
		}
		if (imaginary < 0) {
			return real + "-" + (-imaginary) + "i";
		}
		return real + "+" + imaginary + "i";
	}
 	/**gets the real number
 	 * @return real number
 	 */
	public double getReal() {
		return real;
	}
	/**get imaginary number
	 * @return imaginary get imaginary number
	 */
	public double getImaginary() {
		return imaginary;
	}
	/**
	 * Sets the real number
	 * @param sReal
	 */
	public void setReal(double sReal) {
		real = sReal;
	}
	/**
	 * Sets the imaginary number
	 * @param sImaginary
	 */
	public void setImaginary(double sImaginary) {
		imaginary = sImaginary;
	}
	/**
	 * Adds c1 + c2 and sets the answers to equal to c1 object
	 * @param c2
	 * @return c1
	 */
	public ComplexNum add(ComplexNum c2) {
		ComplexNum c1 = new ComplexNum(real, imaginary);
		c1.real = real + c2.real;
		c1.imaginary = imaginary + c2.imaginary;
		return c1;
	}
	/**
	 * Subtracts c1 - c2 and sets the answers to equal to c1 object
	 * @param c2
	 * @return c1
	 */
	public ComplexNum sub(ComplexNum c2) {
		ComplexNum c1 = new ComplexNum(real, imaginary);
		c1.real = real - c2.real;
		c1.imaginary = imaginary - c2.imaginary;
		return c1;
	}
	/**
	 * Multiply c1 * c2 and sets the answers to equal to c1 object
	 * @param c2
	 * @return c1
	 */
	public ComplexNum mul(ComplexNum c2) {
		ComplexNum c1 = new ComplexNum(real, imaginary);
		c1.real = real * c2.real - imaginary * c2.imaginary;
		c1.imaginary = real - c2.real + imaginary * c2.imaginary;
		return c1;
	}
	/**
	 * Negates c1 and sets the answers equal to c1
	 * @return c1
	 */
	public ComplexNum neg() {
		ComplexNum c1 = this;
		c1.real = real * -1;
		c1.imaginary = imaginary * -1;
		return c1;
	}
	/**
	 * Checks to see if c1 object is equal to the imaginary or real number
	 * @param ComplexNum c1
	 * @return true or false
	 */
	public boolean equals(ComplexNum c1) {
		if(c1 != null) {
			if (c1.imaginary == imaginary & c1.real == real) {
				return true;
			}
			else {
				return false;
			}
		}
		else {
			return false;
		}
	}
}