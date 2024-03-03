/*=================================
���� �÷���(Collection) ����
=================================*/

//Vector v = new Vector();
//-> ������ ���� ���µ� ��ü �����ϸ� ����ִ� Vector �ڷᱸ�� ����

//Vector v = new Vector(8);
// 8���� �ʱ� elements�� ���� Vector �ڷᱸ�� v ����
// �� �ڷᱸ���� Ȱ���ϴ� ��������
// 8���� ��� ä������ �Ǹ�(��� ���Ǿ� ���ڶ�� �Ǹ�) �ڵ����� Ȯ��ȴ�.

//Vector v = new Vector(3, 5);
// -> 3���� �ʱ� elements�� ���� Vector �ڷᱸ�� v ����
//    �� �ڷᱸ���� Ȱ���ϴ� ��������
//    3���� ��� ä������ �Ǹ� (��� ���Ǿ� ���ڶ�� �Ǹ�) �ڵ����� 5�� ����(Ȯ��)�ȴ�.

// - ���ʹ� ������ ��ҷ� ������, �Ǽ���, ���ڿ� ... ����
//   ��Ƴ��� ���� �����ϴ�.(-> ����������.)
//   -> ������ �������� Ȯ���ؼ� ����ؾ� �Ѵ�.

import java.util.Vector;
import java.util.Iterator;


//myVector Ŭ���� ���� -> Vector Ŭ���� ���
class myVector extends Vector<Object>
{
	//����� ���� ������
	myVector()
	{	
		//Vector(���� Ŭ����) ������ ȣ�� -> ���� ���� ȣ�� �Ǿ�� �Ѵ�.
		//super();
		// Vector(); (�θ�)
		super(1,1);
		//ù ��° ���� : �־��� �뷮
		//�� ��° ���� : ������
	}

	void addInt(int i)
	{
		addElement(new Integer(i));
	}

	void addFloat(float f)
	{
		addElement(new Float(f));
	}

	void addString(String s)
	{
		addElement(s);
	}

	void addCharArray(char[] a)
	{
		addElement(a);
	}

	void addObject(Record rec)
	{
		addElement(rec);
	}

	void write()
	{	
		/*//���ڹ迭 �ȳ����� ��
		Object o;
		int length = size();

		System.out.println("���� ����� ���� : " + length);
		//���� ����� ���� : 4

		for (int i=0; i<length; i++)
		{
			o = elementAt(i);
			System.out.println(o);
		}
		//5
		//3.14
		//�ȳ��ϼ���
		//[C@15db9742
		*/

//---------------------------------------------------------------------------------------------

		/*//���ڹ迭 �ȳ����� ��
		Iterator<Object> it = this.iterator();   //this ��� super�� ��.
		
		while (it.hasNext()) 
		{   
			//��� 1
			//Object a = (Object)it.next();
			//System.out.print(a + " ");
			
			//��� 2
			System.out.println(it.next() + " ");
		}
		System.out.println();
		//5
		//3.14
		//�ȳ��ϼ���
		//[C@15db9742
		*/

//---------------------------------------------------------------------------------------------

		// instanceof ������
		//	: ó���ؾ� �ϴ� ����� ��ü Ÿ�� Ȯ��

		Object o;
		int length = size();

		System.out.println("���� ����� ���� : " + length);

		for (int i=0; i<length; i++)
		{
			o = elementAt(i);            //super, this elementAt() �� ����
			
			/*
			if (o instanceof char[])
			{
				System.out.println("���ڹ迭");
			}
			else
			{
				System.out.println("�ٸ�����");
			}
			*/

			//����
			if (o instanceof char[])
			{
				//System.out.println("���ڹ迭");
				System.out.println("���ڹ迭 : " + String.copyValueOf((char[])o));
			}
			else if (o instanceof String)
			{
				System.out.println("���ڿ� : " + o.toString());
			}
			else if (o instanceof Integer)
			{
				System.out.println("������ : " + o);
			}
			else if (o instanceof Float)
			{
				System.out.println("�Ǽ��� : " + o);
			}
			else
			{
				System.out.println("Ÿ�� Ȯ�� ���");
			}
		}
		//������ : 5
		//�Ǽ��� : 3.14
		//���ڿ� : �ȳ��ϼ���
		//���ڹ迭 : study
	}

}

public class Test159
{
	public static void main(String[] args)
	{
		//myVector Ŭ���� ��� �ν��Ͻ� ����
		myVector v = new myVector();

		//�ֿ� ���� ���� �� �ʱ�ȭ
		int digit = 5;
		float real = 3.14f;
		String s = new String("�ȳ��ϼ���");
		char[] letters = {'s', 't', 'u', 'd', 'y'};

		v.addInt(digit);           //���� �ڷᱸ���� ���� ����
		v.addFloat(real);          //���� �ڷᱸ���� �Ǽ� ����
		v.addString(s);            //���� �ڷᱸ���� ���ڿ� ����
		v.addCharArray(letters);   //���� �ڷᱸ���� ���� �迭 ����

		v.write();
	}
}
