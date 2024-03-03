/*=================================
■■■ 배열 ■■■
- 배열의 선언과 초기화
- 배열의 기본적 활용
=================================*/

// 사용자로부터 인원수를 입력받고
// 입력받은 인원 수 만큼의 학생 이름과 전화번호를 입력 받아
// 이렇게 입력받은 데이터를 이름 배열과 전화번호 배열로 구성하여
// 결과를 출력할 수 있는 프로그램을 구현한다.

// 실행 예)
// 입력 처리할 학생 수 입력(명, 1~10) : 27
// 입력 처리할 학생 수 입력(명, 1~10) : -5
// 입력 처리할 학생 수 입력(명, 1~10) : 3
// 이름 전화번호 입력[1](공백 구분) : 임하성 010-1234-1234
// 이름 전화번호 입력[2](공백 구분) : 임하성 010-1234-1234
// 이름 전화번호 입력[3](공백 구분) : 임하성 010-1234-1234

//-----------------------
// 전체 학생 수: 3
//-----------------------
//  이름     전화번호
// 임하성   010-1234-1234
// 임하성   010-1234-1234
// 임하성   010-1234-1234
//------------------------
//계속하려면 아무 키나 누르세요...

import java.util.Scanner;

public class Test082
{
	public static void main(String[] args) 
	{
		/*
		Scanner sc = new Scanner(System.in);
		
		int a;

		do
		{
			System.out.print("입력 처리할 학생 수 입력(명, 1~10) : ");
			a = sc.nextInt();
		}
		while (a<=0 || a>11);
		
		String[] str1 = new String[a];
		String[] str2 = new String[a];


		for (int i=0; i<a; i++)
		{
			System.out.printf("이름 전화번호 입력[%d](공백 구분) : ", (i+1));
			String name = sc.next();
			String num = sc.next();

			str1[i]=name;
			str2[i]=num;
		}

		System.out.println("------------------------------");
		
		System.out.printf("전체 학생 수 : %d\n", a);

		System.out.println("------------------------------");

		System.out.println("이름 전화번호");
		for (int i=0; i<a; i++)
		{
			System.out.println(str1[i] + "      " + str2[i]);
		}
		System.out.println("------------------------------");
		*/

//------------------------------------------------------------------------------------

		//Scanner 인스턴스 생성
		Scanner sc = new Scanner(System.in);

		//사용자가 입력하는 학생 수를 담아낼 변수
		int member = 0;
		
		do
		{
			System.out.print("입력 처리할 학생 수 입력(명, 1~10) : ");
			member = sc.nextInt();
		}
		while (member<1 || member>10);
		
		//테스트
		//System.out.println("사용자가 입력한 인원 수 : " + member);

		//사용자가 입력한 인원 수를 토대로
		//이름 배열과 전화번호 배열을 생성해야 한다.

		//인원 수 만큼의 이름 저장 배열 구성
		String[] name = new String[member];

		//인원 수 만큼의 전화번호 저장 배열 구성
		String[] num = new String[member];
		//String[] num = new String[name.length];//이것도 가능.

		//이름 전화번호 입력[%d](공백 구분) :
		//인원 수 만큼의 안내 메세지 출력 및 입력값 담아내기
		for (int i=0; i<name.length; i++)    //i<num.length도 가능 i<member 도 가능
		{
			System.out.printf("이름 전화번호 입력[%d](공백 구분) : ", (i+1));

			// ㅇㅇㅇ 1010310
			// ------
			name[i] = sc.next();

			// ㅇㅇㅇ 1010310
			num[i] = sc.next();
		}

		//최종 결과(이름, 전화번호) 출력
		System.out.println();
		System.out.println("------------------------------");
		System.out.printf("전체 학생 수 : %d명\n", member);
		//member == name.length == num.length
		System.out.println("------------------------------");

		System.out.println("이름      전화번호");

		//학생 리스트 출력 -> 반복문 구성
		for (int i=0; i<member; i++)
		{
			System.out.printf("%3s %10s\n", name[i], num[i]);
		}
		System.out.println("------------------------------");





		

	}
}