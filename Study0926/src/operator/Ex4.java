package operator;

public class Ex4 {

	public static void main(String[] args) {

		int a = 10, b = 0;
		
//		b = b + a;
		b += a;
		System.out.println(b);
		
		System.out.println("=========================");
		
		b += a;
		System.out.println(b);
		
		b -= a;
		System.out.println(b);
		
		b *= a;
		System.out.println(b);
		
		b /= a;
		System.out.println(b);
		
		b %= a;
		System.out.println(b);
		
		System.out.println("=========================");

		short s = 10;
//		s = s + 10;
//		s = (short)(s + 10);
		s += 10;
				
		
	}

}
