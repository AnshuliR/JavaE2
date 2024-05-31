public class Apple extends Fruits{

	double price = 70;
	public static void main(String[] args){

		Fruits f = new Apple();
		System.out.println(f.origin);
		//System.out.println(f.price);
		Apple a = (Apple)f;
		System.out.println(a.origin);
		System.out.println(a.price);
	}
}
		