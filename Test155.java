/*=================================
���� �÷��� �����ӿ�ũ(Collection Framework) ����
=================================*/

import java.util.Stack;

public class Test155
{	
	//���� ���ڿ� �迭 ���� �� �ʱ�ȭ
	private static final String[] colors = {"����", "���", "�ʷ�", "�Ķ�", "����", "����"};

	//������
	public Test155()
	{
		//st��� Stack �ڷᱸ�� ����
		//���׷��� Ȱ���Ͽ� �ڷᱸ���� ���� �����Ϳ� ���� ǥ�� -> <String>
		Stack<String> st = new Stack<String>();
		
		//st ��� Stack �ڷᱸ���� ������(colors) ���
		//st = colors;  -> �̷��� ��� ������ �ƴ�
		
		/*
		st.push(colors[0]);    // = st.add(colors[0]);
		st.push(colors[1]);    // = st.add(colors[1]);
		st.push(colors[2]);    // = st.add(colors[2]);
		st.push(colors[3]);    // = st.add(colors[3]);
		st.push(colors[4]);    // = st.add(colors[4]);
		st.push(colors[5]);    // = st.add(colors[5]);
		*/
		
		/*
		for (int i=0; i<colors.length; i++)
		{
			st.push(colors[i]);      // = st.add(colors[i]);
		}
		*/

		//���� for��
		for (String color : colors)        //String color -> � Ÿ�Կ� �̸�, colors->�ڷᱸ����
		{
			st.push(color);    // = st.add(color);
		}
		
		//st.push(10.0); -> ���׸����� String�� ��Ƴ��� ������ �Ǽ������� 10.0�� ������ �ȵ�.
		//st.push(10);
		//������ ���� �߻�
		// -> ���׸� ǥ������ ���� �����ϰ� �ִ�
		//    String �� �ƴ� �ٸ� �ڷ���(double �̳� int)��
		//    ���� �ڷᱸ�� st�� push() �Ϸ��� �߱� ������...

		st.push("����");  //�̰� ���� -> ���� �������� ����. ->���Լ����̹Ƿ� �������� �־����Ƿ� ���� ���� ��µ�

		//��� �޼ҵ� ȣ��
		popStack(st);

	}

	//��� �޼ҵ�
	private void popStack(Stack<String> st)    //�� st��� �̸� ���� ����! -> �޼ҵ� �ȿ����� ���̱� ����
	{
		System.out.print("pop : ");
		//System.out.println(st); -> �̷��� �ȵ� -> �������� �����ؾߵ�
		while (!st.empty())   //st.empty() -> �̸�ŭ�� ��� ���� �ʴٸ�~? -> ! ������ �ֱ� ����   //Test154.java������ !myStack.isEmpty() �̰ſ� ���� ����
		{
			System.out.print(st.pop() + " ");        //peek�� ���Ÿ� ����. pop�� ������.
		}
		System.out.println();
	}

	public static void main(String[] args)
	{
		new Test155();   //������ ȣ��
	}
}

//������
//pop : ���� ���� ���� �Ķ� �ʷ� ��� ����