/*=================================
■■■ 실행 흐름의 컨트롤 (제어문) ■■■
- switch문 실습
=================================*/

//사용자로 부터 1부터 3까지의 정수 중 하나를 입력받아
//입력받은 정수만큼 별문자(★)가 출력되는 프로그램을 작성한다.
//단, 두 가지 방법으로 구현할 수 있도록 한다.

// 1. switch문의 일반 모델을 사용하여 구현한다. -> 자유롭게 break 써도 됨.
// 2. switch문의 기본 모델을 사용하되,
// break를 딱 한 번만 사용할 수 있도록 구현한다.(입력오류 시에 break 사용)

//실행 예)
// 임의의 정수 입력(1~3) : 3
// ★★★
// 계속하려면 아무 키나 누르세요...

//실행 예)
// 임의의 정수 입력(1~3) : 1
// ★
// 계속하려면 아무 키나 누르세요...

//실행 예)
// 임의의 정수 입력(1~3) : 7
// 입력 오류
// 계속하려면 아무 키나 누르세요...

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test041
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int a;
		String t;

		System.out.print("임의의 정수 입력(1~3) : ");
		a = Integer.parseInt(br.readLine());
		
		/*
		switch (a)
		{
			case 1: t="★"; break;
			case 2: t="★★"; break;
			case 3: t="★★★"; break;
			default : t="입력오류"; break;
		}
		*/
		
		/* 해결 못함.
		switch (a)
		{
			default : t="입력오류"; break;
			case 3: t="★★★"; 
			case 2: t="★★";
			case 1: t="★";
			default : t="입력오류"; break;
		
		}
		*/

		System.out.println();
		System.out.printf(">> %s\n", t);
		


//------------------------------------------------------------------------
		/*
		int n;

		System.out.print("임의의 정수 입력(1~3) : ");
		n = Integer.parseInt(br.readLine());
	
		
		// 1번
		switch (n)
		{
			case 1:System.out.println("★"); break;
			case 2:System.out.println("★★"); break;
			case 3:System.out.println("★★★"); break;
			default : System.out.println("입력오류"); break;
		}
		*/

		//2번
		/*
		switch (n)
		{	
			default :System.out.println("입력오류"); break;
			case 3:System.out.print("★");
			case 2:System.out.print("★");
			case 1:System.out.print("★");
		}*/
		
		/*
		switch (n)
		{	
			case 3:System.out.print("★");
			case 2:System.out.print("★");
			case 1:System.out.print("★"); break;
			default :System.out.println("입력오류");
		}
		
		System.out.println();
		*/


	}
}