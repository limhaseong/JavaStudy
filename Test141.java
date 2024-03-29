/*=================================
■■■ 자바의 주요(중요) 클래스 ■■■
- 자바에서 기본적으로 제공하는 주요 클래스들
- 문자열 관련 클래스
- 캐릭터 셋(CharacterSet)
=================================*/

/*
- 캐릭터 셋(CharacterSet)
	: 1. 유니코드
		: 국제 표준으로 제정된 2바이트계의 만국 공통의 국제 문자부호
		  체계(UCS: Universal Code System)를 말한다.
		  애플컴퓨터, IBM, 마이크로소프트 등이 컨소시엄으로 설립한
		  유니코드(Unicode)가 1990년에 첫 버전을 발표하였고
		  ISO/IEC JTC1에서 1995년 9월 국제표준으로 제정하였다.
		  공식 명칭은 ISO/IEC 10646-1(Universal Multiple-Octet Coded Character Set)이다

		  데이터의 교환을 원활하게 하기 위하여 문자 1개에 부여되는 값을
		  16비트로 통일하였다.
		  코드의 1문자 당 영어는 7비트, 비영어는 8비트
		  한글이나 일본어는 16비트의 값을 가지게 되는데
		  이들을 모두 16비트로 통일한 것이다.

	  2. UTF-8 과 UTF-16
	  	: UTF-8 과 UTF-16의 차이를 한 마디로 말하면
		  문자를 표현할 때의 단위가 다르다는 것이다.
		  UTF-8은 8비트 가변장 멀티바이트에서 문자를 표현하고
		  UTF-16 은 16비트 가변장 멀티바이트에서 문자를 표현한다.

		  - UTF-8(8bit UCS Transformation Format)
		  	: 웹에서 기본적으로 사용하는 코드.
			  UCS-2로 정의되는 문자 집합을 이용하여 기술된 문자열을
			  바이트 열로 변환하는 방식의 1개 1문자를 1-6바이트 가변장
			  멀티바이트로 변환된다.

		  - UTF-16(16bit UCS Transformation Format)
		  	: 자바의 기본 코드.
			  자바에서는 문자 하나를 저장하면 바이트 수는
			  영문자든, 한글문자든 2바이트를 차지하게 된다.
			  UCS-2로 정의도는 문자 집합을 이용하여 기술된 문자열에
			  UCS-4의 일부의 문자를 채워넣기 위한 인코딩 방식.
			  UTF-8과 병용할 수 있다.
			  UCS-2로 이용할 수 있는 문자 수를 대폭 늘릴 수 있다.

			  - 자바단에서는 UTF-16을 사용하고 웹에서는 UTF-8을 사용하기 때문에
			    경우에 따라 변환해야 하는 상황이 발생할 수 있다.

- 문자 코드의 종류
	: 1. KSC5601
		: 한글 완성형 표준(한글 2,350자 표현),
		  한국공업표준 정보처리분야(C)의 5601번 표준안

	  2. KSC5636
	  	: 영문자에 대한 표준
		  한국공업표준 정보처리분야(C)의 5636번 표준안.
		  기존 ASCII Code에서 역슬래시(\)를 원(￦) 표시로 대체

	  3. EUC-KR(MS949)
	  	: Bell-Laboratories에서 유닉스 상에서 영문자 이외의 문자를
		  지원하기 위해 제안한 확장 유니코드(Extend UNIX Code) 중
		  한글 인코딩 방식
		  영문은 KSC5636으로 처리하고 한글은 KSC5601로 처리.
		  즉, EUC-KR(MS949) = KSC5636 + KSC5601

	  4. UTF-8
	  	: 영문과 숫자는 1바이트, 한글은 3바이트로 표현.
		  (웹에서 많이 사용. UTF-8 형식으로 JSP를 작성할 때에는
		   파일도 UTF-8 형식으로 저장해야 한다.)

	  5. UTF-16
	  	: 자바 기본 문자 코드.
		  영문과 숫자는 1바이트, 한글은 2바이트로 표현.

	  6. ISO-8859-1
	  	: 서유럽 언어 표기에 필요한 US-ASCII에 있는
		94개 글자의 순차적 나열.
*/

import java.io.UnsupportedEncodingException; //checked exception임

