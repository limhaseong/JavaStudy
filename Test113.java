/*=================================
■■■ 클래스 고급 ■■■
- 상속(Inheritance)
=================================*/

//Test073.java 참고

//다음과 같은 프로그램을 구현한다.
//단, 상속의 개념을 적용하여 작성할 수 있도록 한다.

//실행 예)
//임의의 두 정수 입력(공백 구분) : 20 10
//연산자 입력(+ - * /) : -
//>> 20-10 = 10
//계속하라면 아무 키나 누르세요...

//import java.util.Scanner;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

class Aclass
{
	protected int x, y;
	protected char op;

	Aclass()
	{
		
	}

	void write(double result)
	{
		System.out.printf("\n>> %d %c %d = %.2f\n", x, op, y, result);
	}
}

//Aclass를 상속받는 클래스로 설계
class Bclass extends Aclass
{
	/*Aclass의 것이 상속됨
	protected int x, y;
	protected char op;

	//Aclass()  --> 단, 생성사는 상속이 안되므로 이 부분은 빠짐.
	//{
	//	
	//}

	void write(double result)
	{
		System.out.printf("\n>> %d %c %d = %.2f\n", x, op, y, result);
	}
	*/

	Bclass()
	{
		//super();   //->부모 클래스의 것이 이렇게 상속됨
	}
	
	//void input()-> 원래 이렇게 했는데 아래꺼로 해보겠다는 의미.
	boolean input() throws IOException
	{
		//Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("임의의 두 정수 입력(공백 구분) : ");   //"20 10" 문자열형태로 받음
		String temp=br.readLine();

		//문자열 .split("구분자");
		//대상 문자열을 자름
		// 문자열.split("\\s");    //구분자 -> 공백으로 넣은 것
		// ex)"10 20 30 40 50".split("\\s");
		//  --> 반환 결과 -> {"10", "20", "30", "40", "50"};
		// ex) "010-1234-4567".split("-");
		// --> 반환 결과 -> {"010", "1234", "4567"};

		String[] strArr = temp.split("\\s");                           //"20 10"으로 입력했다면 -> String[] strArr = {"20", "10"};

		if (strArr.length != 2)
		{										//if (temp.length() != 2는 안됨 -> 입력한 문자열 길이가 2글자가 아니면 이라는 뜻.
			return false;
		}
			//false를 반환하며 input() 메소드 종료
			// 이 조건을 만족하여 if문을 수행하게 될 경우
			// 아래 수행해야 할 코드가 남아있더라도
			// 결과값(->false)을 반환하며 메소드는 종료된다.

			x = Integer.parseInt(strArr[0]);
			//this.x = Integer.parseInt(strArr[0]); 이것도 가능. Bclass.x임 -> this를 포함한 x를 찾아가라
			//super.x = Integer.parseInt(strArr[0]); 이것도 가능 -> 부모로부터 물려받은 x에 담아도 된다.
			y = Integer.parseInt(strArr[1]);
			//this.y = Integer.parseInt(strArr[0]); 이것도 가능. Bclass.x임 -> this를 포함한 x를 찾아가라
			//super.y = Integer.parseInt(strArr[0]); 이것도 가능 -> 부모로부터 물려받은 x에 담아도 된다.

			System.out.print("연산자 입력(+ - * /) : ");
			op = (char)System.in.read();                          //br.readLine() 으로 받아오면 안된다.

			/*
			if (op!='+' && op!='-' && op!='*' && op!='/')                  //boolead으로 했기 때문에 if문 사용.
																  //||를 써버리면 맨 앞이 true이면 뒤를 확인 안함 즉, '-'를 사용햇을때 op!='+'이것을 먼저 확인 하는데
																  // op!='+'를 확인하면 true이기 때문에 나머지들도 다 true가 되어버림
																  //부정일때 &&면 긍정일땐 ||
			{
				return false;
			}
			return true;
			*/
			
		if (op=='+' || op=='-' || op=='*' || op=='/')
		{
			return true;
		}
		return false;

	}//end input()
		
	double calc()
	{
		double result = 0;

		switch (op)
		{
			case '+' : result = x+y; break;
			case '-' : result = x-y; break;
			case '*' : result = x*y; break;
			// case '/' : result = x/y; break;
			case '/' : result = (double)x/y;   //-> break 생략 가능 어차피 끝나면 나갈거니까
											   //-> 나눗셈은 x나 y를 double 형태로 해줘야 되기에 둘중에 하나에 double 적용
		}
		return result;
	} //end calc()

	/*
	print()  -> 출력메소드는 사용할 필요 없음 write를 물려받으면 되기 때문
	{

	}
	*/



//--------------------------------------------------------------------------------------------------
	
	//내가 한 것들

	/*
	Scanner sc = new Scanner(System.in);

	public void input() throws IOException
	{
		//this.x=x;
		//this.y=y;
		//this.op=op;
		System.out.print("임의의 두 정수 입력(공백 구분) : ");
		x=sc.nextInt();
		y=sc.nextInt();
		System.out.print("임의의 연산자 입력(+ - * /) : ");
		op = (char)System.in.read();
	}
	*/
	
	/*//방법 1
	int cal()
	{
		int re = 0;

		switch (op)
		{
			case '+': re=x+y; break;
			case '-': re=x-y; break;
			case '*': re=x*y; break;
			case '/': re=x/y; break;
			default : re = -1;
		
		}
		return re;
	}
	*/
	
	/*//방법2
	private int res;
	public void cal()
	{
		if (op=='+')
			res=x+y;
		else if (op=='-')
			res=x-y;
		else if (op=='*')
			res=x*y;
		else if (op=='/')
			res=x/y;
		write(res);
	}
	*/

	/*//방법 3
	private int b;
	int cal()
	{
		if (op=='+')
			b=x+y;
		else if (op=='-')
			b=x-y;
		else if (op=='*')
			b=x*y;
		else if (op=='/')
			b=x/y;
		return (b);
	}
	*/
	
	
}

//main() 메소드를 포함하고 있는 외부의 다른 클래스
public class Test113
{
	public static void main(String[] args) throws IOException
	{
		Bclass ob = new Bclass();
		
		//ob.input();    -> void로 반환메소드를 정의하면 이렇게 하면 된다.
		
		/*//1번
		boolean resp = ob.input();

		if (resp!=true)
		{
			System.out.println("Error...");
			return;                           //-> 프로그램 종료
		}
		*/
		/*//2번
		boolean resp = ob.input();

		if (!resp) //!resp == resp!=true
		{
			System.out.println("Error...");
			return;                           //-> 프로그램 종료
		}
		*/
		//3번
		if (!ob.input()) //!resp == resp!=true
		{
			System.out.println("Error...");
			return;                           //-> 프로그램 종료
		}
		// 1번, 2번, 3번 다 가능.

		double result = ob.calc();
		ob.write(result);

//--------------------------------------------------------------------------------------------------------------------
		
		//내가 한 것들

		//Bclass ob = new Bclass();//Bclass를 기반으로 해서 프로그램 작성

		//ob.input();
		
		//방법2를 쓸 때는 이렇게
		//ob.cal();  
		
		//방법3을 쓸 때는 아래 두개
		//int res = ob.cal();
		//ob.write(res);
	}
}