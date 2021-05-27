package inheritance;

public class TestQuadrilateral {

	public static void main(String[] args) {
		Square sq=new Square(4,6,7,3,4,7,8,2);
		System.out.println("Area Of The Square is " + sq.area());
		Rectangle rec=new Rectangle(8,6,3,8,6,5,7,4);
		System.out.println("Area Of The Rectangle is " + rec.area());
		Parallelogram p=new Parallelogram(2,7,8,4,6,7,2,3,4);
		System.out.println("Area Of The Parallelogram is " + p.area());
		Trapezoid t=new Trapezoid(6,7,4,5,7,3,5,7,6);
		System.out.println("Area Of The Trapezoid is " + t.area());

	}

}
