/*=================================
���� Ŭ���� ��� ����
- ��ø Ŭ����
=================================*/

//Test122.java�� ���� ����

//static��ø Ŭ������ ���ؼ� ���� ��.

//3. ���� Ŭ����(���� Ŭ����, local class)

//outer
class InnerOuterTest
{
	static int a = 10;
	int b = 20; //�ν��Ͻ� ����
	
	//inner
	class InnerNested  //�ν��Ͻ� ���
	{
		int c = 30;
		
		void write()
		{
			System.out.println("inner �� write()...");
			System.out.println("a : " + a);         //ź������ ���� ����
			System.out.println("b : " + b);         //�Ѵ� �ν��Ͻ� ������ Ŭ������ ����
			System.out.println("c : " + c);         //int c�� inner�� write()�� ź�� ������ ����.
		}
	}

	void write()
	{
		System.out.println("outer �� write()...");
		
		//InnerNested Ŭ���� ��� �ν��Ͻ� ����(-> inner)
		InnerNested ob1 = new InnerNested();
		ob1.write();                        //inner�� write() �޼ҵ� ȣ��
	}
}

public class Test124
{
	public static void main(String[] args)
	{
		//InnerOuterTestŬ���� ��� �ν��Ͻ� ����(-> outer)
		InnerOuterTest ob2 = new InnerOuterTest();
		ob2.write();                             //outer�� write() �޼ҵ� ȣ��
		//outer �� write()...
		//inner �� write()...
		//a : 10
		//b : 20
		//c : 30

		//InnerNestedŬ���� ��� �ν��Ͻ� ����(-> inner)
		//InnerNested ob3 = new InnerNested();
		//-> ������ ���� �߻�.
		
		// üũ~~!!! -> Test122.java���ϰ� ��!
		//InnerNestedŬ���� ��� �ν��Ͻ� ����(-> inner)
		//InnerOuterTest.InnerNested ob4 = new InnerOuterTest.InnerNested();
		//-> ������ ���� �߻�
		//InnerOuterTest = ���赵�� ������ ��ü�� �ƴϴ�.

		// - ��ø ���� Ŭ����(static ��ø Ŭ����)�ʹ� �޸�
		//   �ܺ� Ŭ������ �ν��Ͻ�(��ü)�� ������� �ʰ�
		//   �ܵ����� ���� Ŭ������ �ν��Ͻ��� �����ϴ� ���� �Ұ����ϴ�.
		//   -> ��, �ܺ� Ŭ������ ��.ü. �� ����ϸ�
		//      ���� Ŭ������ ��ü�� �����ϴ� ���� �����ϴ�.

		// üũ~~!!! -> Test122.java ���ϰ� ��!
		InnerOuterTest.InnerNested ob5 = ob2.new InnerNested();  //ó�� ���� Ÿ���� ����.
		//--------���赵 Ÿ��---------   ----���� ��ü ����----
		//ob2 = �ܺ� Ŭ���� ����� ��ü!(������ ����� ��ü��!)
		ob5.write();
		//inner �� write()...
		//a : 10
		//b : 20
		//c : 30
		
		// üũ~~!!! -> Test122.java ���ϰ� ��
		//outerŬ������.innerŬ������ ���������� = new outer������().new inner������();
		InnerOuterTest.InnerNested ob6 = new InnerOuterTest().new InnerNested();  //�ٷ� �� ob5�� ����.
		ob6.write();
		//inner �� write()...
		//a : 10
		//b : 20
		//c : 30

		//cf) static -> ��ø ���� Ŭ����
		//    outerŬ������.innerŬ������ ���������� = new outerŬ������.inner������();


		
	}
}