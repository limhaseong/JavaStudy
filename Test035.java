/*=================================
���� ���� �帧�� ��Ʈ�� (���) ����
- if��
- if ~ else�� �ǽ�
=================================*/

/*
1. ���α׷��� �ۼ��� �� �־��� ���ǿ� ����
�б� ������ ���ϱ� ���� ����ϴ� �������
if��, if~else��, ���ǿ�����, ���� if��(if�� ��ø), switch���� �ִ�.

2. if���� if ������ ������ ��(true)�� ���
Ư�� ������ �����ϰ��� �� �� ���Ǵ� �����̴�.
*/

//����ڷκ��� ������ �� ������ �����ڸ� �Է¹޾�
//�ش� �������� ���� ó�� ����� ����ϴ� ���α׷��� �����Ѵ�.
//��, if ���ǹ��� Ȱ���Ͽ� ó���� �� �ֵ��� �ϸ�,
//���� ����� ���ǻ� ���� ������� ó���� �� �ֵ��� �Ѵ�.

//���� ��)
// ù ��° ���� �Է� : 10
// �� ��° ���� �Է� : 3
// ������ �Է�( +(43), -(45), *(42), /(47)) : +

//>>10 + 3 = 13
//����Ϸ��� �ƹ� Ű�� ��������...

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test035
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		/*
		int a, b;

		System.out.print("ù ��° ���� �Է� : ");
		a = Integer.parseInt(br.readLine());

		System.out.print("�� ��° ���� �Է� : ");
		b = Integer.parseInt(br.readLine());
		
		char q;

		System.out.print("������ �Է� : ");
		q = (char)System.in.read();

		if (q == 43)
		{
			System.out.println(a + b);
		}
		else if (q == 45)
		{
			System.out.println(a - b);
		}
		else if (q == 42)
		{
			System.out.println(a * b);
		}
		else if (q == 47)
		{
			System.out.println(a / b);
		}
		else
		{
			System.out.println("�Է� ������ ������ �����մϴ�.");
		}
		*/

//----------------------------------------------------------------------------------
		
		/*
		//��� 1
		int a, b, op;     //ù ��°, �� ��° ���� , ������ ���� int������ �ᵵ ��.
		     

		System.out.print("ù ��° ���� �Է� :");
		a = Integer.parseInt(br.readLine());

		System.out.print("�� ��° ���� �Է� :");
		b = Integer.parseInt(br.readLine());

		//Integer.parseInt()
		//"1234" -> Integer.parseInt() -> 1234
		//"abcd" -> Integer.parseInt() -> ����

		System.out.print("������ �Է� :");
		//op = (char)Integer.parseInt(br.readLine()); -> ���� �ȵ�
		op = System.in.read();    //System.in.read();�̰͵� throws IOException �ʿ���.

		//�׽�Ʈ(Ȯ��)
		//System.out.println("�Է��� ������ : " + op);

		// '+' -> 43 / '-' -> 45 / '*' -> 42 / '/' -> 47
		if (op==43)       //����ڰ� �Է��� �����ڰ� +�̶��
		{
			System.out.printf("\n>> %d + %d = %d\n", a, b, (a+b)); //a�� b�� ���� ���� �����Ͽ� ��� ���
		}
		else if (op==45)  //����ڰ� �Է��� �����ڰ� -�̶��
		{
			System.out.printf("\n>> %d - %d = %d\n", a, b, (a-b)); //a�� b�� ���� ���� �����Ͽ� ��� ���
		}
		else if (op==42)  //����ڰ� �Է��� �����ڰ� *�̶��
		{
			System.out.printf("\n>> %d * %d = %d\n", a, b, (a*b)); //a�� b�� ���� ���� �����Ͽ� ��� ���
		}
		else if (op==47) //����ڰ� �Է��� �����ڰ� /�̶��
		{
			System.out.printf("\n>> %d / %d = %d\n", a, b, (a/b)); //a�� b�� ������ ���� �����Ͽ� ��� ���
		}
		else       //����ڰ� �Է��� �����ڰ� �⺻ ��Ģ �����ڰ� �ƴ϶��....
		{
			System.out.println("\n>> �Է� ������ ������ �����մϴ�.");
		}
		*/
		
		/*
		//��� 2
		int a, b;     //ù ��°, �� ��° ���� , ������ ���� int������ �ᵵ ��.
		char op;      //������

		System.out.print("ù ��° ���� �Է� :");
		a = Integer.parseInt(br.readLine());

		System.out.print("�� ��° ���� �Է� :");
		b = Integer.parseInt(br.readLine());

		System.out.print("������ �Է� :");
		op = (char)System.in.read();    //System.in.read();�̰͵� throws IOException �ʿ���.

		if (op=='+')       //����ڰ� �Է��� �����ڰ� +�̶��
			System.out.printf("\n>> %d + %d = %d\n", a, b, (a+b)); //a�� b�� ���� ���� �����Ͽ� ��� ���
		else if (op=='-')  //����ڰ� �Է��� �����ڰ� -�̶��
			System.out.printf("\n>> %d - %d = %d\n", a, b, (a-b)); //a�� b�� ���� ���� �����Ͽ� ��� ���
		else if (op=='*')  //����ڰ� �Է��� �����ڰ� *�̶��
			System.out.printf("\n>> %d * %d = %d\n", a, b, (a*b)); //a�� b�� ���� ���� �����Ͽ� ��� ���
		else if (op=='/') //����ڰ� �Է��� �����ڰ� /�̶��
			System.out.printf("\n>> %d / %d = %d\n", a, b, (a/b)); //a�� b�� ������ ���� �����Ͽ� ��� ���
		else       //����ڰ� �Է��� �����ڰ� �⺻ ��Ģ �����ڰ� �ƴ϶��....
			System.out.println("\n>> �Է� ������ ������ �����մϴ�.");
		//�� if {} �ȿ� ���ٸ� �ִٸ� {} ���� �����ϴ�.
		*/

		//��� 3 (��±��� 1���� ���� �ٸ� �� ���)
		int a, b, result=0;
		char op;

		System.out.print("ù ��° ���� �Է� :");
		a = Integer.parseInt(br.readLine());
		System.out.print("�� ��° ���� �Է� :");
		b = Integer.parseInt(br.readLine());
		System.out.print("������ �Է� :");
		op = (char)System.in.read();

		if (op=='+')
			result=a+b;
		else if (op=='-')
			result=a-b;
		else if (op=='*')
			result=a*b;
		else if (op=='/')
			result=a/b;

		System.out.printf("\n>> %d %c %d = %d\n", a, op, b, result);

		
	}
}
/*������
ù ��° ���� �Է� :10
�� ��° ���� �Է� :10
������ �Է� :+

>> 10 + 10 = 20
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

ù ��° ���� �Է� :10
�� ��° ���� �Է� :10
������ �Է� :+

>> 10 + 10 = 20
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

ù ��° ���� �Է� :10
�� ��° ���� �Է� :2
������ �Է� :+

>> 10 + 2 = 12
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/