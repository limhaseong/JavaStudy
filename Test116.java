/*=================================
■■■ 클래스 고급 ■■■
- 상속 관계에 있는 클래스들 간의 캐스팅
  (업 캐스팅, 다운 캐스팅)
=================================*/

//super class, 부모 클래스, 상위 클래스
class SuperTest116
{
	public int a=10, b=20;

	public void write()
	{
		System.out.println("슈퍼클래스 write() 메소드...");
	}

	public int hap()
	{
		return a+b;
	}
}

//sub class, 자식 클래스, 하위 클래스
class SubTest116 extends SuperTest116
{
	public int b=100, c=200;
	
	@Override
	public int hap()
	{
		return a+b+c;
	}

	public void print()
	{
		System.out.println("서브클래스 print() 메소드...");
	}
}

//main() 메소드를 포함하는 외부의 다른 클래스
public class Test116
{
	public static void main(String[] args)
	{
		//하위 클래스 기반 인스턴스 생성
		SubTest116 ob1=new SubTest116();
		//하위클래스를 인스턴스 생성 했지만 부모 클래스도 상속 받았기 때문에 하위도 메모리에 저장, 상위도 메모리에 저장한다.

		System.out.println("ob1.b : " + ob1.b);
		//ob1.b : 100
		
		//상위로 형변환 = 업 캐스팅                                              //형변환=캐스팅
		SuperTest116 ob2 = ob1;    //이렇게 하는 거 가능하다.
		//SuperTest116 ob2 = (SuperTest116)ob1; 와 같은 코드
		//ob1은 자식 타입이지만 부모의 내용들도 다 상속 받아 왔기에 형변환 가능.

		/*
		학생 ㅇㅇㅇ = new 학생();
		포유류 사람 = ㅇㅇㅇ; //포유류 사람 = (사람)ㅇㅇㅇ: 과 동일한 코드
		!학생도 포유류!
		
		class 포유류               class 학생 extends 포유류
		{                          {
		}                          }
		*/

		System.out.println("ob2.b : " + ob2.b);
		//==System.out.println("ob2.b : " + ((SuperTest116)ob1).b);        //(SuperTest116)ob1 이 만큼은 ob2이다.
		//ob2.b : 20

		//--> 메모리 그림판에서 변수는 객체별로 따로 할당되기 때문에
		//    변수 b는 ob2의 변수이다.

		//클래스에 대한 인스턴스 생성을 하게 되면 변수 선언 + 메소드 정의가 있을텐데
		//변수 선언한 것은 메모리에 올라가고
		//메소드 정의는 다른 메모리에 올라간다.
		//즉, 클래스에 대한 인스턴스를 생성하게 되면 전체가 메모리에 가는 것이 아니라
		//변수 선언만 올라가고 메소드 정의는 다른 메모리에 올라가게 되어 변수 선언이 보임.
		
		System.out.println("합 : " + ob2.hap());
		//합 : 310
		//--> hap()메소드는 오버라이딩(Overriding) 되어 있고
		//   ob2는 ob1을 업캐스팅한 상태의 객체이므로
		//   SuperTest116의 hap()메소드를 호출하는 것이 아니라
		//   SubTest116에서 재정의한 hap()메소드를 호출하게 된다.
		//   즉, 메소드는
		//   업 캐스팅이 되더라도
		//   재정의(덮어쓰기)한 이상... 원래의 기능으로 되돌릴 수 없다.

		/*
		SuperTest116 ob2 = new SuperTest116();
		인스턴스 생성 후
		ob2.hap() 하면
		30이 나올 것이지만
		위에 ob2는 ob1을 업캐스팅 한 것이기에 자식클래스의 hap을 가져옴
		*/

		ob2.write();
		//슈퍼클래스 write() 메소드...

		//ob2.print();
		//컴파일 에러뜸
		// 자식은 부모것을 쓸 수 있지만, 부모는 자식꺼 못씀.
		
		//이런 것이 다운 캐스팅
		((SubTest116)ob2).print();
		//서브클래스 print() 메소드...

//---------------------------------추가 관찰----------------------------------------
		
		//다운 캐스팅 가능 여부

		//상위 클래스 기반 인스턴스 생성
		SuperTest116 ob3 = new SuperTest116();

		SubTest116 ob4;

		//System.out.println(ob3.c);
		//>> 컴파일 에러 발생
		// 상위 객체는 하위 객체의 멤버에 접근하는 것이 불가능하다.
		// (상위 객체 입장에서는 어떤 하위 객체가 존재하는지도 알 수 없음)

		//ob4 = ob3;
		//>> 컴파일 에러 발생
		// 상위 객체는 하위 객체에 담을 수(참조할 수) 없다.
		
		//ob4 = (SubTest116)ob3;
		//>> 런타임 에러 발생(ClassCastException)
		// 작성된 구문의 문법적인 구조만 봤을 때...
		// 이 구문은 다운 캐스팅이 이루어지는 상황이다.
		// 하지만, 정상적인 캐스팅이 이루어지지 않는다.
		// 현재 SubTest116 객체에 대한 메모리 할당은 이루어지지 않은 상태이기 때문이다.
		// 그러므로 이 상황에서 다운 캐스팅은 불가능하다.

		/*하위 클래스 기반 인스턴스 생성
		SubTest116 ob1=new SubTest116(); 을 하면 부모 클래스와 자식 클래스의 메모리가 다 올라가지만

		상위 클래스 기반 인스턴스 생성
		SuperTest116 ob3 = new SuperTest116(); 을 하면 부모 클래스는 메모리가 올라가지만 자식 클래스의 메모리는 올라가지 않기 때문이다.*/


//-------업 캐스팅, 다운 캐스팅이 정상적으로 이루어지는 경우----------------------------------------------------------------------------
		
		/*
		1. 하위 객체 생성시    //확인 필요~ --> 하위객체를 생성할 때 상위 객체도 생성되는 거 잊지 말기.
		
		2. 상위 = 하위;        //업 캐스팅. 정상적으로 이루어짐.

		3. 하위 = 상위;        //에러 발생.

		4. 하위 = (하위)상위;  //다운 캐스팅, 정상적으로 처리 됨.

//-------다운 캐스팅이 정상적으로 이루어지지 않는 경우----------------------------------------------------------------------------------

		1. 상위 객체 생성      //확인 필요~ --> 하위 객체는 생성되지 않는다.

		2. 하위 = 상위;        //에러 발생.

		3. 하위 = (하위)상위;  //다운 캐스팅이 맞지만 런타임 에러 발생.

		<<결과>>
			: 업 캐스팅은 항상 가능하지만
			  다운 캐스팅은 경우에 따라 가능하다.
		*/
	}
}