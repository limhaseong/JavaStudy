/*=================================
■■■ 지역변수와 전역변수 ■■■
- 전역 변수의 초기화 테스트 및 관찰
=================================*/

//Test068.java 와 비교하면서 보기.

public class Test069
{
	//클래스의 영역
	
	//전역 변수 a선언
	int a;
	// 자바가 자동으로 0으로 초기화 지원해줌

	boolean b;
	char c;
	double d;

	public static void main(String[] args)
	{
		//메소드의 영역

		//System.out.println("a : " + a);
		//컴파일 에러 발생
		// 에러 내용: non-static variable a cannot be referenced from a static context
		//Test068.java와 다른 에러가 발생.

		//Test069 클래스를 기반으로 인스턴스 생성
		Test069 ob = new Test069();

		System.out.println("ob.a : " + ob.a);
		//에러 안남.
		//ob.a = 0

		System.out.println("ob.b : " + ob.b);
		System.out.println("ob.c : " + ob.c);
		System.out.println("ob.d : " + ob.d);
		//ob.b : false
		//ob.c :
		//ob.d : 0.0
		// 자바가 자동으로 초기화 해준 값.



	}
}