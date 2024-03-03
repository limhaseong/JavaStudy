/*=================================
���� ����(sort) �˰��� ����
=================================*/

/*
- ����
	: �����͸� Ư���� ��Ģ(����)�� �°� ������� �����ϴ� ��(��������, ��������)

- ������ ����
	: ������ ó�� ������ ���Ǽ��̳� �������� ���̱� ����
	 -> ���� ���� �ϱ� ����, ã�� ���� �ϱ� ����, �˻��� ���ϰ� �ϱ� ����

- ������ ���ϰ� ���ϴ� -> ���ҽ��� ���� ����Ѵ�.

- ������ ����
	: ���� ����, ���� ����, ���� ����, �� ����, �� ����, �� ���� ...
*/

//���ĵ� �ѹ��� �غ���.

//���� ����(��ǰ ����, Bubble Sort)
//���� ��)
//Source Data: 52 42 12 62 69
//Bubble Data: 12 42 52 60 62
//����Ϸ��� �ƹ� Ű�� ��������...

public class Test108
{
	public static void main(String[] args)
	{
		int[] a = {52, 42, 12, 62, 60};
		
		int i, j;
		
		System.out.print("Source Data: ");
		for (int n : a)                
		{
			System.out.print(n + " ");
		}
		System.out.println();

		// ����
		// Bubble Sort
		for (i=1; i<a.length; i++)                //��~~     i -> �ڿ��� �� ����� �ϳ��� �ٿ��ִ� ���� 1     2     3     4
		{
			for (j=0; j<a.length-i; j++)          //������~~ j -> �񱳱��� �ε���                        0123  012    01    0
			{
				if (a[j]>a[j+1])                  //��������   // if (a[j]<a[j+1]) -> ��������
				{
					//�ڸ��ٲ�
					a[j]=a[j]^a[j+1];
					a[j+1]=a[j+1]^a[j];
					a[j]=a[j]^a[j+1];
				}
			}
		}

		System.out.print("Bubble Data: ");
		for (int n : a )
		{
			System.out.print(n + " ");
		}
		System.out.println();

//----------------------------------------------------------------------------------
		
		/*
		
		System.out.print("Source Data: ");

		for (int i=0; i<a.length; i++)
			{
				System.out.print(a[i] + " ");
			}
		System.out.println();

		for (int j=4; j>0; j--)
		{
			for (int i=0; j-i>0; i++)
			{
				if (a[i]>a[i+1])
				{
					a[i]=a[i]^a[i+1];
					a[i+1]=a[i+1]^a[i];
					a[i]=a[i]^a[i+1];
				}
			}
		}
		System.out.print("Bubble Data: ");
		for (int i=0; i<a.length; i++)
			{
				System.out.print(a[i] + " ");
			}
		System.out.println();
		*/

//------------------------------------------------------------------------------
		
		/*
		System.out.print("Source Data: ");

		for (int i=0; i<a.length; i++)
			{
				System.out.print(a[i] + " ");
			}
		System.out.println();
		
		for (int i=0; i<a.length-1; i++)                  
		{
			for (int j=0; j<a.length-1; j++)              
			{
				if (a[j]>a[j+1])
				{
					a[j]=a[j]^a[j+1];
					a[j+1]=a[j+1]^a[j];
					a[j]=a[j]^a[j+1];
				}
			}
		}
		
		System.out.print("Bubble Data: ");
		for (int i=0; i<a.length; i++)
		{
			System.out.print(a[i] + " ");
		}
		System.out.println();*/
		
		

		/*
		52, 42, 12, 62, 60 -> 42, 52, 12, 62, 60 -> 42, 12, 52, 62, 60 -> 42, 12, 52, 62, 60 -> 42, 12, 52, 60, 62 -> 1ȸ�� ��(���� ū ���� �����ʿ� �ڸ��� ����)
		==  --  ��              ==  --  ��              ==  --  ��              ==  -- ��

		42, 12, 52, 60, 62 -> 12, 42, 52, 60, 62 -> 12, 42, 52, 60, 62 -> 2ȸ�� ��
		==  --  ��              ==  -- ��               ==  --  ��

		12, 42, 52, 60, 62 -> 12, 42, 52, 60, 62 -> 3ȸ�� ��
		==  --  ��              ==  --  ��

		12, 42, 52, 60, 62 -> 4ȸ�� ��
		==  --  ��
		*/
	}
}