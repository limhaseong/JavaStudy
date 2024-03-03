/*=================================
���� �÷���(Collection) ����
=================================*/

// �ڷᱸ�� ��ü ���� �� ���� ��
// ����� ���� Ŭ���� Ȱ��
// -> �ڷ���

import java.util.Vector;

//Ŭ���� -> ����� ���� �ڷ������� Ȱ��
class MyData
{
	//�ֿ� �Ӽ� ���� -> �ֿ� ���� ����(��� ����)
	private String name;  //�̸�
	private int age;      //����
	
	//private�� ���� ���ϴ� ���� ������ �ƴ� ���� �������� ��ӵ� ������ �޼ҵ� Ȱ��!
	//-> �޼ҵ� Ȱ��� �󸶵��� ��Ģ�� ������ ���� �� �ִ�.

	//getter(������ ���� ��)
	//setter(�����ϴ� ��)
	
	//getter / setter ����
	public String getName()  //name�� ������ ��ߵǱ⿡ String
	{
		return name; //this.name����
	}

	public void setName(String name)  //�ܺ� �����͸� setName�� �����ٵ� String name�� �־���
	{
		this.name = name;
	}

	public int getAge()
	{
		return age;
	}

	public void setAge(int age)
	{
		this.age = age;
	}
	
	//������ -> ����� ���� ������(�Ű����� 2���� ������)
	public MyData(String name, int age)
	{
		this.name = name;
		this.age = age;
	}

	// - ����� ���� �����ڰ� ������ ���
	//   default �����ڰ� �ڵ����� ���Ե��� �ʱ� ������
	//   default ������ ������ �����ڸ� ����� ���� �����ڷ�
	//   �߰� �����ϰ� �Ǵ� ���� �Ϲ����� Ŭ���� ���� ����
	//   (�ݵ�� �����ؾ� �Ѵٴ� �������� ��Ģ�� ����.)

	//������ -> ����� ���� ������(�Ű����� ���� ������)
	public MyData()
	{
		//�̷��� �־ ��
		//this("",0);
		
		name = "";
		age = 0;
	}

}

public class Test162
{
	public static void main(String[] args)
	{
		//���� �ڷᱸ�� ����
		Vector<MyData> v = new Vector<MyData>(); //MyDataŸ�Ը� ��ҷ� ���� �� ����
		//MyData[] dataArr = new MyData[10]; -> �̰� �����ϴ� �������� ����

		//���� �ڷᱸ�� v��
		//���ȯ 73��/ ������ 7��/ ������ 3��
		//��Ƴ���
		
		/*
		// ��
		Mydata st1 = new MyData();
		st1.setName("�趯ȯ");
		st1.setAge(73);
		v.add(st1);

		Mydata st2 = new MyData();
		st1.setName("�趯��");
		st1.setAge(7);
		v.add(st2);

		Mydata st3 = new MyData();
		st1.setName("�붯��");
		st1.setAge(3);
		v.add(st3);
		*/

		//---------------------------------------------------------------
		
		/*
		// ��
		Mydata st1 = new MyData("�趯ȯ",73);
		v.add(st1);
		Mydata st2 = new MyData("�趯��",7);
		v.add(st2);
		Mydata st3 = new MyData("�붯��",3);
		v.add(st3);
		*/

		//---------------------------------------------------------------

		// ��
		v.add(new MyData("�趯ȯ",73));
		v.add(new MyData("�趯��", 7));
		v.add(new MyData("�붯��", 3));
		
		//���� �ڷᱸ�� v�� ��� ����(���) ��ü ����ϱ�
		// ���� ��)
		//�̸� : �趯ȯ, ���� 73��
		//�̸� : �趯��, ���� 7��
		//�̸� : �붯��, ���� 3��
		
		/*
		// ��
		for (MyData obj : v)
		{
			System.out.printf("�̸� : %s, ���� : %d��\n", obj.getName(), obj.getAge());
		}
		*/
		
		//---------------------------------------------------------------

		// ��
		/*
		for (int i=0; i<3; i++)
		{
			System.out.print("�̸� : " + v.get(i).getName() + " " + "���� : " + v.get(i).getAge());
			System.out.println();
		}
		System.out.println();
		*/

		//---------------------------------------------------------------
		
		// ��
		/*
		for (int i=0; i<v.size(); i++)
		{
			System.out.printf("�̸� : %s, ���� : %d��\n", v.elementAt(i).getName(), v.elementAt(i).getAge());
		}//                                               ------------- -> MyDataŸ��
		System.out.println();
		*/

		//---------------------------------------------------------------

		// ��
		/*
		for (int i=0; i<v.size(); i++)
		{
			System.out.printf("�̸� : %s, ���� : %d��\n", v.get(i).getName(), v.get(i).getAge());
		}
		System.out.println();
		*/
		
		//---------------------------------------------------------------
		
		// ��
		for (Object obj : v)
		{
			System.out.printf("�̸� : %s, ���� : %d��\n", ((MyData)obj).getName(), ((MyData)obj).getAge());
		}                                               //------------- -> �ٿ� ĳ����

		//---------------------------------------------------------------
		
		/*
		// ��
		v.add(new MyData("�趯ȯ", 73));
		v.add(new MyData("�趯��", 7));
		v.add(new MyData("�붯��", 3));
		
		for (int i=0; i<v.size(); i++)
		{
			System.out.print("�̸� : " + v.get(i).getName());
			System.out.print("  ���� : " + v.get(i).getAge());
			System.out.println();
		}
		System.out.println();
		*/
	}
}