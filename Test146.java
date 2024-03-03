/*=================================
���� �ڹ��� �ֿ�(�߿�) Ŭ���� ����
- �ڹٿ��� �⺻������ �����ϴ� �ֿ� Ŭ������
- Random Ŭ����
=================================*/

/*
- java.lang.Random Ŭ������
  ���� ������ ������ �߻����� �����ϴ� Ŭ�����̴�.
  Math Ŭ������ ���� �޼ҵ��� random()�޼ҵ嵵 ������ �����ϴ� �޼ҵ�������
  0.0 -> 1.0 ������ �Ǽ� ���¸� �߻��ϰ� �ǹǷ�
  �ʿ��� ������ ������ ������ ���ؼ��� �߰����� ������ ���� ���·� �����ؾ� �Ѵ�.
  �׷��� �ڹٴ� ���� ������ ������ �߻������ִ�
  ���� Ŭ������ Random Ŭ������ ������ �����ϰ� �ִ�.
*/

//�ζ� ��ȣ ����(���� �߻� ���α׷�)

//���α׷��� ���۵Ǹ�...
//�⺻������ �ζ� 5������ �����ϴ� ���α׷��� �����Ѵ�.

//���� ��)
//  3 12 15 24 31 41
//  1 12 18 36 41 42
//  4  9 12 13 22 30
//  5 10 13 14 22 40
// 22 31 36 40 43 44
//����Ϸ��� �ƹ� Ű�� ��������...

import java.util.Random;
import java.util.Arrays;

class Lotto
{
	//�迭 ���� ���� �� �޸� �Ҵ� -> �ζ� ��ȣ�� ��Ƶ� �迭�� 6ĭ
	private int[] num;

	//������
	Lotto()
	{
		num = new int[6];
	}

	//getter
	public int[] getNum()
	{
		return num;
	}
	
	//6���� ������ �߻���Ű�� �޼ҵ� ����
	public void start()
	{	
		//Random �ν��Ͻ� ����
		Random rd = new Random();

		//���1
		int n;
		int cnt = 0;
		
		//���� ���� ���(��)
		//�������̱⿡ run ���� �����Ӱ� ���� ����
		run:  //�����ݷ� ; �� �ƴ϶� �ݷ� : ��.
		// - goto �� -> ������ �������� ���� ����� �� ������ ��.(ó������ �����ڸ� ���ϰ� �Ϸ��� ��������� ����)
		//              �׷��� �ڹٰ� ó���� ���ö� goto���� �����ߴٰ� �ϰ� ����
		//              goto���� ���� ��� continue��, break���� �������� �ִ��� ���� �������.
		//����� ����� �ٶ������� �ʴ�.

		while (cnt < 6)            // cnt -> 0 1 2 3 4 5
		{
			n = rd.nextInt(45)+1;   // 0~44 -> +1 -> 1~45

			for (int i=0; i<cnt; i++)
			{
				// num[i] ��ҿ� n�� ��
				if (num[i]==n)
				{
					continue run;             //�ڸ� �����ϰ� ���� ����� �ݺ����� ����������.(for���� ��������)
											  //���� ����ϸ� ���� run:���� ������ �ٽ� while �� ����.
											  //��, ó���� while���� ����� �� ���� �������� ���� �ƴ� ó�� ������� �Ͱ� ���� while�� �����ϴ� �Ͱ� ��!
				}
			}
			num[cnt++] = n;
		}

		//���� �޼ҵ� ȣ��
		sorting();



//----------------------------------------------------------------------------------

		/*���2
		for (int i=0 ; i<num.length ; i++)
		{
			int randomNum;
			boolean dup;

			do
			{
				randomNum = rd.nextInt(45)+1;
				dup = false;
				
				for (int j=0 ; j<i ; j++)
				{
					if (num[j]==randomNum)
					{
						dup = true;
						break;
					}
				}
			}
			while (dup);
			num[i] = randomNum;
		}
		*/

//----------------------------------------------------------------------------------
		
		/*���3
		for (int i=0; i<num.length; i++)
		{
			num[i] = rd.nextInt(45)+1;

			for (int j=0; j<i; j++)
			{
				if (num[i]==num[j])
				{
					i--;
				}
			}
		}
		sorting();
		*/
	}
	
	//���� �޼ҵ� ����
	private void sorting()
	{
		Arrays.sort(num);           //static��
	}

//------------------------------------------------------------------------------

	/*//���2
	private void sorting()
	{
		for (int i=0; i<num.length-1; i++)          
		{
			for (int j=i+1; j<num.length; j++)     
			{
				if (num[i]>num[j])                
				{
					num[i]=num[i]^num[j];
					num[j]=num[j]^num[i];
					num[i]=num[i]^num[j];
				}
			}
		}
	}
	*/
}

public class Test146
{
	public static void main(String[] args)
	{
		//���1

		//Lotto Ŭ���� ��� �ν��Ͻ� ����
		Lotto lotto = new Lotto();
		
		//�⺻ 5���� �ζ� ����
		for (int i=1; i<=5; i++)
		{
			//�ζ� 1���� ����
			lotto.start();

			//��� ���
			for (int n : lotto.getNum())
			{
				System.out.printf("%3d", n);
			}
			System.out.println();
		}

//-----------------------------------------------------------------------------------------------------

		/*//���2
		//Lotto Ŭ���� ��� �ν��Ͻ� ����
		Lotto lotto = new Lotto();
		int lot[] = lotto.getNum();              //int[] lot2 = lotto.get.Num();
		
		//�⺻ 5���� �ζ� ����
		for (int i=1; i<=5; i++)
		{
			//�ζ� 1���� ����
			lotto.start();

			//��� ���
			for (int j=1; j<=5 ; j++)    //���� for (int n : lot2) //Test109.java ����
			{                            //System.out.printf("%4d", n);
				System.out.printf("%4d", lot[j]);
			}
			System.out.println();
		}
		*/
	}
}
