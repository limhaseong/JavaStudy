/*=================================
���� �ڹ� �⺻ ���α׷��� ����
=================================*/

// ������
// �ﰢ���� �غ��� ���̿� ���̸� ����ڷκ��� �Է¹޾�
// �� �ﰢ���� ���̸� ���ϴ� ���α׷��� �����Ѵ�.

//���� ��)
// �ﰢ�� ���� ���ϴ� ���α׷�
//- �ﰢ���� �غ� �Է� : 5
//- �ﰢ���� ���� �Է� : 3

//>> �غ��� 5 ���̰� 3�� �ﰢ���� ���� :
// ����Ϸ��� �ƹ� Ű�� ��������...

//���� �ν� �� �м�
// �ﰢ���� ���� = �غ� * ���� / 2
// ����ڷκ��� �����͸� �Է¹޾� ó���� -> BufferedReader�� Ȱ��
// BufferedReader�� ���� �� ����ϴ°�? 1�� ����ϴ°�? = 1���� ����Ѵ�.

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test013
{
	public static void main(String[] args) throws IOException
	{
		/*BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int z, h;
		double a;

		System.out.print("�ﰢ���� �غ� �Է� : ");
		z = Integer.parseInt(br.readLine());

		System.out.print("�ﰢ���� ���� �Է� : ");
		h = Integer.parseInt(br.readLine());

		a = (double)z * h / 2;

		System.out.println(">>�غ��� 5 ���̰� 3�� �ﰢ���� ���� : " + a);*/


		/*-----------------------------------------------------------------------
		int a,b;
		System.out.print("�ﰢ���� �غ� �Է� : ");
		a = Integer.parseInt(br.readLine());
		System.out.print("�ﰢ���� ���� �Է� : ");
		b = Integer.parseInt(br.readLine());
		
		System.out.printf("�غ��� %.0f, ���̰� %.0f�� �ﰢ���� ����: %.2f\n", a, b, (double)a*b /2);*/

		//-------------------------------------------------------------------------------
		
		// �ֿ� ���� ����
		
		// BufferedReader �ν��Ͻ� ����
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		//�غ�, ����
		int underLength, height; 
		double area;   //����


		// ���� �� ó��
		//1. ����ڿ��� �޼��� ���
		System.out.println("���ﰢ�� ���� ���ϴ� ���α׷���");
		System.out.print("�ﰢ���� �غ� �Է� : ");  //println�� ���� ������ �ǹǷ� �ȵ�.

		//2. ����ڰ� �Է��� ������(���ڿ�)�� ���� ���·� ��ȯ�� �� ���� underLength�� ��Ƴ���
		underLength = Integer.parseInt(br.readLine());

		//3. �ٽ� ����ڿ��� �ȳ� �޼��� ���
		System.out.print("�ﰢ���� ���� �Է� : ");

		//4. ������ �ߴ� ��ó�� ����ڰ� �Է��� ������(���ڿ�)�� �������·� ��ȯ�� �� ���� height�� ��Ƴ���
		height = Integer.parseInt(br.readLine());

		//5. �ﰢ���� ���� ���ϴ� ���� ó��
		// �ﰢ���� ���� = �غ� * ���� / 2
		//area = underLength * height / 2; // �غ��̳� ���̳� 2�� �Ǽ� ���·� �ٲ���)
		//     ������       * ������ / ������
		//--------------------------   ------
		//          ������             ������ -> ���� ��� ����
		//                                       (��, ���� ���ϰ� �������� ����)
		area = underLength * height / 2.0; 
		//      ������     * ������/ �Ǽ��� -> �Ǽ� ��� ����!!!!!�߿�!!!
		
		//�Ǽ� �ڷ����� ��������� ������ �������� �Ǽ� ����� ������ �ʿ��� ��Ȳ�̴�.
		// ������ 2�� �ƴ� �Ǽ������� 2.0���� ������ ������ �����ϰ� �Ǹ�
		// �� ������ �Ǽ� ������� ó���ȴ�.
		// area = (double)underLength * height / 2; �� �Ǹ�,(��)
		// area = underLength * (double)height / 2; �� �Ǹ�,(��)
		// area = (double)(underLength * height) / 2; �� ������(��)
		// area = (double)(underLength * height / 2); �� �ȵȴ�.(x)
		//                --------------------------
		//                 �� ������� ���� ����Ͽ� ���� ��� ������.

		// ��� ���
		System.out.println(); //�Ű� ������ ������ ����ȴ�.
		// System.out.print(); �Ű������� ������ ������ ������.

		System.out.printf(">> �غ��� %d, ���̰� %d�� �ﰢ���� ���� %.2f\n : ", underLength, height, area);

		/*��� ���
		�ﰢ���� �غ� �Է� : 5
		�ﰢ���� ���� �Է� : 3
		>>�غ��� 5 ���̰� 3�� �ﰢ���� ���� : 7.5
		����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .*/


	}
}