/*=================================
■■■ 클래스 고급 ■■■
- 중첩 클래스
=================================*/

//Test122.java랑 같이 보기

//2. 내부 클래스(inner class)

//outer
class Test2
{
	static int a = 10;    
	int b = 20;          

	void write()                         //첫 번째 write() 메소드
	{
		System.out.println("write()... 1번");
		final int c = 30;
		int d = 40;
		
		//inner
		//메소드 안에 존재하는 또 다른 클래스(로컬 클래스, local class, 지역 클래스)
		class LocalTest  //언제 탄생할지 모르는 class임 -> 아래 인스턴스 생성을 했지만 저 인스턴스를 안 할수도 있음 -> 엄청 늦게 태어날수도 있음..
		{
			void write()                 //두 번째 write() 메소드
			{
				System.out.println("write()... 2번");
				System.out.println("a : " + a);  //탄생 시점이 제일 빠른 변수
				System.out.println("b : " + b);  //첫 번째 write()메소드 = 인스턴스 메소드이고, int b도 인스턴스 변수이므로 출력 가능
				System.out.println("c : " + c);  //LocalTest가 언제 인스턴스 생성이 되든지 final이므로 30으로 출력이 됨..
				//System.out.println("d : " + d);  //컴파일 에러 발생함
			}
		}
		
		// - 변수 c와 변수 d는 둘 다 지역변수이지만
		//   (첫번째 write() 메소드 안에서 선언된 변수이므로)
		//   c는 final변수이기 때문에
		//   두 번째 write()메소드에서 언제 접근하더라도
		//   고정된 값 30이 담겨있음을 보장받을 수 있다.
		//   반면에 d는 그 값이 수시로 변화될 수 있는 상황이므로
		//   LocalTest 클래스의 인스턴스 생성 시점이
		//   언제가 될지 알 수 없기 때문에
		//   이로 인해 인스턴스 생성 시점에 d에 값이 담겨있는지를
		//   보장받을 수 없게 된다.
		//   변수 d에 접근하는 것은 피할 수 있도록 문법적으로 처리하는 것이다. 

		//d+=10; 가능
		//d++;
		
		//LocalTest클래스 기반 인스턴스 생성(-> inner)
		LocalTest It = new LocalTest();
		It.write();                      //두 번째 write() 메소드 호출

		//d+=20;
	}
}

public class Test123
{
	public static void main(String[] args)
	{
		//Test2 클래스 기반 인스턴스 생성(-> outer)
		Test2 ob = new Test2();
		ob.write();        //첫 번째 write() 메소드 호출
		
	}
}