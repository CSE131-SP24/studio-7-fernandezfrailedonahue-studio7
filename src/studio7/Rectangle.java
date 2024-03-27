package studio7;

public class Rectangle {

		private double length;
		private double width;
	
		
		public Rectangle (double ILength, double IWidth)
		{
			length = ILength;
			width = IWidth;
		}
		
		public double Area()
		{
			double area = length*width;
			return area;
		}
		
		public double Perimeter()
		{
			double perimeter = (length*2)+(width*2);
			return perimeter;
		}
		
		public boolean Square()
		{
			boolean isSquare = (length == width);
			return isSquare;
		}
		
		public boolean Compare(Rectangle other)
		{
			boolean larger = false;
			if (Area() > other.Area())
			{
				larger = true;
			}
			return larger;	
		}
		
		/*public void print()
		{
			System.out.println("Rectangle with a length and width of " + length + ", " + width);
			System.out.println("Area " + Area());
			System.out.println("Perimeter " + Perimeter());
			System.out.println("Is a square? " + Square());
			System.out.println();

		}*/
		
		public static void main(String[] args)
		{
			Rectangle r1 = new Rectangle(0.5,0.5);
			Rectangle r2 = new Rectangle(7,1);
			
			System.out.println("Rectangle with a length and width of " + r1.length + ", " + r1.width);
			System.out.println("Area " + r1.Area());
			System.out.println("Perimeter " + r1.Perimeter());
			System.out.println("Is a square? " + r1.Square());
			System.out.println("Is this rectangle larger than the other. " + r1.Compare(r2));
			System.out.println();
			System.out.println("Rectangle with a length and width of " + r2.length + ", " + r2.width);
			System.out.println("Area " + r2.Area());
			System.out.println("Perimeter " + r2.Perimeter());
			System.out.println("Is a square? " + r2.Square());
			System.out.println("Is this rectangle larger than the other. " + r2.Compare(r1));
			System.out.println();
		}
}
