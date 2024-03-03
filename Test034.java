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

// 과제
// 사용자로부터 임의의 연도를 입력받아
// 입력받은 연도가 윤년인지... 평년인지... 판별하여
// 그 결과를 출력하는 프로그램을 구현한다.
// 단, 입력은 BufferedReader를 활용하고
// if 조건문을 활용하여 연산을 수행할 수 있도록 한다.

//실행 예)
// 임의의 연도 입력 : 2024
// 2024 -> 윤년
// 계속하려면 아무 키나 누르세요...

// 임의의 연도 입력 : 2023
// 2024 -> 평년
// 계속하려면 아무 키나 누르세요...

//꼼꼼하게 설명 및 주석해서 .java 파일 보내면 됨.

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test034
{
	public static void main(String[] args) throws IOException
	{	
		//주요 변수 선언

		//BufferedReader 인스턴스 생성
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int year;           //사용자로부터 입력받은 임의의 정수를 담아둘 변수
		
		//연산 및 처리
		//사용자에게 메세지 출력
		System.out.print("임의의 연도 입력 : ");
		year = Integer.parseInt(br.readLine());
		
		//결과 출력
		if (year%4==0 && year%100!=0 || year%400==0)    //윤년의 판별조건
		{
			System.out.println(year + " -> 윤년");
		}
		else if (year%4!=0 && year%100==0 || year%400!=0)  //평년의 판별조건
		{
			System.out.println(year + " -> 평년");
		}
		else               //사용자가 입력한 정수가 아니라면...
		{
			System.out.println(" -> 판정불가");
		}
		
	}
}
/*실행결과
임의의 연도 입력 : 2024
2024 -> 윤년
계속하려면 아무 키나 누르십시오 . . .

임의의 연도 입력 : 2023
2023 -> 평년
계속하려면 아무 키나 누르십시오 . . .

임의의 연도 입력 : 2100
2100 -> 평년
계속하려면 아무 키나 누르십시오 . . .
*/