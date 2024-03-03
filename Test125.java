/*=================================
���� Ŭ���� ��� ����
- ��ø Ŭ����
=================================*/

//Test122.java�� ���� ����

/*
- Annonymous Ŭ����(�͸��� Ŭ���� : ���� Ŭ����)
	: 1. AWT �� �ȵ���̵� �̺�Ʈ ó��(Ű���忡�� �� ������ ��, ȭ����ġ, ȭ�鿡 ���� �� ������ ��� ��� ���� �̺�Ʈ ó��)���� �Ϲ������� ���
	  2. ���� Ŭ���� �޼ҵ带 �ϳ� ���� �������� �ʿ伺�� ���� �� ���
	  3. Ŭ������ ��ü�� �ʿ��ϸ� �� �ٽ� Ŭ������ �����ؾ� �ϴ�
	     ���ŷο����� ���� ����ϰ� ��ü ������ �ʿ��� ���
		 �͸��� Ŭ������ �����Ͽ� ó���� �� �ִ�.

- ���� �� ����
	: new ���� Ŭ������ ������()
	  {
		  �������������� �ڷ��� �޼ҵ�()
		  {
			  ...;
		  }
	  };       <- �����ݷ� �ִ� �� üũ~~
*/

//4. ���� Ŭ����(�͸� Ŭ����, annonymous class)

//class SuperTest116 extends Object   --> �̷������� �پ ��ӹް� �ȴ�. �� ��� extends Object�� �ٴ´�.
//{
//}
//class SubTest116 extends SuperTest116 (,Object �̷��� ���ִ� ���� �ƴ�)
//{
//}
//extends Object = ��� Ŭ������ ������ �Ǵ� Ŭ������

//import java.lang.Object; -> lang -> ������� ���� �ִ� ���� �� lang�ȿ� ����
//import java.lang.*; //import ������ ���� �ʾƵ� �ڵ������� �� �������.

class TestObj // extends Object -> Ŭ���� �ڿ��� �� �پ� ����(Object�� ��� �ްڴ�.)
{
	/*
	object �� ������� ������.
	������� https://docs.oracle.com/javase/8/docs/api/
	���⼭ ���� ��.
	...;
	public String toString()
	{
		...;
	}
	*/
	
	/*//object ����� ��� �Ǿ��⿡ �������̵� �����ϴ�.
	@Override
	public String toString()
	{
		...;
	}

	...;
	*/

	public Object getString()
	{
		/*
		Object ob = new Object();
		ob.xx();
		ob.yyy();
		ob.zzzz();
		
		return ob;
		*/

		//return new Object(); //Object ob = new Object(); return ob; �� ���� �ǹ�
		//     ------------- Object ��
		
		//return new Object(){};
		return new Object() //�̸��� ���� ���� ��ü��.
		{
			//Ư�� �޼ҵ� �籸�� -> ������
			@Override
			public String toString()
			{
				return "�͸��� Ŭ����...";
			}
		};

	}
}

//import java.lang.*;

public class Test125 // extends Object
{
	/*
	Object�� ����� ��� ����
	*/
	public static void main(String[] args) //���������� ������ �͵��� ���� import������ ������ String, System�� �� �� ���� = java.lang�� ����ְ� -> �� java.lang�� �ڵ����� ���ԵǱ� �����̴�.
	{
		TestObj ob = new TestObj();

		System.out.println(ob.toString());
		//TestObj@15db9742

		System.out.println(ob.getString());
		//�͸��� Ŭ����...
	}
}