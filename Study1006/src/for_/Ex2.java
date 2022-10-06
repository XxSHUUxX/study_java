package for_;

public class Ex2 {

	public static void main(String[] args) {

		int sum = 0;
		for(int i = 1; i <= 100; i++) {
			sum += i;
		}
		System.out.println("정수 1 ~ 100 까지의 합: " + sum);
		
		System.out.println("------------------------------");
		
		sum = 0;        //짝수의합
		int sum2 = 0;   //홀수의 합
		
		for(int i = 1; i <= 10; i++) {
			if(i % 2 ==0) {
				sum += i;
			} else {
				sum2 += i;
			}
		}
		System.out.println("1 ~ 10 까지 짝수의 합 : " + sum);
		System.out.println("1 ~ 10 까지 홀수의 합 : " + sum2);

		
		
	}

}
