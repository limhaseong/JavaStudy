/*=================================
���� Ŭ���� ��� ����
- �߻� Ŭ����(abstract)
=================================*/

//Ŭ���� == ���赵 -> ��ü����
//�߻� Ŭ���� == �̿ϼ��� ���赵 -> ��ü���� �Ұ���
//�߻� Ŭ������ ����̶� ������ �����ؾ��� ���簡ġ�� �ִ�.

/*
- �߻�(abstract) Ŭ������
	: ���� �ְ� ���ǰ� ���� �ϳ� �̻��� �޼ҵ�(�߻� �޼ҵ�)�� ���� Ŭ������
	  ���� Ŭ����(�ڽ� Ŭ����)���� �������̵�(Overriding)�� ������ ����Ǵ� �޼ҵ忡 ����
	  �޸� ���� ���� �̸� ȣ�� ��ȹ�� �����α� ���� �����.

- ���� �� ����
	: [��������������] abstract class Ŭ������
	  {
		  [��������������] abstract ��ȯ�ڷ��� �޼ҵ��([�Ű�����]. ...);
	  }

//ex) �߻� Ŭ����, �߻� �޼ҵ�
//public abstract class Test105
//{
//	 public abstract String abc();  -> �������������� ��ȯ�ڷ��� �޼ҵ��(�Ű�����); --> ���� �ְ� ���Ǵ� ����.
//}

- Ư¡
	: Ŭ������ ��� �ϳ� �̻��� �߻� �޼ҵ带 ������ ��
	  �� Ŭ������ Ŭ���� �տ� abstractŰ���带 �ٿ�
	  �߻� Ŭ������ ����ؾ� �ϸ�,
	  �߻� Ŭ������ ������ ��쿡��
	  �ҿ����� ������ Ŭ�����̹Ƿ� ��ü�� ������ �� ����.(�ν��Ͻ� ���� �Ұ�!)
	  �߻� �޼ҵ尡 �������� �ʴ� �߻� Ŭ����������
	  ��ü�� ������ �� ���� ���̴�.

	  ��, �߻� Ŭ������ ���������� ������ �� ���� ������
	  ����� ���ؼ��� �����ϸ�
	  �߻� Ŭ������ ��ӹ��� ���� Ŭ����������
	  �ݵ�� �߻� �޼ҵ带 �������̵�(Overriding) �ؾ� �Ѵ�.

//ex)
//abstract class �θ�                
//{
//	�޼ҵ�1 ()
//	{
//	}
//  �޼ҵ�2 ()
//	{
//	}
//	abstract �޼ҵ�3 ();
//}

//abstract class �ڽ� extends �θ�
//class �ڽ� extends �θ�
//{
//	/ *
//	�޼ҵ�1 ()
//	{
//	}
//  �޼ҵ�2 ()
//	{
//	}
//	abstract �޼ҵ�();  ---------------> �̷� ��� abstract �޼ҵ嵵 ���ԵǾ� �ڽ� Ŭ������ �߻� Ŭ������ ��(abstract class �ڽ� extends �θ�)
//	* /
//	�޼ҵ�96 ()
//	{
//	}
//  �޼ҵ�95 ()
//	{
//	}
//	@Override          ----------------> �̷��� �������̵����� ������ �ϸ� class �ڽ� extends �θ� �̷��� �߻� Ŭ������ �ƴ� Ŭ���� ��� ����.
//	�޼ҵ�3 ()
//	{
//	}
//}

- abstractŰ�����
  Ŭ������ �޼ҵ忡���� ����� �� ������
  ��� ������ ���� ���������� ����� �� ����.
*/

//protected abstract void sorting(); �޼ҵ带 ���� �߻� Ŭ���� �̹Ƿ�
//class SortInt115 �� �ƴ�
abstract class SortInt115
{
	private int[] value;

	protected void sort(int[] value)
	{
		this.value = value;
		sorting();
	}
	
