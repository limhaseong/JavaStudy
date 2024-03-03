/*=================================
■■■ 자바의 주요(중요) 클래스 ■■■
- 자바에서 기본적으로 제공하는 주요 클래스들
- Wrapper 클래스
=================================*/

//Test130.java 와 같이 보기

public class Test134
{
	public static void main(String[] args)
	{
		byte b = 3;
		int i = 256;

		Byte b2 = new Byte(b);
		Integer i2 = new Integer(i);

		System.out.println(b2);
		System.out.println(i2);
		//3
		//256

		print(b2);
		print(i2);
	}

	/*
	println(byte b)
	{
		...;
	}

	println(Integer i)
	{
		...;
	}

	println(Long l)
	{
		...;
	}
	*/
	//		↓  업 캐스팅 과정을 함.
	/*
	println(Object obj)
	{
		...;
	}
	*/
	
	/*
	api에서 보면 
	Class Byte
	java.lang.Object(제일 상위)
	java.lang.Number(2번째)
	java.lang.Byte(3번째)
	
	Number n = new Integer(); 업캐스팅
	*/


	//java.lang.Number클래스(추상 클래스)는
	//모든 숫자형 Wrapper클래스의 부모 클래스
	// 슈퍼클래스, 상위 클래스이다.
	// b2, i2에 해당하는 자료형인 Number에 넘어오면서
	// 업 캐스팅이 일어나게 된다.
	static void print(Number n)
	{
		System.out.println(n);//api를 꼼꼼하게 확인해서 하기.(Object 사용하지 말고 하기)
		//3
		//256
		/*
		if (n instanceof Integer)
		{
			System.out.println(n.intValue());
		}
		else if (n instanceof Double)
		{
		}*/
	}
}