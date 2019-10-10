package cse360assign2;
public class Test {
	public static void main(String[] args) {
		System.out.println("Hello");
		AddingMachine testMe = new AddingMachine();
		testMe.add(50);
		testMe.subtract(15);
		testMe.subtract(15);
		testMe.subtract(-25);
		System.out.println(testMe.toString());
		System.out.println(testMe.getTotal());
		testMe.clear();
		System.out.println(testMe.getTotal());
	}
}
