/*=================================
■■■ 변수와 자료형 ■■■
- 형 변환 / 접미사 활용
=================================*/

public class Test006
{
	public static void main(String[] args)
	{
		int a;
		a = 10;
		System.out.println("a의 결과 : " + a);
		// a의 결과 : 10

		int b = 20;
		System.out.println("b의 결과: " + b);
		// b의 결과 : 20

		short c;

		//연산 및 처리(대입 연산)
		//c = a;
		//에러 발생(컴파일 에러)
		//기본적으로는 자료형이 작은 것에 큰 것을 담아내지 못한다.
		//(자동형 변환 규칙 위반)

		//명시적인 형 변환(강제 형 변환)
		c = (short)a;
		// a가 가지고 있는 데이터를 short 형으로 형 변환을 수행한 후 변수 c에 대입한다.

		//00000000 00000000 00000000 00001010 (int 형 a변수 10)
		//          ↓ 형 변환
		//00000000 00001010 (short 형으로 변환된 10)

		//결과출력
		System.out.println("c의 결과 : " + c);
		// c의 결과 : 10
		

		//변수 선언 및 초기화
		//int d = 10000000000;      //백억
		//컴파일 에러 발생

		//long d = 10000000000;       //백억
		//컴파일 에러 발생

		long d = 10000000000L;       //백억
		//접미사 L(l)이 중요하다.
		//long 형은 숫자(상수) 뒤에 L 또는 l 을 붙여 상수를 표현해야 한다.
		// 즉, 약 21억 이상 되는 정수 형태의 상수에는 데이터 뒤에 접미사를 꼭 붙여줄 수 있도록 한다.


		//결과출력
		System.out.println("d의 결과 : " + d);
		//d의 결과 : 10000000000      백억

		
		//변수 선언 및 초기화
		int e = 030;  //앞에 0이 붙으면 8진수!

		//결과출력
		System.out.println("e의 결과 : " + e);
		//e의 결과 : 24
		//접두사 0은 8진수


		//변수 선언 및 초기화
		int f = 0xa6;    

		//결과 출력
		System.out.println("f의 결과 : " + f);
		//166
		//접두사 0x는 16진수
		// 0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15
		//                      a  b  c  d  e  f


		//변수 선언 및 초기화
		//float g = 0;
		//0.0
		//자동 형 변환때문임

		//float g = 0.0;
		//컴파일 에러 발생
		//0.0은 double형이기 때문
		float g = 0.0f;
		//f를 붙여줘야 됨


		//결과출력
		System.out.println("g의 결과 : " + g);
		//g의 결과 : 0.0


	}
}

/*실행결과
a의 결과 : 10
b의 결과: 20
c의 결과 : 10
d의 결과 : 10000000000
e의 결과 : 24
f의 결과 : 166
g의 결과 : 0.0
계속하려면 아무 키나 누르십시오 . . .*/