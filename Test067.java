/*=================================
���� �޼ҵ��� ��� ȣ�� ����
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
		showHi(cnt--);           //3--�� �����ϸ� ������ --�϶�� �ǵ� 3���Ŀ� 2�� �Ѿ�� ���� �ƴ� ������ �� 3 ��.
		if (cnt==1)
		return;
		
	}
	*/

	/*
	public static void showHi(int cnt)
	{
		System.out.println("Hi~");
		showHi(--cnt);                 //int cnt=3�̶�� �ϸ� --cnt�̹Ƿ� 2�� �ǰ� 1�� �ǰ� 0, -1�� �Ǿ
		if (cnt==1)                    //0���ʹ� ���ѷ���
		return;
		
	}
	*/

	//showHi() �޼ҵ��� �ڵ� ������ �� ���� ��ġ �ٲ㼭 ��� 3�� ������ �ϱ�.

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
		System.out.println("Hi~");  //���
		if (cnt==1)
		return;
		showHi(2);
	}
	*/
	
	/*
	public static void showHi(2)
	{
		System.out.println("Hi~");  //���
		if (cnt==1)
		return;
		showHi(1);
	}
	*/
	
	/*
	public static void showHi(1)
	{
		System.out.println("Hi~"); //���
		if (cnt==1)
		return;
		showHi(--cnt);
	}
	*/
}