/*=================================
■■■ 자바 기본 프로그래밍 ■■■
- 변수와 자료형
=================================*/

public class Test003
{
	public static void main(String[] args)
	{
		// 변수 선언
		int a; 

		// 변수 a에 10 대입(변수를 초기화 한다고 함)
		a = 10;

		// 변수 선언 및 초기화(선언과 대입을 한 번에 처리)
		int b = 20;

		// int a = 30; 쓰는 거 불가능(위에 a를 선언 해놨기 때문에 안됨), a = 30;이라고 쓰면 됨.

		//변수 선언
		int c; 

		// 테스트
		//System.out.println(c);
		//-> 컴파일 에러
		//->ctrl+2 눌렀을 때 에러= 런파일 에러

		// 여기까지 했을때 에러는 c를 초기화 하지 않아서 나온 거임.

		//System.out.println(b);
		// 20
		
		//System.out.println(a);
		// 10

		// 연산 및 처리
		c = a + b;
		// -> c = a + b; -> c = 10 + 20; -> c = 30;
		// 변수 c에 30을 대입해라와 같은 말임.

		// 결과출력
		System.out.println(c);
		// 30

		//결과 출력
		//System.out.println(a b c);
		// 컴파일 에러 발생

		//결과 출력
		//System.out.println(abc);
		// 컴파일 에러 발생

		// 덧셈 연산자(+)
		// 피연산자 중 어느 하나라도 문자열 형태의 데이터가 존재한다면 
		// 산술연산자로써의 덧셈 연산의 기능을 수행하는 것이 아니라
		// 문자열 결합 연산자로써의 기능을 수행하게 된다.

		//결과 출력
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		// 10
		// 20
		// 30

		System.out.println(a+""+b+""+c);
		//102030

		//결과 출력
		System.out.println("a의 값은" + a + "입니다.");
		System.out.println("b의 값은" + b + "입니다.");
		System.out.println("c의 값은" + c + "입니다.");
		// + 연산자를 사용하는 과정에서 피연산자 중 문자열이 포함되어 있을 경우
		// 문자열 결합 연산자로 활용되며 처리의 최종 결과는 문자열의 형태로 반환된다.
		// a의 값은10입니다.
		// b의 값은20입니다.
		// c의 값은30입니다.

		System.out.println(1 + 2);    // 산술연산자 +
		System.out.println("1" + 2);  // 문자열 결합 연산자 +
		System.out.println(1 + "2");  // 문자열 결합 연산자 +
		System.out.println("1" + "2");// 문자열 결합 연산자 +

		System.out.println("결과확인 : " + 1 + 2);
		// 결과확인:12 나옴

		System.out.println("결과확인 : " + (1 + 2));
		// 결과확인:3 나옴

/* 실행 결과
30
20
10
30
102030
a의 값은10입니다.
b의 값은20입니다.
c의 값은30입니다.
3
12
12
12
결과확인 : 12
결과확인 : 3
계속하려면 아무 키나 누르십시오 . . .*/


	}
}