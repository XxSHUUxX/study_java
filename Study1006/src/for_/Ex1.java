package for_;

public class Ex1 {

	public static void main(String[] args) {

		for(int i = 1; i <=10; i++) {
			System.out.println(i + " : Hello, World!");
		}
		
		
		for(int i = 2; i <=10; i += 2) {
			System.out.print(i + " ");
		}
		
		System.out.println();
		System.out.println("----------------------------------");
		
		for(int i = 10; i >= 1; i--) {
			System.out.print(i + " ");
		}
		
		System.out.println();
		System.out.println("----------------------------------");
		// for문에서 구성요소 제외 가능 예(초기화가 for문위에 선언된 경우)
		int i = 1;
		for(; i <=10; i++) {
			System.out.print(i + " ");
		}
		
		for(i = 1; i <= 10; i++) {
			System.out.print(i + " ");
		}
	}

}
