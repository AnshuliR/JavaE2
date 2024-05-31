package hybridinheritance;

public class MulDiv extends AddSub {
	public static void mul(int n1, int n2) {
		System.out.println("Product = "+(n1*n2));
	}
	public static void div(int n1, int n2) {
		System.out.println("Divison = "+(n1/n2));
	}
	public static void main(String[] args) {
		MulDiv md = new MulDiv();
		md.mul(md.n1, md.n2);
		md.div(md.n1, md.n2);
	}
}
