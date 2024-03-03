/*=================================
■■■ 자바의 주요(중요) 클래스 ■■■
- 자바에서 기본적으로 제공하는 주요 클래스들
- BigInteger 클래스
=================================*/

import java.math.BigInteger;

public class Test132
{
	public static void main(String[] args)
	{
		//int a1 = 123456789123456789;
		//System.out.println(a1);
		//불가능

		//long b1 = 123456789123456789;
		//System.out.println(b1);
		//불가능 (123456789123456789은 int형임)
		
		//long c1 = 123456789123456789L;
		//System.out.println(c1);
		//123456789123456789
		//L(l) 붙이면 가능

		//long d1 = 123456789123456789123456789L;
		//System.out.println(d1);
		//불가능 (long 범위를 넘음)
		
		BigInteger a = new BigInteger("123456789123456789123456789");
		BigInteger b = new BigInteger("123456789123456789123456789");
		//정수형태를 표현하는데 한계까 있어서 BigInteger를 쓰는데 123456789123456789123456789이렇게 하면 정수형태로 표현이 안되기 때문에
		// 문자열 형태로 보낸다.
		
		//BigInteger c = a + b; //둘다 primitive 형태가 아님
		//System.out.println(c);
		//컴파일 에러 발생
		

		//더하기
		BigInteger c = a.add(b);    //a.add(b); 얘네도 BigInteger 타입
		System.out.println("덧셈 결과 : " + c);
		//덧셈 결과 : 246913578246913578246913578

		//빼기
		BigInteger d = a.subtract(b);
		System.out.println("뺄셈 결과 : " + d);
		//뺄셈 결과 : 0

		//곱하기
		BigInteger e = a.multiply(b);
		System.out.println("곱셈 결과 : " + e);
		//곱셈 결과 : 15241578780673678546105778281054720515622620750190521

		//나누기
		BigInteger f = a.divide(b);
		System.out.println("나눗셈 결과 : " + f);
		//나눗셈 결과 : 1

		//지수승
		BigInteger g = new BigInteger("2");
		System.out.println("2의 3승 : " + g.pow(3));
		//2의 3승 : 8
	}
}