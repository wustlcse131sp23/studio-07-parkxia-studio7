package studio7;

public class Fraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	private int numerator;
	private int denominator;
	
	public Fraction(int numerator, int denominator) {
		this.numerator = numerator;
		this.denominator = denominator;
		
	}

	public double fractionDouble() {
		double fractionDouble;
		fractionDouble = numerator / denominator;
		return fractionDouble;
	}
	
	public double fractionSum(Fraction other) {
		double fractionSum;
		fractionSum = this.fractionDouble() + other.fractionDouble();
		int fractionSum1 = (int) fractionSum * 100;
		System.out.println(fractionSum1 + " / " + "100");
		return fractionSum;
	}
}
