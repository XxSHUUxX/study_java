package if_;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {

		int num1 = 0;
		
		if(num1 > 0) {
			System.out.println("양수");
		} else if(num1 < 0) {
			System.out.println("음수");
		} else {
			System.out.println("0");
		}
		
		//====================================
		
		int num2 = 0;
		
		if(num2%2 == 0 && num2 != 0) {
			System.out.println("짝수");
		} else if(num2%2 == 1) {
			System.out.println("홀수");
		} else {
			System.out.println("0");
		}
		
		//======================================
		
//		char ch = '0';
		
//		if(ch>='A' && ch<='Z') {
//			ch+=32;
//			System.out.println(ch);
//		} else if(ch>='a' && ch<='z') {
//			ch-=32;
//			System.out.println(ch);
//		} else {
//			System.out.println("ch는 영문자가 아닙니다!");
//		}
		char ch = '0';
		String result = "";
		
		if(ch>='A' && ch<='Z')       result = "(ch+=32)";
		else if(ch>='a' && ch<='z')  result = "(ch-=32)";
		else                         result = "ch는 영문자가 아닙니다!";
		
		System.out.println(result);
		
		//=========================================
		
//		Scanner sc = new Scanner(System.in);
//		
//		int score = sc.nextInt();
//		
			
		int score = 75;
		String grade = "";
		
//		if(score >= 90)      grade = "A학점";
//		else if(score >= 80) grade = "B학점";
//		else if(score >= 70) grade = "C학점";
//		else if(score >= 60) grade = "D학점";
//		else                 grade = "F학점";
		
		grade = score >= 90 ? "A" :
				score >= 80 ? "B" :
				score >= 70 ? "C" :
				score >= 60 ? "D" : "F";
				
		grade += "학점";
		
		System.out.println(grade);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
