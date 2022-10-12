package method;

public class Test1 {

	public static void main(String[] args) {

		//1.매개변수(X), 리턴(X)
		hello();
		
		System.out.println("-------------------------------");
		
		//2.매개변수(O), 리턴(X)
		hello2("안녕하세요", 10);
		
		System.out.println("-------------------------------");

		//3.매개변수(X), 리턴(O)
		System.out.println(sum());
		
		System.out.println("-------------------------------");

		//4.매개변수(O), 리턴(X)
		System.out.println(sum2(100));
		
		
		
	}

	//1.
	public static void hello() {
		int i=1;
		while(i <= 10) {
			System.out.println(i + " : Hello, World!");
			i++;
		}
	}
	
	//2.
	public static void hello2(String msg, int count) {
		int i=1;
		while(i <= count) {
			System.out.println(i + " : " + msg);
			i++;
		}
	}
	
	//3.
	public static int sum() {
		int sum = 0;
		for(int i=1; i<=10; i++) {
			sum += i;
		}
		return sum;
		}
	

	//4.
	public static int sum2(int num) {
		int sum2 = 0;
		for(int i=1; i<=num; i++) {
			sum2 += i;
		}
		return sum2;
	}
	
}