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

//사용자로부터 임의의 정수 세 개를 입력받아
//작은 수에서 큰 수 순으로 출력하는 프로그램을 구현한다.

//실행 예)
// 첫 번째 정수 입력 : 753
// 두 번째 정수 입력 : 22
// 세 번째 정수 입력 : 124

// >>정렬 결과 : 22 124 753
// 계속하려면 아무 거나 누르세요...

/*
            8     21     24
            --------
			--           --    
			      ---------    크기 비교 후 자리를 바꾼다.

			25     7     99        -> 7     25     99      -> 7     25     99 
			--------                 --            --               ----------

 1. 첫 번째 정수와 두 번째 정수의 크기 비교를 한다.
 -> 첫번째 정수가 두번째 정수보다 클 경우 자리 바꿈한다.

 2. 첫 번째 정수와 세 번째 정수와 크기 비교
 -> 첫 번째 정수가 세 번째 정수보다 클 경우 자리 바꾼다.

 3. 두 번째 정수와 세 번째 정수와 크기 비교
 -> 두 번째 정수가 세 번째 정수보다 클 경우 자리 바꾼다.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test036
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		int a, b, c;

		System.out.print("첫 번째 정수 입력 : ");
		a = Integer.parseInt(br.readLine());

		System.out.print("두 번째 정수 입력 : ");
		b = Integer.parseInt(br.readLine());

		System.out.print("세 번째 정수 입력 : ");
		c = Integer.parseInt(br.readLine());
		
		if (a>=b && a>=c)
		{	
			//System.out.printf("\n %d, %d, %d\n", b, c, a);
			if (b>c)
			{
				System.out.printf("\n %d, %d, %d\n", c, b, a);
			}
			else
			{
			
			}
		}
		else if (b>=a && b>=c)
		{
			//System.out.printf("\n %d, %d, %d\n", a, c, b);
			if (a>c)
			{
				System.out.printf("\n %d, %d, %d\n", c, a, b);
			}
			else
			{
				
			}
		}
		else if (c>a && c>b)
		{
			System.out.printf("\n %d, %d, %d\n", a, b, c);
			if (a>b)
			{
				System.out.printf("\n %d, %d, %d\n", b, a, c);
			}
			else
			{
				
			}
		}
		
		
		
//--------------------------------------------------------------------------------
		
		/*
		int a, b, c;    // 사용자가 입력하는 임의의 정수를 담아둘 변수

		System.out.print("첫 번째 정수 입력 : ");
		a = Integer.parseInt(br.readLine());

		System.out.print("두 번째 정수 입력 : ");
		b = Integer.parseInt(br.readLine());

		System.out.print("세 번째 정수 입력 : ");
		c = Integer.parseInt(br.readLine());
		
		//1. 첫 번째 정수와 두 번째 정수의 크기 비교를 한다.
		//	-> 첫번째 정수가 두번째 정수보다 클 경우 자리 바꿈한다.

		//2. 첫 번째 정수와 세 번째 정수와 크기 비교
		//	-> 첫 번째 정수가 세 번째 정수보다 클 경우 자리 바꾼다.

		//3. 두 번째 정수와 세 번째 정수와 크기 비교
		//  -> 두 번째 정수가 세 번째 정수보다 클 경우 자리 바꾼다.
		
		if (a>b)   //첫 번째 정수가 두 번째 정수보다 클 경우
		{
			//자리 바꿈
			a=a^b;
			b=b^a;
			a=a^b;
		}
		//else if는 왜 안쓰는가? 첫번째 로직 후에 2번째 로직을 하는지를 보면 됨.
		//첫번째꺼를 수행 하고도 두번째꺼에 영향을 안주기 때문에 if가 옴.
		if (a>c)   //첫 번째 정수가 세 번째 정수보다 클 경우
		{
			//자리 바꿈
			a=a^c;
			c=c^a;
			a=a^c;
		}
		if (b>c)   //두 번째 정수가 세 번째 정수보다 클 경우
		{
			//자리 바꿈
			b=b^c;
			c=c^b;
			b=b^c;
		}

		//최종 결과 출력
		System.out.printf("\n>> 정렬 결과 : %d %d %d\n", a, b, c);
		*/


	}
}