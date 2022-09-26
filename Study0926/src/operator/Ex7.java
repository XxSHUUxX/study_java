package operator;

public class Ex7 {

	public static void main(String[] args) {

		int a = 10;
		String result = a%2 == 0 ? "짝수" : "홀수";
		System.out.println(result);
		a = 11;
		result = a%2 == 0 ? "짝수" : "홀수";
		System.out.println(result);

		a = 30;
		int b = 20;
		
		int max = a > b ? a : b;
		int min = a < b ? a : b;
		
		String strmax = a > b ? "a" : "b";
		String strmin = a < b ? "a" : "b";

		System.out.println(max);
		System.out.println(min);
		System.out.println(strmax);
		System.out.println(strmin);
		
		double d = 97.3;
		int i = (int)(((d*10)%10) >= 5 ? (int)++d : d);
		System.out.println(i);

		
	}

}
