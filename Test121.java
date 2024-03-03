/*=================================
■■■ 클래스 고급 ■■■
- 인터페이스(Interface)
=================================*/

//실습 문제
// 성적 처리 프로그램을 구현한다.
// 단, 인터페이스를 활용할 수 있도록 한다.

//실행 예)
// 원원 수 입력(1-10) : 11
// 원원 수 입력(1-10) : 0
// 원원 수 입력(1-10) : 2

//1번째 학생의 학번 이름 입력(공백 구분) : 2309123 김다슬
//국어 영어 수학 점수 입력   (공백 구분) : 90 100 85
//2번째 학생의 학번 이름 입력(공백 구분) : 2309125 김동민
//국어 영어 수학 점수 입력   (공백 구분) : 85 70 60

// 2309123 김다슬  90 100 85 총점 평균
//                  수 수 우
// 2309125 김동민  85 70 60  총점 평균
//                 우 미 양
//계속하려면 아무 키나 누르세요...

//90 이상       -> 수
//80이상 90미만 -> 우
//70이상 80미만 -> 미
//60이상 70미만 -> 양
//60미만(그 외) -> 가

import java.util.Scanner;

//속성만 존재하는 클래스 -> 자료형 활용
class Record
{
	String hak, name;        //학번, 이름
	int kor, eng, mat;       //국어, 영어, 수학
	int tot=0;               //총점
	double avg;              //평균
}

//인터페이스
interface Sungjuk
{
	public void set();         //인원 세팅
	public void input();       //데이터 입력
	public void print();       //결과 출력
}

//문제 해결 과정에서 설계해야 할 클래스 -> Sungjuk 인터페이스를 구현하는 클래스
class SungjukImpl implements Sungjuk
{
	private int inwon;
	private Record[] rec;

	@Override
	public void set()
	{
		Scanner sc = new Scanner(System.in);

		do
		{
			System.out.print("인원 수 입력(1-10) : ");
			inwon = sc.nextInt();
		}
		while (inwon<1 || inwon>10);

		rec = new Record[inwon];
	}

	@Override
	public void input()
	{
		Scanner sc = new Scanner(System.in);

		String[] hak = new String[inwon];
		String[] name = new String[inwon];
		int[] kor = new int[inwon];
		int[] eng = new int[inwon];
		int[] mat = new int[inwon];

		for (int i=0; i<name.length; i++)
		{
			rec[i]=new Record();

			System.out.printf("%d번째 학생의 학번 이름 입력(공백 구분) :", (i+1));

			rec[i].hak = sc.next();
			rec[i].name = sc.next();

			System.out.print("국어 영어 수학 점수 입력   (공백 구분) : ");

			rec[i].kor = sc.nextInt();
			rec[i].eng = sc.nextInt();
			rec[i].mat = sc.nextInt();

			rec[i].tot+=rec[i].kor+rec[i].eng+rec[i].mat;

			rec[i].avg = rec[i].tot / 3.0;
		}

		
	}

	@Override
	public void print()
	{
		System.out.println();
		
		for (int i=0; i<rec.length; i++)
		{
		
			System.out.printf("%2s\n %2s %2d %2d %2d %2d %4.2f\n", rec[i].hak, rec[i].name, rec[i].kor, rec[i].eng, rec[i].mat, rec[i].tot, rec[i].avg);
			System.out.printf("%9s %s %s", panjung(rec[i].kor), panjung(rec[i].eng), panjung(rec[i].mat));


			// 개행
			System.out.println();
		}
	}

	//내부적으로 등급에 대한 판정을 수행할 메소드
	private String panjung(int score)
	{
		String pan;

		if (score>=90)
			pan="수";
		else if (score>=80)
			pan="우";
		else if (score>=70)
			pan="미";
		else if (score>=60)
			pan="양";
		else
			pan="가";
		return pan;
	}
}

//main()메소드를 포함하는 외부의 다른 클래스
public class Test121
{
	public static void main(String[] args)
	{
		Sungjuk ob = new SungjukImpl();

		//문제 해결 과정에서 작성해야 할 ob 구성 및 객체 생성
		
		ob.set();
		ob.input();
		ob.print();
	}
}

/*
실행결과
인원 수 입력(1-10) : 2
1번째 학생의 학번 이름 입력(공백 구분) :202309123 김다슬
국어 영어 수학 점수 입력   (공백 구분) : 90 100 85
2번째 학생의 학번 이름 입력(공백 구분) :202309125 김동민
국어 영어 수학 점수 입력   (공백 구분) : 85 70 60

202309123
 김다슬 90 100 85 275 91.67
        수 수 우
202309125
 김동민 85 70 60 215 71.67
        우 미 양
*/