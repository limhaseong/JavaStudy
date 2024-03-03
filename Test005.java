/*=================================
���� �ڹ� ���� �� Ư¡ ����
- ������ �ڷ���
- Ű���� �� �ĺ���
- printf()
=================================*/

public class Test005
{
	public static void main(String[] args)
	{
		// ���� ����(�޸� Ȯ��) �� �ʱ�ȭ(�޸𸮿� ���� �Ҵ�)
		int a=10, b=5;

		// ���� ����
		int c, d;

		//���� �� ó��
		c = a + b;  // a+b�� ������� ���� c�� ����.
		d = a - b;  // a-b�� ������� ���� d�� ����.


		//��� ��� -> 10 + 5 = 15�� ���·� ��� ����.
		System.out.println(a+"+"+b+"="+c);
		//10 + 5 = 15
		// ���� ���ڿ� ���� ���ڿ� ���� �� �迭
		// �ڹٿ����� ���� �ٸ� �ڷ����� �����͵鳢���� +������ �����ϸ�, �ٸ� � �ڷ����� 
		// ���ڿ� �������� + ���� ����� ���ڿ��̴�. ��, ���ڿ� ���� �����ڷν� +
		
		//println(), print(), printf() = format()

		System.out.println("abcd");
		System.out.print("abcd\n");
		// ���ڿ� ���� �ȿ��� ���Ǵ� \n�� ����(�ٹٲ� ����)
		
		//printf() / format() = JDK 1.5���� �����Ǵ� �޼ҵ�
		//System.out.printf("��+��=��", 10, 20, 30);
		System.out.printf("%d + %d = %d\n", 10, 20, 30);
		System.out.printf("%d + %d = %d%n", 10, 20, 30); // \n �Ӹ� �ƴ϶� %n(printf���� ����) �� �����̴�.
		// 10 + 20 = 30
		// 10 + 20 = 30
		// %d�� 10������ ������ -> ���� ���� �ɼ���.

		//System.out.printf("�� �� ��", 12, 13);
		System.out.printf("%d �� %d\n", 12, 13);
		
		
		//System.out.printf("�� �� ��", 12, 13.45);
		//System.out.printf("%d �� %d\n", 12, 13.45);
		//���� �߻�(��Ÿ�� ����)

		System.out.printf("%d �� %f\n", 12, 13.45);
		// 12�� 13.45000
		// %f�� �Ǽ��� ���� ���� �ɼ�


		System.out.printf("%d �� %.1f\n", 11, 12.34);
		// 11�� 12.3
		// %.1f�� �Ҽ��� ���� ù��° �ڸ����� ǥ���ض�.

		System.out.printf("%d �� %.2f\n", 11, 12.34);
		// 11�� 12.34
		// %.1f�� �Ҽ��� ���� �ι�° �ڸ����� ǥ���ض�.

		System.out.printf("%d �� %.3f\n", 11, 12.34);
		// 11�� 12.340
		// %.1f�� �Ҽ��� ���� ����° �ڸ����� ǥ���ض�.

		System.out.printf("%f%n", 3.141592);
		// 3.141592

		System.out.printf("%.4f%n", 3.141592);
		// 3.1416
		// %.4f�� �Ҽ��� ���� �׹�° �ڸ����� ǥ���ض�(�ټ���° �ڸ����� �ݿø��Ѵ�.)


	}
}

/*������
10+5=15
abcd
abcd
10 + 20 = 30
10 + 20 = 30
12 �� 13
12 �� 13.450000
11 �� 12.3
11 �� 12.34
11 �� 12.340
3.141592
3.1416
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .*/