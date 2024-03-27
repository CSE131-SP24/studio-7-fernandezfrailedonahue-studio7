package studio7;

public class Fraction {

	private int Numerator;
	private int Denominator;
	
	public static void main(String[] args) {
		Fraction f1 = new Fraction(3,4);
		Fraction f2 = new Fraction(4,8);
		System.out.println(f1);
		System.out.println(f1);

	}
	public static int gcd(int p, int q) {
		while (q != 0) {
			int temp = q;
			q = p % q;
			p = temp;
		}
		return p;
	}
	public Fraction (int numerator, int denominator)
	{
		Numerator = numerator;
		Denominator = denominator;
	}
	public Fraction Add(Fraction other)
	{
		int numerator = (Numerator*other.Denominator)+(other.Numerator*Denominator);
		int denominator = (Denominator*other.Denominator)+(other.Denominator*Denominator);
		return new Fraction(numerator, denominator);
	}
	public Fraction Multiply(Fraction other)
	{
		int numerator = (Numerator*other.Numerator);
		int denominator = (Denominator*other.Denominator);
		return new Fraction(numerator, denominator);
	}
	public Fraction Reciprocal()
	{
		int numerator = Denominator;
		int denominator = Numerator;
		return new Fraction(numerator, denominator);
	}
	
	@Override
	public String toString() {
		return "Fraction [" +Numerator + "/" + Denominator + "]";
	}
	
	
}
