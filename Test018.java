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

//import java.util.Scanner;

public class Test018
{
	public static void main(String[] args)
	{
		//�ֿ� ���� ����
		java.util.Scanner sc = new java.util.Scanner(System.in);
		//import ���� �Ⱦ��� java.util. �߰�����ߵ�

		String name;
		int kor, eng, mat, tot;

		//���� �� ó��
		//����ڿ��� �ȳ� �޼��� ���
		System.out.print("�̸� ���� ���� ���� �Է�(���� ����) : ");
		//-> ������ 10 20 30

		//����ڰ� �Է��� �����͸� ������ ������ ��Ƴ���
		name = sc.next();
		kor = sc.nextInt();
		eng = sc.nextInt();
		mat = sc.nextInt();

		//���� ����
		tot = kor + eng + mat;


		//��� ���
		System.out.println();
		System.out.println(">> �̸� : " + name);
		System.out.println(">> ���� : " + tot);

	}
}

/* ���� ���
�̸� ���� ���� ���� �Է�(���� ����) : dla 10 20 30

>> �̸� : dla
>> ���� : 60
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/