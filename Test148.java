/*=================================
���� ���� ó��(Exception Handling) ����
=================================*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test148
{
	private String[] data = new String[3];//�迭�� 3��

	public void proc() throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str;
		int n = 0;

		System.out.print("�̸� �Է�(����:Ctrl+z) : " );
		while ( (str=br.readLine()) != null )     //br.readLine() �ڿ� throws IOException�� �������. ���� br.readLine()�� ������ ���� ���� throws IOException�� ����ߵ�
										          //�� ���� �ƴ� ���� ��� �Է�
												  //Ctrl+z�� ������  (str=br.readLine()) -> null�̵�.
		{
			data[n++] = str;
			System.out.print("�̸� �Է�(����:Ctrl+z) : " );
		}

		System.out.println("�Էµ� ����...................");
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