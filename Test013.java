/*=================================
■■■ 자바 기본 프로그래밍 ■■■
=================================*/

// ㅇ퀴즈
// 삼각형의 밑변의 길이와 높이를 사용자로부터 입력받아
// 이 삼각형의 넓이를 구하는 프로그램을 구현한다.

//실행 예)
// 삼각형 넓이 구하는 프로그램
//- 삼각형의 밑변 입력 : 5
//- 삼각형의 높이 입력 : 3

//>> 밑변이 5 높이가 3인 삼각형의 넓이 :
// 계속하려면 아무 키나 누르세요...

//문제 인식 및 분석
// 삼각형의 넓이 = 밑변 * 높이 / 2
// 사용자로부터 데이터를 입력받아 처리함 -> BufferedReader를 활용
// BufferedReader를 여러 개 사용하는가? 1개 사용하는가? = 1개만 사용한다.

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test013
{
	public static void main(String[] args) throws IOException
	{
		/*BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int z, h;
		double a;

		System.out.print("삼각형의 밑변 입력 : ");
		z = Integer.parseInt(br.readLine());

		System.out.print("삼각형의 높이 입력 : ");
		h = Integer.parseInt(br.readLine());

		a = (double)z * h / 2;

		System.out.println(">>밑변이 5 높이가 3인 삼각형의 넓이 : " + a);*/


		/*-----------------------------------------------------------------------
		int a,b;
		System.out.print("삼각형의 밑변 입력 : ");
		a = Integer.parseInt(br.readLine());
		System.out.print("삼각형의 높이 입력 : ");
		b = Integer.parseInt(br.readLine());
		
		System.out.printf("밑변이 %.0f, 높이가 %.0f인 삼각형의 넓이: %.2f\n", a, b, (double)a*b /2);*/

		//-------------------------------------------------------------------------------
		
		// 주요 변수 선언
		
		// BufferedReader 인스턴스 생성
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		//밑변, 높이
		int underLength, height; 
		double area;   //넓이


		// 연산 및 처리
		//1. 사용자에게 메세지 출력
		System.out.println("ㅁ삼각형 넓이 구하는 프로그램ㅁ");
		System.out.print("삼각형의 밑변 입력 : ");  //println을 쓰면 개행이 되므로 안됨.

		//2. 사용자가 입력한 데이터(문자열)를 정수 형태로 변환한 후 변수 underLength에 담아내기
		underLength = Integer.parseInt(br.readLine());

		//3. 다시 사용자에게 안내 메세지 출력
		System.out.print("삼각형의 높이 입력 : ");

		//4. 위에서 했던 것처럼 사용자가 입력한 데이터(문자열)를 정수형태로 변환한 후 변수 height에 담아내기
		height = Integer.parseInt(br.readLine());

		//5. 삼각형의 넓이 구하는 연산 처리
		// 삼각형의 넓이 = 밑변 * 높이 / 2
		//area = underLength * height / 2; // 밑변이나 높이나 2를 실수 형태로 바꿔줌)
		//     정수형       * 정수형 / 정수형
		//--------------------------   ------
		//          정수형             정수형 -> 정수 기반 연산
		//                                       (즉, 몫을 취하고 나머지는 버림)
		area = underLength * height / 2.0; 
		//      정수형     * 정수형/ 실수형 -> 실수 기반 연산!!!!!중요!!!
		
		//실수 자료형이 결과값으로 나오는 과정에서 실수 기반의 연산이 필요한 상황이다.
		// 정수형 2가 아닌 실수형으로 2.0으로 나눗셈 연산을 수행하게 되면
		// 이 연산은 실수 기반으로 처리된다.
		// area = (double)underLength * height / 2; 도 되며,(ㅇ)
		// area = underLength * (double)height / 2; 도 되며,(ㅇ)
		// area = (double)(underLength * height) / 2; 도 되지만(ㅇ)
		// area = (double)(underLength * height / 2); 는 안된다.(x)
		//                --------------------------
		//                 이 결과값을 먼저 계산하여 몫을 얻기 때문임.

		// 결과 출력
		System.out.println(); //매개 변수가 없으면 개행된다.
		// System.out.print(); 매개변수가 없으면 컴파일 에러남.

		System.out.printf(">> 밑변이 %d, 높이가 %d인 삼각형의 넓이 %.2f\n : ", underLength, height, area);

		/*결과 출력
		삼각형의 밑변 입력 : 5
		삼각형의 높이 입력 : 3
		>>밑변이 5 높이가 3인 삼각형의 넓이 : 7.5
		계속하려면 아무 키나 누르십시오 . . .*/


	}
}