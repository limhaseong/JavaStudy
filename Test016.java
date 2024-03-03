/*=================================
���� �ڹ� �⺻ ���α׷��� ����
- ������ �ڷ���
- �ڹ��� �⺻ ����� : System.out.printf()
=================================*/

public class Test016
{
	public static void main(String[] args)
	{
		System.out.print("AAA");
		System.out.print("BBB");
		System.out.print("CCC\n");    // \n�� ����
		// -> AAABBBCCC

		System.out.println(); //����
		//System.out.print();
		//->������ ���� �߻�

		System.out.printf("123456789");
		System.out.printf("123456789\n");  // \n �� ����
		System.out.printf("123456789%n");  // %n �� ����ó���� �ȴ�.
		//System.out.printf();
		//->������ ���� �߻�

		System.out.printf("%d + %d = %d%n", 10, 20, 30);
		//->10 + 20 = 30

		System.out.printf("%d\n", 123);    //123
		System.out.printf("%10d\n", 123);  //10�ڸ��� Ȯ���ض�(       123)
		System.out.printf("%8d\n", 1234);  //    1234
		System.out.printf("%010d\n", 123);  //0000000123 ���ڸ��� 0���� ä����
		
		System.out.printf("%+d\n", 365);  //+365
		System.out.printf("+%d\n", 365);  //+365
		System.out.printf("%d\n", +365);  //365

		//System.out.printf("%-d\n", 365);  //��Ÿ�� ����
		System.out.printf("-%d\n", 365);  //-365		
		System.out.printf("%d\n", -365);  //-365

		//System.out.printf("%d\n", 'A');  //��Ÿ�� ���� �߻�
		System.out.printf("%c\n", 'A');  // A, %c�� ���� ��

		//System.out.printf("%c\n", "ABCD"); //��Ÿ�� ���� �߻�
		System.out.printf("%s\n", "ABCD");  //ABCD, %s�� ���ڿ� ��

		System.out.printf("%h\n", 365);  // 16d -> 16���� ���·� ���� (%h)
		System.out.printf("%o\n", 24);  // 30 -> 8���� ���·� ����(%o)
		
		System.out.printf("%b\n", true);  //boolean�� (%b)
		System.out.printf("%b\n", false);  //boolean�� (%b)

		System.out.printf("%f\n", 123.23);  //float�� 6�ڸ� ����, double�� 12�ڸ� ����
											//123.230000
											//�Ǽ����� %f
		System.out.printf("%.2f\n", 123.23);  //123.23 ->�Ҽ��� ���� �� ��° �ڸ����� ǥ���Ѵ�.
		
		System.out.printf("%.2f\n", 123.231);  //123.23 ->�Ҽ��� ���� �� ��° �ڸ����� ǥ��
												//(�Ҽ��� ���� �� ��° �ڸ� ����)
		
		System.out.printf("%.2f\n", 123.235);  //123.24-> �Ҽ��� ���� �� ��° �ڸ����� ǥ��
												//(�Ҽ��� ���� �� ��° �ڸ� �ø�)

		System.out.printf("%8.2f\n", 123.236); //�� 8�ڸ� Ȯ���Ѵ�.(�Ҽ��ڸ� �� .�� �����Ͽ���)
												//8. = 8�ڸ� Ȯ��, .2 = �Ҽ��� ���� �� ��° �ڸ����� ǥ��
												//  123.24

		System.out.printf("%2.2f\n", 123.236); 
		//�ؼ� ���� - %f -> .2 -> 2.
		//123.24 -> 2.�� �̷���� �� �ִ� �κ��� �ƴϱ⿡ ���õ�.
		
	}
}

/*
AAABBBCCC

123456789123456789
123456789
10 + 20 = 30
123
       123
    1234
0000000123
+365
+365
365
-365
-365
A
ABCD
16d
30
true
false
123.230000
123.23
123.23
123.24
  123.24
123.24
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .*/