/*=================================
■■■ 예외 처리(Exception Handling) ■■■
=================================*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test149
{
	private String[] data = new String[3];//배열방 3개

	public void proc() //throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str;
		int n = 0;
		
		try
		{
			System.out.print("이름 입력(종료:Ctrl+z) : " );
			while ( (str=br.readLine()) != null )     //br.readLine() 뒤에 throws IOException이 들어있음. 따라서 br.readLine()의 내용이 들어가는 곳에 throws IOException을 써줘야됨
											          //널 값이 아닌 동안 계속 입력
													  //Ctrl+z를 누르면  (str=br.readLine()) -> null이됨.
			{
				data[n++] = str;
				System.out.print("이름 입력(종료:Ctrl+z) : " );
			}

			System.out.println("입력된 내용...................");
			for (String s : data )
			{
				if (s != null)
				{
				System.out.println(s);
				}
			}
		}
		catch (IOException e)
		{
			System.out.println(e.toString());
			System.out.println("checked exception 에 대한 처리");
		}
		catch (ArrayIndexOutOfBoundsException e)
		{
			System.out.println("배열 인덱스 관련 예외 발생");
			System.out.println("e.getMessage() : " + e.getMessage());
			System.out.println("e.toString() : " + e.toString());
			System.out.println("printStackTrace.........................");
			e.printStackTrace();

		}


	}

	public static void main(String[] args) //throws IOException -> try-catch 사용하면 쓸 필요 없음. 이유는 try-catch가 없으면 throws로 던져버려서 다시 새롭게 써줘야됨.
	{
		Test149 ob = new Test149();
		ob.proc();
	}
}