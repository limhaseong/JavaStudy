/*=================================
■■■ 자바의 주요(중요) 클래스 ■■■
- 자바에서 기본적으로 제공하는 주요 클래스들
- Random 클래스
=================================*/

/*
- java.lang.Random 클래스는
  여러 형태의 난수를 발생시켜 제공하는 클래스이다.
  Math 클래스의 정적 메소드인 random()메소드도 난수를 제공하는 메소드이지만
  0.0 -> 1.0 사이의 실수 형태만 발생하게 되므로
  필요한 형태의 난수를 만들어내기 위해서는 추가적인 연산을 여러 형태로 수행해야 한다.
  그래서 자바는 여러 형태의 난수를 발생시켜주는
  전용 클래스인 Random 클래스를 별도로 제공하고 있다.
*/

//로또 번호 생성(난수 발생 프로그램)

//프로그램이 시작되면...
//기본적으로 로또 5게임을 수행하는 프로그램을 구현한다.

//실행 예)
//  3 12 15 24 31 41
//  1 12 18 36 41 42
//  4  9 12 13 22 30
//  5 10 13 14 22 40
// 22 31 36 40 43 44
//계속하려면 아무 키나 누르세요...

import java.util.Random;
import java.util.Arrays;

class Lotto
{
	//배열 변수 선언 및 메모리 할당 -> 로또 번호를 담아둘 배열방 6칸
	private int[] num;

	//생성자
	Lotto()
	{
		num = new int[6];
	}

	//getter
	public int[] getNum()
	{
		return num;
	}
	
	//6개의 난수를 발생시키는 메소드 정의
	public void start()
	{	
		//Random 인스턴스 생성
		Random rd = new Random();

		//방법1
		int n;
		int cnt = 0;
		
		//라벨을 만들어서 사용(라벨)
		//변수명이기에 run 말고 자유롭게 쓰기 가능
		run:  //세미콜론 ; 이 아니라 콜론 : 임.
		// - goto 문 -> 묻지도 따지지도 말고 가라고 한 곳으로 가.(처음에는 개발자를 편하게 하려고 만들었지만 불편)
		//              그래서 자바가 처음에 나올때 goto문을 배제했다고 하고 나옴
		//              goto문이 없는 대신 continue라벨, break라벨이 나왔지만 최대한 쓰지 말라고함.
		//빈번한 사용은 바람직하지 않다.

		while (cnt < 6)            // cnt -> 0 1 2 3 4 5
		{
			n = rd.nextInt(45)+1;   // 0~44 -> +1 -> 1~45

			for (int i=0; i<cnt; i++)
			{
				// num[i] 요소와 n을 비교
				if (num[i]==n)
				{
					continue run;             //뒤를 무시하고 가장 가까운 반복문을 빠져나간다.(for문을 빠져나감)
											  //라벨을 사용하면 위에 run:으로 나가서 다시 while 문 시작.
											  //단, 처음에 while에서 만들어 진 것은 없어지는 것이 아닌 처음 만들어진 것과 새로 while문 시작하는 것과 비교!
				}
			}
			num[cnt++] = n;
		}

		//정렬 메소드 호출
		sorting();



//----------------------------------------------------------------------------------

		/*방법2
		for (int i=0 ; i<num.length ; i++)
		{
			int randomNum;
			boolean dup;

			do
			{
				randomNum = rd.nextInt(45)+1;
				dup = false;
				
				for (int j=0 ; j<i ; j++)
				{
					if (num[j]==randomNum)
					{
						dup = true;
						break;
					}
				}
			}
			while (dup);
			num[i] = randomNum;
		}
		*/

//----------------------------------------------------------------------------------
		
		/*방법3
		for (int i=0; i<num.length; i++)
		{
			num[i] = rd.nextInt(45)+1;

			for (int j=0; j<i; j++)
			{
				if (num[i]==num[j])
				{
					i--;
				}
			}
		}
		sorting();
		*/
	}
	
	//정렬 메소드 정의
	private void sorting()
	{
		Arrays.sort(num);           //static임
	}

//------------------------------------------------------------------------------

	/*//방법2
	private void sorting()
	{
		for (int i=0; i<num.length-1; i++)          
		{
			for (int j=i+1; j<num.length; j++)     
			{
				if (num[i]>num[j])                
				{
					num[i]=num[i]^num[j];
					num[j]=num[j]^num[i];
					num[i]=num[i]^num[j];
				}
			}
		}
	}
	*/
}

public class Test146
{
	public static void main(String[] args)
	{
		//방법1

		//Lotto 클래스 기반 인스턴스 생성
		Lotto lotto = new Lotto();
		
		//기본 5게임 로또 실행
		for (int i=1; i<=5; i++)
		{
			//로또 1게임 수행
			lotto.start();

			//결과 출력
			for (int n : lotto.getNum())
			{
				System.out.printf("%3d", n);
			}
			System.out.println();
		}

//-----------------------------------------------------------------------------------------------------

		/*//방법2
		//Lotto 클래스 기반 인스턴스 생성
		Lotto lotto = new Lotto();
		int lot[] = lotto.getNum();              //int[] lot2 = lotto.get.Num();
		
		//기본 5게임 로또 실행
		for (int i=1; i<=5; i++)
		{
			//로또 1게임 수행
			lotto.start();

			//결과 출력
			for (int j=1; j<=5 ; j++)    //향상된 for (int n : lot2) //Test109.java 참고
			{                            //System.out.printf("%4d", n);
				System.out.printf("%4d", lot[j]);
			}
			System.out.println();
		}
		*/
	}
}
