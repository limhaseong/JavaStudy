/*=================================
■■■ 자바의 개요 및 특징 ■■■
=================================*/
// ㅇ퀴즈
// 사전에 부여된 반지름 정보를 통해
// 원의 넓이와 둘레는 구하는 프로그램을 구현한다.
// -> 반지름 10

//실행 예)
//넓이 : 반지름 * 반지름 * 3.14
//둘레 : 반지름 * 2 * 3.14
//계속하려면 아무 키나 누르세요...

public class Test010
{
	public static void main(String[] args)
	{
		//double a = 10*10*3.141592;
		//double b = 10*2*3.141592;

		//----------------------------
		//int r = 10;
		//double a = r*r*3.141592;
		//double b = r*2*3.141592;

		//----------------------------
		//int r;
		//r = 10;

		//double a = r*r*3.141592;
		//double b = r*2*3.141592;
		
		//----------------------------
		//주요 변수 선언
		int r = 10;   //반지름 r
		//double pi = 3.141592  //원주율 π
		//final double pi = 3.141592 // final은 변수를 상수화 시킨다.(변하지 않게 함)
		final double PI = 3.141592;  //상수화 된 변수는 대문자로 씀.
		//상수화 된 변수를 쓸때
		//-> rainbowColor -> RAINBOWCOLOR -> RAINBOW_COLOR
		//-> applePrice -> APPLEPRICE -> APPLE_PRICE
		
		double area, length;   //원의 넓이 둘레


		//연산 및 처리
		// 넓이 연산 (반지름 * 반지름 * 3.141592)
		area = r * r * PI;

		// 둘레 연산 (반지름 * 2 * 3.141592)
		length = r * 2 * PI;

		//결과출력
		System.out.println("넓이 : " + area);
		System.out.println("둘레 : " + length);

		System.out.printf("넓이 : %.2f%n", area);
		System.out.printf("둘레 : %.3f%n", length);

		System.out.printf("넓이 : %.2f%n둘레 : %.3f%n", area, length);



		//결과출력
		/*System.out.println("넓이 : " + a);
		System.out.println("둘레 : " + b);

		System.out.printf("넓이 : %.2f%n", a);
		System.out.printf("둘레 : %.3f%n", b);*/

	}
}

/* 실행결과
넓이 : 314.1592
둘레 : 62.83184
넓이 : 314.16
둘레 : 62.832
넓이 : 314.16
둘레 : 62.832
계속하려면 아무 키나 누르십시오 . . .*/