public class Test141
{
	public static void main(String[] args) throws UnsupportedEncodingException
	{
		byte[] buf;
		String name = new String("오땡경");

		System.out.println("디폴트 캐리턱셋 : " + System.getProperty("file.encoding")); //getProperty() = static 메소드
		//디폴트 캐리턱셋 : MS949

		//String.getBytes() 호출
		// 디폴트 캐릭터셋으로 (시스템에 설정된 인코딩 방식을 활용해서) 바이트 배열을 반환하는 메소드
		buf = name.getBytes();
		//byte[] buf = name.getBytes();
		//byte[] buf = "오땡경".getBytes();
		//byte[] buf = {-65, -64, -74, -81, -80, -26};   //"오땡경" 이름을 바이트 배열 값으로 변환
		//              --------  --------- ---------
		//                 오        땡        경

		for (byte b:buf)
		{
			System.out.println("[" + b + "]");
		}
		System.out.println();
		//[-65]
		//[-64]
		//[-74]
		//[-81]
		//[-80]
		//[-26]

		System.out.println("Length : " + buf.length);
		//Length : 6

		//UTF-8 캐릭터셋으로 바이트 배열을 반환
		//String.getBytes("utf-8")
		//대상 문자열을 매개변수로 넘겨받은 인코딩 방식을 활용해서
		//바이트 배열을 반환하는 메소드
		buf = name.getBytes("utf-8");         //name.getBytes() = 디폴트 캐릭터셋으로 name 문자열을 바이트배열로 반환
		//배열 갱신 -> 컴파일 에러 발생(UnsupportedEncodingException)
		//데이터를 지정해버리면 자바에서는 사용자가 뭘 입력할 줄 알고 지정하냐면서 에러 발생
		//따라서 위에 throws UnsupportedEncodingException 하라고 입력 후 import 구문 써주면 에러 해결.

		System.out.println("Length : " + buf.length);
		//Length : 9

		for (byte b: buf)
		{
			System.out.println("[" + b + "]");
		}
		System.out.println();
		//[-20]
		//[-104]    오
		//[-92]

		//[-21]
		//[-107]    땡
		//[-95]

		//[-22]
		//[-78]     경
		//[-67]

		//new String("오땡경");
		//new String(바이트배열, 인코딩방식);
		//new String(buf, "utf-8");
		
		//utf-8 형태로 저장된 바이트 배열을
		//String 객체로 파라미터 값 utf-8을 부여하여 생성
		// -> 즉, utf-8기반으로 buf 바이트배열을 합쳐서 문자열 객체를 생성한 후 출력
		System.out.println("Value 1 : " +new String(buf, "utf-8"));
		//Value 1 : 오땡경
		

		System.out.println(); //개행
		
		////new String(바이트배열[]);
		//new String(바이트배열[.기본인코딩방식(디폴트 캐릭터셋)]);
		//new String(buf)
		//utf-8 형태로 저장된 바이트 배열을
		//String 객체로 두 번째 파라미터 값 없이 부여하여 생성
		// -> 즉, ms949 방식으로 buf 바이트배열을 합쳐서 문자열 객체를 생성한 후 출력
		
		System.out.println("Value 2 : " + new String(buf));
		//Value 2 : ?삤?븸寃?
		//오땡경은 그대로 있지만 한글은 깨져서 나올 수 있음.
		

		System.out.println(); //개행

		System.out.println("-----------------------------------------------------");

		String convert = new String(name.getBytes("euc-kr"), "utf-8"); //euc-kr로 지정된 것을 utf-8로 변환해달라는 것 //name에 담긴 것은 "오땡경"
		//이렇게 생긴 문자열은 다 깨질 수 밖에 없음.(변환하겠다고 할때 이렇게 코드 짜면 안됨.)
		//문자열 객체가 생성될때부터 잘못 된 것이라서 이후에도 계속 깨짐.

		System.out.println("Value 3 : " + convert);
		//Value 3 : ??????

		buf = convert.getBytes();
		System.out.println("Length : " + buf.length);
		//Length : 6

		buf = convert.getBytes("utf-8");
		System.out.println("Length : " + buf.length);
		//Length : 18

		/*
		>>체크하기<<
			: 문자열을 euc-kr 인코딩방식에서 utf-8 방식으로 변환하겠다는 의도로
			  위와 같이 코딩을 해버리면...
			  이러한 변환(잘못된 변환)으로 인해 배열이 깨져서
			  이 이후에는 euc-kr이든 utf-8이든
			  어떠한 바이트 배열로 읽어오든
			  결과물이 깨져 있는 것을 확인할 수 있다.

			  이미 깨져서 생성된 String 객체의 바이트 배열은
			  어떤 방식으로든 복구가 불가능하다.
		*/


	}
}
