package hybridinheritance;

public class AddSub extends Data {
 public static void sum(int n1,int n2) {
	System.out.println("Sum= "+(n1+n2));
 }
 public static void sub(int n1, int n2) {
	System.out.println("Difference = "+(n1-n2));
 }
 public static void main(String[] args) {
	AddSub as = new AddSub();
	as.sum(as.n1, as.n2);
	as.sub(as.n1, as.n2);
}
}
