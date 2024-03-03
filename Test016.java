/*=================================
■■■ 자바 기본 프로그래밍 ■■■
- 변수와 자료형
- 자바의 기본 입출력 : System.out.printf()
=================================*/

public class Test016
{
	public static void main(String[] args)
	{
		System.out.print("AAA");
		System.out.print("BBB");
		System.out.print("CCC\n");    // \n은 개행
		// -> AAABBBCCC

		System.out.println(); //개행
		//System.out.print();
		//->컴파일 에러 발생

		System.out.printf("123456789");
		System.out.printf("123456789\n");  // \n 은 개행
		System.out.printf("123456789%n");  // %n 도 개행처리가 된다.
		//System.out.printf();
		//->컴파일 에러 발생

		System.out.printf("%d + %d = %d%n", 10, 20, 30);
		//->10 + 20 = 30

		System.out.printf("%d\n", 123);    //123
		System.out.printf("%10d\n", 123);  //10자리를 확보해라(       123)
		System.out.printf("%8d\n", 1234);  //    1234
		System.out.printf("%010d\n", 123);  //0000000123 빈자리가 0으로 채워짐
		
		System.out.printf("%+d\n", 365);  //+365
		System.out.printf("+%d\n", 365);  //+365
		System.out.printf("%d\n", +365);  //365

		//System.out.printf("%-d\n", 365);  //런타임 에러
		System.out.printf("-%d\n", 365);  //-365		
		System.out.printf("%d\n", -365);  //-365

		//System.out.printf("%d\n", 'A');  //런타임 에러 발생
		System.out.printf("%c\n", 'A');  // A, %c에 문자 씀

		//System.out.printf("%c\n", "ABCD"); //런타임 에러 발생
		System.out.printf("%s\n", "ABCD");  //ABCD, %s에 문자열 씀

		System.out.printf("%h\n", 365);  // 16d -> 16진수 형태로 나옴 (%h)
		System.out.printf("%o\n", 24);  // 30 -> 8진수 형태로 나옴(%o)
		
		System.out.printf("%b\n", true);  //boolean형 (%b)
		System.out.printf("%b\n", false);  //boolean형 (%b)

		System.out.printf("%f\n", 123.23);  //float은 6자리 이하, double은 12자리 이하
											//123.230000
											//실수형태 %f
		System.out.printf("%.2f\n", 123.23);  //123.23 ->소수점 이하 두 번째 자리까지 표현한다.
		
		System.out.printf("%.2f\n", 123.231);  //123.23 ->소수점 이하 두 번째 자리까지 표현
												//(소수점 이하 세 번째 자리 절삭)
		
		System.out.printf("%.2f\n", 123.235);  //123.24-> 소수점 이하 두 번째 자리까지 표현
												//(소수점 이하 세 번째 자리 올림)

		System.out.printf("%8.2f\n", 123.236); //총 8자리 확보한다.(소수자리 및 .도 포함하여서)
												//8. = 8자리 확보, .2 = 소수점 이하 두 번째 자리까지 표현
												//  123.24

		System.out.printf("%2.2f\n", 123.236); 
		//해석 순서 - %f -> .2 -> 2.
		//123.24 -> 2.은 이루어질 수 있는 부분이 아니기에 무시됨.
		
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
계속하려면 아무 키나 누르십시오 . . .*/