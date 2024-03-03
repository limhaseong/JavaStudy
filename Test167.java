/*=================================
���� �÷���(Collection) ����
=================================*/

//List(���) -> String[] �� �����ϴ� �� -> List.toArray();

//String[] -> List �� �����ϴ� �� -> Arrays.asList();

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class Test167
{
	public static void main(String[] args)
	{
		List<String> mList = new ArrayList<String>();

		mList.add("1");
		mList.add("2");
		mList.add("3");

		//üũ~
		//List ������ String[] �� ��ȯ�Ϸ�����
		//mList.toArray(new String[3]);   ->mList.toArray(new String[3]) -> String Ÿ�Կ� mList�� ��ȯ
		String[] strArray = mList.toArray(new String[mList.size()]);

		for (String s : strArray ) //String -> strArray ������
		{
			System.out.print(s + " ");
		}
		System.out.println();
		//1 2 3

		//üũ~
		//String[] �� List�� ��ȯ
		//Arrays.asList()
		List<String> mNewList = Arrays.asList(strArray);         //Ŭ����
		// Arrays.asList() �� ��ȯ �ڷ����� List

		for (String s : mNewList)
		{
			System.out.print(s + " ");
		}
		System.out.println();
		//1 2 3
	}
}