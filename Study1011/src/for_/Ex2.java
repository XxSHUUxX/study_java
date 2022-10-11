package for_;

public class Ex2 {

	public static void main(String[] args) {

		for(int i = 1; i <= 5; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}	System.out.println();
		}
		
		System.out.println("=============================");
		
		for(int i = 5; i >= 1; i--) {
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}	System.out.println();
		}
		
		System.out.println("=============================");

		
//		int line = 10;
//		int star = 1;
//		int space = line - 1;
		
//		for(int i = 0; i < line; i++) {
//			// 공백찍기
//			for(int j = 0; j < space; j++) {
//				System.out.print(" ");
//			}
//			// 별찍기
//			for(int j = 0; j < star; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//			star++;
//			space--;
//		}
		
		System.out.println("=====================================");
		
		/*
		 줄 = 1 , 공백 = 0, 별 = 5
		 줄 = 2 , 공백 = 1, 별 = 4
		 줄 = 3 , 공백 = 2, 별 = 3
		 줄 = 4 , 공백 = 3, 별 = 2
		 줄 = 5 , 공백 = 4, 별 = 1
		 
		 */
		
		int line = 5;
		int space = 0;
		int star = line;
		
		for(int i = 0; i < line; i++) {
			// 공백찍기
			for(int j = 0; j < space; j++) {
				System.out.print(" ");
			}
			// 별찍기
			for(int j = 0; j < star; j++) {
				System.out.print("*");
			}
			System.out.println();
			space++;
			star--;
		}
		
		
		
	}

}
