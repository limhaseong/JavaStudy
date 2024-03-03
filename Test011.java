/*=================================
■■■ 자바 개요 및 특징 ■■■

=================================*/

// ㅇ퀴즈
// 직사각형의 넓이와 둘레를 구하는 프로그램을 구현한다.
// 가로: 10, 세로 :20

// 실행 예)
// 넓이 : 가로 * 세로;
// 둘레 : (가로+세로)*2;
// 계속하려면 아무키나 누르세요...


public class Test011
{
	public static void main(String[] args)
	{	
		/*주요 변수 선언
		int a = 10;
		int b = 20;

		int area, length;

		//연산 및 처리
		area = a * b;
		length = (a+b)*2;
		
		//결과출력
		System.out.println("넓이 : " + area);
		System.out.println("둘레 : " + length);*/

		//-----------------------------------------

		//주요 변수 선언
		int a=10, b=20; //가로, 세로
		int x,y;        //넓이, 둘레

		//연산 및 처리
		x = a*b;
		y = (a+b)*2;

		//결과 출력
		System.out.println("넓이 : " + x);
		System.out.println("둘레 : " + y);

		System.out.printf("넓이 : %d%n", x);
		System.out.printf("둘레 : %d%n", y);

	}
}

/* 실행결과
넓이 : 200
둘레 : 60
넓이 : 200
둘레 : 60
계속하려면 아무 키나 누르십시오 . . .
*/