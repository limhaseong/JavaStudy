/*=================================
���� �ڹ��� �ֿ�(�߿�) Ŭ���� ����
- �ڹٿ��� �⺻������ �����ϴ� �ֿ� Ŭ������
- Wrapper Ŭ����
=================================*/



/*
- Wrapper Ŭ����
	: 1. �ڹٿ����� ��� ���ؿ��� �����ϴ� �⺻�� �����͸� ������
	     �������� Ŭ������ �����ϸ� ��ü ������ ó���Ѵ�.
		 ���� �ڹٿ����� �̷��� �⺻�� �����͸�
		 ��ü ������ ó���� �� �ֵ��� Ŭ������ ������ �� �ۿ� ���µ�
		 �̷��� Ŭ�������� ������ Wrapper Ŭ������ �Ѵ�.(���� WrapperŬ������� ���� �ʴ´�.)
	   
	  2. �⺻ �ڷ����� 
	     byte, short, int,     long, float, double, char,      boolean ���� �����ϴ�
		 Byte, Short, Integer, Long, Float, Double, Character, Boolean ��
		 Wrapper Ŭ���� �� ū ���ڵ��� �ٷ�� ����
		 java.math.BigInteger(��û ū ������ ��������)�� java.math.BigDecimal(��û ū ������ �Ǽ�����) Ŭ������ �����Ѵ�.

		 Wrapper Ŭ������ java.lang ��Ű���� ���ԵǾ� �����Ƿ�
		 ������ import �������� �ٷ� ����ϴ� ���� �����ϸ�
		 �⺻���� ���������� WrapperŬ������ ���� �޼ҵ带 ����
		 �� ��ȯ�� �����ϰ�, ���� �񱳰� ���� ���굵 �����ϴ�.

		 ex) java.lang.Integer Ŭ����
		     int �⺻ �ڷ����� Wrapper Ŭ������
			 ������ �ٷ�µ� �ʿ��� ����� �޼ҵ�, ���� ��ȯ � �ʿ���
			 �޼ҵ� ���� �����ϰ� �ִ�.

			 static Integer valueOf(int i)
			 int ���� Integer ������ ��ȯ�Ѵ�.

			 static int parseInt(String s)
			 ���ڿ� �������� ����� ���ڸ� ���� ���·� ��ȯ�Ͽ� ��ȯ�Ѵ�.

			 byte byteValue(), int intValue(),
			 short shortValue(), long longValue(),
			 float floatValue(), double doubleValue()
			 �ش� �⺻ �ڷ������� �� ��ȯ�� ���� ��ȯ�Ѵ�.
*/

//Integer.parseInt("���������� ���ڿ�");
//1. java.lang.Integer; 
//2. Integer it = new Integer(); -> �Ⱦ�
//   -> static�̱� ����.

/*
- ���� �ڽ�(Auto-Boxing)�� ���� ��ڽ�(Auto-Unboxing)
	: �Ϲ������� ���۷��� ���� �⺻ �ڷ����� ȣȯ���� ������,
	  �� ��� �߻��ϴ� ���� �ذ��� ���� �ڹٿ����� Wrapper Ŭ������ �����ϰ� �Ǿ���.
	  ������, JDK 1.5 ���� ���۷��� ���� �⺻ �ڷ�����
	  ������ ���� �� ��ȯ�� �����ϵ��� �������� ������ �̷������ �Ǿ���.

	  int a=10, b;
	  Integer ob;       //Integer ob = new Integer(); �̶�� �ؾߵǴµ� �̰� �Ⱦ��� Integer ob; �̷��� ���� ���ְڴٰ� �ϴ°�
	  ob = a;
	  // �⺻ �ڷ���(int)�� Integer������ �ڵ� ��ȯ(���� �ڽ�)
	  // �����δ� ... ob = new Integer(a); ��� �ؾ� �Ǵ� ���� ���ص� ��

	  b=ob;       //b=int�� ob=��üŸ��
	  //Integer(��ü)�� �⺻ �ڷ����� int������ �ڵ���ȯ(���� ��ڽ�)
      //�����δ�... b = ob.intValue(); ��� �ؾ� �Ǵ� ���� ���ص���
	     |
	  �̴� JDK 1.5 ���� �߰��� ���� �ڽ� / ���� ��ڽ��̶��
	  ������� ���� �������� ���̴�.
*/

public class Test130
{
	public static void main(String[] args)
	{
		int a=10, b;
		Integer c;
		Object d;

		b=a;     //-> int �� ������(�ڷ�)�� -> int �� ������ ��� ���̶� ��
		c=new Integer(0);   //�ν��Ͻ�(��ü) ����

		// >>>>>>>>>�⺻������ ���۷��� ��(���� Ÿ��)�� �⺻ �ڷ���(�⺻ Ÿ��)�� ȣȯ�� ���� �ʴ´�.<<<<<<<<<<<<<<<
		
		b=c; //Integer�� ������(��ü)�� -> int�� ������ ��ڴ� (���� ��ڽ�)	
		b=c.intValue();  // ��ü�� �޼ҵ� ȣ���� ���� ����� ��ȯ(��ڽ�)

		d=new Object();   //�ν��Ͻ�(��ü) ����
		System.out.println("d.toString() : " + d.toString());        //	System.out.println(d);
		//d.toString() : java.lang.Object@15db9742                   // java.lang.Object@15db9742

		d=new Integer(10);                                     //d = Object�� -> �� ĳ����(����(Integer) ��ü�� ����(Object) ��ü�� ����)
		System.out.println("d.toString() : " + d.toString());  //Object�ȿ��� toString()�� �����Ƿ� �ٸ� ������ �� toString()�� �����ǵ� new Integer(10) �̷��� �ϸ� Integer �ȿ� toString()�� �������̵� ���� ���̱⿡ ����.
		//d.toString() : 10

		d=new Double(12.345);	                              //�� ĳ����
		System.out.println("d.toString() : " + d.toString()); //Object�ȿ��� toString()�� �����Ƿ� �ٸ� ������ �� toString()�� �����ǵ� new Double(12.345) �̷��� �ϸ� Double �ȿ� toString()�� �������̵� ���� ���̱⿡ ����.
		//d.toString() : 12.345
		
		//Object d = 10;
		d = 10;                                                //IntegerŸ���� �� -> new Integer 10;���� �� ����. �ڵ����� �Ǳ� ������ -> ����ڽ�, �� ĳ����
		System.out.println("d.toString() : " + d.toString());
		//d.toString() : 10

	}
}