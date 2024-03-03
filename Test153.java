/*=================================
■■■ 예외 처리(Exception Handling) ■■■
=================================*/

//다른 예외 다시 던지기

public class Test153
{
	public int getValue(int value) throws Exception          //⑦ 예외 던지기(파랑폭탄 던지기) -> 무조건 throws Exception 써줘야됨.
															 //여기서 던진 폭탄은 main()메소드로 감
	{
		int a = 0;

		try
		{
			a = getData(-2);                                 //③ 예외 발생(빨강폭탄 예외)
		}
		catch (Exception e)                                  //④ 예외 잡아내기(빨강폭탄 잡아내기)
		{
			//⑤ 예외에 대한 처리(빨강폭탄에 대한 처리)
			System.out.println("printStackTrace.................");
			e.printStackTrace();
			
			//check!
			//⑥ 새로운 예외 발생(파랑폭탄이라 가정)
			throw new Exception("value 가 음수입니다.");
		}

		return a;
	}
	
	public int getData(int data) throws Exception            //② 예외 던지기(빨강폭탄 던지기)
	{
		if (data<0)
		{
			throw new Exception("value가 0보다 작습니다.");  //① 최초의 예외 발생(빨강폭탄이라 가정)
		}
		return data + 10;
	}


	public static void main(String[] args)
	{
		Test153 ob = new Test153();
		
		try
		{
			int a = ob.getValue(-2);                         //⑧ 예외 발생(파랑폭탄)
			System.out.println("a : " + a);
		}
		catch (Exception e)                                  //⑨ 예외 잡아내기(파랑폭탄 잡아내기)
		{
			System.out.println("printStackTrace.................");
			e.printStackTrace();
		}
	}
}