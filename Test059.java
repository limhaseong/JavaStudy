/*=================================
■■■ 실행 흐름의 컨트롤 (제어문) ■■■
- 반복문(for문) 실습 및 관찰
- 다음 for문(반복문의 중첩)을 활용한 구구단 출력 실습
=================================*/

//실행 예)
/*
2 * 1 = 2 3 * 1 = 3 4 * 1 = 4 5 * 1 = 5
2 * 2 = 4 3 * 2 = 6 4 * 2 = 8 5 * 2 = 10
					:
2 * 9 = 18 3 * 9 = 27 4 * 9 = 36 5 * 9 = 45


6 * 1 = 6 7 * 1 = 7 8 * 1 = 8 9 * 1 = 9
6 * 2 = 12 7 * 2 = 14 8 * 2 = 16 9 * 2 = 18
					:
6 * 9 = 54 7 * 9 = 63 8 * 9 = 72 9 * 9 = 81


1. 2중첩 * 2번 써서 풀이
2. 3중첩 * 1번 써서 풀이
*/
public class Test059
{
	public static void main(String[] args)
	{
		/*
		int i, j;
		
		
		for (j=1 ; j<=9; j++)
		{
			for (i=2; i<=5; i++)
			{
				System.out.print(" " + i + " * " + j + " = " + ( i * j ) + " ");
			}
			System.out.println();
		}
		System.out.println();
		for (j=1 ; j<=9; j++)
		{
			for (i=6; i<=9; i++)
			{
				System.out.print(" " + i + " * " + j + " = " + ( i * j ) + " ");
			}
			System.out.println();
		}
		*/

//------------------------------------------------------------------------------------------
		
		/*
		int i, j;

		for (j=1 ; j<=9; j++)
		{
			for (i=2; i<=5; i++)
			{
				System.out.print(" " + i + " * " + j + " = " + ( i * j ) + " ");
			}
			System.out.println();
			for (k=6; k<=9; k++)
			{
				System.out.print(" " + k + " * " + j + " = " + ( k * j ) + " ");
			}
			System.out.println();
		}
		*/ //해결 못함

//---------------------------------------------------------------------------------------------

		//1. Test 058과 비교하여 출력방향(출력의 순서)가 다르기 때문에
		//   반복문의 제어 흐름도 달려져야 한다.
		//   (한 방향으로 처리되는 콘솔 기반의 출력 환경이기 때문에...)

		//2. (1)에 따라...
		//   단과 곱해지는 수의 위치가 달라진 상태에서의 반복문 구성
		
		/* //2중첩 2번 사용
		for (int i=1; i<=9; i++)      //웅~ 곱해지는 수 1 2 3 4 5 6 7 8 9
		{
			//테스트 - 잘 모르면 찍어보라
			//System.out.print(i);
			for (int j=2; j<=5; j++)         //쑝쑝쑝~ -> 단
			{
				System.out.printf("%4d * %d = %2d", j, i, (i*j));
			}
			System.out.println();      //개행
		}
		System.out.println();           //개행
		for (int i=1; i<=9; i++)      //웅~ 곱해지는 수 1 2 3 4 5 6 7 8 9
		{
			//테스트 - 잘 모르면 찍어보라
			//System.out.print(i);
			for (int j=6; j<=9; j++)         //쑝쑝쑝~ -> 단
			{
				System.out.printf("%4d * %d = %2d", j, i, (i*j));
			}
			System.out.println();         //개행
		}
		*/


		//3중첩 1번 사용

		// 3. (2)에서 처리한 결과를 두 문단으로 반복하는 반복문 구성
		//    -> 두 번 반복하는 반목문에 (2)의 결과를 삽입
		
		/*
		for (int h=0; h<=1; h++)      //문단 구성
		{
			//System.out.println("테스트" + h);
			
			// 2중첩에서 복사해온 것.
			for (int i=1; i<=9; i++)      //웅~ 곱해지는 수 1 2 3 4 5 6 7 8 9
		{
			//테스트 - 잘 모르면 찍어보라
			//System.out.print(i);
			for (int j=2; j<=5; j++)         //쑝쑝쑝~ -> 단
			{
				System.out.printf("%4d * %d = %2d", j, i, (i*j));
			}
			System.out.println();      //개행
		}
		System.out.println(); 
		}
		*/

		// 4. 같은 구문을 두 문단으로 나누어 처리하는 과정에서
		//    문단에 따라 다르게 주어지는 환경(h 의 값)을 활용하는 방법으로
		//    최종 반복문 3중첩 구성

		//h=0 일때 한번 돌고 1일때를 바꿔주면 됨.
		for (int h=0; h<=1; h++)      //문단 구성
		{
			for (int i=1; i<=9; i++)      //웅~ 곱해지는 수 1 2 3 4 5 6 7 8 9
		{
			//테스트 - 잘 모르면 찍어보라
			//System.out.print(i);
			for (int j=2; j<=5; j++)         //쑝쑝쑝~ -> 단
			{
				System.out.printf("%4d * %d = %2d", j+(h*4), i, (j+(h*4))*i);
			}

			System.out.println();     //개행
		}
		System.out.println(); 
		}

	}
}