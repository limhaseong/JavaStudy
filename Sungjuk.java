/*=================================
■■■ 클래스와 인스턴스 ■■■
- 클래스와 인스턴스 활용
=================================*/

//Test101.java와 같이 보기

// 2. Sungjuk 클래스
// 인원수를 입력받아
// 입력받은 인원 수 만큼 이름, 국어점수, 영어점수, 수학점수를 입력받고
// 총점과 평균을 산출하는 클래스로 설계할것
// 속성 : 인원수, Record 타입의 배열 (변수 2개)
// 기능 : 인원수 입력, 상세 데이터 입력, 총점 및 평균 연산, 결과 출력 (메소드 4개)

import java.util.Scanner;

public class Sungjuk
{
	//주요 속성 구성
	int inwon;                // 인원수
	Record[] rec;             // Record 타입의 배열(학생 한 명당 Record배열 방 한 개 활용)
							  // 배열을 생성하는 것과 객체를 생성하는 것은 다름(배열을 생성한다고 객체가 생성되지 않음)
							  // Record 를 기반으로 생성된 객체만 담아낼 수 있는 배열

	//주용 기능 구성
	// 1. 인원 수 입력
	public void set()
	{
		Scanner sc = new Scanner(System.in);

		do
		{
			System.out.print("인원 수 입력(1-100) : ");
			inwon = sc.nextInt();
		}
		while (inwon<1 || inwon>100);

		rec = new Record[inwon];
		//Record 클래스를 기반으로 생성된 객체(인스턴스)를 담을 수 있는
		//배열방을 inwon만큼 생성한 것일 뿐
		//Record 클래스와 인스턴스를 생성한 것은 아니다.
		//rec = new Record[inwon]; 배열을 생성한 구문
		//Record ob = new Record(); 인스턴스 생성한 구문
	}

	// 2. 상세 데이터 입력 + 3. 총점 및 평균 연산
	public void input()
	{
		Scanner sc = new Scanner(System.in);
		String[] subTitle = {"국어 점수 : ", "영어 점수 : ", "수학 점수 : "};

		//인원 수 만큼 반복 -> 인원수에 기반하여 만들어진 배열의 길이만큼 반복
		for (int i=0; i<rec.length; i++) //for (int i=0; i<inwon; i++)랑 같은 말
		{
			//Record 클래스 기반의 인스턴스 생성이 제일 먼저!
			//Record ob = new Record();
	   //이런 타입 변수 -------------
					// 실제 인스턴스가 생성되는 구문
			//rec[i]=ob; 아래와 같음.
			rec[i]=new Record();
			
			System.out.printf("%d번째 학생의 이름 입력 : ", (i+1));
			rec[i].name = sc.next();
			
			/*
			System.out.print("국어점수 : ");
			rec[i].score[0] = sc.nextInt();
			System.out.print("영어점수 : ");
			rec[i].score[1] = sc.nextInt();
			System.out.print("수학점수 : ");
			rec[i].score[2] = sc.nextInt();
			*/  //String으로 받아내도 되기에 위에 String으로 배열선언

			for (int j=0; j<subTitle.length; j++)
			{
				//안내 메세지 출력
				System.out.print(subTitle[j]);
				rec[i].score[j] = sc.nextInt();

				//국어, 영어, 수학 점수 데이터를 반복적으로 입력받는 동안
				//총점에 대한 누적 산출
				rec[i].tot+=rec[i].score[j];
			}
			
			// 평균 산출하기
			rec[i].avg = rec[i].tot / 3.0;

		}//end outer for
	}//end input

	// 4. 결과 출력
	public void print()
	{
		//내부 석차 산출 메소드 호출
		ranking();//성적이라는 클래스 안에 있고 static이 아니기에 부를 수 있음.

		//개행
		System.out.println();

		//학생 한 명 당 반복 출력 구문 구성
		//for (int i=0; i<inwon; i++) 아래와 같은 뜻
		for (int i=0; i<rec.length; i++)
		{
			//이름 출력
			System.out.printf("%5s", rec[i].name);

			//성적(국어, 영어, 수학) 반복 출력
			for (int j=0; j<3; j++)
			{
				System.out.printf("%4d", rec[i].score[j]);
			}

			//총점, 평균 출력
			System.out.printf("%5d", rec[i].tot);
			System.out.printf("%8.2f", rec[i].avg);

			//+석차 산출 추가
			System.out.printf("%4d", rec[i].rank);
			
			// 개행
			System.out.println();
		}

	}
	
	// + 5. 석차 산출
	// -> 산출 과정에서 연산에 필요한 데이터가 이미 존재하는 상황->매개변수 넘겨줄 필요 없음
	// 연산에 필요한 데이터란 평균.
	// Record배열의 rank속성에 연산결과 대입 기능 수행 -> 반환 자료형 void
	// 클래스 내부에서 활용할 메소드로 정의 -> 접근제어 지시자 private
	private void ranking()
	{
		//모든 학생들의 등수(석차, rank)를 1로 초기화
		for (int i=0; i<inwon; i++)
		{
			rec[i].rank=1;
		}

		//등수 산출 -> 입력인원이 5명이라고 가정하면
		for (int i=0; i<inwon-1; i++)                    //웅~ -> 비교 기준 ->     0    1    2    3
		{
			for (int j=i+1; j<inwon; j++)                //숑숑숑~ -> 비교 대상 ->1234  234  34    4
														 //0이 비교 기준이면 1부터 시작이기 때문에 i+1이고 j<inwon인것은 끝까지 계산 해봐야 되기 때문.
			{
				if (rec[i].avg>rec[j].avg)    //비교 기준의 평균이 비교 대상의 평균보다 크다면
				{
					//비교대상의 rank를 1만큼 증가
					rec[j].rank++;
				}
				else if (rec[j].avg > rec[i].avg) //비교 대상의 평균이 비교 기준의 평균보다 크다면
				{
					//비교기준의 rank을 1만큼 증가
					rec[i].rank++;
				}
			}
		}



	}








//------------------------------------------------------------------------

	/*//해결 못함
	Scanner sc = new Scanner(System.in);
	Record rec=new Record();

	void input()
	{
		do
		{
			System.out.print("학생 수(1-100) : ");
			rec.a = sc.nextInt();
		}
		while (rec.a<1 || rec.a>100);
	}

	void data()
	{
		for (int i=0; i<rec.a; i++)
		{
			System.out.printf("%d번째 학생의 이름 입력 : ", (i+1));
			rec.name[i] = sc.next();
			System.out.print("국어점수 : ");
			rec.score[0] = sc.nextInt();
			System.out.print("영어점수 : ");
			rec.score[1] = sc.nextInt();
			System.out.print("수학점수 : ");
			rec.score[2] = sc.nextInt();

			rec.tot += rec.score[0]+rec.score[1]+rec.score[2];
			rec.avg=rec.tot/3.0;
		}
	}

	void tott()
	{
		for (int i=0; i<rec.a; i++)
		{
			System.out.printf("%3s %d %d %d %d %.2f", rec.name, rec.score[0], rec.score[1], rec.score[2], rec.tot, rec.avg);
		}
	}*/
}