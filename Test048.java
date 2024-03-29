/*=================================
■■■ 실행 흐름의 컨트롤 (제어문) ■■■
- 반복문 실습 및 관찰
=================================*/

// 1/2 + 2/3 + 3/4 + 4/5 + ... 9/10
//   |
// (n+1)

// 1/2 + 2/3 + 3/4 + 4/5 + ... 9/10
//       |
//     (n-1)

// 의 연산 처리 결과를 출력하는 프로그램을 구현한다.

// 실행 예)
// 연산결과 : 실수 기반의 연산
// 계속하려면 아무 키나 누르세요...

public class Test048
{
	public static void main(String[] args)
	{
		/*
		double a=1;
		double sum=0;

		while (a<=10)
		{
			sum+=a/(a+1);
			a++;
		}
		System.out.println("연산결과" + sum);
		*/
//-----------------------------------------------------		
		/*
		double a=1, b=2;
		double sum=0;

		while (a<=10)
		{
			if (b<=10)
			{
				sum+=a/b;
				b++;
			}
				a++;
		}
		System.out.printf("연산결과 : %f\n", sum);
		*/
//------------------------------------------------------

		//주요 변수 선언 및 초기화
		int n=0;                   //0이지만 1부터 1씩 증가하게 될 변수로 활용
		double sum=0;              //누적합을 담아낼 변수 (실수 형태로 처리)


		//연산 및 처리
		while (n<9)   //0 1 2 3 4 5 6 7 8(8 넣자마자 9가 되기때문에)
		{             // n<=8보다 n<9를 더 많이 사용

			//증감식 구성(0으로 초기화 해놨기 때문에 바로 증감식)
			//최종적으로 반복문의 조건을 무너뜨리게 되는 열쇠가 되는 구문
			n++;      //1 2 3 4 5 6 7 8 9

			sum+=(double)n/(n+1);
			//   n=1인데 (double)1 로 되어 1.0이 됨 -> 1.0/2 -> 2.0/3 ... 9.0/10
			// 정수 기반 나눗셈 연산은 몫을 반환하기 때문에
			// 실수 기반 연산을 수행하도록 처리하기 위해서
			// 나눗셈 연산자를 중심으로 피연산자 중 하나를
			// 실수 형태로 만들어주는 것이 중요하다.


		}


		//결과 출력
		//System.out.printf("연산 결과 : %f\n", sum);
		System.out.println("연산결과" + sum);
		
	}
}

/*실행결과

연산 결과 : 7.071032
계속하려면 아무 키나 누르십시오 . . .

연산결과7.071031746031746
계속하려면 아무 키나 누르십시오 . . .
*/