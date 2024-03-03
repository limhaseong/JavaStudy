/*=================================
■■■ 클래스와 인스턴스 ■■■
- 생성자(Constructor)와 초기화 블럭(Initialized Block)
=================================*/

public class Test078
{
	/*//수행할 수 없음
	int n;
	int m;
                //이렇게는 안됨.
	n = 100;    //변수의 연산은 안됨.
	m = 200;
	*/
	
	/*//수행 가능
	int n = 100;
	int m = 200;    //즉 변수의 초기화는 가능하지만 대입연산은 불가능하다.
	*/
	
	
	int n;
	int m;

	// 생성자
	Test078()
	{
		n=100;
		m=200;
		System.out.println("생성자 실행..");
	}

	//초기화 블럭이라고 함
	{
	n=10;
	m=20;
	System.out.println("초기화 블럭 실행...");
	}

	// 생성자와 초기화 블럭 둘다 초기화의 성격을 가지지만
	// 값은 생성자의 값을 따라간다.


	//멤버 출력 메소드 정의
	void write()
	{
		System.out.println("n : " + n + ", m : " + m);
	}

	Test078(int n, int m)
	{
		this.n=n;
		this.m=m;
		System.out.println("매개변수 있는 생성자 실행");
	}

	public static void main(String[] args)
	{
		Test078 ob1 = new Test078();
		ob1.write();
		//초기화 블럭 실행...
		//생성자 실행..
		//n : 100, m : 200

		Test078 ob2 = new Test078(222, 333);
		ob2.write();
		//초기화 블럭 실행...
		//매개변수 있는 생성자 실행
		//n : 222, m : 333
		//계속하려면 아무 키나 누르십시오 . . .
	}
}