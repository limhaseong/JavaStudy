/*=================================
���� �ڹ� �⺻ ���α׷��� ����
- ������ �ڷ���
- �ڹ��� �⺻ ����� : System.util.Scanner
=================================*/

//*java.util.Scanner
// �ܶ� ���� ������ ����Ͽ� �Է��� ��ū�� ���� �����ϸ�, (����, -, / �̷� ���� ������ �����ϴ� ���� ��ū ����)
// ����Ʈ(default)�� ���Ǵ� �ܶ����ڴ� �����̴�.
// �ۼ��� ���� ��ū�� next() �޼ҵ带 ���
// �ٸ� ����(�ڷ���)�� ������ ��ȯ�� �� �ִ�.
// BufferedReader���� Scanner�� ����� ������ ������ ������.

import java.util.Scanner;

public class Test017
{
	public static void main(String[] args) //throws IOException -> Scanner�� �ڵ����� �Ǿ�����.
	{
		//�ֿ� ���� ����

		//Scanner Ŭ���� ����� �ν��Ͻ� ����
		Scanner sc = new Scanner(System.in);
		
		String name;        //�̸�
		int kor, eng, mat;  //��������, ��������, ��������

		//���� �� ó��
		System.out.print("�̸��� �Է��ϼ��� : ");
		name = sc.next();

		//�׽�Ʈ(Ȯ��)
		//System.out.println("�Է��� �̸� : " + name);

		System.out.print("���� ���� �Է� : ");
		//kor = Integer.parseInt(br.readLine());
		//kor = Integer.parseInt(sc.next());
		kor = sc.nextInt();   // ���� ���·� ����
		
		System.out.print("���� ���� �Է� : ");
		eng = sc.nextInt();

		System.out.print("���� ���� �Է� : ");
		mat = sc.nextInt();

		//��� ���
		System.out.println();   //����
		System.out.println(">> �̸� : " + name);
		//System.out.println(">> ���� : " + kor + eng + mat); �̷��� 102030 �̷��� ����
		System.out.println(">> ���� : " + (kor + eng + mat));
	}
}

/*���� ���

�̸��� �Է��ϼ��� : dla
���� ���� �Է� : 10
���� ���� �Է� : 20
���� ���� �Է� : 30

>> �̸� : dla
>> ���� : 60
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .*/