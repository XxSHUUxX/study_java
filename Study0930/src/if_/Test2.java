package if_;

public class Test2 {

	public static void main(String[] args) {

		int n1 = 4, n2 = 7;
		String result = "";
				
		if(n1%2 == 0) {
			if(n2%2 == 0) {
				result = "짝수 + 짝수 = 짝수";
			} else {
				result = "짝수 + 홀수 = 홀수";
			}
		} else {
			if(n2%2 == 0) {
				result = "홀수 + 짝수 = 홀수";
			} else {
				result = "홀수 + 홀수 = 짝수";
			}
			
		}
		System.out.println(result);
		
		
		
	}

}
