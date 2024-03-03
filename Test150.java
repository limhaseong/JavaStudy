/*=================================
■■■ 예외 처리(Exception Handling) ■■■
=================================*/

//Test151.java 파일과 비교!

class Demo
{
	private int value;

	public void setValue(int value) //세팅하기
	{
		if (value <= 0)     //if문이 적용이 안됨 -> value 값이 음수거나 0이면 메소드 종료해라 했는데 0으로 출력됨.
		{
			return;         //메소드 종료 -> setValue()
		}
		this.value = value;
	}
	public int getValue() //가져다 쓰기
	{
		return value;
	}
}

public class Test150
{
	public static void main(String[] args)
	{
		Demo ob = new Demo();
		ob.setValue(-3);
		int result = ob.getValue();
		System.out.println(result);
	}
}