/*=================================
■■■ 컬렉션(Collection) ■■■
=================================*/

//List(명단) -> String[] 로 구성하는 거 -> List.toArray();

//String[] -> List 로 구성하는 거 -> Arrays.asList();

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

		//체크~
		//List 구조를 String[] 로 전환하려고함
		//mList.toArray(new String[3]);   ->mList.toArray(new String[3]) -> String 타입에 mList를 반환
		String[] strArray = mList.toArray(new String[mList.size()]);

		for (String s : strArray ) //String -> strArray 뽑은것
		{
			System.out.print(s + " ");
		}
		System.out.println();
		//1 2 3

		//체크~
		//String[] 을 List로 변환
		//Arrays.asList()
		List<String> mNewList = Arrays.asList(strArray);         //클래스
		// Arrays.asList() 의 반환 자료형은 List

		for (String s : mNewList)
		{
			System.out.print(s + " ");
		}
		System.out.println();
		//1 2 3
	}
}