/*=================================
���� Ŭ���� ��� ����
- ���(Inheritance)
=================================*/

// <<�޼ҵ� �������̵�(Method Overriding)�� Ư¡>>

// - �޼ҵ� �̸�, ���� Ÿ��, �Ķ���� ���� Ÿ���� ������ ��ġ�ؾ� �Ѵ�.

// - �ݵ�� ��� ���谡 �־�� �Ѵ�.

// - �����ǵ� ����Ŭ������ �޼ҵ� �������������ڴ�
//	 ���� Ŭ������ �޼ҵ� �������������ں��� ������ ũ�ų� ���ƾ� �Ѵ�.
//	 ���� ���, ���� Ŭ���� �޼ҵ��� �������������ڰ� protected�� ���
//	 ����Ŭ������ �� �޼ҵ带 �������̵�(Overriding) �ϴ� ���
//	 �������������ڴ� public �Ǵ� protected�̾�� �Ѵ�.

// - static(Ŭ���� �޼ҵ���), final(�������̱⿡ ���ȭ ����-�ٸ� ������ �ٲ� �� ����), private(�ڽ�Ŭ������� �ص� ���� ��ü�� �ȵǱ⿡ �Ұ���) �޼ҵ��
//	 �������̵�(Overriding)�� �� ����.

// - Exception�� �߰��� �Ұ����ϴ�.
//	 ��, ���� �޼ҵ尡 ������ �ִ� ������ ���� ���׿�
//	 ���ο� Exception�� �߰��ϴ� ���� �Ұ����ϴٴ� ���̴�. 

//�θ� Ŭ����(���� Ŭ����, super class)
class SuperTest114
{
	private int a = 5;
	protected int b = 10;
	public int c = 20;

	public void write()
	{
		System.out.println("Super write() �޼ҵ� : " + a + " : " + b + " : " + c);
	}
}

//�ڽ� Ŭ����(���� Ŭ����, sub class)
class SubTest114 extends SuperTest114
{
	/*//�θ� Ŭ������ ���� ��� ���� ������
	//private �Ұ���
	protected int b = 10;
	public int c = 20;

	public void write()
	{
		System.out.println("Super write() �޼ҵ� : " + a + " : " + b + " : " + c);
	}
	*/

	protected int b = 100;

	public void print()
	{
		//System.out.println("Sub print() �޼ҵ� : " + a + " : " + b + " : " + c);
		//--> ������ ����
		//private�̱� ������ a�� ���� �Ұ���
		// == ����Ŭ�������� ����� ���� a ���� ������ �� ����.
		//  -> private �����̱� �����̴�.

		System.out.println("Sub print() �޼ҵ� : " + b + " : " + c);
		//Sub print() �޼ҵ� : 100 : 20

		System.out.println("Sub print() �޼ҵ� : " + b);
		System.out.println("Sub print() �޼ҵ� : " + this.b);     //this�� ������ this�� ������ class�� ġȯ this.b==SubTest114.b
		System.out.println("Sub print() �޼ҵ� : " + super.b);    //�θ�κ��� �������� b�̹Ƿ� super.b==SuperTest114.b
		//Sub print() �޼ҵ� : 100
		//Sub print() �޼ҵ� : 100
		//Sub print() �޼ҵ� : 10
		//== ���� b�� ���� ����� ���� �ٸ� b�� ���� �� ����� �̷������.
		//����Ŭ�������� ����� b, ����Ŭ�������� ����� b

		System.out.println("Sub print() �޼ҵ� : " + c);
		System.out.println("Sub print() �޼ҵ� : " + this.c);
		System.out.println("Sub print() �޼ҵ� : " + super.c);
		//Sub print() �޼ҵ� : 20
		//Sub print() �޼ҵ� : 20
		//Sub print() �޼ҵ� : 20
		//== ���� c�� �����ϴµ� �ƹ��� ����� ������ ����.
		// ����Ŭ�������� ����� c

	}//end print()
	
	@Override
	public void write()
	{
		//System.out.println("Super write() �޼ҵ� : " + a + " : " + b + " : " + c);
		//--> ������ ����
		//private�̱� ������ a�� ���� �Ұ���
		// == ����Ŭ�������� ����� ���� a ���� ������ �� ����.
		//  -> private �����̱� �����̴�.

		System.out.println("Sub write() �޼ҵ� : " + b + " : " + c);
	}

}

//main() �޼ҵ带 �����ϴ� �ܺ��� �ٸ� Ŭ����
public class Test114
{
	public static void main(String[] args)
	{
		//����(SubTest114) �ν��Ͻ� ����
		SubTest114 ob = new SubTest114();

		ob.print();

		ob.write();
		//Super write() �޼ҵ� : 5 : 10 : 20
		//@Override
		//public void write() ���� ������ ����� ����.
		
		//@Override
		//public void write() ��� �� ����� (a�� �ҷ��� �� ��� ����)
		//Sub write() �޼ҵ� : 100 : 20

		System.out.println("----------------------------------------------���м�");

		System.out.println(ob.b);  // �� 3���� ���忡�� �ڽ� Ŭ������ ����
		//100					   // ���м� ���� b�� �θ� Ŭ������ b�� �ڽ��� ���� ������ b�� ������ �ڽ�Ŭ������ �ҷ���.
								   // ob = SubTest114(�ڽ� Ŭ����)

		//System.out.println(((SuperTest114)ob));  -> ob�� SuperTest114Ÿ������ ��ȯ�Ѵ�.
		System.out.println(((SuperTest114)ob).b);
		//10
		//==���� �θ� -> ob �տ� (SuperTest114)�� ���ָ� ob�� SuperTest114Ÿ������ ��ȯ�ϴµ� �̶��� �θ� ������ b�� ���� ������ �� �ִ�.

		ob.write();
		//Sub write() �޼ҵ� : 100 : 20

		((SuperTest114)ob).write();          //((SuperTest114)ob) �ϸ� ob�� �θ� Ŭ������ ��ȯ�� ������ ������ �޼ҵ�� �ٲٸ� �ǵ��� �� ���ٴ� ��Ģ ������.
		//Sub write() �޼ҵ� : 100 : 20

		// --> �޼ҵ�� ������ �� �����Ͽ� ������ ��.
		

		
	}
}