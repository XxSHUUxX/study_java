package break_continue;

import java.util.Random;
import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {

		Random r = new Random();
//		int target = r.nextInt(999) + 1;

		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
		
		
		int target = 10;
		int count = 20;
		
		boolean isSuccess = false;
		
		for(int i = 0; i < count; i++) {
			System.out.print("1 ~ 999 사이 정수를 입력 : ");
			int num = sc.nextInt();
			
			if(target > num) {
				System.out.println("UP");
			} else if(target < num) {
				System.out.println("DOWN");
			} else {
				System.out.println("정답: " + target + ", 횟수: " + i);
				isSuccess = true;
				break;
			}
		}
		if(!isSuccess)System.out.println("실패 (정답: " + target + ") ");
	}}
		
		
		
		
//		int num = 100;
//		int target = 500;
//		int count = 0;
//		
//		
//		for(int i = 0; i < 20; i++) {
//			if(num == target) {
//				count++;
//				System.out.println("정답 : " + target + ", 횟수 : " + count);
//				break;
//			} else if(num < target) {
//				System.out.println("UP");
//			} else {
//				System.out.println("DOWN");
//			} 
//			count++;
//		}	
//	}	
//	}

//	while(num != target) {
//		if(num < target) {
//			System.out.println("UP");
//		} else if(num > target) {
//			System.out.println("DOWN");
//		} else {
//			break;
//		}
//		count++;
//	}	System.out.println("정답 : " + target + ", 횟수 : " + count);
//}
//}
//

