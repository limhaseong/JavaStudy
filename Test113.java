/*=================================
���� Ŭ���� ��� ����
- ���(Inheritance)
=================================*/

//Test073.java ����

//������ ���� ���α׷��� �����Ѵ�.
//��, ����� ������ �����Ͽ� �ۼ��� �� �ֵ��� �Ѵ�.

//���� ��)
//������ �� ���� �Է�(���� ����) : 20 10
//������ �Է�(+ - * /) : -
//>> 20-10 = 10
//����϶�� �ƹ� Ű�� ��������...

//import java.util.Scanner;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

class Aclass
{
	protected int x, y;
	protected char op;

	Aclass()
	{
		
	}

	void write(double result)
	{
		System.out.printf("\n>> %d %c %d = %.2f\n", x, op, y, result);
	}
}

//Aclass�� ��ӹ޴� Ŭ������ ����
class Bclass extends Aclass
{
	/*Aclass�� ���� ��ӵ�
	protected int x, y;
	protected char op;

	//Aclass()  --> ��, ������� ����� �ȵǹǷ� �� �κ��� ����.
	//{
	//	
	//}

	void write(double result)
	{
		System.out.printf("\n>> %d %c %d = %.2f\n", x, op, y, result);
	}
	*/

	Bclass()
	{
		//super();   //->�θ� Ŭ������ ���� �̷��� ��ӵ�
	}
	
	//void input()-> ���� �̷��� �ߴµ� �Ʒ����� �غ��ڴٴ� �ǹ�.
	boolean input() throws IOException
	{
		//Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("������ �� ���� �Է�(���� ����) : ");   //"20 10" ���ڿ����·� ����
		String temp=br.readLine();

		//���ڿ� .split("������");
		//��� ���ڿ��� �ڸ�
		// ���ڿ�.split("\\s");    //������ -> �������� ���� ��
		// ex)"10 20 30 40 50".split("\\s");
		//  --> ��ȯ ��� -> {"10", "20", "30", "40", "50"};
		// ex) "010-1234-4567".split("-");
		// --> ��ȯ ��� -> {"010", "1234", "4567"};

		String[] strArr = temp.split("\\s");                           //"20 10"���� �Է��ߴٸ� -> String[] strArr = {"20", "10"};

		if (strArr.length != 2)
		{										//if (temp.length() != 2�� �ȵ� -> �Է��� ���ڿ� ���̰� 2���ڰ� �ƴϸ� �̶�� ��.
			return false;
		}
			//false�� ��ȯ�ϸ� input() �޼ҵ� ����
			// �� ������ �����Ͽ� if���� �����ϰ� �� ���
			// �Ʒ� �����ؾ� �� �ڵ尡 �����ִ���
			// �����(->false)�� ��ȯ�ϸ� �޼ҵ�� ����ȴ�.

			x = Integer.parseInt(strArr[0]);
			//this.x = Integer.parseInt(strArr[0]); �̰͵� ����. Bclass.x�� -> this�� ������ x�� ã�ư���
			//super.x = Integer.parseInt(strArr[0]); �̰͵� ���� -> �θ�κ��� �������� x�� ��Ƶ� �ȴ�.
			y = Integer.parseInt(strArr[1]);
			//this.y = Integer.parseInt(strArr[0]); �̰͵� ����. Bclass.x�� -> this�� ������ x�� ã�ư���
			//super.y = Integer.parseInt(strArr[0]); �̰͵� ���� -> �θ�κ��� �������� x�� ��Ƶ� �ȴ�.

			System.out.print("������ �Է�(+ - * /) : ");
			op = (char)System.in.read();                          //br.readLine() ���� �޾ƿ��� �ȵȴ�.

			/*
			if (op!='+' && op!='-' && op!='*' && op!='/')                  //boolead���� �߱� ������ if�� ���.
																  //||�� ������� �� ���� true�̸� �ڸ� Ȯ�� ���� ��, '-'�� ��������� op!='+'�̰��� ���� Ȯ�� �ϴµ�
																  // op!='+'�� Ȯ���ϸ� true�̱� ������ �������鵵 �� true�� �Ǿ����
																  //�����϶� &&�� �����϶� ||
			{
				return false;
			}
			return true;
			*/
			
		if (op=='+' || op=='-' || op=='*' || op=='/')
		{
			return true;
		}
		return false;

	}//end input()
		
