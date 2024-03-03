/*=================================
■■■ 연산자(Operator ■■■
- 논리 연산자
=================================*/

public class Test026
{
	public static void main(String[] args)
	{
		boolean a=true, b=false; //true나 false는 %b

		System.out.printf("a && b : %b\n", (a && b)); //and 에서는 1개라도 false면 false
		System.out.printf("a || b : %b\n", (a || b)); //or 에서는 둘중에 1개 true 면 true
		System.out.printf("!a : %b\n", !a);  //논리 연산에서 부정은 !으로 표현한다. -> false
		System.out.printf("!b : %b\n", !b); //true

	}
}

/*실행결과
a && b : false
a || b : true
!a : false
!b : true
계속하려면 아무 키나 누르십시오 . . .*/