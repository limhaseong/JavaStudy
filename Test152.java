/*=================================
■■■ 예외 처리(Exception Handling) ■■■
=================================*/

//예외 다시 던지기

public class Test152
{
	public static void main(String[] args)
	{
		Test152 ob = new Test152();

		try
		{
			int a = ob.getValue(-2);    //⑧ 다시 예외 발생
			System.out.println("a : " + a);
		}
		catch (Exception e)           //⑨ 예외 잡아내기
		{
			//⑩ 잡아낸 예외에 대한 처리로 끝(마지막 처리로 끝냈기 때문에 main()메소드에는 throws Exception 안 써도 됨)
			System.out.println("printStackTrace........................");
			e.printStackTrace();
		}
	}

	public int getData(int data) throws Exception //② 발생한 예외 던지기(방법 2는 try-catch사용하면 꼭 throws Exception이거 안써도 됨)
	{
		if (data<0)
		{
			//① 최초로 예외가 발생한 상황
			throw new Exception("data가 e보다 작습니다.");
		}
		return data + 10;
	}
                                   //check!
	public int getValue(int value) throws Exception //⑦ 다시 발생한 잡아낸 예외를 다시 던질 수 있도록 처리하는 것.(무조건 써줘야됨 -> ⑥에서 발생한 것을 던져야 하기 때문)
	{
		int a = 0;
		try
		{
			//③ 두 번째 예외 발생
			a=getData(-2);
		}
		catch (Exception e)       //④ -> ③예외 잡아내기
		{
			//⑤ -> ④에서 잡아낸 예외에 대한 처리
			System.out.println("printStackTrace........................");
			e.printStackTrace();
			
			//check!
			//⑥ 잡아서 처리한 예외를 다시 발생(던지는)시키는 것
			throw e;
		}
		return a;

	}
}