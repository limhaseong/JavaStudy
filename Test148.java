/*=================================
■■■ 예외 처리(Exception Handling) ■■■
=================================*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test148
{
	private String[] data = new String[3];//배열방 3개

	public void proc() throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str;
		int n = 0;

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
	public static void main(String[] args) throws IOException
	{
		Test148 ob = new Test148();
		ob.proc();
	}
}