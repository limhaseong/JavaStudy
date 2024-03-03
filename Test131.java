/*=================================
���� �ڹ��� �ֿ�(�߿�) Ŭ���� ����
- �ڹٿ��� �⺻������ �����ϴ� �ֿ� Ŭ������
- Wrapper Ŭ����
=================================*/

public class Test131
{
	public static void main(String[] args)
	{
		boolean bi = true;
		Boolean wrapBi = new Boolean(bi); //�ν��Ͻ� ���� ����
		Boolean wBi = bi;                 //���� �ڽ�

		int n = 30;                       //int ���� ��ü ���� �Ұ��� �ϴ�.
		Integer wrapN = new Integer(n);
		int n2 = wrapN;                   //���� ��ڽ��� ���� ����

		float f = 300.3f;                
		//        -----
		// 300.3 �̶�� ���� double ���̶� �ȵ�
		Float wrapF = new Float(f);

		System.out.println(wrapBi.toString());
		System.out.println(wrapN.toString());
		System.out.println(wrapF.toString());
		//                       ------------
		//                     Object�� -> ���ڿ��� ����ϱ⿡ ���� �ؽ��ڵ�� ���;� �ǰ����� �������� �ڸ����� �������̵��� ��.
		//true
		//30
		//300.3

		System.out.println(wrapBi);
		System.out.println(wrapN);
		System.out.println(wrapF);
		//true
		//30
		//300.3

		//Integer Ŭ����
		String sn = "12";
		int ni = Integer.parseInt(sn);
		System.out.printf("ni : %3d\n", ni);
		//ni :  12

		ni = Integer.parseInt("0101", 2);
		System.out.printf("ni : %3d\n", ni);
		//ni :   5
		// 2���� ���� ����

		ni = Integer.parseInt("12", 8);
		System.out.printf("ni : %3d\n", ni);
		//ni :  10
		//8���� ����

		ni = Integer.parseInt("A", 16);
		System.out.printf("ni : %3d\n", ni);
		//ni :  10
		//16���� ����

		//toxxx() �� ������ ��ȯ�ϴ� �޼ҵ��� �����ϸ� ��. isxxx() �޼ҵ�� �̰����� �ƴ��� Ȯ���ϴ� �޼ҵ��� �����ϸ��.

		sn = Integer.toBinaryString(20);          //static�� �پ��ִ� �޼ҵ�
		System.out.printf("sn : %3s\n", sn);
		//sn : 10100
		//2���� ���ڿ��� ��ȯ

		sn = Integer.toOctalString(31);
		System.out.printf("sn : %3s\n", sn);
		//sn :  37
		//10������ 8������ ��ȯ

		sn = Integer.toHexString(31);
		System.out.printf("sn : %3s\n", sn);
		//sn :  1f
		//16����

		Integer num = new Integer(50);
		System.out.println("num.toString() : " + num.toString());
		//                                       ---
		//                                       int��
		//                                       ----------------
		//                                           ���ڿ���
		//num.toString() : 50  //���ڿ� String Ÿ����

		int n3 = 345;
		Integer n4 = Integer.valueOf(n3);             //static�� �پ��ִ� �޼ҵ�
		//                           ---
		//                         ��������
		//Integer.valueOf(n3); ��ü�� Integer Ÿ���� 345
		System.out.println("n4 : " + n4);    //->IntegerŸ��
		//n4 : 345
		//toString()�� �������̵� �Ǿ 345�� ���� ��, �������̵��� �����ٸ� �ؽ��ڵ� ����.


	}
}