/*=================================
■■■ 자바의 주요(중요) 클래스 ■■■
- 자바에서 기본적으로 제공하는 주요 클래스들
- BigDecimal 클래스
=================================*/

import java.math.BigDecimal;

public class Test133
{
	public static void main(String[] args)
	{
		BigDecimal a = new BigDecimal("123456789.123456789");

		//movePointLeft() : 소수점을 왼쪽으로 이동
		BigDecimal b = a.movePointLeft(3);
		System.out.println("처리 결과 : " + b);
		//처리 결과 : 123456.789123456789
		
		//더하기, 빼기, 곱하기도 다 있음(Test132.java 확인)
		//나눗셈 연산
		BigDecimal c = a.divide(b);
		System.out.println("처리 결과 : " + c);
		//처리 결과 : 1E+3
		//실수 표현 방법

		BigDecimal d = a.divide(b, BigDecimal.ROUND_DOWN); //반올림을 하지 않는다. -> 절삭하게 됨    //ROUND_DOWN에는 멤버변수 static final이 있다.
		System.out.println("처리 결과 : " + d);
		//처리 결과 : 1000.000000000
		

		//BigInteger 객체로 변환
		System.out.println(a.toBigInteger());
		//123456789
	}
}
