/*=================================
���� Ŭ������ �ν��Ͻ� ����
- ���� ���а� ��������������(���� ������, ���� ������, ���� ������, ���� ������...)
=================================*/

import java.util.Scanner;

class CircleTest2  //class CircleTest2 �׳� �̷��� �������� default ����̹Ƿ� �Ʒ� public�� ��� ��� ����
{
	// ��� ����, �ν��Ͻ� ����, ���� ����
	//int num;             //int num; �̶�� �Ǿ������� default

	//    |

	// ���� ����(Information Hiding)
	// private �̶�� ���������������� ������
	// Ŭ���� ���ο����� ���� �� ������ �����ϰ� �ϰڴٴ� �ǹ�
	// int �� ���� ���� -> �ڵ� 0���� �ʱ�ȭ ����
	private int num;
	
	/*
	//getter / setter ����(private���� ��� ���ϴ� ���� �� �� �ְԲ� ���ִ� ��)-���߿� ��� ����.
	public int getNum()
	{
		return num;
	}

	public setNum(int num)
	{
		this.num=num;     //this.num=CircleTest2.num
	}*/

	public void input()
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("������ �Է� : ");
		num = sc.nextInt();
	}

	public double calArea()
	{
		return num * num * 3.141592;
	}

	public void write(double area)
	{
		System.out.println(">>������ : " + num);
		System.out.println(">> ���� : " + area);
	}

}

// �� ���Ͽ� 2�� Ŭ������ ������ ���� ��Ű���� �ִٰ� ��.
//(CircleTest2�� Test098�� ���� ��Ű����� ��)


public class Test098
{
	public static void main(String[] args)
	{
		//CircleTest2 �ν��Ͻ� ����
		CircleTest2 ob1 = new CircleTest2();

		//ob1.num = 10; //private int num;�� �س��� ������ �Ұ���
		//    |
		//ob1.setNum(10);  //set�� �������� �ʾ���
		//���� ���� �������� input()�޼ҵ� ȣ��

		//System.out.println("���� ������ : " + ob1.num); �̰� �ȵż�
		//    |
		//System.out.println("���� ������ : " + ob1.gerNum()); �̰� ���

		//����ν�� �����ϰ� CircleTest2�� num�� �����͸� ������ �� �ִ� ���
		ob1.input();
		//������ �Է�: 500
		//ob1.num  = 500�̶�� �� �� ����

		double result = ob1.calArea();
		
		ob1.write(result);
	}
}

/*������
������ �Է� : 5
>>������ : 5
>> ���� : 78.5398
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/