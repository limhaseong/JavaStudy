/*=================================
■■■ 클래스 고급 ■■■
- 상속(Inheritance)
=================================*/

//이 부분부터는 매일 복습이 없으면 힘들다.

/*
- 상속(Inheritance)이란
	: 새로 설계(생성)하고자 하는 클래스가
	  이미 설계되어 있는 다른 클래스의 기능과 중복되는 경우
	  이미 설계된 클래스의 일부분이나 전체 구조를 공유할 수 있도록 하는 기능을 의미한다.

	  즉, 상속은 객체를 좀 더 쉽게 만들 수 있는
	  고수준의 재사용성(reusablility)를 확보하고
	  객체 간의 관계를 구성함으로써
	  객체 지향의 또 다른 특징인 다형성의 문법적 토대가 된다.

	  상속은 기존 프로그램의 클래스 내용을 공유함으로써
	  중복된 코드들을 재작성할 필요 없이
	  반복적이고 세부적인 작업을 처리하지 않기 때문에
	  프로그램을 작성하는 시간을 절약할 수 있고
	  유지보수를 편리하게 할 수 있으며,
	  프로그램의 길이도 짧아지게 된다.

	  또한, 이미 작성된 프로그램들은 앞서 테스트되었기 때문에
	  오류를 줄일 수 있어 현재 작성 중인 프로그램에만 전념할 수 있다.

- 상속-> 코드의 재활용(재사용)
	: 자식(주인공) -> 부모가 누구야가 기준
	  (부모가 내 자식이 누구야? 가 기준이 아님)

- 주의할 점
	: 자바는 다중상속을 지원하지 않기 때문에
	  두 개 이상의 클래스로부터 상속받을 수 없다.
	  
	  즉, 자바는 단일상속만 지원한다.
*/

//부모클래스 - 상위 클래스==슈퍼(super) 클래스 -- 물려주는 클래스 -- 상속하는 클래스
class SuperTest111
{
	
	protected double area;               //protected가 있다면 99퍼센터 상속을 염두하고 만든 것임

	SuperTest111()  //생성자 -> 상속에서 제외
	{
		System.out.println("Super Class...");
	}

	void write(String title)
	{
		System.out.println(title + " - " + area);
	}
}

//자식클래스 - 하위 클래스==서브(sub) 클래스 -- 물려받는 클래스 -- 상송받는 클래스
public class Test111 extends SuperTest111             //SuperTest112, SuperTest113을 연속으로 쓰기 불가능.
{
	/*
	protected double area;               //protected가 있다면 99퍼센터 상속을 염두하고 만든 것임
	
	//생성자는 상속 대상에서 제외된다.

	void write(String title)
	{
		System.out.println(tite + " - " + area);
	}*/ //이것이 있다고 가정하면 됨.


	//컴파일 과정에서 자동으로 삽입되는 default 생성자
	/*
	Test111()
	{
		//생성자 내부에서 또 다른 생성자 호출 가능
		// 가능하다. 단, 생성자 내부에서 가장 먼저 실행되어야 한다.

		//텅 비어있다.
		// 부모클래스 생성자 호출 구문이 들어있다라는 거 생각하기.
		//super(); 이 구문이 들어있다고 생각하기

	}*/

	//default 모양으로 사용자정의 생성자를 만든 것
	Test111()
	{
		//super();     // <- 안 보이더라도 자동으로 삽입 됨
		// SuperTest111() // 이거라고 할 수 있고
		//SuperTest111() -> 	SuperTest111()
								//{
								//	System.out.println("Super Class...");
								//}

		System.out.println("Sub Class...");

		//super();  // -> 아래에 붙지 않는다.
	}

	public void actionCircle()
	{
		int r = 10;
		area = r*r*3.141592;                     //부모로부터 상속받은 area임 위쪽에 protected double area;이것을 상속 받음
		write("원");                             //부모로부터 상속받은 write()메소드 위쪽에 void write(String title)
																						//	{
																						//		System.out.println(title + " - " + area);
																						//	}
	}

	public void actionRect()
	{
		int w=20, h=5;
		area = w*h;                              //부모로부터 상속받은 area임 위쪽에 protected double area;이것을 상속 받음
		write("사각형");                         //부모로부터 상속받은 write()메소드 위쪽에 void write(String title)
																						//	{
																						//		System.out.println(title + " - " + area);
																						//	}
	}                                             
	
	public static void main(String[] args)
	{
		//Test111 클래스(자식) 기반 인스턴스 생성
		Test111 ob=new Test111();
		//Super Class...
        //Sub Class...

		ob.actionCircle();
		//원 - 314.1592

		ob.actionRect();
		//사각형 - 100.0
	}
}