/*=================================
■■■ 클래스와 인스턴스 ■■■
=================================*/

// Test071.java 파일과 한 세트

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

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/*
class Circle
{
		int r;
		double p = 3.141592;

		void input() throws IOException
		{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			System.out.print("반지름 입력 : ");
			r = Integer.parseInt(br.readLine());
		}

		double area()
		{
			return r * r * p;
		}

		double length()
		{
			double res;
			res=r*2*p;
			return res;
		}
		void print(double a, double b)
		{
			System.out.println("반지름이" + r + "인 원의");
			System.out.println("넓이 입력 : " + a);
			System.out.println("둘레 입력 : " + b);
		}
}

public class CircleTest
{
	public static void main(String[] args) throws IOException
	{
		Circle ob = new Circle();

		ob.input();

		double ar = ob.area();
		double leng = ob.length();

		ob.print(ar, leng);
	}
}
*/

public class CircleTest
{
	// 주요 속성(데이터, 상태) -> 멤버 변수
	int r;                     //반지름
	final double PI = 3.141592;      //원주율은 중간에 변함이 없음(변수의 상수화) -> 대문자 주의


	// 주요 기능(동작, 행위) -> 멤버 메소드
	
	// 반지름 입력 기능
	void input() throws IOException                     //반지름을 입력 하게끔, 입력 받게끔 하는 것으로 하는 일 끝.
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("반지름 입력 : ");
		r = Integer.parseInt(br.readLine());
	}
	
	// 넓이 계산 기능
	double calArea()
	{
		//원의 넓이 = 반지름 * 반지름 * 3.141592
		return r*r*PI;
	}

	// 둘레 계산 기능
	double calLength()
	{
		//원의 둘레 = 반지름*2*3.141592
		double result;
		result = r*2*PI;
		return result;
	}

	// 결과 출력 기능
	void print(double a, double b)
	{
			System.out.printf("\n 반지름이 %d인 원의\n", r);
			System.out.printf("넓이 : %.2f \n", a);
			System.out.printf("둘레 : %.2f \n", b);
	}
}