	double calc()
	{
		double result = 0;

		switch (op)
		{
			case '+' : result = x+y; break;
			case '-' : result = x-y; break;
			case '*' : result = x*y; break;
			// case '/' : result = x/y; break;
			case '/' : result = (double)x/y;   //-> break ���� ���� ������ ������ �����Ŵϱ�
											   //-> �������� x�� y�� double ���·� ����� �Ǳ⿡ ���߿� �ϳ��� double ����
		}
		return result;
	} //end calc()

	/*
	print()  -> ��¸޼ҵ�� ����� �ʿ� ���� write�� ���������� �Ǳ� ����
	{

	}
	*/



//--------------------------------------------------------------------------------------------------
	
	//���� �� �͵�

	/*
	Scanner sc = new Scanner(System.in);

	public void input() throws IOException
	{
		//this.x=x;
		//this.y=y;
		//this.op=op;
		System.out.print("������ �� ���� �Է�(���� ����) : ");
		x=sc.nextInt();
		y=sc.nextInt();
		System.out.print("������ ������ �Է�(+ - * /) : ");
		op = (char)System.in.read();
	}
	*/
	
	/*//��� 1
	int cal()
	{
		int re = 0;

		switch (op)
		{
			case '+': re=x+y; break;
			case '-': re=x-y; break;
			case '*': re=x*y; break;
			case '/': re=x/y; break;
			default : re = -1;
		
		}
		return re;
	}
	*/
	
	/*//���2
	private int res;
	public void cal()
	{
		if (op=='+')
			res=x+y;
		else if (op=='-')
			res=x-y;
		else if (op=='*')
			res=x*y;
		else if (op=='/')
			res=x/y;
		write(res);
	}
	*/

	/*//��� 3
	private int b;
	int cal()
	{
		if (op=='+')
			b=x+y;
		else if (op=='-')
			b=x-y;
		else if (op=='*')
			b=x*y;
		else if (op=='/')
			b=x/y;
		return (b);
	}
	*/
	
	
}

//main() �޼ҵ带 �����ϰ� �ִ� �ܺ��� �ٸ� Ŭ����
public class Test113
{
	public static void main(String[] args) throws IOException
	{
		Bclass ob = new Bclass();
		
		//ob.input();    -> void�� ��ȯ�޼ҵ带 �����ϸ� �̷��� �ϸ� �ȴ�.
		
		/*//1��
		boolean resp = ob.input();

		if (resp!=true)
		{
			System.out.println("Error...");
			return;                           //-> ���α׷� ����
		}
		*/
		/*//2��
		boolean resp = ob.input();

		if (!resp) //!resp == resp!=true
		{
			System.out.println("Error...");
			return;                           //-> ���α׷� ����
		}
		*/
		//3��
		if (!ob.input()) //!resp == resp!=true
		{
			System.out.println("Error...");
			return;                           //-> ���α׷� ����
		}
		// 1��, 2��, 3�� �� ����.

		double result = ob.calc();
		ob.write(result);

//--------------------------------------------------------------------------------------------------------------------
		
		//���� �� �͵�

		//Bclass ob = new Bclass();//Bclass�� ������� �ؼ� ���α׷� �ۼ�

		//ob.input();
		
		//���2�� �� ���� �̷���
		//ob.cal();  
		
		//���3�� �� ���� �Ʒ� �ΰ�
		//int res = ob.cal();
		//ob.write(res);
	}
}