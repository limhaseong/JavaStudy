/*=================================
���� ���� �帧�� ��Ʈ�� (���) ����
- �ݺ��� �ǽ� �� ����
=================================*/

// ���� ��)
// 1���� 100������ ������ �� :
// 1���� 100������ ¦���� �� :
// 1���� 100������ Ȧ���� �� :
// ����Ϸ��� �ƹ� Ű�� ��������...

public class Test046
{
	public static void main(String[] args)
	{
		/* �ذ� ���� �ڵ�
		int n=0;
		int tot=0;
		int sum=0;
		int odd=0;

		while (n<100)
		{	
			if (n<=100)
			{
				tot+=n;
			}
			else if (n%2==0)
			{
				sum+=n;
			}
			else if (n%2!=0)
			{
				odd+=n;
			}
			else
			{
				System.out.println("�Ǻ� �Ұ�");
				return;
			}
			++n;
			
		}
		System.out.println();
		System.out.println("������ �� : " + tot);
		System.out.println("¦���� �� : " + sum);
		System.out.println("Ȧ���� �� : " + odd);
		*/

		//�ֿ� ���� ���� �� �ʱ�ȭ
		int n=1, sum, odd, even;
		sum=odd=even=0;  //0�� even�� ��� odd�� ��� sum�� ��´�.

		//���� �� ó��
		while (n<=100)
		{
			sum+=n;

			if (n%2==0)
			{
				even+=n;
			}
			else if (n%2!=0)
			{
				odd+=n;
			}
			else
			{
				System.out.println("�Ǻ� �Ұ�");
				return;
			}

			n++;
		}

		//������
		System.out.println();
		System.out.println("������ �� : " + sum);
		System.out.println("¦���� �� : " + even);
		System.out.println("Ȧ���� �� : " + odd);
	}
}