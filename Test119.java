/*=================================
■■■ 클래스 고급 ■■■
- 인터페이스(Interface)
=================================*/

//인터페이스
interface Demo
{
	public void write();
	public void print();
}

//클래스
//class DemoImpl 이거였다가 Demo를 implements하면
//인터페이스를 구현하는 추상 클래스가 됨
abstract class DemoImpl implements Demo
{
	@Override
	public void write()                            //-> 이거 재정의 해도 추상 클래스를 뗄 수 없다. public void print(); 이것도 같이 와서 재정의를 해야지 떼짐.
	{
		System.out.println("write() 메소드 재정의...");
	}

	//public abstract void print();  -> 안보이지만 이것도 같이 딸려옴
}

//클래스
//class DemoImplSub
//class DemoImplSub extends DemoImpl
//추상 클래스를 상속받은 추상클래스가 됨
//abstract class DemoImplSub extends DemoImpl
//추상 클래스를 상속받은 클래스(추상 클래스를 상속받은 클래스이지만 마지막 오버라이딩을 통해 abstract를 뗄 수 있다.
class DemoImplSub extends DemoImpl
{
	/*//안보이지만 위에 것을 가져옴.
	@Override
	public void write()                           
	{
		System.out.println("write() 메소드 재정의...");
	}

	//public abstract void print();
	*/

	@Override
	public void print()
	{
		System.out.println("print() 메소드 재정의...");
	}
}

//main()메소드를 포함하는 외부의 다른 클래스
public class Test119
{
	public static void main(String[] args)
	{
		//Demo ob1 = new Demo();
		//인스턴스 생성 불가 -> 인터페이스이기 때문

		//DemoImpl ob2 = new DemoImpl();
		//인스턴스 생성 불가 -> 추상클래스이기 때문

		DemoImplSub ob3 = new DemoImplSub();

		ob3.write();
		ob3.print();
		//write() 메소드 재정의...
		//print() 메소드 재정의...

	}
}