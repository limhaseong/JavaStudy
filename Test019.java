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

public class Test019
{
	public static void main(String[] args)
	{
		//�ֿ� ���� ����
		Scanner sc = new Scanner(System.in);
		String name;
		int kor, eng, mat, tot;

		//���� �� ó��
		System.out.print("�̸�,����,����,���� �Է�( , ����) : ");
		//�̸�,����,����,���� �Է�( , ����) : ������,10,20,30

		sc = new Scanner(sc.next()).useDelimiter("\\s*,\\s*");
		//              -----------
		//            "������,10,20,30" ���ڿ��� ������
		// new Scanner(sc.next()).useDelimiter("\\s*,\\s*");
		//                        ------------
		//                        .������ ���();
		//                                     "\\s*,\\s*"->���� �̰� �ڹٿ��� \s*,\s*�� ������ ����
		

		//���ڿ� �ȿ��� \\ 2���� \�Ѱ��� �ǹ���.


		name = sc.next();
		kor = sc.nextInt();
		eng = sc.nextInt();
		mat = sc.nextInt();

		tot = kor + eng + mat;

		//������
		System.out.println("\n>> �̸� : " + name);
		System.out.println(">>���� : " + tot);
	}
}

/*������
�̸�,����,����,���� �Է�( , ����) : dla,10,20,30

>> �̸� : dla
>>���� : 60
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .*/