/*=================================
■■■ 자바 기본 프로그래밍 ■■■
- 변수와 자료형
- 자바 기본 입출력 : BufferedReader 클래스
=================================*/
import java.io.BufferedReader; //import를 쓰기 싫으면 BufferedReader나올 때마다 앞에 java.io.BufferedReader를 계속 써줘야됨. java.io.BufferedReader br = new java.io.BufferedReader(new InputStreamReader(System.in));
import java.io.InputStreamReader;
import java.io.IOException;

public class Test012
{
	public static void main(String[] args) throws IOException // INPUT이나 OUTPUT에서 문제가 생길 만한 것이 들어오면 내보내라.
	{
		// 키보드 장착(생성)
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//------------------------------------
		//    문자 입력을 읽어들이는 장치
		//                                     ----------------------
		//                                      바이트 -> 문자 번역기
		//                                                           ------------
		//                                                           바이트 입력값
		// 바이트 입력값을 문자 번역기를 돌려서 문자 입력을 읽어들이는 것.
		
		// String temp = br.readLine();
		// 외부로부터 입력된 값을 temp에 넣겠다.
		// br.readLine(); 2를 입력할지 222222를 입력할지 모르기에 답을 통째로 가져옴.
		// ""(문자열)로 가져오는 것이 특징임.

		//주요 변수 선언
		int r;     //반지름
		final double PI = 3.141592;   //원주율 -> 변수를 상수화 하기 위해 final을 사용
		double a, b;  //원의 넓이, 둘레


		// 연산 및 처리

		// 1. 사용자에게 안내 메세지 출력
		//System.out.println("원의 반지름을 입력 : "); 답을 할때 개행이 되어 있으니 이상해지므로 개행이 안되는 print 사용함.
		System.out.print("원의 반지름을 입력 : ");
		
		//r = 2546이라고 가정함.
		//br.readLine();

		//r = br.readLine();
		//r = "2546";

		//"2546" -> parseInt("2546") = 2546
		//"80" -> parseInt("80") = 80
		//-> 문자열을 정수로 변환해주는 것 parseInt()

		//Integer.parsInt("80"); -> 80
		// 매개변수로 넘겨 받은 문자열 데이터를 정수형으로 변환
		// 단, 이 때 넘겨받은 문자열 데이터는 숫자 형태여야 한다.
		//                                    ---------
		//                                  (Number Format)


		//2. 사용자가 입력한 값을 받아와 반지름 변수 r에 담아내기
		r = Integer.parseInt(br.readLine());
		//r = Integer.parseInt("2546");
		//r = 2546;
		// 사용자가 입력한 값을 br 즉, BufferedReader의 readLine()
		// 메소드를 활용하여 문자열 형태로 읽어들인 후
		// 그 값을 Integer.parseInt()를 통해 숫자형(정수형)으로 변환한 후
		// 정수 형태의 반지를 변수 r에 담아내기.

		//3. 넓이 및 둘레 계산(연산)
		// -> 각각 변수 a와 b에 담아내기
		a = r * r *PI;
		b = r * 2 * PI;
	

		// 결과 출력
		//변수 a와 b에 담겨있는 값 출력
		//System.out.println(">> 넓이 : " + a);
		//System.out.println(">> 둘레 : " + b);

		/*원의 반지름을 입력 : 45
		>> 넓이 : 6361.723800000001
		>> 둘레 : 282.74328
		계속하려면 아무 키나 누르십시오 . . .*/


		System.out.printf(">> 반지름이 45인 원의 넓이는 6361.72 이며,\n ", r, a);
		System.out.printf(">> 반지름이 45인 원의 둘레는 282.74입니다.\n ", r, b);
		// >>반지름이 45인 원의 넓이는 6361.72 이며,
		// >>반지름이 45인 원의 둘레는 282.74입니다.

	}
}

