/*=================================
■■■ 클래스 고급 ■■■
- 인터페이스(Interface)
=================================*/

//인터페이스
interface ADemo
{
	public void write();          //추상메소드
}

//인터페이스
interface BDemo
{
	public void print();          //추상메소드
}

// 인터페이스는 2개 이상을 구현(implements)할 수 있다.
// -> 클래스에서 다중 상속이 되지 않는 부분을 보완(보충)하는 개념
// (추상 클래스는 다중 상속이 안된다.)

//클래스
//class DemoImpl
//class DemoImpl extends ADemo, BDemo   // -> X(인터페이스는 extends 사용 안함)
//class DemoImpl implements ADemo, BDemo
//           |
//추상 클래스 - 두 인터페이스를 구현하는 추상 클래스가 된다.(오버라이딩을 하기전)
//abstract class DemoImpl implements ADemo, BDemo
//           |
//클래스 - 두 인터페이스를 구현한 후 -> 두 인터페이스의 모든 메소드를 Overriding하여 재정의 하면 -> 일반 클래스가 됨
class DemoImpl implements ADemo, BDemo
{
	//JDK 1.5(5.0)에서는 인터페이스를 메소드를
	//오버라이딩(Overriding)할 때
	//@Override 어노테이션(annotation)을 사용할 수 없다.
	//JDK 1.6(6.0) 이후부터 적용 가능한 문법이다.
	//단, 상속받은 클래스의 메소드를 오버라이딩(Overriding)할 때에는
	//JDK1.5(5.0)에서도 어노테이션 사용이 가능하다.
	//(class에서 @를 사용하는 것은 JDK 1.5(5.0)에서 가능하지만
	//인터페이스에서 @사용하는 것은 JDK 1.6에서 가능하다.)
	@Override
	public void write()
	{
		System.out.println("ADemo 인터페이스 메소드 write()...");
	}
	
	@Override
	public void print()
	{
		System.out.println("BDemo 인터페이스 메소드 print()...");
	}
}

//main()메소드를 포함하는 외부의 다른 클래스
public class Test118
{
	public static void main(String[] args)
	{
		//인터페이스를 가지고 인스턴스 생성하는 거 절대 불가능하다.
		//ADemo ob1 = new ADemo();
		//BDemo ob2 = new BDemo();
		
		//ADemo, BDemo 인터페이스를 구현(implements)한
		//클래스(-> DemoImpl)기반의 인스턴스 생성.
		DemoImpl ob1 = new DemoImpl();
		
		ob1.write();
		//ADemo 인터페이스 메소드 write()...

		ob1.print();
		//BDemo 인터페이스 메소드 print()...
		
		//업 캐스팅
		ADemo ob2 = new DemoImpl();
		BDemo ob3 = new DemoImpl();

		//ob2.print();
		//컴파일 에러 발생(ADemo에는 print()가 없음)
		//ob3.write();
		//컴파일 에러 발생(BDemo에는 write()가 없음)

		ob2.write();
		//ADemo 인터페이스 메소드 write()...
		ob3.print();
		//BDemo 인터페이스 메소드 print()...

		//업 캐스팅도 다운 캐스팅도 아니다.
		((BDemo)ob2).print();
		//BDemo 인터페이스 메소드 print()...
		((ADemo)ob3).write();
		//ADemo 인터페이스 메소드 write()...
		//--> DemoImpl클래스가 두 인터페이스(ADemo와 BDemo)를 모두 구현했기 때문에
		//    이와 같은 처리가 가능하다.
		//    만약, DemoImpl클래스가 두 인터페이스들 중 한 인터페이스만 구현했다면
		//    이 구문은 런타임 에러가 발생하는 구문이 된다.
		//(아무런 상관없는 객체와 다른 클래스의 것과 캐스팅하는 것은 원래는 불가능하지만
		//DemoImpl()이 ADemo와 BDemo를 둘다 포함했기 때문이다.)

		//이것이 다운 캐스팅!
		((DemoImpl)ob3).write();
		//ADemo 인터페이스 메소드 write()...



	}
}