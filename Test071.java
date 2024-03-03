/*=================================
■■■ 클래스와 인스턴스 ■■■
=================================*/

// CircleTest.java와 한 세트

//원의 넓이와 둘레 구하기.
// 원의 넓이와 둘레를 구할 수 있는 클래스를 설계한다.
//클래스명: CircleTest
//입력은 BufferedReader의 readLine()을 쓰라.

// 원의 넓이 = 반지름 * 반지름 * 3.141592
// 원의 둘레 = 반지름 * 2 * 3.141592

//실행 예)
// 반지름 입력: xxx
//
//>> 반지름이 xxx인 원의
//>> 넓이 : xxxx
//>> 둘레 : xxxx
// 계속하려면 아무 키나 누르세요...

import java.io.IOException;

public class Test071
{
	public static void main(String[] args) throws IOException
	{
		//CircleTest 클래스 기반의 인스턴스 생성
		//CircleTest 인스턴스 생성
		//CircleTest 객체 생성
		CircleTest ob = new CircleTest();

		ob.input();

		double area = ob.calArea();

		double length = ob.calLength();

		ob.print(area, length);
	}
}