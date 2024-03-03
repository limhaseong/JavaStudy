/*=================================
■■■ 메소드의 재귀 호출 ■■■
=================================*/

public class Test067
{
	public static void main(String[] args)
	{
		showHi(3);
	}
	
	/*
	public static void showHi(int cnt)
	{
		System.out.println("Hi~");
		showHi(cnt--);           //3--로 가정하면 다음에 --하라는 건데 3이후에 2로 넘어가는 것이 아님 다음에 또 3 들어감.
		if (cnt==1)
		return;
		
	}
	*/

	/*
	public static void showHi(int cnt)
	{
		System.out.println("Hi~");
		showHi(--cnt);                 //int cnt=3이라고 하면 --cnt이므로 2가 되고 1이 되고 0, -1이 되어서
		if (cnt==1)                    //0부터는 무한루프
		return;
		
	}
	*/

	//showHi() 메소드의 코드 내에서 두 군데 위치 바꿔서 출력 3개 나오게 하기.

	public static void showHi(int cnt)
	{
		System.out.println("Hi~");
		if (cnt==1)
		return;
		showHi(--cnt);
	}

	/*
	public static void showHi(3)
	{
		System.out.println("Hi~");  //출력
		if (cnt==1)
		return;
		showHi(2);
	}
	*/
	
	/*
	public static void showHi(2)
	{
		System.out.println("Hi~");  //출력
		if (cnt==1)
		return;
		showHi(1);
	}
	*/
	
	/*
	public static void showHi(1)
	{
		System.out.println("Hi~"); //출력
		if (cnt==1)
		return;
		showHi(--cnt);
	}
	*/
}