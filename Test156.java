/*=================================
���� �÷��� �����ӿ�ũ(Collection Framework) ����
=================================*/

/*
- ť(Queue) -> ���⼺(��)�� ����
	: ť(Queue)�� ���Լ����� FIFO(First Input First Output)������
	  ���� �Է��� �ڷḦ ���� ����ϸ�
	  Queue �������̽��� ������ Ŭ������ ť�� ������ �پ��� ����� �����Ѵ�.
	  (������ ���� 1��, ������ ���� 1���� Stack�� �ٸ��� ������ 2����(�� - �� - �� - �ʰ� ������ �� - �� - �� - �� ������ ���� �� ����))

- Queue �������̽� �ν��Ͻ��� �����ϱ� ���ؼ���
  new �����ڸ� �̿��Ͽ� Queue �������̽��� ������(implements)
  Ŭ������ �����ڸ� ȣ���Ѵ�.
  ex) Queue ob = new LinkedList();

- �ֿ� �޼ҵ�
	: 1. E element()
		: ť�� head ��Ҹ� ��ȯ�ϸ� �������� �ʴ´�.    //head ��� = ������ �Ա�

	  2. boolean offer(E o)
	  	: ������ ��Ҹ� ť�� �����Ѵ�.
	  
	  3. E peek()
	  	: ť�� head ��Ҹ� ��ȯ�ϰ� �������� ������
		  ť �ڷᱸ���� empty�� ��� null�� ��ȯ�Ѵ�.

	  4. E poll()
	  	: ť�� head ��Ҹ� ��ȯ�ϰ� �����ϸ�
		  ť �ڷᱸ���� empty�� ��� null�� ��ȯ�Ѵ�.

	  5. E remove()
	  	: ť�� head ��Ҹ� ��ȯ�ϰ� �����Ѵ�.
*/

import java.util.Queue;
import java.util.LinkedList;

public class Test156
{
	public static void main(String[] args)
	{
		//Queue �ڷᱸ�� ����
		//Queue myQue = new Queue();     //->�������̽��⿡ �̷��� ���� �Ұ�
		Queue<Object> myQue = new LinkedList<Object>();  //Queue�� ���׸� ��밡���ϴ�.

		//������ �غ�
		String str1 = "������";
		String str2 = "�涯��";
		String str3 = "�趯��";
		String str4 = "�趯��";

		//myQue ��� Queue �ڷᱸ���� ������ �߰�
		myQue.offer(str1);
		myQue.offer(str2);
		myQue.offer(str3);
		//myQue.offer(str4);
		boolean test = myQue.offer(str4);
		System.out.println("test : " + test);
		//test : true (����� ���� ���� ������ true)
		
		//�׽�Ʈ(Ȯ��)
		System.out.println(myQue);
		//[������, �涯��, �趯��, �趯��] -> ���̵����� = ���� �����Ͱ� ����� ��µǴ� �� ������ �ƴ� ��¥ ��������.
		
		//Queue �ڷᱸ�� myQue����
		//��Ҹ� �������� �ʰ� head ��� ��ȯ
		System.out.println("�� 1 : " + (String)myQue.element());  //myQue.element() ��Ұ� Object Ÿ������ ���� ���� String ����ߵ�
		System.out.println("�� 2 : " + (String)myQue.element());
		System.out.println("�� 3 : " + (String)myQue.element());
		//�� 1 : ������
		//�� 2 : ������
		//�� 3 : ������
		System.out.println();   //����

		String val;

		/*
		//��

		//peek()
		//->ť�� head ��� ��ȯ. ���� ����
		//  ť�� empty�� ��� null ��ȯ.
		while (myQue.peek() != null)            //myQue.peek() -> ������ ��ȯ -> ���� ����
		{
			//poll()
			//-> ť�� head ��� ��ȯ. ������
			//   ť�� empty�� ��� null �� ��ȯ
			val = (String)myQue.poll();         //myQue.poll() -> ������ ��ȯ -> ���� -> ���� ��� ������
			System.out.println("��� : " + val);
		}
		System.out.println();
		//��� : ������
		//��� : �涯��
		//��� : �趯��
		//��� : �趯��
		*/

//------------------------------------------------------------------------------------------------------------------------

		//�׽�Ʈ
		/*
		while (myQue.poll() != null)            //myQue.poll() -> ������ ��ȯ -> ���� -> ���� ��� ������
		{
			
			val = (String)myQue.poll();    //val���� ��µǴ°� -> �涯��     //myQue.poll() -> �涯�� ��ȯ -> ���� -> ���� ��� ������
			System.out.println("��� : " + val);
		}
		System.out.println();
		//��� : �涯��
		//��� : �趯��
		*/

//------------------------------------------------------------------------------------------------------------------------

		// ��
		/*
		while (true)   //���� ����
		{
			val = (String)myQue.poll();
			if (val==null)
			{
				break; //while �� ��������.
			}
			else
			{
				System.out.println("��� : " + val);
			}
		}
		//��� : ������
		//��� : �涯��
		//��� : �趯��
		//��� : �趯��
		*/

//------------------------------------------------------------------------------------------------------------------------

		//��

		while (!myQue.isEmpty())
		{
			val = (String)myQue.poll();
			System.out.println("��� : " + val);
		}
		System.out.println();
		//��� : ������
		//��� : �涯��
		//��� : �趯��
		//��� : �趯��
	}
}