/*=================================
■■■ 클래스 고급 ■■■
- 인터페이스(Interface)
=================================*/

//추상 클래스는 하나 이상의 추상 메소드가 있다면 인터페이스는 단 1개도 구체적으로 정의 되어 있지 않음.

/*
- 인터페이스(Interface)란
	: 완전히 미완성된 채로 남겨져
	  인터페이스 안에 존재하는 그 어떤 메소드도(어떠한 메소드도 정의되어 있으면 안된다.)
	  몸체(정의부)가 없기 때문에 사실상 실행 부분이 존재하지 않는다.
	  클래스를 위한 템플릿으로써의 기능을 수행하는
	  추상 클래스의 한 종류이다.

- 인터페이스는 클래스와 달리 다중 상속이 가능하며
  인터페이스 자체도 상속된다.
  기존의 C++ 언어 등에서 지원되는 다중 상속이
  사용 과정에서 많은 문제점을 노출시켰기 때문에
  자바에서는 다중 상속의 개념을 인터페이스라는 개념으로 변형하여
  인터페이스를 통해 다중 상속을 구현하는 방법을 지원한다.

- 인터페이스는 상수와 추상 메소드만 가질 수 있으며
  인터페이스 안의 메소드를 접근제어지시자를 명시하지 않아도
  public으로 설정되어 클래스에서 구현(implements)함으로써
  바로 접근이 이루어질 수 있다.

- 특징
	1. 추상 클래스의 일종으로 선언만 있고 정의가 없다.
	2. final 변수는 가질 수 있다.(상수의 개념)
	3. 인터페이스는 public static final 상수만 만들 수 있다.
	4. 인터페이스를 구현하기 위해서는 extends 대신에 implements 이용한다.
	5. 하나 이상의 인터페이스를 implements 할 수 있다.
	6. 인터페이스를 implements 한 클래스는 인터페이스의 모든 메소드를 Overriding 해야 한다.
	7. 인터페이스가 다른 인터페이스를 상속받을 수 있으며
	   이 때, extends키워드를 사용한다.
	   또한, 클래스와 달리 인터페이스는 다중 상속이 가능하다.
*/

//인터페이스
interface Demo
{
	public static final double PI = 3.141592;  //상수화 형태로 변수 구성

	//인터페이스의 멤버 변수는
	//static final을 별도로 명시하지 않아도
	//자동으로 static final 인 상태이다.
	public int a = 10; //이렇게도 가능한데 이럴 경우 자동으로 static final을 붙여준다.
	
	//인터페이스의 메소드는 선언만 가능(정의 불가)
	//자동으로 abstract인 상태이기때문에 안써도 됨
	//public abstract void print();
	public void print();                  //-> 선언만 가능하기 때문에 마지막에 ; 붙임
	/*{
		System.out.println("PI : " + PI); -> 인터페이스는 이런식으로 정의 되면 안된다.
	}*/
}

//클래스
//class DemoImpl
//class DemoImpl extends Demo  //이렇게 하면 안된다.
//class DemoImpl implements Demo  //이렇게 implements 사용한다.
//                |
// 추상클래스가 된다. -> 인터페이스를 구현하는 추상 클래스
//abstract class DemoImpl implements Demo -> 인터페이스의 모든 것이 재정의가 되어 추상클래스가 아니게 됨
//                |
// 클래스 - 인터페이스를 구현하는 클래스(->print() 메소드 재정의)로 추상클래스를 제거 가능
class DemoImpl implements Demo
{
	/*//인터페이스꺼를 가져옴
	public static final double PI = 3.141592;
	public int a = 10;
	public void print();
	*/

	@Override
	public void print()
	{
		System.out.println("인터페이스 메소드 재정의...");
	}

	public void write()                                   //추가적인 메소드 정의 가능
	{
		System.out.println("클래스에 정의된 메소드...");
	}
}

//main() 메소드를 포함하는 외부의 다른 클래스
public class Test117
{
	public static void main(String[] args)
	{
		//Demo ob = new Demo();    //생성 불가 -> 아무것도 없는 설계도이므로 안된다.(추상화 클래스도 불가능한 것처럼 이것 또한 안된다.)
		// 인터페이스는 인스턴스를 생성할 수 없다.

		//DemoImpl ob = new DemoImpl();                     
		// 인터페이스를 implements만 한 상태에서는 불가하다.
		// print() 메소드(->추상 메소드)를 재정의한 후 
		// abstract 상태에서 벗어나면 가능하다. //Demo만 implements했다면 불가능 했겠지만 오버라이딩을 통해 재정의 해서 추상 꼬리표를 제거해서 가능하다.

		//DemoImpl obTemp = new DemoImpl();
		//Demo ob = (Demo)obTemp;
		//Demo ob = obTemp;
		//셋다 가능한 부분임(하위 객체를 생성했기 때문)
		
		// 업 캐스팅
		//인터페이스 객체는 상위 객체
		Demo ob = new DemoImpl();
		//Demo ob = obTemp; 이렇게 생긴 게 가능하듯이 이것도 가능
		//바로 위에서 obTemp가 new DemoImpl(); 이거 이듯이 이렇게 사용 가능.

		ob.print();
		//인터페이스 메소드 재정의... -> 오버라이딩 한 상태가 출력됨
		//ob는 인터페이스이지만 오버라이딩 한 것이 출력됨.

		//ob.write();
		//컴파일 에러 발생
		//현재 Demo 객체 생성 했기 때문에 write가 없음
		
		//다운 캐스팅
		((DemoImpl)ob).write();
		//클래스에 정의된 메소드...

		System.out.println(Demo.PI);          //static 이기 때문에 가능하다. //static 메소드 이므로 객체 생성 없이 사용 가능
		//3.141592
		
		System.out.println(Demo.a);           //static이 없어도 static 이 자동으로 붙기에 가능하다.
		//10

		//Demo.a = 300;                       //final이기 때문에 바꾸기 불가능해서 에러 발생.
		//컴파일 에러 발생
	}
}