	//�߻� �޼ҵ� �̹Ƿ�
	//protected void sorting(); �� �ƴ�
	protected abstract void sorting();

	protected int dataLength()
	{
		return value.length;
	}
	
	//�޼ҵ忡 final�� ������ �������̵�
	//final Ű����� ����
	//�� Ŭ����(SortInt115)�� ��ӹ޴� Ŭ��������
	//�� �޼ҵ带 ������(Method Overriding) �� �� ����.
	protected final int compare(int i, int j)
	{
		int x = value[i];
		int y = value[j];

		if (x==y)
			return 0;
		else if (x>y)
			return 1;
		else
			return -1;
	}
	
	//final Ű����� ����
	//�� Ŭ����(SortInt115)�� ��ӹ޴� Ŭ��������
	//�� �޼ҵ带 ������(Method Overriding) �� �� ����.
	protected final void swap(int i, int j)
	{
		int temp = value[i];
		value[i] = value[j];
		value[j] = temp;
	}
} //end SortInt115

//public class Test115  //�̰ſ��µ�
public class Test115 extends SortInt115 //��� �ްڴٴ� Ŭ���� //@Override protected void sorting()�� �����Ƿ� ���־��� ������ abstract ���� �ɷ� ��� ����.
//public abstract class Test115 extends SortInt115    //�߻�Ŭ������ ��� �޾� �Ա⿡ �߻� Ŭ������ ��.
{
	/*//�θ� Ŭ������ �͵��� ������ ��, private�� ��� x
	protected void sort(int[] value)
	{
		this.value = value;
		sorting();
	}
	
	//�߻� �޼ҵ� �̹Ƿ�
	//protected void sorting(); �� �ƴ�
	protected abstract void sorting();

	protected int dataLength()
	{
		return value.length;
	}
	
	//�޼ҵ忡 final�� ������ �������̵�
	//final Ű����� ����
	//�� Ŭ����(SortInt115)�� ��ӹ޴� Ŭ��������
	//�� �޼ҵ带 ������(Method Overriding) �� �� ����.
	protected final int compare(int i, int j)
	{
		int x = value[i];
		int y = value[j];

		if (x==y)
			return 0;
		else if (x>y)
			return 1;
		else
			return -1;
	}
	
	//final Ű����� ����
	//�� Ŭ����(SortInt115)�� ��ӹ޴� Ŭ��������
	//�� �޼ҵ带 ������(Method Overriding) �� �� ����.
	protected final void swap(int i, int j)
	{
		int temp = value[i];
		value[i] = value[j];
		value[j] = temp;
	}
	*/

	int i, j;

	static int[] data = {7, 10, 3, 28, 7};

	
	@Override
	protected void sorting()
	{	
		
		//selection sort
		for (i=0; i<dataLength()-1; i++)
		{
			for (j=i+1; j<dataLength(); j++)
			{
				//ũ�� ��
				if (compare(i,j)>0)
				{
					//�ڸ��ٲ�
					swap(i,j);
				}
			}
		}
		

//-------------------------------------------------------------------------

		/*
		for (i=0; i<dataLength()-1; i++)
		{
			for (j=i+1; j<dataLength(); j++)
			{
				if (compare(i,j)==1)
				{
					swap(i,j);
				}
			}
		}*/
		
		
		/*
		for (i=0; i<data.length-1; i++) 
		{
			for (j=i+1; j<data.length; j++)
			{
				if (data[i]>data[j])                 
				{
					data[i]=data[i]^data[j];
					data[j]=data[j]^data[i];
					data[i]=data[i]^data[j];
				}
			}
		}
		*/
	}

	public static void main(String[] args)
	{
		System.out.print("Source Data : ");
		for (int n : data )
			System.out.print(n+" ");
		System.out.println();

		//Source Data : 7 10 3 28 7

		Test115 ob = new Test115();
		ob.sort(data);
		
		System.out.print("Sorted Data : ");
		for (int n : data )
			System.out.print(n+" ");
		System.out.println();

	}
}