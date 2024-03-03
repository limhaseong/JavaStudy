/*=================================
���� ���� ó��(Exception Handling) ����
=================================*/

/*
- ���α׷����� �߻��ϴ� ����(Error)��
	: 1. �߸��� ������ ����ϰų� ���� ���� ���� ���� ���� ���¿���
	     ��������ν� ������ �ܰ迡�� �߻��ϴ� �������� ����(Error)��

	  2. ���α׷��� �����ϴ� �������� �߻��ϴ� ��Ÿ�� ����(Error)��
	     ���� �� �ִ�.

		 - �����ڰ� ���� �м��� �߸��ϰų� �Ǽ��� ����
		   ������ ����� �������� �Ǵ� ������ ����(Error)��

		 - �ý��� �̻󿡼� �߻��Ǵ� �ý��� ����(Error), �׸���

		 - ���α׷� ���� �� �߻��Ǵ� ���������� ��Ȳ�� �ǹ��ϴ�
		   ���ܻ���(Exception)�� �ִ�.

		   ���� ���
		   -> � ���� 0���� �����ų�...
		   -> �迭�� �����ϴ� �������� ÷�ڸ� ����� ��Ȳ�� �߻��ϰų�...
		   -> �������� �ʴ� ������ �����Ͽ� �о���δٰų�...

	  --> �����ڰ� �̷� ���ܻ����� �߻��� ��� �̸� �����Ͽ�
	      ������ �����ϱ� ���� ������ �����ϵ��� ������ ������ ���� ��.
		  ��. ��. ó. ��!

- ������ ���� ���� (Exception Ŭ����)
	: 1. ���ܴ� ���α׷� ���� �߿� �߻��� �� �ִ�
	     ��ɾ��� �������� �帧�� �����ϴ� �̺�Ʈ��
		 �ڹٿ��� ���ܴ� �ϳ��� ������Ʈ(Object, ��ü)�̴�. //�߿�!

	  2. ���α׷� ���� �߿� �޼ҵ� �ȿ��� ����(Error)�� �߻��ϰ� �� ���,
	     �޼ҵ�� �� ������ �ش��ϴ� ���� ������Ʈ�� �����
		 �װ��� �ڹ� ��Ÿ�� �ý���(Runtime System)�� ������ �ش�.

	  3. �ڹٿ����� ��� ���� Ŭ������ Throwable Ŭ������
	     Throwable Ŭ������ ���� Ŭ������ ��ӹ޾� ����Ѵ�.

	  4. Throwable Ŭ������ ���ܸ� �����ϴ� �����̳�
	     ���ܰ� �߻��� ���� ���α׷� ���¿� ���� ������ �����ϰ� �ִ�.

	  5. Throwable Ŭ�������� �Ļ��� Ŭ����
	     
		 - Exception Ŭ����
			: Exception ���� Ŭ������ �Ϲ������� ���α׷��ӿ� ����
			  ������ �� �ִ� ���� ��������
			  �޼ҵ尡 ���� �߿� ������ ���ܸ� ����Ų��.
		
		 - Error Ŭ����
		 	: �ɰ��� ������ ���·� �����ڰ� ������ �� ���� ������ �����̴�.

- ������ ����
	: 1. checked exception
		: �޼ҵ� ������ ���ܰ� �߻��� ���
		  �޼ҵ带 ������ �� throws ���� �޼ҵ� ������ �߻��� �� �ִ�
		  ���ܵ��� ����� �ְų� �Ǵ� �� ���ܸ� try-catch �ؼ�
		  ó���� �־�߸� �ϴ� �����̴�.
		  �����Ϸ��� ������ �ϴ� �������� checked exception ��
		  throws �Ǵ°��� ���� Ȥ�� try-catch �Ǵ����� ���θ� �Ǵ��Ͽ�
		  ���α׷����� ���ܸ� � ������ε� ó������ ������
		  ������ ��ü�� �Ұ����ϴ�.

	  2. unchecked exception
	  	: ������ ó������ �ʾƵ� �����Ϸ��� üũ���� �ʴ�
		  ��Ÿ�� �ÿ� �߻��� �� �ִ� �����̴�.

- java.lang.Throwable Ŭ������ �ֿ� �޼ҵ�
	: 1. String toString()                                        //Object�� toString()
		: Throwable ������ ���� ������ ���ڿ� ���·� ��ȯ�Ѵ�.
		  - void printStackTrace(PrintStream s)
		  - void printStackTrace(PrintWriter w)
			: ǥ�� ��� ��Ʈ���� ���� ȣ�� ����� ������ �޼ҵ���� ����Ѵ�.

- �ֿ� ��Ÿ�� ���� Ŭ����
	: 1. ArithmeticException
		: ��ġ ������ ����(0���� ������ ��)
	  2. ArrayStoreException
		: �迭�� �߸��� ������ ���� �����Ϸ� ���� ��� �߻��ϴ� ����
	  3. IndexOutOfBoundsException
	  	: �迭, ���ڿ�, ���� ��� �ε���(÷��) ������ ��� ��� �߻��ϴ� ����
	  4. ClassCastException
	  	: Ŭ���� ��ȯ�� �߸��� ��� �߻��ϴ� ����
	  5. NullPointerException
		: �� ��ü�� �����ϴ� ���(�ʱ�ȭ ���� ���� ���� ��� ��) �߻��ϴ� ����
	  6. SecurityException
	  	: �ڹ��� ���� ���� ������ �����Ͽ��� ��� �߻��ϴ� ����
							:
							:
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test147
{											
	public static void main(String[] args) // throws IOException -> �� ù��° ������ ����ó�� ��� -> ������ ������ ���Ŀ� ������ ������ � ó�� �Ұ���
	{
		//BufferedReader Ŭ���� �ν��Ͻ� ����
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		//�ֿ� ���� ����
		int a, b, c;
		
		
		/*//�� �ι�° ������ ����ó�� ��� -> ���ܸ� ��Ƴ� ���̱⿡ ���Ŀ� �ٸ� � ó���� �����ϴ�.
		try                   
		{
			System.out.print("ù ��° ���� �Է� :");
			a = Integer.parseInt(br.readLine());
			System.out.print("�� ��° ���� �Է� :");
			b = Integer.parseInt(br.readLine());

			c = a + b;
			System.out.println("��� : " + c);
		}
		catch (IOException e)                 //catch (��Ȳ) -> ��Ȳ�� �߻��ϸ� ĳġ�ض�
		{
			//IOException -> checked exception
			// -> �޼ҵ带 �����ϴ� �������� throws �� ����.
			//    ��Ƴ��ų� ������ ���� ��� ������ ���� �߻�.
			System.out.println(e.toString());
		}
		*/

