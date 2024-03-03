/*=================================
���� �ڹ��� �ֿ�(�߿�) Ŭ���� ����
- �ڹٿ��� �⺻������ �����ϴ� �ֿ� Ŭ������
- Math Ŭ����
=================================*/

/*
- java.lang.Math Ŭ������
  ����(Mathmatics)�� ���õ� ������ �Ӽ��� �޼ҵ带 �����ϴ� Ŭ������
  �����ڰ� �ֱ� ������... private���� ����Ǿ� �ֱ� ������
  �ܺο��� ��ü(�ν��Ͻ�)�� ������ �� ����.
  ��, ��� �޼ҵ尡 static���� ���ǵǾ� �����Ƿ�
  ��ü�� �������� �ʰ� �ٷ� �����Ͽ� ����ϴ� ���� �����ϴ�.

- java.lang.Math Ŭ������ �ֿ� ��� �� �޼ҵ�
	: 1. public static final double E = 2.71...;
	     -> �ڿ� �α� ���
	
	  2. public static final double PI = 3.141592...;
	     -> ������(��)    //��+����
		 
      3. public static final double sin(double a)
	  4. public static final double cos(double a)
	  5. public static final double tan(double a)
	     ->sin(a), cos(a), tan(a) ���� ��ȯ�Ѵ�. (�ﰢ�Լ�)

	  6. public static final double asin(double a)
	  7. public static final double acos(double a)
	  8. public static final double atan(double a)
	     ->asin(a), acos(a), atan(a) ���� ��ȯ�Ѵ�. (�ﰢ�Լ��� ���Լ�)

	  9. public static double toRadians(double angdeg)
	     -> ����(angdeg)�� ����(radian)���� �ٲپ� ��ȯ�Ѵ�.
	  
	 10. public static double toDegrees(double angdeg)
	     -> ����(angdeg)�� ����(degree)�� �ٲپ� ��ȯ�Ѵ�.

	 11. public static double exp(double a)
	     -> e�� a���� ���Ͽ� ��ȯ�Ѵ�.

	 12. public static double log(double a)
	     -> �α�(log) ���� ���Ͽ� ��ȯ�Ѵ�.

	 13. public static double sqrt(double a)
	     -> a�� �������� ���Ͽ� ��ȯ�Ѵ�.
	
	 14. public static double cell(double a)
	     -> a���� ũ�ų� ���� ������ ��ȯ�Ѵ�.(�ø��� ����)

	 15. public static double floor(double a)
	     -> a���� �۰ų� ���� ������ ��ȯ�Ѵ�.(������ ����)

	 16. public static double pow(double a)
	     -> a�� b���� ���Ͽ� ��ȯ�Ѵ�.

	 17. public static int round(float a)
	 18. public static long round(double a)
		 -> a�� �ݿø��Ͽ� ������� ��ȯ�Ѵ�.
	 
	 19. public static double random()
	     -> 0.0 - 1.0 ������ ����(������ �Ǽ�)�� �߻����� ��ȯ�Ѵ�.
*/

public class Test145
{
	public static void main(String[] args)
	{
		System.out.println("������ : " + Math.PI);
		System.out.println("2�� ������ : " + Math.sqrt(2));
		//������ : 3.141592653589793
		//2�� ������ : 1.4142135623730951

		System.out.println("���̿� ���� Degree : " + Math.toDegrees(Math.PI));
		System.out.println("2���̿� ���� Degree : " + Math.toDegrees(2.0*Math.PI));
		//���̿� ���� Degree : 180.0
		//2���̿� ���� Degree : 360.0
		
		//������ �������� ��ȯ
		double radian45 = Math.toRadians(45);

		System.out.println("���� 45 : " + radian45);
		System.out.println("���� 45 : " + Math.sin(radian45));
		System.out.println("�ڽ��� 45 : " + Math.cos(radian45));
		System.out.println("ź��Ʈ 45 : " + Math.tan(radian45));
		//���� 45 : 0.7853981633974483
		//���� 45 : 0.7071067811865475
		//�ڽ��� 45 : 0.7071067811865476
		//ź��Ʈ 45 : 0.9999999999999999

		System.out.println("�α� 25 : " + Math.log(25));
		//�α� 25 : 3.2188758248682006

		System.out.println("2�� 4�� : " + Math.pow(2, 4));
		//2�� 4�� : 16.0

		System.out.println("0.0 -> 1.0 ������ ���� : " + Math.random());
		//0.0 -> 1.0 ������ ���� : 0.8686171977427268
		//0.0 -> 1.0 ������ ���� : 0.5763382530461283
		//0.0 -> 1.0 ������ ���� : 0.2768396507792883
		//0.0 -> 1.0 ������ ���� : 0.6161318846934455
		//0.0 -> 1.0 ������ ���� : 0.7098691356655734










	}
}