/*=================================
���� ������(Operator ����
- �� ������
=================================*/

public class Test026
{
	public static void main(String[] args)
	{
		boolean a=true, b=false; //true�� false�� %b

		System.out.printf("a && b : %b\n", (a && b)); //and ������ 1���� false�� false
		System.out.printf("a || b : %b\n", (a || b)); //or ������ ���߿� 1�� true �� true
		System.out.printf("!a : %b\n", !a);  //�� ���꿡�� ������ !���� ǥ���Ѵ�. -> false
		System.out.printf("!b : %b\n", !b); //true

	}
}

/*������
a && b : false
a || b : true
!a : false
!b : true
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .*/