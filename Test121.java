/*=================================
���� Ŭ���� ��� ����
- �������̽�(Interface)
=================================*/

//�ǽ� ����
// ���� ó�� ���α׷��� �����Ѵ�.
// ��, �������̽��� Ȱ���� �� �ֵ��� �Ѵ�.

//���� ��)
// ���� �� �Է�(1-10) : 11
// ���� �� �Է�(1-10) : 0
// ���� �� �Է�(1-10) : 2

//1��° �л��� �й� �̸� �Է�(���� ����) : 2309123 ��ٽ�
//���� ���� ���� ���� �Է�   (���� ����) : 90 100 85
//2��° �л��� �й� �̸� �Է�(���� ����) : 2309125 �赿��
//���� ���� ���� ���� �Է�   (���� ����) : 85 70 60

// 2309123 ��ٽ�  90 100 85 ���� ���
//                  �� �� ��
// 2309125 �赿��  85 70 60  ���� ���
//                 �� �� ��
//����Ϸ��� �ƹ� Ű�� ��������...

//90 �̻�       -> ��
//80�̻� 90�̸� -> ��
//70�̻� 80�̸� -> ��
//60�̻� 70�̸� -> ��
//60�̸�(�� ��) -> ��

import java.util.Scanner;

//�Ӽ��� �����ϴ� Ŭ���� -> �ڷ��� Ȱ��
class Record
{
	String hak, name;        //�й�, �̸�
	int kor, eng, mat;       //����, ����, ����
	int tot=0;               //����
	double avg;              //���
}

//�������̽�
interface Sungjuk
{
	public void set();         //�ο� ����
	public void input();       //������ �Է�
	public void print();       //��� ���
}

//���� �ذ� �������� �����ؾ� �� Ŭ���� -> Sungjuk �������̽��� �����ϴ� Ŭ����
class SungjukImpl implements Sungjuk
{
	private int inwon;
	private Record[] rec;

	@Override
	public void set()
	{
		Scanner sc = new Scanner(System.in);

		do
		{
			System.out.print("�ο� �� �Է�(1-10) : ");
			inwon = sc.nextInt();
		}
		while (inwon<1 || inwon>10);

		rec = new Record[inwon];
	}

	@Override
	public void input()
	{
		Scanner sc = new Scanner(System.in);

		String[] hak = new String[inwon];
		String[] name = new String[inwon];
		int[] kor = new int[inwon];
		int[] eng = new int[inwon];
		int[] mat = new int[inwon];

		for (int i=0; i<name.length; i++)
		{
			rec[i]=new Record();

			System.out.printf("%d��° �л��� �й� �̸� �Է�(���� ����) :", (i+1));

			rec[i].hak = sc.next();
			rec[i].name = sc.next();

			System.out.print("���� ���� ���� ���� �Է�   (���� ����) : ");

			rec[i].kor = sc.nextInt();
			rec[i].eng = sc.nextInt();
			rec[i].mat = sc.nextInt();

			rec[i].tot+=rec[i].kor+rec[i].eng+rec[i].mat;

			rec[i].avg = rec[i].tot / 3.0;
		}

		
	}

	@Override
	public void print()
	{
		System.out.println();
		
		for (int i=0; i<rec.length; i++)
		{
		
			System.out.printf("%2s\n %2s %2d %2d %2d %2d %4.2f\n", rec[i].hak, rec[i].name, rec[i].kor, rec[i].eng, rec[i].mat, rec[i].tot, rec[i].avg);
			System.out.printf("%9s %s %s", panjung(rec[i].kor), panjung(rec[i].eng), panjung(rec[i].mat));


			// ����
			System.out.println();
		}
	}

	//���������� ��޿� ���� ������ ������ �޼ҵ�
	private String panjung(int score)
	{
		String pan;

		if (score>=90)
			pan="��";
		else if (score>=80)
			pan="��";
		else if (score>=70)
			pan="��";
		else if (score>=60)
			pan="��";
		else
			pan="��";
		return pan;
	}
}

//main()�޼ҵ带 �����ϴ� �ܺ��� �ٸ� Ŭ����
public class Test121
{
	public static void main(String[] args)
	{
		Sungjuk ob = new SungjukImpl();

		//���� �ذ� �������� �ۼ��ؾ� �� ob ���� �� ��ü ����
		
		ob.set();
		ob.input();
		ob.print();
	}
}

/*
������
�ο� �� �Է�(1-10) : 2
1��° �л��� �й� �̸� �Է�(���� ����) :202309123 ��ٽ�
���� ���� ���� ���� �Է�   (���� ����) : 90 100 85
2��° �л��� �й� �̸� �Է�(���� ����) :202309125 �赿��
���� ���� ���� ���� �Է�   (���� ����) : 85 70 60

202309123
 ��ٽ� 90 100 85 275 91.67
        �� �� ��
202309125
 �赿�� 85 70 60 215 71.67
        �� �� ��
*/