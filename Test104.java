/*=================================
���� Ŭ������ �ν��Ͻ� ����
- �޼ҵ� �����ε�(Method Overloading)�� ������ ���¿� �Ұ����� ����
=================================*/

public class Test104
{
	public static void main(String[] args)
	{
		print();

		print(20);


		print(3.14);

		double result = print(3.14);
	}

	public static void print() {}                          // �����ϴ�
	//public static void print() {}                          // �Ұ����ϴ� -> ��� ���� ��ġ�ϸ� �޼ҵ� �����ε��� ������� ����

	public static void print(int i) {}                     // �����ϴ�
	//public static void print(int j) {}                     // �Ұ����ϴ� -> print�޼ҵ带 ȣ���ϱ� ������ �Ű����� �̸��� �ٸ��ٰ� �ؼ� ���ȴٰ� �����ϸ� �ȵȴ�.

	public static void print(char c) {}                    // �����ϴ� -> �Ǳ������� �ڵ�����ȯ ��Ģ�̶�� ���� �ֱ� ������ �����ؾ� ��. print('A');��� �����ϸ� �Ǳ� ������
											               //             public static void print(char c) {} �̰� ������ ���� public static void print(int i) {}�̰ɷ� �ڵ�����ȯ�� �Ǳ⶧����
											               //			  �� üũ �ʿ�!!
	public static void print(int i, int j) {}              // �����ϴ�

	public static void print(double j) {}                  // �����ϴ� -> ��, �̰͵� �ڵ�����ȯ ��Ģ �����ؾߵ� print(20); �̷��� �Ǹ� int���� ������ double�� �ޱ� ������ ����
	//public static void print(double e) {return 10.0}       // �Ұ����ϴ� -> ���� �ڷ����� 10.0�̶�� �Ǿ��ִµ� void�� ������ �ޱ� ������ �Ұ���
	//public static double print(double e) {return 10.0}     // �Ұ����ϴ� -> double result = print(3.14); ���Կ����ڰ� �����ϸ� ������ó���� ���� �ϰ� ������ �ٶ�
														   //               ��, = print(3.14);�� �κ��� ���� ó����.
														   //               ��ȯ�ڷ����� �ٸ��ٰ� �ؼ� �޼ҵ� ȣ�⿡ ������ ���� ����.

	
}