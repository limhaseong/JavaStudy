/*=================================
■■■ 실행 흐름의 컨트롤 (제어문) ■■■
- if문
- if ~ else문 실습
=================================*/

/*
1. 프로그램을 작성할 때 주어진 조건에 따라
분기 방향을 정하기 위해 사용하는 제어문에는
if문, if~else문, 조건연산자, 복합 if문(if문 중첩), switch문이 있다.

2. if문은 if 다음의 조건이 참(true)일 경우
특정 문장을 수행하고자 할 때 사용되는 구문이다.
*/

//사용자로부터 임의의 정수 5개를 입력받아
//짝수별, 홀수별 합계를 출력하는 프로그램을 구현한다.
//단, Scanner를 활용하여 데이터를 입력받을 수 있도록 한다.

//실행 예)
// 임의의 정수 5개 입력(공백 구분): 11 12 13 14 15

// >> 짝수의 합은 26이고, 홀수의 합은 39입니다.
//계속하려면 아무 키나 누르세요...

import java.util.Scanner;

public class Test037
{
	public static void main(String[] args)
	{
		/*
		Scanner sc = new Scanner(System.in);
		
		int a, b, c, d, e;
		int tot;

		System.out.print("임의의 정수 5개 입력(공백 구분) : ");
		sc = new Scanner(sc.next()).useDelimiter("\\d* \\d*");
		
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		d = sc.nextInt();
		e = sc.nextInt();

		tot = a+b+c+d+e;

		if (a%2==0)
		{
			
		}
		*/

//------------------------------------------------------------------------

		//주요 변수 선언
		Scanner sc = new Scanner(System.in);

		//누적합을 담아낼 별수 초기화
		int evenSum=0;     //짝수의 합을 담아낼 변수 선언(누적합)
		int oddSum=0;      //홀수의 합을 담아낼 변수 선언(누적합) //누적곱은 int oddSum=1;로 함.
		int num1, num2, num3, num4, num5;
		//사용자로부터 입력받은 5개의 정수를 담을 변수 선언

		//연산 및 처리
		System.out.print("임의의 정수 5개 입력(공백 구분) : ");  //10 20 30 40 50
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		num3 = sc.nextInt();
		num4 = sc.nextInt();
		num5 = sc.nextInt();

		if (num1%2==0) //num1 이 짝수일 때
		{
			//evenSum을 num1 만큼 증가
			evenSum += num1;
		}
		else           //num1 이 홀수일 떄
			//oddSum을 num1 만큼 증가
			oddSum += num1;
		if (num2%2==0)  //num2 짝수일 때
		{
			evenSum += num2;
		}
		else
		{
			oddSum += num2;
		}
		if (num3%2==0)  
		{
			evenSum += num3;
		}
		else
		{
			oddSum += num3;
		}
		if (num4%2==0)  
		{
			evenSum += num4;
		}
		else
		{
			oddSum += num4;
		}
		if (num5%2==0)  
		{
			evenSum += num5;
		}
		else
		{
			oddSum += num5;
		}

		//결과 출력
		System.out.printf("\n>> 짝수의 합은 %d 이고, 홀수의 합은 %d 이다.\n", evenSum, oddSum);
		
		

	}
}