/*=================================
■■■ 자바의 주요(중요) 클래스 ■■■
- 자바에서 기본적으로 제공하는 주요 클래스들
- Object 클래스
=================================*/

class Test
{
	private int a = 10;

	public void write()
	{
		System.out.println("a : " + a);
	}
}

public class Test128
{
	public static void main(String[] args)
	{
		Test ob1 = new Test();
		Test ob2 = new Test();

		System.out.println(" 10 == 9 : " + (10 == 9));
		// 10 == 9 : false

		int a = 10;
		int b = 10;
		System.out.println(" a == b : " + (a == b));
		// a == b : true

		// - == 동등함을 나타내는 비교 연산자는 피연산자의 크기를 비교함을 확인(관찰)
		
		System.out.println(" ob1 == ob2 : " + (ob1 == ob2));  //ob1, ob2 둘다 Object 타입이라고 해도 맞다.
		// ob1 == ob2 : false
		// - 객체(Object)들을 비교하는 과정에서 사용하는 == 연산자는
		//   크기를 비교하는 것이 아니라 대상 객체의 주소를 비교함.

		System.out.println();
		System.out.println("---------------------------------------------------------------");
		System.out.println();
		
		System.out.println("ob1            : " + ob1);
		System.out.println("ob1.toString() : " + ob1.toString());
		//ob1            : Test@15db9742
		//ob1.toString() : Test@15db9742

		System.out.println("ob2            : " + ob2);
		System.out.println("ob2.toString() : " + ob2.toString());
		//ob2            : Test@6d06d69c
		//ob2.toString() : Test@6d06d69c

		//클래스명@해쉬코드

		// - 해쉬코드(hashcode)
		//		: 자바 내부적으로 객체를 구분하기 위해 사용하는 것.
		//        메모리의 주소값으로 생각하면 절대로 안된다.
		
		// - 객체가 같으면 hashcode(해쉬코드)가 같지만
		//    hashcode(해쉬코드)가 같다고 같은 객체가 아니다.
		//    즉,해쉬코드가 다르면 다른 객체이지만
		//    해쉬코드가 같다고 같은 객체는 아니다!


		/*
		class 사람
		{
		}
		class 하성 extends 사람
		{
		}
		class 혜썽 extends 사람
		{
		}
		
		하성 ob1 = new 하성();
		혜썽 ob2 = new 혜썽();
		- 둘다 사람이다.
		*/

	}
}