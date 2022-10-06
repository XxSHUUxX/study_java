package for_;

public class Test2 {

	public static void main(String[] args) {

		int sum = 0;
		int a = 1, b = 10;
		
		for(int i = a; i <= b; i++) {
			if(i % 3 == 0) {
				sum += i;
			} 
		}
		System.out.println(a + " ~ " + b + " 까지 3의 배수의 합 : " + sum);
		
		System.out.println("------------------------------------");
		
		
		for(int i = 1; i <= 100; i++) {
			int num = i % 10;
			if(num == 3 || num == 6 || num == 9) {
				System.out.print("짝 ");
			} else {
				System.out.print(i + " ");
			}
		}
		
		System.out.println();
		
		for(int i = 1; i <= 100; i++) {
			switch (i % 10) {
			case 3:
			case 6:
			case 9:
				System.out.print("짝 ");
				break;
			default:
				System.out.print(i + " ");
			}
		}
		
		System.out.println();
		System.out.println("------------------------------------");

		
		int n = 24757737;
		int count = 0;
		
		//while 버전
		while(n > 0) {
			if(n%10 == 7) {
				count++;
			} 
			n /= 10;
		}
		
		//for 버전
//		for(n = 24757737; n > 0; n /= 10) {
//			if(n%10 == 7) {
//				count++;
//			} 
//		}
		
		
		System.out.println("7의 갯수: " + count);
		
		
	}

}
