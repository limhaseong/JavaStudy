/*=================================
���� �ڹ��� ���� �� Ư¡ ����
=================================*/
// ������
// ������ �ο��� ������ ������ ����
// ���� ���̿� �ѷ��� ���ϴ� ���α׷��� �����Ѵ�.
// -> ������ 10

//���� ��)
//���� : ������ * ������ * 3.14
//�ѷ� : ������ * 2 * 3.14
//����Ϸ��� �ƹ� Ű�� ��������...

public class Test010
{
	public static void main(String[] args)
	{
		//double a = 10*10*3.141592;
		//double b = 10*2*3.141592;

		//----------------------------
		//int r = 10;
		//double a = r*r*3.141592;
		//double b = r*2*3.141592;

		//----------------------------
		//int r;
		//r = 10;

		//double a = r*r*3.141592;
		//double b = r*2*3.141592;
		
		//----------------------------
		//�ֿ� ���� ����
		int r = 10;   //������ r
		//double pi = 3.141592  //������ ��
		//final double pi = 3.141592 // final�� ������ ���ȭ ��Ų��.(������ �ʰ� ��)
		final double PI = 3.141592;  //���ȭ �� ������ �빮�ڷ� ��.
		//���ȭ �� ������ ����
		//-> rainbowColor -> RAINBOWCOLOR -> RAINBOW_COLOR
		//-> applePrice -> APPLEPRICE -> APPLE_PRICE
		
		double area, length;   //���� ���� �ѷ�


		//���� �� ó��
		// ���� ���� (������ * ������ * 3.141592)
		area = r * r * PI;

		// �ѷ� ���� (������ * 2 * 3.141592)
		length = r * 2 * PI;

		//������
		System.out.println("���� : " + area);
		System.out.println("�ѷ� : " + length);

		System.out.printf("���� : %.2f%n", area);
		System.out.printf("�ѷ� : %.3f%n", length);

		System.out.printf("���� : %.2f%n�ѷ� : %.3f%n", area, length);



		//������
		/*System.out.println("���� : " + a);
		System.out.println("�ѷ� : " + b);

		System.out.printf("���� : %.2f%n", a);
		System.out.printf("�ѷ� : %.3f%n", b);*/

	}
}

/* ������
���� : 314.1592
�ѷ� : 62.83184
���� : 314.16
�ѷ� : 62.832
���� : 314.16
�ѷ� : 62.832
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .*/