package if_;

public class Test2 {

	public static void main(String[] args) {

//		int num = 0;
//		String result = num + " : ";
//		if(num >= 0) {
//			result += "양수!";
//		} else {
//			result += "음수!";
//		}
		
//		System.out.println(result);
		
		int num = -10;
		String result = (num >= 0) ? " : 양수!" : " : 음수!";
		System.out.println(num + result);

//======================================
		
		char ch = 'X';
//		if('A' <= ch && ch <= 'Z') {
//			ch+=32;
//		} else {
//			ch-=32;
//		}
//		System.out.println(ch);
		
		ch += ('A' <= ch && ch <= 'Z') ? 32 : -32;
		System.out.println(ch);
		
		
		
		
		
	}

}
