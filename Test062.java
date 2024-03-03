/*=================================
■■■ 실행 흐름의 컨트롤 (제어문) ■■■
- 반복문(for문) 실습 및 관찰
- 다음 for문(반복문의 중첩)을 활용한 구구단 출력 실습
=================================*/

//- 다중 for문(반복문의 중첩)을 활용한 별찍기 실습

// ㅇ과제
// 다음과 같은 내용이 출력될 수 있도록
// 반복문의 중첩 구문을 작성하여 프로그램을 구현한다.

// 실행 예)
/*

***********
 *********
  *******
   *****
    ***
     *

*/

public class Test062
{
	public static void main(String[] args)
	{
		//주요 변수 선언 및 초기화
		int a,b,c,d=6;        

		for (a=1; a<=d; a++)        //단 처리는 1,2.3,4,5,6
		{
			for (b=1; b<a; b++)     //공백 출력
			{
				System.out.print(" ");
			}
			for (c=1; c<=2*(d-a)+1; c++)       // * 출력
			{	
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

/*
실행결과
***********
 *********
  *******
   *****
    ***
     *
계속하려면 아무 키나 누르십시오 . . .
*/