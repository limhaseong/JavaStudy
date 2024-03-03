/*=================================
���� Ŭ������ �ν��Ͻ� ����
- Ŭ������ �ν��Ͻ� Ȱ��
=================================*/

//Test101.java�� ���� ����

// 2. Sungjuk Ŭ����
// �ο����� �Է¹޾�
// �Է¹��� �ο� �� ��ŭ �̸�, ��������, ��������, ���������� �Է¹ް�
// ������ ����� �����ϴ� Ŭ������ �����Ұ�
// �Ӽ� : �ο���, Record Ÿ���� �迭 (���� 2��)
// ��� : �ο��� �Է�, �� ������ �Է�, ���� �� ��� ����, ��� ��� (�޼ҵ� 4��)

import java.util.Scanner;

public class Sungjuk
{
	//�ֿ� �Ӽ� ����
	int inwon;                // �ο���
	Record[] rec;             // Record Ÿ���� �迭(�л� �� ��� Record�迭 �� �� �� Ȱ��)
							  // �迭�� �����ϴ� �Ͱ� ��ü�� �����ϴ� ���� �ٸ�(�迭�� �����Ѵٰ� ��ü�� �������� ����)
							  // Record �� ������� ������ ��ü�� ��Ƴ� �� �ִ� �迭

	//�ֿ� ��� ����
	// 1. �ο� �� �Է�
	public void set()
	{
		Scanner sc = new Scanner(System.in);

		do
		{
			System.out.print("�ο� �� �Է�(1-100) : ");
			inwon = sc.nextInt();
		}
		while (inwon<1 || inwon>100);

		rec = new Record[inwon];
		//Record Ŭ������ ������� ������ ��ü(�ν��Ͻ�)�� ���� �� �ִ�
		//�迭���� inwon��ŭ ������ ���� ��
		//Record Ŭ������ �ν��Ͻ��� ������ ���� �ƴϴ�.
		//rec = new Record[inwon]; �迭�� ������ ����
		//Record ob = new Record(); �ν��Ͻ� ������ ����
	}

	// 2. �� ������ �Է� + 3. ���� �� ��� ����
	public void input()
	{
		Scanner sc = new Scanner(System.in);
		String[] subTitle = {"���� ���� : ", "���� ���� : ", "���� ���� : "};

		//�ο� �� ��ŭ �ݺ� -> �ο����� ����Ͽ� ������� �迭�� ���̸�ŭ �ݺ�
		for (int i=0; i<rec.length; i++) //for (int i=0; i<inwon; i++)�� ���� ��
		{
			//Record Ŭ���� ����� �ν��Ͻ� ������ ���� ����!
			//Record ob = new Record();
	   //�̷� Ÿ�� ���� -------------
					// ���� �ν��Ͻ��� �����Ǵ� ����
			//rec[i]=ob; �Ʒ��� ����.
			rec[i]=new Record();
			
			System.out.printf("%d��° �л��� �̸� �Է� : ", (i+1));
			rec[i].name = sc.next();
			
			/*
			System.out.print("�������� : ");
			rec[i].score[0] = sc.nextInt();
			System.out.print("�������� : ");
			rec[i].score[1] = sc.nextInt();
			System.out.print("�������� : ");
			rec[i].score[2] = sc.nextInt();
			*/  //String���� �޾Ƴ��� �Ǳ⿡ ���� String���� �迭����

			for (int j=0; j<subTitle.length; j++)
			{
				//�ȳ� �޼��� ���
				System.out.print(subTitle[j]);
				rec[i].score[j] = sc.nextInt();

				//����, ����, ���� ���� �����͸� �ݺ������� �Է¹޴� ����
				//������ ���� ���� ����
				rec[i].tot+=rec[i].score[j];
			}
			
			// ��� �����ϱ�
			rec[i].avg = rec[i].tot / 3.0;

		}//end outer for
	}//end input

	// 4. ��� ���
	public void print()
	{
		//���� ���� ���� �޼ҵ� ȣ��
		ranking();//�����̶�� Ŭ���� �ȿ� �ְ� static�� �ƴϱ⿡ �θ� �� ����.

		//����
		System.out.println();

		//�л� �� �� �� �ݺ� ��� ���� ����
		//for (int i=0; i<inwon; i++) �Ʒ��� ���� ��
		for (int i=0; i<rec.length; i++)
		{
			//�̸� ���
			System.out.printf("%5s", rec[i].name);

			//����(����, ����, ����) �ݺ� ���
			for (int j=0; j<3; j++)
			{
				System.out.printf("%4d", rec[i].score[j]);
			}

			//����, ��� ���
			System.out.printf("%5d", rec[i].tot);
			System.out.printf("%8.2f", rec[i].avg);

			//+���� ���� �߰�
			System.out.printf("%4d", rec[i].rank);
			
			// ����
			System.out.println();
		}

	}
	
	// + 5. ���� ����
	// -> ���� �������� ���꿡 �ʿ��� �����Ͱ� �̹� �����ϴ� ��Ȳ->�Ű����� �Ѱ��� �ʿ� ����
	// ���꿡 �ʿ��� �����Ͷ� ���.
	// Record�迭�� rank�Ӽ��� ������ ���� ��� ���� -> ��ȯ �ڷ��� void
	// Ŭ���� ���ο��� Ȱ���� �޼ҵ�� ���� -> �������� ������ private
	private void ranking()
	{
		//��� �л����� ���(����, rank)�� 1�� �ʱ�ȭ
		for (int i=0; i<inwon; i++)
		{
			rec[i].rank=1;
		}

		//��� ���� -> �Է��ο��� 5���̶�� �����ϸ�
		for (int i=0; i<inwon-1; i++)                    //��~ -> �� ���� ->     0    1    2    3
		{
			for (int j=i+1; j<inwon; j++)                //������~ -> �� ��� ->1234  234  34    4
														 //0�� �� �����̸� 1���� �����̱� ������ i+1�̰� j<inwon�ΰ��� ������ ��� �غ��� �Ǳ� ����.
			{
				if (rec[i].avg>rec[j].avg)    //�� ������ ����� �� ����� ��պ��� ũ�ٸ�
				{
					//�񱳴���� rank�� 1��ŭ ����
					rec[j].rank++;
				}
				else if (rec[j].avg > rec[i].avg) //�� ����� ����� �� ������ ��պ��� ũ�ٸ�
				{
					//�񱳱����� rank�� 1��ŭ ����
					rec[i].rank++;
				}
			}
		}



	}








//------------------------------------------------------------------------

	/*//�ذ� ����
	Scanner sc = new Scanner(System.in);
	Record rec=new Record();

	void input()
	{
		do
		{
			System.out.print("�л� ��(1-100) : ");
			rec.a = sc.nextInt();
		}
		while (rec.a<1 || rec.a>100);
	}

	void data()
	{
		for (int i=0; i<rec.a; i++)
		{
			System.out.printf("%d��° �л��� �̸� �Է� : ", (i+1));
			rec.name[i] = sc.next();
			System.out.print("�������� : ");
			rec.score[0] = sc.nextInt();
			System.out.print("�������� : ");
			rec.score[1] = sc.nextInt();
			System.out.print("�������� : ");
			rec.score[2] = sc.nextInt();

			rec.tot += rec.score[0]+rec.score[1]+rec.score[2];
			rec.avg=rec.tot/3.0;
		}
	}

	void tott()
	{
		for (int i=0; i<rec.a; i++)
		{
			System.out.printf("%3s %d %d %d %d %.2f", rec.name, rec.score[0], rec.score[1], rec.score[2], rec.tot, rec.avg);
		}
	}*/
}