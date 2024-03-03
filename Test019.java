/*=================================
■■■ 자바 기본 프로그래밍 ■■■
- 변수와 자료형
- 자바의 기본 입출력 : System.util.Scanner
=================================*/

//*java.util.Scanner
// 단락 문자 패턴을 사용하여 입력을 토큰에 따라 분할하며, (공백, -, / 이런 것이 있을때 분할하는 것이 토큰 분할)
// 디폴트(default)로 사용되는 단락문자는 공백이다.
// 작성된 다음 토큰은 next() 메소드를 사용
// 다른 형태(자료형)의 값으로 변환할 수 있다.
// BufferedReader보다 Scanner가 기능은 많지만 성능은 떨어짐.

import java.util.Scanner;

public class Test019
{
	public static void main(String[] args)
	{
		//주요 변수 선언
		Scanner sc = new Scanner(System.in);
		String name;
		int kor, eng, mat, tot;

		//연산 및 처리
		System.out.print("이름,국어,영어,수학 입력( , 구분) : ");
		//이름,국어,영어,수학 입력( , 구분) : ㅇㅇㅇ,10,20,30

		sc = new Scanner(sc.next()).useDelimiter("\\s*,\\s*");
		//              -----------
		//            "ㅇㅇㅇ,10,20,30" 문자열로 가져옴
		// new Scanner(sc.next()).useDelimiter("\\s*,\\s*");
		//                        ------------
		//                        .구분자 사용();
		//                                     "\\s*,\\s*"->따라서 이걸 자바에거 \s*,\s*을 보내고 싶음
		

		//문자열 안에서 \\ 2개는 \한개를 의미함.


		name = sc.next();
		kor = sc.nextInt();
		eng = sc.nextInt();
		mat = sc.nextInt();

		tot = kor + eng + mat;

		//결과출력
		System.out.println("\n>> 이름 : " + name);
		System.out.println(">>총점 : " + tot);
	}
}

/*실행결과
이름,국어,영어,수학 입력( , 구분) : dla,10,20,30

>> 이름 : dla
>>총점 : 60
계속하려면 아무 키나 누르십시오 . . .*/