/*=================================
���� Ŭ���� ��� ����
- �������̽�(Interface)
=================================*/

//�������̽�
interface ADemo
{
	public void write();          //�߻�޼ҵ�
}

//�������̽�
interface BDemo
{
	public void print();          //�߻�޼ҵ�
}

// �������̽��� 2�� �̻��� ����(implements)�� �� �ִ�.
// -> Ŭ�������� ���� ����� ���� �ʴ� �κ��� ����(����)�ϴ� ����
// (�߻� Ŭ������ ���� ����� �ȵȴ�.)

//Ŭ����
//class DemoImpl
//class DemoImpl extends ADemo, BDemo   // -> X(�������̽��� extends ��� ����)
//class DemoImpl implements ADemo, BDemo
//           |
//�߻� Ŭ���� - �� �������̽��� �����ϴ� �߻� Ŭ������ �ȴ�.(�������̵��� �ϱ���)
//abstract class DemoImpl implements ADemo, BDemo
//           |
//Ŭ���� - �� �������̽��� ������ �� -> �� �������̽��� ��� �޼ҵ带 Overriding�Ͽ� ������ �ϸ� -> �Ϲ� Ŭ������ ��
class DemoImpl implements ADemo, BDemo
{
	//JDK 1.5(5.0)������ �������̽��� �޼ҵ带
	//�������̵�(Overriding)�� ��
	//@Override ������̼�(annotation)�� ����� �� ����.
	//JDK 1.6(6.0) ���ĺ��� ���� ������ �����̴�.
	//��, ��ӹ��� Ŭ������ �޼ҵ带 �������̵�(Overriding)�� ������
	//JDK1.5(5.0)������ ������̼� ����� �����ϴ�.
	//(class���� @�� ����ϴ� ���� JDK 1.5(5.0)���� ����������
	//�������̽����� @����ϴ� ���� JDK 1.6���� �����ϴ�.)
	@Override
	public void write()
	{
		System.out.println("ADemo �������̽� �޼ҵ� write()...");
	}
	
	@Override
	public void print()
	{
		System.out.println("BDemo �������̽� �޼ҵ� print()...");
	}
}

//main()�޼ҵ带 �����ϴ� �ܺ��� �ٸ� Ŭ����
public class Test118
{
	public static void main(String[] args)
	{
		//�������̽��� ������ �ν��Ͻ� �����ϴ� �� ���� �Ұ����ϴ�.
		//ADemo ob1 = new ADemo();
		//BDemo ob2 = new BDemo();
		
		//ADemo, BDemo �������̽��� ����(implements)��
		//Ŭ����(-> DemoImpl)����� �ν��Ͻ� ����.
		DemoImpl ob1 = new DemoImpl();
		
		ob1.write();
		//ADemo �������̽� �޼ҵ� write()...

		ob1.print();
		//BDemo �������̽� �޼ҵ� print()...
		
		//�� ĳ����
		ADemo ob2 = new DemoImpl();
		BDemo ob3 = new DemoImpl();

		//ob2.print();
		//������ ���� �߻�(ADemo���� print()�� ����)
		//ob3.write();
		//������ ���� �߻�(BDemo���� write()�� ����)

		ob2.write();
		//ADemo �������̽� �޼ҵ� write()...
		ob3.print();
		//BDemo �������̽� �޼ҵ� print()...

		//�� ĳ���õ� �ٿ� ĳ���õ� �ƴϴ�.
		((BDemo)ob2).print();
		//BDemo �������̽� �޼ҵ� print()...
		((ADemo)ob3).write();
		//ADemo �������̽� �޼ҵ� write()...
		//--> DemoImplŬ������ �� �������̽�(ADemo�� BDemo)�� ��� �����߱� ������
		//    �̿� ���� ó���� �����ϴ�.
		//    ����, DemoImplŬ������ �� �������̽��� �� �� �������̽��� �����ߴٸ�
		//    �� ������ ��Ÿ�� ������ �߻��ϴ� ������ �ȴ�.
		//(�ƹ��� ������� ��ü�� �ٸ� Ŭ������ �Ͱ� ĳ�����ϴ� ���� ������ �Ұ���������
		//DemoImpl()�� ADemo�� BDemo�� �Ѵ� �����߱� �����̴�.)

		//�̰��� �ٿ� ĳ����!
		((DemoImpl)ob3).write();
		//ADemo �������̽� �޼ҵ� write()...



	}
}