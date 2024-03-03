/*=================================
���� Ŭ������ �ν��Ͻ� ����
- Ŭ������ �ν��Ͻ� Ȱ��
=================================*/

// 1 ~ 3 ������ ������ �߻����Ѽ�
// ���� ���� �� ���� ���α׷��� �����Ѵ�.
// ��, Ŭ������ ������ Ȱ���Ͽ� ó���� �� �ֵ���  �Ѵ�.
// ����, �迭�� Ȱ���Ͽ� ó���� �� �ֵ��� �Ѵ�.
// ���������� RpsGame Ŭ������ �ϼ��� �� �ֵ��� �Ѵ�.

// ���� ��Ƽ�� -> 1: ����, 2: ����, 3: ��

// ���� ��)
// 1: ����, 2: ����, 3: �� �� �Է�(1-3) : 4
// 1: ����, 2: ����, 3: �� �� �Է�(1-3) : -2
// 1: ����, 2: ����, 3: �� �� �Է�(1-3) : 2

// ���� : ����
// ��ǻ�� : ��

// >> �º� ���� ��� : ��ǻ�Ͱ� �̰���ϴ�.
//����Ϸ��� �ƹ� Ű�� ��������...

import java.util.Scanner;
import java.util.Random;

class RpsGame
{
	private int user;
	private int com;

	//��ǻ���� ����������
	private void runCom()
	{
		Random rd = new Random();
		com = rd.nextInt(3)+1;        // 0 1 2 -> (+1) -> 1 2 3

	}


	//������ ����������
	public void input()                  //�ν��Ͻ� �޼ҵ�()
	{
		//����ڰ� ���������� �ϱ� ���� ��ǻ��(������) ���� ����������
		runCom();                        //�ν��Ͻ� �޼ҵ�()

		Scanner sc = new Scanner(System.in);

		do
		{
			System.out.print("1: ����, 2: ����, 3: �� �� �Է�(1-3) : ");
			user = sc.nextInt();
		}
		while (user<1 || user>3);
	}
	
	//�߰� ��� ���
	public void middleCalc()
	{
		String[] str = {"����", "����", "��"}; //1 - ����, 2 - ����, 3 - �������� �迭�� 0,1,2

		System.out.println();
		System.out.println("���� : " + str[user-1]);    //����ڰ� �� ��)
		System.out.println("��ǻ�� : " + str[com-1]);    //��ǻ�Ͱ� �� ��)
	}

	//�ºο� ���� ���� ��� ����
	// - ���º� ��Ȳ�Դϴ�.
	// - ����� �¸��߽��ϴ�.
	// - ��ǻ�Ͱ� �����߽��ϴ�.
	public String resultCalc()
	{
		String result = "���º� ��Ȳ�Դϴ�.";
		
		//������ �̱� ���
		//(����=="����" -> ��=="��"), (����=="����" -> ��=="����"), (����=="��" -> ��=="����")
		//(����=="����" && ��=="��") || (����=="����" && ��=="����") || (����=="��" && ��=="����")
		
		//��ǻ�Ͱ� �̱� ���
		//(����=="����" -> ��=="����"), (����=="����" -> ��=="��"), (����=="��" -> ��=="����")
		//(����=="����" && ��=="����") || (����=="����" && ��=="��") || (����=="��" && ��=="����")
		if ((user==1 && com==3) || (user==2 && com==1) || (user==3 && com==2))
		{
			result = "����� �¸��߽��ϴ�.";
		}
		else if ((user==1 && com==2) || (user==2 && com==3) || (user==3 && com==1))
		{
			result = "��ǻ�Ͱ� �¸��߽��ϴ�.";
		}

		return result;
	}

	//��� ���
	public void print(String str)
	{
		System.out.printf("\n>> �º� ���� ��� : %s\n", str);
	}

	/*//��� 2
	Scanner sc = new Scanner(System.in);
	Random rd = new Random();

	int rps;
	
	String[] arr1 = {"����", "����", "��"};
	
	public void input()
	{
	do
	{
		System.out.print("1: ����, 2: ����, 3: �� �� �Է�(1-3) : ");
		rps = sc.nextInt();

		//if (rps>=1 && rps<=3)
		//{
		//	System.out.println("����: " + arr1[rps-1]);
		//}
		//if (rps==1)
		//{
		//	System.out.print("����: ����");
		//}
		//else if (rps==2)
		//{
		//	System.out.print("����: ����");
		//}
		//else if (rps==3)
		//{
		//	System.out.print("����: ��");
		//}
		//System.out.println();
	}
	while (rps<1 || rps>3);

	int com = rd.nextInt(3)+1;
	System.out.println("��ǻ��: " + arr1[com - 1]);

	if (rps==com)
	{
		System.out.println(">> ���º� �Դϴ�.");
	}
	else if (rps==1 && com==3 || rps==2 && com==1 || rps==3 && com==2)
	{
		System.out.println(">> �º� ���� ��� : ������ �̰���ϴ�.");
	}
	else
	{
		System.out.println(">> �º� ���� ��� : ��ǻ�Ͱ��� �̰���ϴ�.");
	}
	}*/
}

public class Test102
{
	public static void main(String[] args)
	{
		RpsGame ob = new RpsGame();

		ob.input();
		ob.middleCalc();
		String result = ob.resultCalc();
		ob.print(result);



		/*//��� 2
		RpsGame ob = new RpsGame();
		
		ob.input();
		*/
	}
}