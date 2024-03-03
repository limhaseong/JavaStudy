/*=================================
■■■ 만년 달력 ■■■
- 다음과 같은 기능의 프로그램을 구현한다.
=================================*/

//실행 예)
// 연도를 입력하세요 : 2023
// 월을 입력하세요 : 9

/*
    [2023년 9월]

일 월 화 수 목 금 토
====================
                1  2
 3  4  5  6  7  8  9
10 11 12 13 14 15 16
17 18 19 20 21 22 23
24 25 26 27 28 29 30
====================
*/

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class Test105
{
	public static void main(String[] args) throws IOException
	{
		/*//공백만 해결하면 됨
		Scanner sc = new Scanner(System.in);

		int year, month;

		System.out.print("연도를 입력하세요 : ");
		year = sc.nextInt();

		System.out.print("월을 입력하세요 : ");
		month = sc.nextInt();

		String[] str = {"일", "월", "화", "수", "목", "금", "토"};
		int[] months = {31, 0, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

		if (year%4==0 && year%100!=0 || year%400==0)
		{
			months[1]=29;
		}
		else
		{
			months[1]=28;
		}

		
		int n;

		n=(year-1)*365 + (year-1)/4 - (year-1)/100 + (year-1)/400;

		for (int i=0; i<month-1; i++)
		{
			n+=months[i];
		}
		n++;

		System.out.printf("\n[%d년 %d월]\n", year, month);
		System.out.println("  일  월  화  수  목  금  토");
		System.out.println("============================");


		int we=n%7;
		
		for (int i=1; i<=we; i++)
		{
			System.out.print("    ");
		}

		for (int i=1; i<=months[month-1]; i++)
		{
			System.out.printf("%4d ", i);

			we++;

			if (we%7==0)
			{
				System.out.println();
			}
		}
		we++;

		System.out.println();
		System.out.println("============================");
		*/
		


//----------------------------------------------------------------------------------------
		
		/*
		//주요 변수 선언
		int year, month, totalDay, yoil;
		int[] months = {31, 0, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

		Scanner sc = new Scanner(System.in);
		
		//연도 입력
		System.out.print("연도를 입력하세요 : ");
		year = sc.nextInt();
		
		//월입력
		System.out.print("월을 입력하세요 : ");
		month = sc.nextInt();
		
		//총 날짜 계산
		totalDay = (year-1)*365 + (year-1)/4 - (year-1)/100 + (year-1)/400;
		
		if (year%4==0 && year%100!=0 || year%400==0)
		{
			months[1]=29;
		}
		else
		{
			months[1]=28;
		}

		for (int i=0; i<month-1; i++)
		{
			totalDay+=months[i];
		}
		totalDay+=1;
		
		//요일 계산
		yoil=totalDay%7;

		//totalDay(총날짜) %7의 나머지가 0일 1월 2화 3수 4목 5금 6토

		//출력
		System.out.println();
		System.out.printf("\n[%d년 %d월]\n", year, month);
		System.out.println("  일  월  화  수  목  금  토");
		System.out.println("=============================");
		
		//월요일부터 시작해 달의 시작 요일까지 공백 찍기 일요일이면 공백없이 시작
		for (int i=1; i<=yoil; i++)
		{
			System.out.print("    ");
		}
		
		//해당 월의 날짜까지 날짜와 요일을 하루씩 증가시키고 일요일이 되면 개행
		for (int i=1; i<=months[month-1]; i++)
		{
			System.out.printf("%4d", i);

			yoil++;
			
			if (yoil%7==0)
			{
				System.out.println();
			}
		}
		
		//딱 맞게 끝나면 또 개행하니까 개행 방지
		if (yoil%7==0)
		{

		}
		else
		{
			System.out.println();
		}

		System.out.println("=============================");
		*/

//-------------------------------------------------------------------------------------
		
		//BufferedReader 인스턴스 생성
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//배열 선언 및 초기화
		//각 달이 담고 있는 마지막 날짜(매 월의 최대 날짜)
		int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		//배열 인덱스 0    1   2   3   4   5   6   7   8   9  10  11
		//월          1    2   3   4   5   6   7   8   9  10  11  12
		
		//확인
		//System.out.println(days.length);
		//12

		//주요 변수 선언
		int nalsu, y, m, w;   // 날 수, 년, 월, 요일

		do
		{
			System.out.print("연도를 입력하세요 : ");
			y = Integer.parseInt(br.readLine());
		}
		while (y<1);
		//입력받은 연도가 1보다 작을 경우 다시 입력받기

		do
		{
			System.out.print("월을 입력하세요 : ");
			m = Integer.parseInt(br.readLine());
		}
		while (m<1 || m>12);
		//입력 받은 월이 1보다 작거나 12보다 큰 경우 다시 입력 받기

		//여기까지 수행하면 유효한 연도와 월을 사용자로부터 입력 받은 상태

		//입력받은 연도에 해당하는 2월 마지막 날 계산
		if ((y%4==0 && y%100!=0 || y%400==0))   //윤년이라면..
		{
			days[1]=29;
		}
		//else 구문은
		//현재 days 배열의 1번째 요소(2월)가 28일로 구성되어 있는 상태이기 때문에
		//생략이 가능한 구문이 된다.

		//1년 1월 1일 -> 입력받은 연도와 이전 년도 12월 31일 까지의 날 수 계산
		nalsu = (y-1)*365 + (y-1)/4 - (y-1)/100 + (y-1)/400;

		//입력받은 연도(해당 연도) 1월 1일 - 입력한 월의 이전 월까지의 날 수 계산
		for (int i=0; i<m-1; i++)
		{
			nalsu+=days[i];
		}
		
		//입력받은 월의 1일을 날 수 누적 연산
		nalsu+=1;   //++nalsu;

		//---------------------여기까지 수행하면 모든 날 수에 대한 종합 처리 완료
		
		//요일 확인
		//입력받은 연의 입력월의 1일이 무슨 요일인지 확인하기 위한 연산
		w=nalsu%7;
		//w:0 -> 일요일
		//w:1 -> 월요일
		//w:2 -> 화요일
		//w:3 -> 수요일
		//w:4 -> 목요일
		//w:5 -> 금요일
		//w:6 -> 토요일

		//테스트
		//System.out.println("w : " + w);
		//연도를 입력하세요 : 2024
		//월을 입력하세요 : 5
		//w : 3
		//2024년 5월 1일은 수요일(3)이라는 의미

		//------------------------여기까지 수행하면 해당 연도 해당 월의 1일이 무슨 요일인지 확인 완료
		
		//출력(달력 그리기)

		System.out.println();                    //개행
		System.out.printf("\t[ %d년 %d월 ]\n", y, m);  //\t 탭만큼 띄기
		System.out.println();                    //개행
		System.out.println("  일  월  화  수  목  금  토");  //하루 4칸
		System.out.println("============================");

		//특정 요일부터 1일이 출발할 수 있도록 공백 발생(지정)
		for (int i=1; i<=w; i++)
		{
			System.out.print("    ");          //공백 4칸 지정
		}

		//확인
		//System.out.printf("%4d", 1);     //공백 잘 됐나 확인

		//해당 월(입력한 월)의 날짜만 출력될 수 있도록 반복문 구성
		for (int i=1; i<=days[m-1]; i++)
		{
			System.out.printf("%4d", i);
			w++;
			//반복문을 통해 날짜를 처리하는 동안
			//그 만큼의 요일도 함께 증가할 수 있도록 처리

			//일요일을 구성하려는 경우
			//즉, 이번에 출력하고자 하는 날짜가 일요일인 경우
			if (w%7==0)
			{
				System.out.println(); //개행
			}
		}
		
		//달의 마지막 날짜가 출력 형식을 모두 채웠을 경우
		// 즉, 토요일까지 라인 전체 출력이 이루어졌을 경우
		// 이미 일요일 개행이 이루어졌기 때문에
		//이 경우에는 추가 개행이 하지 않도록 처리
		if (w%7!=0)                         //일요일일때는 개행하지마
		{
			System.out.println(); //개행
		}
		System.out.println("============================");

	}
}