/*=================================
■■■ 클래스와 인스턴스 ■■■
=================================*/

/*
사용자로부터 임의의 정수를 입력받아
1부터 입력받은 수 까지의 합을 연산하여
결과값을 출력하는 프로그램을 구현한다.

단, 지금까지 처럼 main() 메소드에 모든 기능을 적용하는 것이 아니라
클래스와 인스턴스의 개념을 활용하여 처리할 수 있도록 한다.
(Hap 클래스 설계)
또한, 데이터 입력 처리 과정에서 BufferedReader의 readLine()을 사용하며,
입력 데이터가 1보다 작거나 1000보다 큰 경우
다시 입력받을 수 있는 처리를 포함하여 프로그램을 구현할 수 있도록 한다.

실행 예)
임의의 정수 입력(1~1000) : 1200
임의의 정수 입력(1~1000) : -50
임의의 정수 입력(1~1000) : 100
>> 1~100 까지의 합 : 5050
//계속하려면 아무 키나 누르세요...*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/*  //해결못함
class Hap
{
	int a,b;
	
	void input() throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));		
		
		{
			do
			{
				System.out.print("임의의 정수 입력 : ");
				a = Integer.parseInt(br.readLine());
			}
			while (a<1 || a>1000);
		}
	}

	int num1()
	{
		int sum = 0;
		for (b=1; b<=a; b++)
		{
			return sum+=b;	
		}
	}
	void print(int a)
	{
		System.out.printf("\n1~%d까지의 합 : %d\n", a, sum);
	}
}




public class Test072
{
	public static void main(String[] args) throws IOException  
	{
		Hap ob = new Hap();

		ob.input();

		int nump = ob.num1();

		ob.print(a);
	}
}
*/ 
//---------------------------------------------------------------------------------

class Hap
{
	//주요 변수 선언(사용자의 입력값을 담아낼 변수
	int su;

	//입력 메소드 정의
	void input() throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		do
		{
			System.out.print("임의의 정수 입력(1~1000) : ");
			su = Integer.parseInt(br.readLine());
		}
		while (su<1 || su>1000);
	}

	//연산 처리 메소드 정의
	int calculate()
	{
		int result = 0;
		for (int i=1; i<=su; i++)
		{
			result+=i;
		}
		return result;
	}

	//결과 출력 메소드 정의
	void print(int sum)
	{
		System.out.printf("\n>> 1-%d 까지의 합 : %d\n", su, sum);
	}

}

public class Test072
{
	public static void main(String[] args) throws IOException  
	{
		//Hap 인스턴스 생성
		Hap ob = new Hap();

		//생성된 인스턴스 통해 입력 메소드 호출
		//--------------------
		// 참조변수 활용
		ob.input();         //new Hap().input(); 가능

		//생성된 인스턴스를 통해 연산 매소드 호출
		int s = ob.calculate();

		//생성된 인스턴스를 통해 출력 메소드 호출
		ob.print(s);              //ob.print(ob.calculate()); 가능
		
	}
}