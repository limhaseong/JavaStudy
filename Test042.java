/*=================================
���� ���� �帧�� ��Ʈ�� (���) ����
- switch�� �ǽ�
=================================*/

//����ڷκ��� ������ �� ������ �����ڸ� �Է¹޾�
//�ش� �������� ���� ó�� ����� ����ϴ� ���α׷��� �����Ѵ�.
//��, switch���� Ȱ���Ͽ� ó���� �� �ֵ��� �ϸ�,
//���� ����� ���ǻ� ���� ���·� ó���� �� �ֵ��� �Ѵ�.

//���� ��)
// ù ��° ���� �Է� : 3
// �� ��° ���� �Է� : 17
// ������ �Է�(+, -, *. /)" : +

//>> 3 + 17 = 20
//��� �Ϸ��� �ƹ�Ű��...

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test042
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		/*
		int a, b;
		char op;

		System.out.print("ù ��° ���� �Է� :");
		a = Integer.parseInt(br.readLine());

		System.out.print("�� ��° ���� �Է� :");
		b = Integer.parseInt(br.readLine());

		System.out.print("������ �Է� :");
		op = (char)System.in.read();
		
		switch (op)
		{
		case 43:System.out.printf("%d %c %d = %d\n", a, op, b, a+b); break;
		case 45:System.out.printf("%d %c %d = %d\n", a, op, b, a-b); break;
		case 42:System.out.printf("%d %c %d = %d\n", a, op, b, a*b); break;
		case 47:System.out.printf("%d %c %d = %d\n", a, op, b, a/b); break;
		}
		System.out.println();
		*/

//--------------------------------------------------------------------------------------
		
		/*
		//1��
		int a,b, result;
		int op;

		System.out.print("ù ��° ���� �Է� :");
		a = Integer.parseInt(br.readLine());

		System.out.print("�� ��° ���� �Է� :");
		b = Integer.parseInt(br.readLine());

		System.out.print("������ �Է� :");
		op = System.in.read();

		// + = 45, - = 45, * =42, / = 47

		switch (op)
		{
		case 43: result = a + b; break;
		case 45: result = a - b; break;
		case 42: result = a * b; break;
		case 47: result = a / b; break;
		default : return;  // 1. ���� ��ȯ(�����ش�). -> Ư���� �޼ҵ带 ȣ�� ������(���� �θ� ������ ���� ���� �ϰ� ���� ��)
						   // 2. �޼ҵ带 �����Ѵ�.(���⼭�� main() �޼ҵ带 �����Ѵٴ� ����)
						   // main() �޼ҵ�� ���۰� ���� �ǹ��ϹǷ� ���⼭�� ���α׷� ���Ḧ ���Ѵ�.
		}

		System.out.println();
		System.out.printf(">> %d %c %d = %d\n", a, op, b, result);
		*/
		
		
		/*
		//2��
		int a, b, result;
		char op;

		System.out.print("ù ��° ���� �Է� :");
		a = Integer.parseInt(br.readLine());

		System.out.print("�� ��° ���� �Է� :");
		b = Integer.parseInt(br.readLine());

		System.out.print("������ �Է� :");
		op = (char)System.in.read();

		switch (op)
		{
		case '+': result = a + b; break;
		case '-': result = a - b; break;
		case '*': result = a * b; break;
		case '/': result = a / b; break;
		default : return;
		}

		System.out.println();
		System.out.printf(">> %d %c %d = %d\n", a, op, b, result);
		*/

		//3��
		int a, b, result;
		String op;

		System.out.print("ù ��° ���� �Է� :");
		a = Integer.parseInt(br.readLine());

		System.out.print("�� ��° ���� �Է� :");
		b = Integer.parseInt(br.readLine());

		System.out.print("������ �Է� :");
		op = br.readLine();

		switch (op)
		{
		case "+": result = a + b; break;
		case "-": result = a - b; break;
		case "*": result = a * b; break;
		case "/": result = a / b; break;
		default : return;
		}

		System.out.println();
		System.out.printf(">> %d %s %d = %d\n", a, op, b, result);

	}
}