/*=================================
■■■ 클래스 고급 ■■■
- 중첩 클래스
=================================*/

//Test122.java랑 같이 보기

/*
- Annonymous 클래스(익명의 클래스 : 무명 클래스)
	: 1. AWT 나 안드로이드 이벤트 처리(키보드에서 뭐 누르는 것, 화면터치, 화면에 뭐를 꾹 누른다 등등 모든 것이 이벤트 처리)에서 일반적으로 사용
	  2. 상위 클래스 메소드를 하나 정도 재정의할 필요성이 있을 때 사용
	  3. 클래스의 객체가 필요하면 또 다시 클래스를 생성해야 하는
	     번거로움으로 인해 빈번하게 객체 생성이 필요할 경우
		 익명의 클래스를 생성하여 처리할 수 있다.

- 형식 및 구조
	: new 상위 클래스의 생성자()
	  {
		  접근제어지시자 자료형 메소드()
		  {
			  ...;
		  }
	  };       <- 세미콜론 있는 거 체크~~
*/

//4. 무명 클래스(익명 클래스, annonymous class)

//class SuperTest116 extends Object   --> 이런식으로 붙어서 상속받게 된다. 즉 모두 extends Object가 붙는다.
//{
//}
//class SubTest116 extends SuperTest116 (,Object 이렇게 들어가있는 것이 아닌)
//{
//}
//extends Object = 모든 클래스의 조상이 되는 클래스임

//import java.lang.Object; -> lang -> 언어적인 것이 있는 곳은 다 lang안에 있음
//import java.lang.*; //import 구문을 쓰지 않아도 자동적으로 다 들어있음.

class TestObj // extends Object -> 클래스 뒤에는 다 붙어 있음(Object를 상속 받겠다.)
{
	/*
	object 의 멤버들이 존재함.
	멤버들은 https://docs.oracle.com/javase/8/docs/api/
	여기서 보면 됨.
	...;
	public String toString()
	{
		...;
	}
	*/
	
	/*//object 멤버가 상속 되었기에 오버라이딩 가능하다.
	@Override
	public String toString()
	{
		...;
	}

	...;
	*/

	public Object getString()
	{
		/*
		Object ob = new Object();
		ob.xx();
		ob.yyy();
		ob.zzzz();
		
		return ob;
		*/

		//return new Object(); //Object ob = new Object(); return ob; 와 같은 의미
		//     ------------- Object 형
		
		//return new Object(){};
		return new Object() //이름이 없이 생긴 객체임.
		{
			//특정 메소드 재구성 -> 재정의
			@Override
			public String toString()
			{
				return "익명의 클래스...";
			}
		};

	}
}

//import java.lang.*;

public class Test125 // extends Object
{
	/*
	Object의 멤버들 상속 받음
	*/
	public static void main(String[] args) //빨간색으로 써지는 것들은 원래 import구문을 썼지만 String, System은 안 쓴 이유 = java.lang에 들어있고 -> 이 java.lang은 자동으로 삽입되기 때문이다.
	{
		TestObj ob = new TestObj();

		System.out.println(ob.toString());
		//TestObj@15db9742

		System.out.println(ob.getString());
		//익명의 클래스...
	}
}