package for_;

public class Ex1 {

	public static void main(String[] args) {

		//중첩 for문
		//1.이중for문
//		for(int min = 0; min < 60; min++) {
//			for(int sec = 0; sec < 60; sec++) {
//				System.out.println(min + "분" + sec + "초"); 
//			}
//		}
		
		//-----------------------
		//2.삼중for문
		for(int h = 0; h < 24; h++) {
			for(int min = 0; min < 60; min++) {
				for(int sec = 0; sec < 60; sec++) {
					System.out.println(h + "시" + min + "분" + sec + "초"); 
				}
			}
		}
		
		
		
	}

}
