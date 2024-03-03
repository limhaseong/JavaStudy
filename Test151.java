/*=================================
■■■ 예외 처리(Exception Handling) ■■■
=================================*/

//Test150.java 파일과 비교!

//throw

class Demo
{
	private int value;
	public void setValue(int value) throws Exception
	{
		if (value<=0)
		{
			//return; Test150.java에서 안되는 거 확인했음

			throw new Exception("value 는 0보다 작거나 같을 수 없습니다.");
			//new Exception("value 는 0보다 작거나 같을 수 없습니다."); -> new라는 예외를 발생시키는 것.
		}
		this.value = value;
	}

	public int getValue()
	{
		return value;
	}
}

public class Test151
{
	public static void main(String[] args) //throws Exception -> 이걸 쓰기 싫다면 try-catch 사용
	{
		Demo ob = new Demo();
	
		try
		{
			ob.setValue(-3);
			int result = ob.getValue();
			System.out.println(result);
		}
		catch (Exception e)
		{
			System.out.println(e.toString());
		}		
	}
}

/*
실행결과
java.lang.Exception: value 는 0보다 작거나 같을 수 없습니다.
계속하려면 아무 키나 누르십시오 . . .
*/