/*=================================
■■■ 배열 ■■■
- 배열의 배열
=================================*/

//과제
/*
배열의 배열(다차원 배열)을 활용하여
다음과 같은 데이터를 요소로 취하는 배열을 구성하고
그 결과를 출력하는 프로그램을 구현한다.

실행 예)
 A               00  
 B  C            10  11
 D  E  F         20  21  22  
 G  H  I  J      30  31  32  33
 K  L  M  N  O   40  41  42  43  44

계속하려면 아무 키나 누르세요...

 A             
 B  C           
 D  E  F         
 G  H  I  J      
 K  L  M  N  O
*/

public class Test093
{
	public static void main(String[] args)
	{
		//배열의 배열 선언 및 메모리 할당
		char[][] arr = new char[5][5];

		char ch = 'A';                   //65
		
		//배열 구성
		//담아내기 반복문
		for (int i=0; i<arr.length; i++)
		{
			for (int j=0; j<=i; j++)
			{
				arr[i][j]=ch++;
			}
		}
		
		//배열의 배열 전체 출력 구문
		for (int i=0; i<arr.length; i++)
		{
			for (int j=0; j<arr[i].length; j++)
			{
				if (arr[i][j]>='A' && arr[i][j]<='O')
				{
					System.out.printf("%3c", arr[i][j]);
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}

/*
실행결과
  A
  B  C
  D  E  F
  G  H  I  J
  K  L  M  N  O
계속하려면 아무 키나 누르십시오 . . .
*/