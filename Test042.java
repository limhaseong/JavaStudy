/*=================================
■■■ 실행 흐름의 컨트롤 (제어문) ■■■
- switch문 실습
=================================*/

//사용자로부터 임의의 두 정수와 연산자를 입력받아
//해당 연산자의 연산 처리 결과를 출력하는 프로그램을 구현한다.
//단, switch문을 활용하여 처리할 수 있도록 하며,
//연산 결과는 편의상 정수 형태로 처리할 수 있도록 한다.

//실행 예)
// 첫 번째 정수 입력 : 3
// 두 번째 정수 입력 : 17
// 연산자 입력(+, -, *. /)" : +

//>> 3 + 17 = 20
//계속 하려면 아무키나...

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test042
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		/*
		int a, b;
		char op;

		System.out.print("첫 번째 정수 입력 :");
		a = Integer.parseInt(br.readLine());

		System.out.print("두 번째 정수 입력 :");
		b = Integer.parseInt(br.readLine());

		System.out.print("연산자 입력 :");
		op = (char)System.in.read();
		
		switch (op)
		{
		case 43:System.out.printf("%d %c %d = %d\n", a, op, b, a+b); break;
		case 45:System.out.printf("%d %c %d = %d\n", a, op, b, a-b); break;
		case 42:System.out.printf("%d %c %d = %d\n", a, op, b, a*b); break;
		case 47:System.out.printf("%d %c %d = %d\n", a, op, b, a/b); break;
		}
		System.out.println();
		*/

//--------------------------------------------------------------------------------------
		
		/*
		//1번
		int a,b, result;
		int op;

		System.out.print("첫 번째 정수 입력 :");
		a = Integer.parseInt(br.readLine());

		System.out.print("두 번째 정수 입력 :");
		b = Integer.parseInt(br.readLine());

		System.out.print("연산자 입력 :");
		op = System.in.read();

		// + = 45, - = 45, * =42, / = 47

		switch (op)
		{
		case 43: result = a + b; break;
		case 45: result = a - b; break;
		case 42: result = a * b; break;
		case 47: result = a / b; break;
		default : return;  // 1. 값을 반환(돌려준다). -> 특정한 메소드를 호출 했을때(내가 부른 공간에 가서 뭐를 하고 가는 거)
						   // 2. 메소드를 종료한다.(여기서는 main() 메소드를 종료한다는 것임)
						   // main() 메소드는 시작과 끝을 의미하므로 여기서는 프로그램 종료를 뜻한다.
		}

		System.out.println();
		System.out.printf(">> %d %c %d = %d\n", a, op, b, result);
		*/
		
		
		/*
		//2번
		int a, b, result;
		char op;

		System.out.print("첫 번째 정수 입력 :");
		a = Integer.parseInt(br.readLine());

		System.out.print("두 번째 정수 입력 :");
		b = Integer.parseInt(br.readLine());

		System.out.print("연산자 입력 :");
		op = (char)System.in.read();

		switch (op)
		{
		case '+': result = a + b; break;
		case '-': result = a - b; break;
		case '*': result = a * b; break;
		case '/': result = a / b; break;
		default : return;
		}

		System.out.println();
		System.out.printf(">> %d %c %d = %d\n", a, op, b, result);
		*/

		//3번
		int a, b, result;
		String op;

		System.out.print("첫 번째 정수 입력 :");
		a = Integer.parseInt(br.readLine());

		System.out.print("두 번째 정수 입력 :");
		b = Integer.parseInt(br.readLine());

		System.out.print("연산자 입력 :");
		op = br.readLine();

		switch (op)
		{
		case "+": result = a + b; break;
		case "-": result = a - b; break;
		case "*": result = a * b; break;
		case "/": result = a / b; break;
		default : return;
		}

		System.out.println();
		System.out.printf(">> %d %s %d = %d\n", a, op, b, result);

	}
}