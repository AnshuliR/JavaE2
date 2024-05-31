package singlelevelinheritance;

public class Rectangle extends Measurement {
	public static void area(double l, double w) {
		System.out.println("Area of rectangle = "+(l*w));
	}
	public static void peri(double l, double w) {
		System.out.println("Perimeter of the rectangle = "+(2*(l+w)));
	}
	public static void main(String[] args) {
		Rectangle r = new Rectangle();
		r.area(r.l,r.w);
		r.peri(r.l,r.w);
	}
}
