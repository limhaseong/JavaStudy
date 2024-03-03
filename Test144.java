/*=================================
■■■ 자바의 주요(중요) 클래스 ■■■
- 자바에서 기본적으로 제공하는 주요 클래스들
- Calendar 클래스(추상 클래스)
=================================*/

// - 오늘을 기준으로 입력받는 날짜만큼 후의 연, 월, 일, 요일을
//   확인하여 결과를 출력하는 프로그램을 구현한다.

// 실행 예)
// 오늘 날짜 : 2023-9-19 화요일
// 몇 일 후의 날짜를 확인하고자 하십니까? : 200

// ============[확인 결과]============
// 200일 후 : xxxx-xx-xx x요일
// ===================================
// 계속하려면 아무 키나 누르세요...

// Calendar 와 관련한 API Document 참조~
// add()
// 현재 날짜를 기준으로 날 수 더하는 연산 메소드
//  -> 객체(날짜 객체).add(Calendar.DATE, nalsu)

import java.util.Scanner;
import java.util.Calendar;

public class Test144
{
	public static void main(String[] args)
	{
		//Scanner 인스턴스 생성
		Scanner sc = new Scanner(System.in);
		
		//Calendar 인스턴스 생성
		Calendar now = Calendar.getInstance();

		//주요 변수 선언
		int nalsu;      //사용자로부터 입력받은 날 수
		int y,m,d,w;    //연, 월, 일, 요일
		String[] week = {"일요일", "월요일", "화요일", "수요일", "목요일", "금요일", "토요일"};

		//현재의 연, 월, 일, 요일 확인(-> 가져오기 : get())
		y = now.get(Calendar.YEAR);
		m = now.get(Calendar.MONTH) + 1;     // +1 check~
		d = now.get(Calendar.DATE);
		w = now.get(Calendar.DAY_OF_WEEK);

		//현재의 연, 월, 일, 요일 확인결과 출력
		System.out.println("오늘 날짜 : " + y + "-" + m + "-" + d + " " + week[w-1]);
		//오늘 날짜 : 2023-9-19 화요일

		do
		{
			System.out.print("몇 일 후의 날짜를 확인하고자 하십니까? : ");
			nalsu = sc.nextInt();
		}
		while (nalsu<1);
		
		now.add(Calendar.DATE, nalsu);    //nalsu를 while 안해줬으면 음수도 가능함

		//결과 출력
		System.out.println();
		System.out.println("============[확인 결과]============");
		System.out.printf("%d일 후 : %tF %tA\n", nalsu, now, now);
		System.out.println("===================================");

		//String.format("%tF", 달력객체); -> System.out.printf랑 사용법이 같지만 출력은 안하고 문자열을 반환함.
		//->년-월-일 형태의 문자열 반환
		//%t = 날짜 객체의 값이 들어온다고 보면 됨

		//Stirng.format("%tA", 달력객체)
		//요일 형태의 문자열 반환

//------------------------------------------------------------------------------------------------------------------------------

		/*
		Scanner sc = new Scanner(System.in);

		Calendar cal = Calendar.getInstance();

		int input;

		int y = cal.get(Calendar.YEAR);
		int m = cal.get(Calendar.MONTH) + 1;
		int d = cal.get(Calendar.DATE);
		int w = cal.get(Calendar.DAY_OF_WEEK);

		String week = "";
		switch (w)
		{
			case 1 : week = "일요일"; break;
			case 2 : week = "월요일"; break;
			case 3 : week = "화요일"; break;
			case 4 : week = "수요일"; break;
			case 5 : week = "목요일"; break;
			case 6 : week = "금요일"; break;
			case 7 : week = "토요일"; break;
		}
		
		System.out.println("오늘 날짜 : " + y + "-" + m + "-" + d + " " + week);

		System.out.print("몇 일 후의 날짜를 확인하고자 하십니까? : ");
		input = sc.nextInt();

		cal.add(Calendar.DAY_OF_MONTH, input);
		y = cal.get(Calendar.YEAR);
		m = cal.get(Calendar.MONTH) + 1;
		d = cal.get(Calendar.DATE);
		w = cal.get(Calendar.DAY_OF_WEEK);

		switch (w)
		{
			case 1 : week = "일요일"; break;
			case 2 : week = "월요일"; break;
			case 3 : week = "화요일"; break;
			case 4 : week = "수요일"; break;
			case 5 : week = "목요일"; break;
			case 6 : week = "금요일"; break;
			case 7 : week = "토요일"; break;
		}
		
		System.out.println("============[확인 결과]============");
		System.out.printf("%d일 후 : %d-%d-%d %s\n", input, y, m, d, week);
		System.out.println("===================================");
		*/
	}
}