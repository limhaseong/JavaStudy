/*=================================
���� �÷���(Collection) ����
=================================*/

//List -> Vector, ArrayList, LinkedList...

// - ������ �ǹ̰� �ִ�.
// - �迭�� ����� �����ϴ�
// - ������ �ֱ� ������ �ߺ��� ����Ѵ�.

/*
- ArrayList Ŭ����
	: 1. ArrayList �� Vector Ŭ������
	     List�� ũ�� ������ ������ �迭�� ������ ������
		 �������� Vector Ŭ������ ��ü�� �⺻������ ����ȭ ������,
		 ArrayList �� �׷��� �ʴٴ� ���̴�.
		 (��Ƽ�����忡�� safety�ϰ� ó���ؾ����� �ʴ� ��Ȳ������ ������ ArrayList�� ����Ѵ�.)
	  
	  2. �񵿱�ȭ �÷����� ����ȭ�� �÷��Ǻ��� �� ���� ������ �����ϸ�
	     ��������� �÷����� ������ �ʿ䰡 ���� ���α׷�������
		 �Ϲ������� ArrayList �� Vector ���� �� ��ȣ�ϸ�,
		 ArrayList �� ����ȭ�� ������� ���� Vector ó�� ���������ν�
		 ������ ����ȭ�� ������ �δ��� ������ �ʱ� ������
		 Vector ���� �� ������ ����ȴ�.

	  3. null �� ������ ��� ��Ҹ� ����ϸ�
	     List �������̽��� �����ϴ� �� �ܿ� ����Ʈ�� �ݳ��ϱ� ����
		 ���������� ���Ǵ� �迭�� ����� �����ϴ� �޼ҵ带 �����Ѵ�.
*/

import java.util.Vector;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Test165
{
	public static void main(String[] args)
	{
		//ArrayList �ڷᱸ�� ����
		//ArrayList<String> list = new ArrayList<String>();
		//ArrayList �� �ƴ� List �ڷᱸ���� ������ �Ѵٸ�
		//Vector<String> list = new Vector<String>();
		//List<String> list = new Vector<String>();
		List<String> list1 = new ArrayList<String>();  //�������� �Ʒ����� ���� �� ���ϰ� ����Ҷ��� �� ���ؼ� �� ���� �� ��� ����
		//List �ȿ� Vector, ArrayList, LinkedList... ������ �˱�!
		//List�� add() �� ���� �޼ҵ���� ���� �ٵ� �ٸ� Vector�� ArrayList���� �̷��� �޼ҵ� ���� �־
		//Vector<String> list = new Vector<String>(); �̷������� �ϸ� ���߿� List�� ArrayList�� �ٲܶ� �� �ٲ���ߵ�

		//List �ڷᱸ���� ����ٰ� �Ʒ�ó�� ����?
		//List<String> list = new List<String>();   //List, Set, Map�� �������̽��� �Ұ����ϴ�.

		//list1 �ڷᱸ���� ��� �߰� -> add()
		list1.add("�������̸�");
		list1.add("������Ż");
		list1.add("�˶��");

		List<String> list2 = new ArrayList<String>(list1); //->list1 ��ü�� ���� ������

		//list2 �ڷᱸ���� ��� �߰� -> add()
		list2.add("�����̴���");

		List<String> list3 = new ArrayList<String>();

		//list3 �� list2 �� ��ü ��� �߰� -> addAll()
		list3.addAll(list2);

		//"�˶��" �տ� "ž��" �߰�
		//[�������̸�, ������Ż, �˶��, �����̴���] -> ����
		//[�������̸�, ������Ż, ž��, �˶��, �����̴���] -> �̷��� ����� ������.

		//�� "�˶��" ã�� -> indexOf() -> "�˶��"�� �ֳ� ���� �� ��ġ �ε��� ��ȯ��
		int n = list3.indexOf("�˶��");

		//�׽�Ʈ
		//System.out.println("n : " + n);
		//n : 2

		//�� "�˶��" ã�� �ε��� ��ġ�� "ž��" ���� -> add()
		list3.add(n, "ž��");
		//[�������̸�, ������Ż, ž��, �˶��, �����̴���]


		//��� -> ���̵����ͷ� Ȯ��
		System.out.println("===============================================");
		System.out.println(list1);
		//[�������̸�, ������Ż, �˶��]
		System.out.println(list2);
		//[] -> list2�� ������ �س��� ����
		//[�������̸�, ������Ż, �˶��] -> list1�� �Ѱ� �����鼭 �ڷᱸ���� �����Ǿ ��� ����.
		//[�������̸�, ������Ż, �˶��, �����̴���] -> add�� list2�� �ڷᱸ�� ��� �߰��� ���
		System.out.println(list3);
		//[�������̸�, ������Ż, �˶��, �����̴���]


		//��� -> ListIterator() �޼ҵ� Ȱ���Ͽ� ���
		System.out.println("===============================================");

		ListIterator<String> li = list3.listIterator();
		while (li.hasNext())
		{
			System.out.print(li.next() + " ");
		}
		System.out.println();
		//�������̸� ������Ż ž�� �˶�� �����̴���

		//��� -> �������� ����
		while (li.hasPrevious())   // -> ������ �ִ��� ������ Ȯ��
		{
			System.out.print(li.previous() + " ");
		}
		System.out.println();
		//�����̴��� �˶�� ž�� ������Ż �������̸�
	}
}