package oop;

class Account {
	
	String accountNo;
	String ownerName;
	int balance;
}

public class Test1 {

	public static void main(String[] args) {

		Account a = new Account();
		
		a.accountNo = "111-1111-111";
		a.ownerName = "홍길동";
		a.balance = 100000;
		
		System.out.println("계좌번호 : " + a.accountNo);
		System.out.println("예금주명 : " + a.ownerName);
		System.out.println("현재잔고 : " + a.balance + "원");
		
		
		
		
		
	}

}

