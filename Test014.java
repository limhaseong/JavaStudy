/*=================================
■■■ 자바 기본 프로그래밍 ■■■
- 변수와 자료형
- 자바의 기본 입출력 : BufferedReader클래스
=================================*/

//사용자로부터 이름, 국어점수, 영어점수, 수학점수를 입력 받아
//이름과 총점을 출력하는 프로그램을 구현한다.

//실행 예)
// 이름을 입력하세요 : 
// 국어 점수 입력 :
// 영어 점수 입력 :
// 수학 점수 입력 :

//===[결과]===
// 총점 :
// 계속 하려면 아무 키나 누르세요...

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
//import java.io*; 로 해도 됨(문법적으로 허용되지만, 좋은 사용은 아님)

public class Test014
{
	public static void main(String[] args) throws IOException
	{
		/*BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String name;

		System.out.print("이름을 입력하세요 : ");
		name = br.readLine();
		
		int a, b, c, z;

		System.out.print("국어 점수 입력 : ");
		a = Integer.parseInt(br.readLine());
		System.out.print("영어 점수 입력 : ");
		b = Integer.parseInt(br.readLine());
		System.out.print("수학 점수 입력 : ");
		c = Integer.parseInt(br.readLine());

		z = a + b + c;

		System.out.println("\n===[결과]===");
		System.out.printf("이름 : %s%n총점 : %d%n", name, z);*/

		// 주요 변수 선언
		// BufferedReader 인스턴스생성
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		/*InputStreamReader isr = new InputStreamReader(System.in); 
		BufferedReader br = new BufferedReader(isr); //이렇게 2줄로 쓰기도 가능.*/
		
		
		String strName;  // 이름 변수 헝가리언식
		int nKor, nEng, nMat;  //국어점수, 영어점수, 수학점수 변수
		int nTot;   //총점 변수
		String strTemp;  //문자열 임시 저장 변수


		//연산 및 처리
		// 사용자에게 안내 메세지 출력(이름 입력 안내)
		System.out.print("이름을 입력하세요 : ");

		//사용자가 입력한 값(외부 데이터)을 변수에 담아내기
		strName = br.readLine();
		//readLine은 문자열의 형태로 가져옴.

		//사용자에게 안내 메세지 출력(국어점수 입력 안내)
		System.out.print("국어 점수 입력 : ");

		//사용자가 입력한 값(외부 데이터)을 변수에 담아내기
		//nKor = br.readLine();
		//nKor은 정수, br.readLine();은 문자열

		strTemp = br.readLine();

		//담아낸 데이터를 변환한 후 필요한 변수에 다시 담기.
		nKor = Integer.parseInt(strTemp);
		
		//사용자에게 안내 메세지 출력(영어점수 입력 안내)
		System.out.print("영어 점수 입력 : ");

		//사용자가 입력한 값(외부 데이터)을 변수에 담아내기
		strTemp = br.readLine();

		//담아낸 데이터를 변환한 후 필요한 변수에 담아내기
		nEng = Integer.parseInt(strTemp);

		//사용자에게 안내메세지 출력(수학점수 입력 안내)
		System.out.print("수학 점수 입력 : ");

		//사용자가 입력한 값(외부 데이터)을 변수에 담아내기
		strTemp = br.readLine();

		//담아낸 데이터를 변환한 후 필요한 변수에 담아내기
		nMat = Integer.parseInt(strTemp);


		//각 점수 변수에 담겨있는 데이터(사용자가 입력한 데이터)들을
		//종합하여 총점을 산출하고 그 결과를 총점 변수에 담아내기
		nTot = nKor + nEng + nMat;


		//결과 출력
		System.out.println("/n===[결과]===");
		//System.out.println("이름 : " + strName); - 이것도 가능
		System.out.printf("이름 : %s\n", strName);
		//System.out.println("총점 : " + nTot);
		System.out.printf("총점 : %d\n", nTot);
		
		//%d = 정수형, %f = 실수형, %s = 문자열형
	}
}

/*실행결과
이름을 입력하세요 : d
국어 점수 입력 : 10
영어 점수 입력 : 10
수학 점수 입력 : 10
/n===[결과]===
이름 : d
총점 : 30
계속하려면 아무 키나 누르십시오 . . .
*/