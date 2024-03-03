/*=================================
■■■ 클래스 고급 ■■■
- 상속(Inheritance)
=================================*/

// <<메소드 오버라이딩(Method Overriding)의 특징>>

// - 메소드 이름, 리턴 타임, 파라미터 수나 타입이 완전히 일치해야 한다.

// - 반드시 상속 관계가 있어야 한다.

// - 재정의된 하위클래스의 메소드 접근제어지시자는
//	 상위 클래스의 메소드 접근제어지시자보다 범위가 크거나 같아야 한다.
//	 예를 들어, 상위 클래스 메소드의 접근제어지시자가 protected인 경우
//	 하위클래스가 이 메소드를 오버라이딩(Overriding) 하는 경우
//	 접근제어지시자는 public 또는 protected이어야 한다.

// - static(클래스 메소드임), final(최종값이기에 상수화 가능-다른 값으로 바꿀 수 없음), private(자식클래스라고 해도 접근 자체가 안되기에 불가능) 메소드는
//	 오버라이딩(Overriding)할 수 없다.

// - Exception의 추가가 불가능하다.
//	 즉, 상위 메소드가 가지고 있는 기존의 예외 사항에
//	 새로운 Exception을 추가하는 것은 불가능하다는 것이다. 

//부모 클래스(상위 클래스, super class)
class SuperTest114
{
	private int a = 5;
	protected int b = 10;
	public int c = 20;

	public void write()
	{
		System.out.println("Super write() 메소드 : " + a + " : " + b + " : " + c);
	}
}

//자식 클래스(하위 클래스, sub class)
class SubTest114 extends SuperTest114
{
	/*//부모 클래스로 부터 상속 받은 데이터
	//private 불가능
	protected int b = 10;
	public int c = 20;

	public void write()
	{
		System.out.println("Super write() 메소드 : " + a + " : " + b + " : " + c);
	}
	*/

	protected int b = 100;

	public void print()
	{
		//System.out.println("Sub print() 메소드 : " + a + " : " + b + " : " + c);
		//--> 컴파일 에러
		//private이기 때문에 a에 접근 불가능
		// == 슈퍼클래스에서 선언된 변수 a 에는 접근할 수 없다.
		//  -> private 변수이기 때문이다.

		System.out.println("Sub print() 메소드 : " + b + " : " + c);
		//Sub print() 메소드 : 100 : 20

		System.out.println("Sub print() 메소드 : " + b);
		System.out.println("Sub print() 메소드 : " + this.b);     //this를 만나면 this가 포함한 class로 치환 this.b==SubTest114.b
		System.out.println("Sub print() 메소드 : " + super.b);    //부모로부터 물려받은 b이므로 super.b==SuperTest114.b
		//Sub print() 메소드 : 100
		//Sub print() 메소드 : 100
		//Sub print() 메소드 : 10
		//== 변수 b는 접근 방법에 따라 다른 b로 접근 및 출력이 이루어진다.
		//슈퍼클래스에서 선언된 b, 서브클래스에서 선언된 b

		System.out.println("Sub print() 메소드 : " + c);
		System.out.println("Sub print() 메소드 : " + this.c);
		System.out.println("Sub print() 메소드 : " + super.c);
		//Sub print() 메소드 : 20
		//Sub print() 메소드 : 20
		//Sub print() 메소드 : 20
		//== 변수 c는 접근하는데 아무런 제약과 제한이 없다.
		// 슈퍼클래스에서 선언된 c

	}//end print()
	
	@Override
	public void write()
	{
		//System.out.println("Super write() 메소드 : " + a + " : " + b + " : " + c);
		//--> 컴파일 에러
		//private이기 때문에 a에 접근 불가능
		// == 슈퍼클래스에서 선언된 변수 a 에는 접근할 수 없다.
		//  -> private 변수이기 때문이다.

		System.out.println("Sub write() 메소드 : " + b + " : " + c);
	}

}

//main() 메소드를 포함하는 외부의 다른 클래스
public class Test114
{
	public static void main(String[] args)
	{
		//하위(SubTest114) 인스턴스 생성
		SubTest114 ob = new SubTest114();

		ob.print();

		ob.write();
		//Super write() 메소드 : 5 : 10 : 20
		//@Override
		//public void write() 쓰기 전에는 결과값 나옴.
		
		//@Override
		//public void write() 사용 후 결과값 (a를 불러올 수 없어서 빼줌)
		//Sub write() 메소드 : 100 : 20

		System.out.println("----------------------------------------------구분선");

		System.out.println(ob.b);  // 제 3자의 입장에서 자식 클래스를 볼때
		//100					   // 구분선 위에 b는 부모 클래스에 b와 자식이 새로 선언한 b가 있지만 자식클래스가 불려짐.
								   // ob = SubTest114(자식 클래스)

		//System.out.println(((SuperTest114)ob));  -> ob만 SuperTest114타입으로 변환한다.
		System.out.println(((SuperTest114)ob).b);
		//10
		//==슈퍼 부름 -> ob 앞에 (SuperTest114)를 해주면 ob만 SuperTest114타입으로 변환하는데 이때는 부모가 선언한 b의 값을 가져올 수 있다.

		ob.write();
		//Sub write() 메소드 : 100 : 20

		((SuperTest114)ob).write();          //((SuperTest114)ob) 하면 ob가 부모 클래스로 변환은 하지만 이유는 메소드는 바꾸면 되돌릴 수 없다는 규칙 때문임.
		//Sub write() 메소드 : 100 : 20

		// --> 메소드와 변수를 꼭 구분하여 정리할 것.
		

		
	}
}