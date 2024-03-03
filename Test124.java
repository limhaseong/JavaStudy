/*=================================
■■■ 클래스 고급 ■■■
- 중첩 클래스
=================================*/

//Test122.java랑 같이 보기

//static중첩 클래스와 비교해서 보면 됨.

//3. 지역 클래스(로컬 클래스, local class)

//outer
class InnerOuterTest
{
	static int a = 10;
	int b = 20; //인스턴스 변수
	
	//inner
	class InnerNested  //인스턴스 멤버
	{
		int c = 30;
		
		void write()
		{
			System.out.println("inner 의 write()...");
			System.out.println("a : " + a);         //탄생시점 제일 빠름
			System.out.println("b : " + b);         //둘다 인스턴스 변수와 클래스라 가능
			System.out.println("c : " + c);         //int c와 inner의 write()의 탄생 시점이 같다.
		}
	}

	void write()
	{
		System.out.println("outer 의 write()...");
		
		//InnerNested 클래스 기반 인스턴스 생성(-> inner)
		InnerNested ob1 = new InnerNested();
		ob1.write();                        //inner의 write() 메소드 호출
	}
}

public class Test124
{
	public static void main(String[] args)
	{
		//InnerOuterTest클래스 기반 인스턴스 생성(-> outer)
		InnerOuterTest ob2 = new InnerOuterTest();
		ob2.write();                             //outer의 write() 메소드 호출
		//outer 의 write()...
		//inner 의 write()...
		//a : 10
		//b : 20
		//c : 30

		//InnerNested클래스 기반 인스턴스 생성(-> inner)
		//InnerNested ob3 = new InnerNested();
		//-> 컴파일 에러 발생.
		
		// 체크~~!!! -> Test122.java파일과 비교!
		//InnerNested클래스 기반 인스턴스 생성(-> inner)
		//InnerOuterTest.InnerNested ob4 = new InnerOuterTest.InnerNested();
		//-> 컴파일 에러 발생
		//InnerOuterTest = 설계도일 뿐이지 객체는 아니다.

		// - 중첩 내부 클래스(static 중첩 클래스)와는 달리
		//   외부 클래스의 인스턴스(객체)를 사용하지 않고
		//   단독으로 내부 클래스의 인스턴스를 생성하는 것은 불가능하다.
		//   -> 단, 외부 클래스의 객.체. 를 사용하면
		//      내부 클래스의 객체를 생성하는 것이 가능하다.

		// 체크~~!!! -> Test122.java 파일과 비교!
		InnerOuterTest.InnerNested ob5 = ob2.new InnerNested();  //처음 보는 타입일 것임.
		//--------설계도 타입---------   ----내부 객체 생성----
		//ob2 = 외부 클래스 기반의 객체!(위에서 사용한 객체임!)
		ob5.write();
		//inner 의 write()...
		//a : 10
		//b : 20
		//c : 30
		
		// 체크~~!!! -> Test122.java 파일과 비교
		//outer클래스명.inner클래스명 참조변수명 = new outer생성자().new inner생성자();
		InnerOuterTest.InnerNested ob6 = new InnerOuterTest().new InnerNested();  //바로 위 ob5와 같음.
		ob6.write();
		//inner 의 write()...
		//a : 10
		//b : 20
		//c : 30

		//cf) static -> 중첩 내부 클래스
		//    outer클래스명.inner클래스명 참조변수명 = new outer클래스명.inner생성자();


		
	}
}