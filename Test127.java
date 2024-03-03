/*=================================
■■■ 자바의 주요(중요) 클래스 ■■■
- 자바에서 기본적으로 제공하는 주요 클래스들
- Object 클래스
=================================*/

//Test126.java 와 같이 보기

//import java.lang.*;
//위 import java.lang.Object; 를 포함하는 구문일 것임

public class Test127 //extends Object
{
	/*
	Object 클래스로부터 상속받은 멤버들
	...

	public String toString()
	{
		...;
	}

	...
	*/
	
	@Override
	public String toString()  //toString()를 재정의함.
	{
		return "재정의한 toString()...";
	}

	public static void main(String[] args)
	{
		Test127 ob = new Test127();
		
		System.out.println(ob.toString());
		//재정의한 toString()...

		System.out.println(ob);       //Object의 String()을 가져오지만 오버라이딩을 하였기 때문에 같은 값이 나옴.
		//재정의한 toString()...
	}
}
