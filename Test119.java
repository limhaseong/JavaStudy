/*=================================
���� Ŭ���� ��� ����
- �������̽�(Interface)
=================================*/

//�������̽�
interface Demo
{
	public void write();
	public void print();
}

//Ŭ����
//class DemoImpl �̰ſ��ٰ� Demo�� implements�ϸ�
//�������̽��� �����ϴ� �߻� Ŭ������ ��
abstract class DemoImpl implements Demo
{
	@Override
	public void write()                            //-> �̰� ������ �ص� �߻� Ŭ������ �� �� ����. public void print(); �̰͵� ���� �ͼ� �����Ǹ� �ؾ��� ����.
	{
		System.out.println("write() �޼ҵ� ������...");
	}

	//public abstract void print();  -> �Ⱥ������� �̰͵� ���� ������
}

//Ŭ����
//class DemoImplSub
//class DemoImplSub extends DemoImpl
//�߻� Ŭ������ ��ӹ��� �߻�Ŭ������ ��
//abstract class DemoImplSub extends DemoImpl
//�߻� Ŭ������ ��ӹ��� Ŭ����(�߻� Ŭ������ ��ӹ��� Ŭ���������� ������ �������̵��� ���� abstract�� �� �� �ִ�.
class DemoImplSub extends DemoImpl
{
	/*//�Ⱥ������� ���� ���� ������.
	@Override
	public void write()                           
	{
		System.out.println("write() �޼ҵ� ������...");
	}

	//public abstract void print();
	*/

	@Override
	public void print()
	{
		System.out.println("print() �޼ҵ� ������...");
	}
}

//main()�޼ҵ带 �����ϴ� �ܺ��� �ٸ� Ŭ����
public class Test119
{
	public static void main(String[] args)
	{
		//Demo ob1 = new Demo();
		//�ν��Ͻ� ���� �Ұ� -> �������̽��̱� ����

		//DemoImpl ob2 = new DemoImpl();
		//�ν��Ͻ� ���� �Ұ� -> �߻�Ŭ�����̱� ����

		DemoImplSub ob3 = new DemoImplSub();

		ob3.write();
		ob3.print();
		//write() �޼ҵ� ������...
		//print() �޼ҵ� ������...

	}
}