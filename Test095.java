/*=================================
■■■ 배열 ■■■
- 배열과 단수 처리(Random클래스 활용)
=================================*/

/*
사용자로부터 임의의 정수를 입력받아
그 수 만큼 단수(1~100)을 발생시켜 배열에 담고
배열에 담겨있는 데이터들 중
가장 큰 값과 가장 작은 값을 선택하여
결과를 출력하는 프로그램을 구현한다.

실행 예)
발생시킬 난수의 갯수 입력 : 10
(50 7 24 81 72 45 61 38 1 99 -> 무작위로 정수들 발생시킴)
(int[] arr = {50, 7, 24, 81, 72, 45, 61, 38, 1, 99} -> 배열에 담아내기(배열구성)
가장 큰 값 : 99, 가장 작은 값 : 1
계속하려면 아무 키나 누르세요...
*/

import java.util.Scanner;
import java.util.Random;

public class Test095
{
	public static void main(String[] args)
	{
		//Scanner 인스턴스 생성
		Scanner sc = new Scanner(System.in);

		//주요 변수 선언
		int size;               //사용자의 입력값을 담아낼 변수

		//안내 메세지 출력
		System.out.print("발생시킬 난수의 갯수 입력 : ");
		size = sc.nextInt();

		//입력받은 size만큼의 배열방 만들기(배열 길이)
		//(배열 선언 및 메모리 할당)
		int[] arr = new int[size];

		//무작위 정수(난수)를 발생시키기 위해서는
		// 난수 발생 전용 객체가 필요하다
		//-> java.util.Random 이다.
		Random rd = new Random();
		//Random 인스턴스 생성

		//Random 클래스의 nextInt() 메소드가 있음.
		// 0 - 매개변수로 넘겨받은 정수 n-1까지의 수 중
		// 무작위 정수(난수) 1개를 발생시킨다.
		//ex) rd.nextInt(10); // 0~9 중 난수 1개 발생한다는 것임.
		
		//테스트
		//System.out.println("발생한 난수: " + rd.nextInt(10));
		//0~9까지의 범위 내에서 무작위 정수 한 개 발생

		//배열 구성
		//for (int i=0; i<arr.length; i++) //가능
		for (int i=0; i<size; i++)
		{
			//rd.nextInt(101);
			//0~100중 1개
			//rd.nextInt(100);
			//0~99중 1개

			arr[i] = rd.nextInt(100)+1;
			//       ------------------
			//           1~100중 1개
		}

		//테스트 -> 구성된 배열의 전체 요소 출력
		for (int i=0; i<arr.length; i++)
		{
			System.out.printf("%4d", arr[i]);
		}
		System.out.println();

		//--------------------여기까지 수행하면 배열 구성 완료!

		// 방법 1. 가장 작은 값, 가장 큰 값 출력
		/*
		for (int i=0; i<arr.length; i++)
		{
			if (arr[i]>arr[0])
			{
				arr[0]=arr[i];
			}
			else if (arr[i]<arr[1])
			{
				arr[1]=arr[i];
			}
			
		}
		System.out.println("가장 큰 수: " + arr[0]);
		System.out.println("가장 작은 수: " + arr[1]);*/
        //방법 2 --------------------------
		int max, min;        //최대값, 최소값
		
		max=min=arr[0];      // arr[0]의 값을 min에 대입하고
							 // min의 값을 max에 대입!
		
		for (int i=1; i<arr.length; i++)  //arr[0]을 이미 담아 놨기 때문에 1부터 시작
		{
			if (max<arr[i])
			{
				max=arr[i];
			}
			if (min>arr[i])
			{
				min=arr[i];
			}
		}
		//결과 출력
		System.out.printf("가장 큰 값 : %d, 가장 작은 값 : %d\n", max, min);
	}
}