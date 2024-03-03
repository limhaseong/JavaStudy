/*=================================
■■■ 실행 흐름의 컨트롤 (제어문) ■■■
- 반복문(for문) 실습 및 관찰
- 다음 for문(반복문의 중첩)을 활용한 구구단 출력 실습
=================================*/

// 실행 예)
/*
[2단]
2 * 1 = 2
2 * 2 = 4
2 * 3 = 6
	:
[3단]
3 * 1 = 3
3 * 2 = 6
3 * 3 = 9
	:
[9단]
9 * 1 = 9
9 * 2 = 18
9 * 3 = 27
	:
9 * 9 = 81
계속하려면 아무 키나 누르세요...
*/

public class Test058
{
	public static void main(String[] args)
	{
		int i,j;                  // 루프 변수
								  // j를 밖에 안 쓰면 for(int j=1)로 하면 안에 for문에만 적용됨.
		
		// 첫번째 for문은 돌 때 웅~ 웅~ 웅~ 소리 남
		for (i=2; i<=9; i++)      //단 처리 과정 -> 2 3 4 5 6 7 8 9
		{
			//테스트
			//System.out.println("==[ i : " + i + "]==");
			System.out.printf("===[%d단]===\n", i);

			// 안에 for문은 쑝쑝쑝 소리남
			for (j=1; j<=9; j++)  //곱해지는 수 처림 -> 1 2 3 4 5 6 7 8 9
			{
				//테스트
				//System.out.println("j : " + j);
				System.out.printf("%d * %d = %d\n", i, j, (i*j));
			}//end for
		}//end for
		//그래서 총 웅~ 쑝쑝쑝 웅~ 쑝쑝쑝 소리가 남.
	}//end main()
}//close class Test058

/*
순서
i=2
i<=9
System.out.printf("===[%d단]===\n", i);
j=1
j<=9
System.out.printf("%d * %d = %d\n", i, j, (i*j));
false 나올때까지 돌고
i++
*/

/*
실행결과
===[2단]===
2 * 1 = 2
2 * 2 = 4
2 * 3 = 6
2 * 4 = 8
2 * 5 = 10
2 * 6 = 12
2 * 7 = 14
2 * 8 = 16
2 * 9 = 18

===[3단]===
3 * 1 = 3
3 * 2 = 6
3 * 3 = 9
3 * 4 = 12
3 * 5 = 15
3 * 6 = 18
3 * 7 = 21
3 * 8 = 24
3 * 9 = 27

===[4단]===
4 * 1 = 4
4 * 2 = 8
4 * 3 = 12
4 * 4 = 16
4 * 5 = 20
4 * 6 = 24
4 * 7 = 28
4 * 8 = 32
4 * 9 = 36

===[5단]===
5 * 1 = 5
5 * 2 = 10
5 * 3 = 15
5 * 4 = 20
5 * 5 = 25
5 * 6 = 30
5 * 7 = 35
5 * 8 = 40
5 * 9 = 45

===[6단]===
6 * 1 = 6
6 * 2 = 12
6 * 3 = 18
6 * 4 = 24
6 * 5 = 30
6 * 6 = 36
6 * 7 = 42
6 * 8 = 48
6 * 9 = 54

===[7단]===
7 * 1 = 7
7 * 2 = 14
7 * 3 = 21
7 * 4 = 28
7 * 5 = 35
7 * 6 = 42
7 * 7 = 49
7 * 8 = 56
7 * 9 = 63

===[8단]===
8 * 1 = 8
8 * 2 = 16
8 * 3 = 24
8 * 4 = 32
8 * 5 = 40
8 * 6 = 48
8 * 7 = 56
8 * 8 = 64
8 * 9 = 72

===[9단]===
9 * 1 = 9
9 * 2 = 18
9 * 3 = 27
9 * 4 = 36
9 * 5 = 45
9 * 6 = 54
9 * 7 = 63
9 * 8 = 72
9 * 9 = 81
계속하려면 아무 키나 누르십시오 . . .
*/