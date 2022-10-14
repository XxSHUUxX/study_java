package oop;

public class Ex1 {

	public static void main(String[] args) {

//		Person p;
//		p = new Person();
//		=>
		Person p = new Person();
		
		//1.멤버변수값 출력
		System.out.println("이름(p.name): " + p.name);
		System.out.println("나이(p.age): " + p.age);
		System.out.println("배고픔(p.isHungry): " + p.isHungry);
		
		//2.메서드 호출
		p.eat();
		p.talk();
		
		System.out.println("-----------------------------");
		
		//인스턴스의 멤버변수 초기화
		p.name = "홍길동";
		p.age = 20;
		p.isHungry = true;
		System.out.println("이름(p.name): " + p.name);
		System.out.println("나이(p.age): " + p.age);
		System.out.println("배고픔(p.isHungry): " + p.isHungry);
		
		System.out.println("-----------------------------");

		//인스턴스 p2 생성
		Person p2 = new Person();
		
		p2.name = "김진숙";
		p2.age = 32;
		p2.isHungry = true;
		System.out.println("이름(p2.name): " + p2.name);
		System.out.println("나이(p2.age): " + p2.age);
		System.out.println("배고픔(p2.isHungry): " + p2.isHungry);
		
		
		
		
	}

}
