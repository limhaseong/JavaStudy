/*=================================
���� �迭 ����
- �迭�� ����� �ʱ�ȭ
- �迭�� �⺻�� Ȱ��
=================================*/

// ����ڷκ��� �ο����� �Է¹ް�
// �Է¹��� �ο� �� ��ŭ�� �л� �̸��� ��ȭ��ȣ�� �Է� �޾�
// �̷��� �Է¹��� �����͸� �̸� �迭�� ��ȭ��ȣ �迭�� �����Ͽ�
// ����� ����� �� �ִ� ���α׷��� �����Ѵ�.

// ���� ��)
// �Է� ó���� �л� �� �Է�(��, 1~10) : 27
// �Է� ó���� �л� �� �Է�(��, 1~10) : -5
// �Է� ó���� �л� �� �Է�(��, 1~10) : 3
// �̸� ��ȭ��ȣ �Է�[1](���� ����) : ���ϼ� 010-1234-1234
// �̸� ��ȭ��ȣ �Է�[2](���� ����) : ���ϼ� 010-1234-1234
// �̸� ��ȭ��ȣ �Է�[3](���� ����) : ���ϼ� 010-1234-1234

//-----------------------
// ��ü �л� ��: 3
//-----------------------
//  �̸�     ��ȭ��ȣ
// ���ϼ�   010-1234-1234
// ���ϼ�   010-1234-1234
// ���ϼ�   010-1234-1234
//------------------------
//����Ϸ��� �ƹ� Ű�� ��������...

import java.util.Scanner;

public class Test082
{
	public static void main(String[] args) 
	{
		/*
		Scanner sc = new Scanner(System.in);
		
		int a;

		do
		{
			System.out.print("�Է� ó���� �л� �� �Է�(��, 1~10) : ");
			a = sc.nextInt();
		}
		while (a<=0 || a>11);
		
		String[] str1 = new String[a];
		String[] str2 = new String[a];


		for (int i=0; i<a; i++)
		{
			System.out.printf("�̸� ��ȭ��ȣ �Է�[%d](���� ����) : ", (i+1));
			String name = sc.next();
			String num = sc.next();

			str1[i]=name;
			str2[i]=num;
		}

		System.out.println("------------------------------");
		
		System.out.printf("��ü �л� �� : %d\n", a);

		System.out.println("------------------------------");

		System.out.println("�̸� ��ȭ��ȣ");
		for (int i=0; i<a; i++)
		{
			System.out.println(str1[i] + "      " + str2[i]);
		}
		System.out.println("------------------------------");
		*/

//------------------------------------------------------------------------------------

		//Scanner �ν��Ͻ� ����
		Scanner sc = new Scanner(System.in);

		//����ڰ� �Է��ϴ� �л� ���� ��Ƴ� ����
		int member = 0;
		
		do
		{
			System.out.print("�Է� ó���� �л� �� �Է�(��, 1~10) : ");
			member = sc.nextInt();
		}
		while (member<1 || member>10);
		
		//�׽�Ʈ
		//System.out.println("����ڰ� �Է��� �ο� �� : " + member);

		//����ڰ� �Է��� �ο� ���� ����
		//�̸� �迭�� ��ȭ��ȣ �迭�� �����ؾ� �Ѵ�.

		//�ο� �� ��ŭ�� �̸� ���� �迭 ����
		String[] name = new String[member];

		//�ο� �� ��ŭ�� ��ȭ��ȣ ���� �迭 ����
		String[] num = new String[member];
		//String[] num = new String[name.length];//�̰͵� ����.

		//�̸� ��ȭ��ȣ �Է�[%d](���� ����) :
		//�ο� �� ��ŭ�� �ȳ� �޼��� ��� �� �Է°� ��Ƴ���
		for (int i=0; i<name.length; i++)    //i<num.length�� ���� i<member �� ����
		{
			System.out.printf("�̸� ��ȭ��ȣ �Է�[%d](���� ����) : ", (i+1));

			// ������ 1010310
			// ------
			name[i] = sc.next();

			// ������ 1010310
			num[i] = sc.next();
		}

		//���� ���(�̸�, ��ȭ��ȣ) ���
		System.out.println();
		System.out.println("------------------------------");
		System.out.printf("��ü �л� �� : %d��\n", member);
		//member == name.length == num.length
		System.out.println("------------------------------");

		System.out.println("�̸�      ��ȭ��ȣ");

		//�л� ����Ʈ ��� -> �ݺ��� ����
		for (int i=0; i<member; i++)
		{
			System.out.printf("%3s %10s\n", name[i], num[i]);
		}
		System.out.println("------------------------------");





		

	}
}