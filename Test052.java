/*=================================
■■■ 실행 흐름의 컨트롤 (제어문) ■■■
- 반복문(while문) 실습 및 관찰
=================================*/

/* 과제
사용자로 부터 임의의 정수를 입력받아
1 부터 입력받은 그 정수까지의
전체 합과, 짝수의 합과, 홀수의 합을
각각 결과값으로 연산하여 출력하는 프로그램을 구현한다.

실행 예)
임의의 정수 : 396
>>1~396까지의 정수의 합 : 
>>1~396까지 짝수의 합 :
>>1~396까지 홀수의 합 :
//계속하려면 아무 키나 누르세요...

기존에 하던 거랑 다른 것은 뒤에 숫자가 정해지지 않고
사용자가 입력한 값까지라는 것.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test052
{
	public static void main(String[] args) throws IOException
	{
		//주요 변수 선언
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int a, sum, even, odd;    //사용자가 입력할 임의의 정수, 정수 합, 짝수 합, 홀수 합
		sum=even=odd=0;           //변수 초기화
		int b=1;				  //루프 변수로 활용
		
		//연산 및 처리
		System.out.print("임의의 정수 입력 :");
		a = Integer.parseInt(br.readLine());

		while (b<=a)
		{
			sum+=b;           // 정수의 합
		if (b%2==0)
		{
			even+=b;          // 짝수의 합
		}
		else if (b%2!=0)
		{
			odd+=b;           // 홀수의 합
		}
		else
		{
			System.out.println("판별 불가");
			return;	
		}
		b++;
		}
		
		//결과 출력
		System.out.printf("1 ~ %d 정수의 합 : %d\n", a, sum);
		System.out.printf("1 ~ %d 짝수의 합 : %d\n", a, even);
		System.out.printf("1 ~ %d 홀수의 합 : %d\n", a, odd);
	}
}

/*
실행결과

임의의 정수 입력 :3
1 ~ 3 정수의 합 : 6
1 ~ 3 짝수의 합 : 2
1 ~ 3 홀수의 합 : 4
계속하려면 아무 키나 누르십시오 . . .

 */