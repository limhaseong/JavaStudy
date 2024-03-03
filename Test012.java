/*=================================
���� �ڹ� �⺻ ���α׷��� ����
- ������ �ڷ���
- �ڹ� �⺻ ����� : BufferedReader Ŭ����
=================================*/
import java.io.BufferedReader; //import�� ���� ������ BufferedReader���� ������ �տ� java.io.BufferedReader�� ��� ����ߵ�. java.io.BufferedReader br = new java.io.BufferedReader(new InputStreamReader(System.in));
import java.io.InputStreamReader;
import java.io.IOException;

public class Test012
{
	public static void main(String[] args) throws IOException // INPUT�̳� OUTPUT���� ������ ���� ���� ���� ������ ��������.
	{
		// Ű���� ����(����)
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//------------------------------------
		//    ���� �Է��� �о���̴� ��ġ
		//                                     ----------------------
		//                                      ����Ʈ -> ���� ������
		//                                                           ------------
		//                                                           ����Ʈ �Է°�
		// ����Ʈ �Է°��� ���� �����⸦ ������ ���� �Է��� �о���̴� ��.
		
		// String temp = br.readLine();
		// �ܺηκ��� �Էµ� ���� temp�� �ְڴ�.
		// br.readLine(); 2�� �Է����� 222222�� �Է����� �𸣱⿡ ���� ��°�� ������.
		// ""(���ڿ�)�� �������� ���� Ư¡��.

		//�ֿ� ���� ����
		int r;     //������
		final double PI = 3.141592;   //������ -> ������ ���ȭ �ϱ� ���� final�� ���
		double a, b;  //���� ����, �ѷ�


		// ���� �� ó��

		// 1. ����ڿ��� �ȳ� �޼��� ���
		//System.out.println("���� �������� �Է� : "); ���� �Ҷ� ������ �Ǿ� ������ �̻������Ƿ� ������ �ȵǴ� print �����.
		System.out.print("���� �������� �Է� : ");
		
		//r = 2546�̶�� ������.
		//br.readLine();

		//r = br.readLine();
		//r = "2546";

		//"2546" -> parseInt("2546") = 2546
		//"80" -> parseInt("80") = 80
		//-> ���ڿ��� ������ ��ȯ���ִ� �� parseInt()

		//Integer.parsInt("80"); -> 80
		// �Ű������� �Ѱ� ���� ���ڿ� �����͸� ���������� ��ȯ
		// ��, �� �� �Ѱܹ��� ���ڿ� �����ʹ� ���� ���¿��� �Ѵ�.
		//                                    ---------
		//                                  (Number Format)


		//2. ����ڰ� �Է��� ���� �޾ƿ� ������ ���� r�� ��Ƴ���
		r = Integer.parseInt(br.readLine());
		//r = Integer.parseInt("2546");
		//r = 2546;
		// ����ڰ� �Է��� ���� br ��, BufferedReader�� readLine()
		// �޼ҵ带 Ȱ���Ͽ� ���ڿ� ���·� �о���� ��
		// �� ���� Integer.parseInt()�� ���� ������(������)���� ��ȯ�� ��
		// ���� ������ ������ ���� r�� ��Ƴ���.

		//3. ���� �� �ѷ� ���(����)
		// -> ���� ���� a�� b�� ��Ƴ���
		a = r * r *PI;
		b = r * 2 * PI;
	

		// ��� ���
		//���� a�� b�� ����ִ� �� ���
		//System.out.println(">> ���� : " + a);
		//System.out.println(">> �ѷ� : " + b);

		/*���� �������� �Է� : 45
		>> ���� : 6361.723800000001
		>> �ѷ� : 282.74328
		����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .*/


		System.out.printf(">> �������� 45�� ���� ���̴� 6361.72 �̸�,\n ", r, a);
		System.out.printf(">> �������� 45�� ���� �ѷ��� 282.74�Դϴ�.\n ", r, b);
		// >>�������� 45�� ���� ���̴� 6361.72 �̸�,
		// >>�������� 45�� ���� �ѷ��� 282.74�Դϴ�.

	}
}

