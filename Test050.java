/*=================================
■■■ 실행 흐름의 컨트롤 (제어문) ■■■
- 반복문(while문) 실습 및 관찰
=================================*/

//사용자로부터 임의의 정수를 입력받아
//입력받은 정수가 소수인지... 아닌지.. 를 판별하여
//결과를 출력하는 프로그램을 구현한다.

//실행 예)
//임의의 정수 입력 : 10
// 10 -> 소수 아님
//계속하려면 아무 키나 누르세요...

//임의의 정수 입력 : 11
// 11 -> 소수
//계속하려면 아무 키나 누르세요...

//소수 : 1 또는 자기 자신의 값 이외에 어떤 수로도
//       나누어 떨어지지 않는 수.
//       단, 1은 소수가 아니다.
// n-1까지 나눈 거 이랑 1인지 아닌지

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test050
{
	public static void main(String[] args) throws IOException
	{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		/*
		int n;
		int a=1;

		System.out.print("임의의 정수 입력 :");
		n = Integer.parseInt(br.readLine());

		while (a<n)
		{
			a++;
			if (n%a==0)
			{
				System.out.println("소수 아님");
				break;
			}
			else if (n%a==1)
			{
				System.out.println("소수");
				break;
			}
		}
		
		// 1일때 아무것도 안나오는 거 해결 못함.
		*/

//-------------------------------------------------------------------------------------------
		
		
		//주요 변수 선언
		int num;           //사용자의 입력값을 담아낼 변수
		int n=2;           //입력값을 대상으로 나눗셈 연산을 수행할 변수
						   //2부터 시작해서 1씩 증가
						   // ex) 입력값 27 -> n = 2 3 4 5 6 7 8 ....26

		//연산 및 처리
		System.out.print("임의의 정수 입력 :");
		num = Integer.parseInt(br.readLine());

		// 사용자가 입력한 어떤 값을 입력 받은 상태인지 알 수 없지만
		// 이 입력값을 소수로 간주한다.
		//String result = "소수다."
		boolean flag = true;   //true라 소수라고 정의 해놓은 의미
							   // num(사용자 입력값)은 소수 일 것이라고 가정.
		
		while (n<num)
		{
			//테스트
			//System.out.println("반복문 수행 -> n : " + n);

			//확인 연산
			// n으로 num을 나누어 떨어지는 확인 -> 나머지가 0인지 확인

			if (num%n==0)          //즉 나누어 떨어지는 상황
			{
				//앗 난 너를 소수라 생각했는데
				//넌 소수가 아니였어 즉, 소수가 아닐때 false로 바뀜
				flag = false;
				break; //990을 적었을 때 2로 나누어 떨어지면 멈추고 그리고 빠져나간다.(굳이 989까지 안나눔) 
					   //if문을 빠져 나가는 게 아닌 가까운 반복문인 while을 빠져나감.
					   //->break를 감싸는 가장 가까운 반복문.
			}

			n++;

		}

		//테스트
		//System.out.println("flag : " + flag);

		//결과출력
		//(최종 결과를 출력하기 전에 추가 확인 -> num이 1인지 아닌지에 대한 추가 검토)
		
		//조건문에
		if (flag && num!=1)
		//  ----------
		//flag==true원래 이렇게 적는데 위에flag를 true라고 줬기에 그냥 flag만 써도 됨

		{
			System.out.printf("%d -> 소수\n", num);//이러면 소수야
		}
		else
		{
			System.out.printf("%d -> 소수 아님\n", num);//소수가 아니야
		}
	}
}
/*
실행결과
임의의 정수 입력 :990
990 -> 소수 아님
계속하려면 아무 키나 누르십시오 . . .

임의의 정수 입력 :1
1 -> 소수 아님
계속하려면 아무 키나 누르십시오 . . .

임의의 정수 입력 :991
991 -> 소수
계속하려면 아무 키나 누르십시오 . . .
*/