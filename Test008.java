/*=================================
■■■ 자바의 개요 및 특징 ■■■
- 변수와 자료형
- 변수와 자료형 실습 및 테스트 : char
=================================*/

public class Test008
{
	public static void main(String[] args)
	{
		//주요 변수 선언
		char ch1, ch2, ch3;

		int a;      //----check---!!!


		//연산 및 처리
		ch1 = 'A';
		ch2 = 'B';
		//ch2 = 'BB'; //= 에러
		//ch2 = '대'; //= 에러 안나옴
		//ch3 = 'C';
		ch3 = '\n';   //하나의 개행 문자로 인식함

		//a = 10;  
		//10으로 잘 나옴
		//a = ch1;   //----check---!!!
		//65가 나옴   

		a = (int)ch1;  //----check---!!!
		//명시적 형 변환(강제 형 변환)


		//결과출력
		System.out.println("ch1 : " + ch1);
		System.out.println("ch2 : " + ch2);
		System.out.println("ch3 : " + ch3);
		
		System.out.println("a : " + a);

		//결과출력
		//System.out.printf("ㅇ ㅇ ㅇ ㅇ%n", ch1, ch2, ch3, a);
		System.out.printf("%c %c %c %d%n", ch1, ch2, ch3, a);  //문자형은 %c


	}
}

/* 실행결과
ch1 : A
ch2 : B
ch3 :

a : 65
A B
 65
계속하려면 아무 키나 누르십시오 . . .*/