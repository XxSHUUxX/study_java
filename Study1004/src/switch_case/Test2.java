package switch_case;

public class Test2 {

	public static void main(String[] args) {

		int n1 = 20, n2 = 60, n3 = 40;
		String result = "";
		
		if(n1>n2) {
			if(n1>n3) {
				System.out.println("최대값 : " + n1);
			} else {
				System.out.println("최대값 : " + n3);
			}
		} else {
			System.out.println(result + n2);
		}
	
//		==========================================
		
		result = (n1>n2 && n1>n3) ? "최대값 : " + n1 : 
			     (n2>n3)          ? "최대값 : " + n2 : "최대값 : " + n3;
		System.out.println(result);
		
		
		
	}

}
