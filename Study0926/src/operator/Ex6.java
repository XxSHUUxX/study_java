package operator;

public class Ex6 {

	public static void main(String[] args) {

		boolean a = false;
		boolean b = true;
		
//		AND
		System.out.println("a(false) && a(false) = " + (a && a));
		System.out.println("a(false) && b(true) = " + (a && b));
		System.out.println("b(true) && a(false) = " + (b && a));
		System.out.println("b(true) && b(true) = " + (b && b));
		System.out.println();
		
//		OR
		System.out.println("a(false) || a(false) = " + (a || a));
		System.out.println("a(false) || b(true) = " + (a || b));
		System.out.println("b(true) || a(false) = " + (b || a));
		System.out.println("b(true) || b(true) = " + (b || b));
		System.out.println();
		
//		NOT
		System.out.println("!a(false) = " + (!a));
		System.out.println("!b(true) = " + (!b));
		System.out.println();
		
//		XOR
		System.out.println("a(false) ^ a(false) = " + (a ^ a));
		System.out.println("a(false) ^ b(true) = " + (a ^ b));
		System.out.println("b(true) ^ a(false) = " + (b ^ a));
		System.out.println("b(true) ^ b(true) = " + (b ^ b));
		System.out.println();
		
		int i = 10;
		boolean result = i > 5 || i++ > 5;
		System.out.println(i);
		
		
	}

}
