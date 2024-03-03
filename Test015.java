/*=================================
■■■ 자바 기본 프로그래밍 ■■■
- 변수와 자료형
- 자바의 기본 입출력 : System.in.read()
=================================*/

/*
System.in.read() 메소드는 (입력 대기열로부터) 한 문자만 가져온다.(버퍼드리드는 문자열 가져옴)
단, 입력 받은 하나의 문자를 문자 그대로 가져오는 것이 아니라
ASCII code 값(정수형태)으로 반환하게 된다.(정수형태로 가져온다는 뜻)
*/

//실행 예)
//한 문자 입력 : A
//한 자리 정수 입력 : 9

//-> 입력한 문자 : A
//-> 입력한 정수 : 9
//계속하려면 아무 키나 누르세요...

import java.io.IOException;

public class Test015
{
	public static void main(String[] args) throws IOException
	{
		/*// 주요 변수 선언
		한문자 입력 : A
		-> 입력한 문자 : A
		
		char ch;    //문자형


		// 연산 및 처리
		System.out.print("문자 하나 입력하세요 : ");    //A라고 입력할 시 System.in.read(); = 65라는 숫자임
		ch = (char)System.in.read();                    //65
		//         -----------------
		//           int형태이기 때문에 char형태로 강제로 변환 해야됨
		//System.in.read(); 여기에서 생기는 오류는 자바 밖으로 내보내라고 throws IOException써줌.

		// 결과 출력
		System.out.println(ch);
		*/

		//주요 변수 선언
		char ch;
		int a;

		//변수 추가 선언
		//char temp;     //임시로 테스트할 변수
		
		//연산 및 처리
		System.out.print("문자 하나 입력하세요 : ");
		ch = (char)System.in.read();
		
		//엔터는 \r과 \n이 합쳐진것
		//입력 대기열에 남아있는 \r과 \n을 스킵(건너뛰기)해줘야됨
		System.in.skip(2);
		//매개변수 (2)에 의해 2글자(\r,\n을 건너뜀)를 읽어내지 않고 건너뛴다(버린다.)

		System.out.print("한자리 정수를 입력하세요 : ");
		a = System.in.read();
		//1->49
		//2->50
		//3->51 ...
		//입력받은 a의 값을 48만큼 감소시키는 방법
		a -= 48;

		//temp = (char)System.in.read(); 임시 변수를 활용하여 문자형태로 사용하기 가능.
		//a = System.in.read()-'0'; https://fallingstar.tistory.com/23 - 이것도 됨

		//System.in.read() = 아스키코드를 읽어오기 때문에 다른 값이 나옴
		
		//결과 출력
		System.out.println();  //개행
		System.out.println(">> 입력한 문자 : " + ch);
		//System.out.println(">> 입력한 정수 : " + a);
		//System.out.println(">> 입력한 정수 : " + temp);
		System.out.println(">> 입력한 정수 : " + a);
	}
}

/*실행결과
문자 하나 입력하세요 : a
한자리 정수를 입력하세요 : 3

>> 입력한 문자 : a
>> 입력한 정수 ; 3
계속하려면 아무 키나 누르십시오 . . .*/