package oop;

class Account2 {
	
	String accountNo;
	String ownerName;
	int balance;
	
	void showAccountInfo() {
		System.out.println("계좌번호 : " + accountNo);
		System.out.println("예금주명 : " + ownerName);
		System.out.println("현재잔고 : " + balance);
	}
	
	void deposit(int amount) {
		balance += amount;
		System.out.println("입금금액 : " + amount + "원");
		System.out.println("현재잔고 : " + balance + "원");
	}
	
	int withdraw(int amount) {
		if(amount > balance) {
			System.out.println("출금할 금액 : " + amount);
			System.out.println("잔액이 부족하여 출금 불가! (현재잔고 : " + balance + "원)");
			amount = 0;
		} else {
			balance -= amount;
			System.out.println("출금할 금액 : " + amount);
			System.out.println("현재잔고 : " + balance + "원");
		}
		return amount;
	}
	
	void transfer(int amount, Account2 other) {
		balance -= amount;
		other.balance += amount;
		System.out.println("이체할 금액 : " + amount);
		System.out.println("이체 후 잔액 : " + balance);
	}
}
public class Test2 {

	public static void main(String[] args) {

		Account2 acc = new Account2();
		acc.accountNo = "111-1111-111";
		acc.ownerName = "홍길동";
		acc.balance = 100000;
		
		acc.showAccountInfo();
		System.out.println("-------------------");
		
		acc.deposit(50000);
		
		System.out.println("-------------------");

		System.out.println("출금금액 : " + acc.withdraw(500000));
		
		System.out.println("====================");
		
		Account2 acc2 = new Account2();
		acc2.accountNo = "222-2222-222";
		acc2.ownerName = "김진숙";
		acc2.balance = 100000;
		
		acc2.showAccountInfo();
		System.out.println("-------------------");

		acc.transfer(50000, acc2);
		System.out.println("-------------------");

		acc2.showAccountInfo();
	}

}
