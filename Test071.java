/*=================================
���� Ŭ������ �ν��Ͻ� ����
=================================*/

// CircleTest.java�� �� ��Ʈ

//���� ���̿� �ѷ� ���ϱ�.
// ���� ���̿� �ѷ��� ���� �� �ִ� Ŭ������ �����Ѵ�.
//Ŭ������: CircleTest
//�Է��� BufferedReader�� readLine()�� ����.

// ���� ���� = ������ * ������ * 3.141592
// ���� �ѷ� = ������ * 2 * 3.141592

//���� ��)
// ������ �Է�: xxx
//
//>> �������� xxx�� ����
//>> ���� : xxxx
//>> �ѷ� : xxxx
// ����Ϸ��� �ƹ� Ű�� ��������...

import java.io.IOException;

public class Test071
{
	public static void main(String[] args) throws IOException
	{
		//CircleTest Ŭ���� ����� �ν��Ͻ� ����
		//CircleTest �ν��Ͻ� ����
		//CircleTest ��ü ����
		CircleTest ob = new CircleTest();

		ob.input();

		double area = ob.calArea();

		double length = ob.calLength();

		ob.print(area, length);
	}
}