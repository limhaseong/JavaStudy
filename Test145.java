/*=================================
■■■ 자바의 주요(중요) 클래스 ■■■
- 자바에서 기본적으로 제공하는 주요 클래스들
- Math 클래스
=================================*/

/*
- java.lang.Math 클래스는
  수학(Mathmatics)과 관련된 유용한 속성과 메소드를 제공하는 클래스로
  생성자가 있긴 하지만... private으로 선언되어 있기 때문에
  외부에서 객체(인스턴스)를 생성할 수 없다.
  단, 모든 메소드가 static으로 정의되어 있으므로
  객체를 생성하지 않고 바로 접근하여 사용하는 것이 가능하다.

- java.lang.Math 클래스의 주요 상수 및 메소드
	: 1. public static final double E = 2.71...;
	     -> 자연 로그 상수
	
	  2. public static final double PI = 3.141592...;
	     -> 원주율(π)    //ㅎ+한자
		 
      3. public static final double sin(double a)
	  4. public static final double cos(double a)
	  5. public static final double tan(double a)
	     ->sin(a), cos(a), tan(a) 값을 반환한다. (삼각함수)

	  6. public static final double asin(double a)
	  7. public static final double acos(double a)
	  8. public static final double atan(double a)
	     ->asin(a), acos(a), atan(a) 값을 반환한다. (삼각함수와 역함수)

	  9. public static double toRadians(double angdeg)
	     -> 각도(angdeg)를 라디언(radian)으로 바꾸어 반환한다.
	  
	 10. public static double toDegrees(double angdeg)
	     -> 라디언(angdeg)을 각도(degree)로 바꾸어 반환한다.

	 11. public static double exp(double a)
	     -> e의 a승을 구하여 반환한다.

	 12. public static double log(double a)
	     -> 로그(log) 값을 구하여 반환한다.

	 13. public static double sqrt(double a)
	     -> a의 제곱근을 구하여 반환한다.
	
	 14. public static double cell(double a)
	     -> a보다 크거나 같은 정수를 반환한다.(올림의 개념)

	 15. public static double floor(double a)
	     -> a보다 작거나 같은 정수를 반환한다.(절삭의 개념)

	 16. public static double pow(double a)
	     -> a의 b승을 구하여 반환한다.

	 17. public static int round(float a)
	 18. public static long round(double a)
		 -> a를 반올림하여 결과값을 반환한다.
	 
	 19. public static double random()
	     -> 0.0 - 1.0 사이의 난수(임의의 실수)를 발생시켜 반환한다.
*/

public class Test145
{
	public static void main(String[] args)
	{
		System.out.println("원주율 : " + Math.PI);
		System.out.println("2의 제곱근 : " + Math.sqrt(2));
		//원주율 : 3.141592653589793
		//2의 제곱근 : 1.4142135623730951

		System.out.println("파이에 대한 Degree : " + Math.toDegrees(Math.PI));
		System.out.println("2파이에 대한 Degree : " + Math.toDegrees(2.0*Math.PI));
		//파이에 대한 Degree : 180.0
		//2파이에 대한 Degree : 360.0
		
		//각도를 라디언으로 반환
		double radian45 = Math.toRadians(45);

		System.out.println("각도 45 : " + radian45);
		System.out.println("싸인 45 : " + Math.sin(radian45));
		System.out.println("코싸인 45 : " + Math.cos(radian45));
		System.out.println("탄젠트 45 : " + Math.tan(radian45));
		//각도 45 : 0.7853981633974483
		//싸인 45 : 0.7071067811865475
		//코싸인 45 : 0.7071067811865476
		//탄젠트 45 : 0.9999999999999999

		System.out.println("로그 25 : " + Math.log(25));
		//로그 25 : 3.2188758248682006

		System.out.println("2의 4승 : " + Math.pow(2, 4));
		//2의 4승 : 16.0

		System.out.println("0.0 -> 1.0 사이의 난수 : " + Math.random());
		//0.0 -> 1.0 사이의 난수 : 0.8686171977427268
		//0.0 -> 1.0 사이의 난수 : 0.5763382530461283
		//0.0 -> 1.0 사이의 난수 : 0.2768396507792883
		//0.0 -> 1.0 사이의 난수 : 0.6161318846934455
		//0.0 -> 1.0 사이의 난수 : 0.7098691356655734










	}
}