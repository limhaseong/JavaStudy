/*=================================
���� �迭 ����
- �迭�� ����
=================================*/

//Test096.java ���ϰ� ���ؼ� ����.

// �ڹٿ��� �迭 ������ ���翡�� ������ ����, �ּҰ� ���� �� ���� ���°� �����Ѵ�.

// �ּҰ� ���� -> ���� ����
// ������ �����ϸ� ���纻�� ������ ��ġ�� �Ǵ� ���� ���
// (�ڹ��� �迭 �� �ƴ϶� ��� ������ �����Ϳ� �ش��ϴ� ���� ���)

// ������ ���� -> ���� ����
// ���� ��ҷ� ����ִ� ���� ���� �����
// ������ �����ص� ���纻�� ������ ��ġ�� �ʴ� ���� ���

// ������ ���� ����
// - int �� �迭�� ���� ���� ���縦 ó���ϴ�
// �޼ҵ带 �����ϴ� ���·� �ǽ� ����

public class Test097 //extend object�� �پ�����.
{
	public static void main(String[] args)
	{
		int[] nums = {10, 20, 30, 40, 50};    // �迭 ����
		
		int[] copys1 = nums;                  // ���� �ǹ��� �迭 ���� ����(�ּҰ� ����)
		
		int[] copys2 = copyArray(nums);       // copyArray()�޼ҵ� ȣ�� �ϸ鼭 nums�� �Ѱܹްڴ�.
											  // ���� �ǹ��� �迭 ���� ����->����� ���� �޼ҵ� ȣ��->������ ����

		int[] copys3 = (int[])nums.clone();   // nums�� clone()�̶�� �޼ҵ带 ȣ��(�ڹٿ��� �̹� clone()�̶�� �޼ҵ带 ��ȯ�س���)
											  // copys3>nums.clone()�̹Ƿ� int�� ����ȯ
											  // ���� �ǹ��� �迭 ���� ����(������ ����)->�ڹٰ� �����ϴ� clone()�޼ҵ� ���
											  // nums.clone(); = object Ÿ���� ��ȯ�ϴ� ���̰� (int[])nums.clone(); = int�迭Ÿ���� ��ȯ�ϹǷ� �ٿ� ĳ������ �� ����.
											  //                                                                    = ������ object�� �ֻ��� Ŭ�����̱� ����.
											  //                                                                    = � Ÿ���� �͵� object���� �Ʒ��̱� ������ �ٿ�ĳ���� ��.
											  // clone() = object �ȿ� �ִ� �޼ҵ�


		// ���� �迭(nums) ����� ���� �߻�
		nums[1] = 2345;


		//��� Ȯ��
		for (int i=0; i<nums.length; i++)
		{
			System.out.printf("%5d", nums[i]);
		}
		System.out.println();
		//   10 2345   30   40   50

		for (int i=0; i<copys1.length; i++)
		{
			System.out.printf("%5d", copys1[i]);
		}
		System.out.println();
		//   10 2345   30   40   50

		for (int i=0; i<copys2.length; i++)
		{
			System.out.printf("%5d", copys2[i]);
		}
		System.out.println();
		//   10   20   30   40   50

		for (int i=0; i<copys3.length; i++)
		{
			System.out.printf("%5d", copys3[i]);
		}
		System.out.println();
		//   10   20   30   40   50
	}
	
	// �Ű�������  int�迭 Ÿ���� �Ѱܹ޾�
	// �� �迭�� ������ ��
	// ������ �迭�� ��ȯ�ϴ� ����� ���� �޼ҵ� ����
	public static int[] copyArray(int[] os)
		       //------                ----
			 //������ �迭           �迭 ������
		 //���� ��ȯ�� ���ΰ�
	{
		//�Ű������� �Ѱܹ��� �迭(os)
		//��, ���� �迭��ŭ�� �迭��(�޸� ����)�� Ȯ����
		//������ �迭 ����
		//int[] result;
		//     +
		//result = new int[]
		int[] result = new int[os.length];
		
		//���� �迭(os)�� ����ִ� ������ ��ҵ��� ���� �迭(result)�� ��Ƴ���
		//result = os; -> �ּҰ��� ��� ���̶� �ȵ�.
		for (int i=0; i<os.length; i++)       //result.length=os.length
		{
			result[i] = os[i];
		}
		
		//������ �迭(result) ��ȯ
		return result;
	}
}