/*=================================
���� �ڹ� �⺻ ���α׷��� ����
- ������ �ڷ���
- �ڹ��� �⺻ ����� : BufferedReaderŬ����
=================================*/

//����ڷκ��� �̸�, ��������, ��������, ���������� �Է� �޾�
//�̸��� ������ ����ϴ� ���α׷��� �����Ѵ�.

//���� ��)
// �̸��� �Է��ϼ��� : 
// ���� ���� �Է� :
// ���� ���� �Է� :
// ���� ���� �Է� :

//===[���]===
// ���� :
// ��� �Ϸ��� �ƹ� Ű�� ��������...

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
//import java.io*; �� �ص� ��(���������� ��������, ���� ����� �ƴ�)

public class Test014
{
	public static void main(String[] args) throws IOException
	{
		/*BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String name;

		System.out.print("�̸��� �Է��ϼ��� : ");
		name = br.readLine();
		
		int a, b, c, z;

		System.out.print("���� ���� �Է� : ");
		a = Integer.parseInt(br.readLine());
		System.out.print("���� ���� �Է� : ");
		b = Integer.parseInt(br.readLine());
		System.out.print("���� ���� �Է� : ");
		c = Integer.parseInt(br.readLine());

		z = a + b + c;

		System.out.println("\n===[���]===");
		System.out.printf("�̸� : %s%n���� : %d%n", name, z);*/

		// �ֿ� ���� ����
		// BufferedReader �ν��Ͻ�����
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		/*InputStreamReader isr = new InputStreamReader(System.in); 
		BufferedReader br = new BufferedReader(isr); //�̷��� 2�ٷ� ���⵵ ����.*/
		
		
		String strName;  // �̸� ���� �밡�����
		int nKor, nEng, nMat;  //��������, ��������, �������� ����
		int nTot;   //���� ����
		String strTemp;  //���ڿ� �ӽ� ���� ����


		//���� �� ó��
		// ����ڿ��� �ȳ� �޼��� ���(�̸� �Է� �ȳ�)
		System.out.print("�̸��� �Է��ϼ��� : ");

		//����ڰ� �Է��� ��(�ܺ� ������)�� ������ ��Ƴ���
		strName = br.readLine();
		//readLine�� ���ڿ��� ���·� ������.

		//����ڿ��� �ȳ� �޼��� ���(�������� �Է� �ȳ�)
		System.out.print("���� ���� �Է� : ");

		//����ڰ� �Է��� ��(�ܺ� ������)�� ������ ��Ƴ���
		//nKor = br.readLine();
		//nKor�� ����, br.readLine();�� ���ڿ�

		strTemp = br.readLine();

		//��Ƴ� �����͸� ��ȯ�� �� �ʿ��� ������ �ٽ� ���.
		nKor = Integer.parseInt(strTemp);
		
		//����ڿ��� �ȳ� �޼��� ���(�������� �Է� �ȳ�)
		System.out.print("���� ���� �Է� : ");

		//����ڰ� �Է��� ��(�ܺ� ������)�� ������ ��Ƴ���
		strTemp = br.readLine();

		//��Ƴ� �����͸� ��ȯ�� �� �ʿ��� ������ ��Ƴ���
		nEng = Integer.parseInt(strTemp);

		//����ڿ��� �ȳ��޼��� ���(�������� �Է� �ȳ�)
		System.out.print("���� ���� �Է� : ");

		//����ڰ� �Է��� ��(�ܺ� ������)�� ������ ��Ƴ���
		strTemp = br.readLine();

		//��Ƴ� �����͸� ��ȯ�� �� �ʿ��� ������ ��Ƴ���
		nMat = Integer.parseInt(strTemp);


		//�� ���� ������ ����ִ� ������(����ڰ� �Է��� ������)����
		//�����Ͽ� ������ �����ϰ� �� ����� ���� ������ ��Ƴ���
		nTot = nKor + nEng + nMat;


		//��� ���
		System.out.println("/n===[���]===");
		//System.out.println("�̸� : " + strName); - �̰͵� ����
		System.out.printf("�̸� : %s\n", strName);
		//System.out.println("���� : " + nTot);
		System.out.printf("���� : %d\n", nTot);
		
		//%d = ������, %f = �Ǽ���, %s = ���ڿ���
	}
}

/*������
�̸��� �Է��ϼ��� : d
���� ���� �Է� : 10
���� ���� �Է� : 10
���� ���� �Է� : 10
/n===[���]===
�̸� : d
���� : 30
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/