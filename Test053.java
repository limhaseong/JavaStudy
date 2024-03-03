/*=================================
■■■ 실행 흐름의 컨트롤 (제어문) ■■■
- 반복문(while문) 실습 및 관찰
=================================*/

// 사용자로부터 원하는 단(구구단)을 입력받아
// 해당하는 구구단을 출력하는 프로그램을 구현한다.
// 단, 1단~9단 사이의 수를 입력받은 상황이 아니라면
// 이에 대한 안내를 한 후 프로그램을 종료할 수 있도록 처리한다.

//실행 예)
//원하는 단(구구단)입력 : 7
// 7 * 1 = 7
// 7 * 2 = 14
//     :
// 7 * 9 = 63
// 계속하려면 아무 키나 누르세요...

//원하는 단(구구단)입력 : 11
//1부터 9까지의 정수만 입력이 가능합니다.
// 계속하려면 아무 키나 누르세요...

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test053
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		/*
		int a, b=1;

		System.out.print("원하는 단(구구단) 입력 :");
		a = Integer.parseInt(br.readLine());
		
		if (a<10)
		{
			while (b<10)
			{	
				//테스트
				//System.out.println("반복문 수행 -> n : " + n);
				System.out.printf("%d * %d = %d\n", a, b, (a*b));
				b++;
			}
		}
		else
		{
			System.out.println("1부터 9까지의 정수만 입력이 가능합니다.");
			return;
		}
		*/
		

//------------------------------------------------------------------------------------------------------

		//주요 변수 선언 및 초기화
		int dan;              //사용자로부터 입력값을 정수 형태로 담아둘 변수(단)

		//연산 및 처리
		System.out.print("원하는 단(구구단) 입력 :");
		dan = Integer.parseInt(br.readLine());

		if (dan<1 || dan>9)
		{
			System.out.println("1부터 9까지 정수만 입력이 가능합니다.");
			return;   //return을 품고있는 main()를 종료함 -> 프로그램 종료
		}

		int n=0;

		//결과출력(반복출력)
		while (n<9)  //0 1 2 3 4 5 6 7 8
		{
			n++;
			System.out.printf("%d & %d = %d\n", dan, n, (dan*n));
		}
	}
}

/*실행결과
원하는 단(구구단) 입력 :5
5 & 1 = 5
5 & 2 = 10
5 & 3 = 15
5 & 4 = 20
5 & 5 = 25
5 & 6 = 30
5 & 7 = 35
5 & 8 = 40
5 & 9 = 45
계속하려면 아무 키나 누르십시오 . . .

원하는 단(구구단) 입력 :14
1부터 9까지 정수만 입력이 가능합니다.
계속하려면 아무 키나 누르십시오 . . .
*/