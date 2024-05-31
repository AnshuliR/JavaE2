package singleinheritance2;

public class SICalculator extends Customer {
	public static void si(int p, int t,int r) {
		System.out.println("Simple Interest = "+((p*t*r)/100));
	}
	public static void main(String[] args) {
		SICalculator c = new SICalculator();
		c.si(c.p,c.t,c.r);
	}

}
