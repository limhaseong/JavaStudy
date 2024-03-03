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

/*과제
사용자로부터 임의의 문자를 하나 입력받아
알파벳 대문자이면 소문자로, 소문자이면 대문자로
알파벳이 아닌 기타 문자면 입력 오류 처리하는 프로그램을 구현한다.

실행 예)
한 문자 입력 : A
>> A -> a
계속하려면 아무 키나 누르세요...

한문자 입력 : b
>> b -> B
계속하려면 아무 키나 누르세요...

한 문자 입력 : 3
>> 입력오류
계속하려면 아무 키나 누르세요...
*/

import java.util.Scanner;

public class Test039
{
	public static void main(String[] args)
	{
		//주요 변수 선언
		Scanner sc = new Scanner(System.in);
		char ch;                   // 사용자가 입력 할 한 문자
		char res='\0';             // 초기화를 위해 \0 입력.
		
		//연산 및 처리
		System.out.print("한 문자 입력 : ");
		ch = (char)sc.next().charAt(0);
		
		//결과출력
		if (ch>='A' && ch<='Z')
		{
			res = ((char)(ch+32));
			System.out.println(ch + " -> " + res);
		}
		else if (ch>='a' && ch<='z')
		{
			res = ((char)(ch-32));
			System.out.println(ch + " -> " + res);
		}
		else
		{
			System.out.println(">>입력오류");
		}

	}
}
/*실행결과
한 문자 입력 : a
a -> A
계속하려면 아무 키나 누르십시오 . . .

한 문자 입력 : C
C -> c
계속하려면 아무 키나 누르십시오 . . .

한 문자 입력 : 3
>>입력오류
계속하려면 아무 키나 누르십시오 . . .
*/