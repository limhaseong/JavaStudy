/*=================================
���� �迭 ����
- �迭�� ����
=================================*/

//Test097.java ���ϰ� ���ؼ� ����.

// �ڹٿ��� �迭 ������ ���翡�� ������ ����, �ּҰ� ���� �� ���� ���°� �����Ѵ�.

// �ּҰ� ���� -> ���� ����
// ������ �����ϸ� ���纻�� ������ ��ġ�� �Ǵ� ���� ���
// (�ڹ��� �迭 �� �ƴ϶� ��� ������ �����Ϳ� �ش��ϴ� ���� ���)

// ������ ���� -> ���� ����
// ���� ��ҷ� ����ִ� ���� ���� �����
// ������ �����ص� ���纻�� ������ ��ġ�� �ʴ� ���� ���

public class Test096
{
	public static void main(String[] args)
	{
		int[] nums = {10, 20, 30, 40, 50};    //-- �迭 ����
		int[] copys;                          //���纻���� ���� �迭

		int temp;                             // ������ �ӽ� ���� ����
		                                      // (�� Ÿ�� Ȯ�� -> �迭�� ��)
		//check
		copys = nums;                         // ����
											  // (�߻� ���� Ȯ��)
		
		temp = nums[0];                       // temp=10;

		//���� �迭�� ������ ����
		nums[0] = 1000;						  // nums = {1000, 20, 30, 40, 50};

		// copys �迭�� ��ü ��� ���
		for (int i=0; i<copys.length; i++)
		{
			System.out.printf("%3d", copys[i]);
		}
		System.out.println();

		// temp ��� Ȯ��
		System.out.println("temp : " + temp);
	}
}

/*������
1000 20 30 40 50
temp : 10
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/