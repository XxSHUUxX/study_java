package if_;

public class Test1 {

	public static void main(String[] args) {

		int num = -5;
		if(num < 0) {
			num = -num;
		} 
		System.out.println("변수 num = " + num);
		
		//==========================================
		
		char ch = 'G';
		if(ch >= 'A' && ch <= 'Z') {
			ch += 32;
		}
		System.out.println(ch);

//		ch = (ch >= 'A' && ch <= 'Z') ? (char)(ch+32) : ch;
//		ch = (ch >= 'A' && ch <= 'Z') ? ch+=32 : ch;
		ch += (ch >= 'A' && ch <= 'Z') ? 32 : 0;
		System.out.println(ch);
		
		
		
		
	}

}
