/*=================================
■■■ 실행 흐름의 컨트롤 (제어문) ■■■
- 반복문 실습 및 관찰
=================================*/

// 실행 예)
// 1부터 100까지의 정수의 합 :
// 1부터 100까지의 짝수의 합 :
// 1부터 100까지의 홀수의 합 :
// 계속하려면 아무 키나 누르세요...

public class Test046
{
	public static void main(String[] args)
	{
		/* 해결 못한 코드
		int n=0;
		int tot=0;
		int sum=0;
		int odd=0;

		while (n<100)
		{	
			if (n<=100)
			{
				tot+=n;
			}
			else if (n%2==0)
			{
				sum+=n;
			}
			else if (n%2!=0)
			{
				odd+=n;
			}
			else
			{
				System.out.println("판별 불가");
				return;
			}
			++n;
			
		}
		System.out.println();
		System.out.println("정수의 합 : " + tot);
		System.out.println("짝수의 합 : " + sum);
		System.out.println("홀수의 합 : " + odd);
		*/

		//주요 변수 선언 및 초기화
		int n=1, sum, odd, even;
		sum=odd=even=0;  //0을 even에 담고 odd에 담고 sum에 담는다.

		//연산 및 처리
		while (n<=100)
		{
			sum+=n;

			if (n%2==0)
			{
				even+=n;
			}
			else if (n%2!=0)
			{
				odd+=n;
			}
			else
			{
				System.out.println("판별 불가");
				return;
			}

			n++;
		}

		//결과출력
		System.out.println();
		System.out.println("정수의 합 : " + sum);
		System.out.println("짝수의 합 : " + even);
		System.out.println("홀수의 합 : " + odd);
	}
}