//----------------------------------------------------------------------------------------------------------------
		
		/*//�鼼��° ������ ����ó�� ���
		try                   
		{
			System.out.print("ù ��° ���� �Է� :");
			a = Integer.parseInt(br.readLine());
			System.out.print("�� ��° ���� �Է� :");
			b = Integer.parseInt(br.readLine());

			c = a + b;
			System.out.println("��� : " + c);
		}
		catch (IOException e)                 //catch (��Ȳ) -> ��Ȳ�� �߻��ϸ� ĳġ�ض�
		{
			//IOException -> checked exception
			// -> �޼ҵ带 �����ϴ� �������� throws �� ����.
			//    ��Ƴ��ų� ������ ���� ��� ������ ���� �߻�.
			System.out.println(e.toString());
		}
		catch (NumberFormatException e)                 //�����Է��� ���� �ʰ� abc�� ���� ���� �Է����� �� �߻��ϴ� unchecked exception ����
		{
			//NumberFormatException -> unchecked exception
			//unchecked exception -> ��Ÿ�� �� �߻��� �� �ִ� ���ܷ�
			//                       �ݵ�� ���� �ʿ䵵, ��Ƴ� �ʿ䵵 ���� ����.
			//                       ����, ������ ó���� ������ ������ �������� �������� ����.
			System.out.println(e.toString());
			//java.lang.NumberFormatException: For input string: "a"
			System.out.println(">> ���� ������ �����͸� �Է��ؾ� �մϴ�.");
			//>> ���� ������ �����͸� �Է��ؾ� �մϴ�.
		}
		*/

//--------------------------------------------------------------------------------------------------------------------------
		
		/*//��׹�° ������ ����ó�� ���
		try                   
		{
			System.out.print("ù ��° ���� �Է� :");
			a = Integer.parseInt(br.readLine());
			System.out.print("�� ��° ���� �Է� :");
			b = Integer.parseInt(br.readLine());

			c = a + b;
			System.out.println("��� : " + c);
		}

		catch (Exception e)                      //��ĳ����
		{
			System.out.println(e.toString());
			System.out.println(e.getMessage());
			//java.lang.NumberFormatException: For input string: "a"
			//For input string: "a"
			System.out.println("printStackTrace...............");
			e.printStackTrace();
			//java.lang.NumberFormatException: For input string: "a"
			//at java.lang.NumberFormatException.forInputString(NumberFormatException.java:65)
			//at java.lang.Integer.parseInt(Integer.java:580)
			//at java.lang.Integer.parseInt(Integer.java:615)
			//at Test147.main(Test147.java:168)
		}
		*/

//-----------------------------------------------------------------------------------------------------
		
		//����ó�� ����� �ƴ� finally �˾ƺ��� ���� �ǽ�
		try                   
		{
			System.out.print("ù ��° ���� �Է� :");
			a = Integer.parseInt(br.readLine());
			System.out.print("�� ��° ���� �Է� :");
			b = Integer.parseInt(br.readLine());

			c = a + b;
			System.out.println("��� : " + c);
		}

		catch (Exception e)                      //��ĳ����
		{
			System.out.println(e.toString());
			System.out.println(e.getMessage());
			//java.lang.NumberFormatException: For input string: "a"
			//For input string: "a"
			System.out.println("printStackTrace...............");
			e.printStackTrace();
			//java.lang.NumberFormatException: For input string: "a"
			//at java.lang.NumberFormatException.forInputString(NumberFormatException.java:65)
			//at java.lang.Integer.parseInt(Integer.java:580)
			//at java.lang.Integer.parseInt(Integer.java:615)
			//at Test147.main(Test147.java:168)
		}
		finally
		{
			//���ܰ� �߻��ϰų� �߻����� �ʰų� ������ ����Ǵ� ����
			System.out.println("��� �����̽��ϴ�. �����մϴ�.");
		}

	}
}