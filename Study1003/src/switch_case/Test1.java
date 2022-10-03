package switch_case;

public class Test1 {

	public static void main(String[] args) {

		int score = 75;
		String grade = "";
		
		if(score >= 0 && score <= 100) {
			switch (score/10) {
			case 10:  	
			case 9: 	grade = "A학점"; break;
			case 8: 	grade = "B학점"; break;
			case 7: 	grade = "C학점"; break;
			case 6: 	grade = "D학점"; break;
			default: 	grade = "F학점"; break;
			}
		} else {
			grade = "점수입력 오류!";
		}
		System.out.println(grade);
		
		
		//==========================================
		
		int pee = 10000;
		int grade2 = 5;
		String result = "결재 금액 : ";
		
//		if(grade2 == 1) {
//			result += (pee * 0.95) + "원";
//		} else if(grade2 == 2) {
//			result += (pee * 0.85) + "원";
//		} else if(grade2 == 3) {
//			result += (pee * 0.7) + "원";
//		} else {
//			result = "회원 등급 오류!";
//		}
		System.out.println(result);
		
		result = grade2 == 1 ? "결재 금액 : " + (pee * 0.95) + "원" :
				 grade2 == 2 ? "결재 금액 : " + (pee * 0.85) + "원" :
				 grade2 == 3 ? "결재 금액 : " + (pee * 0.7) + "원" : "회원 등급 오류!";
			
		switch (grade2) {
		case 1:
			result = "결재 금액 : " + (pee * 0.95) + "원";
			break;
		case 2:
			result = "결재 금액 : " + (pee * 0.85) + "원";
			break;
		case 3:
			result = "결재 금액 : " + (pee * 0.7) + "원";
			break;
		default:
			result = "회원 등급 오류!";
			break;
		}
		
		
		
		
	}

}
