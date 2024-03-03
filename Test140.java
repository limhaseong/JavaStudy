/*=================================
■■■ 자바의 주요(중요) 클래스 ■■■
- 자바에서 기본적으로 제공하는 주요 클래스들
- StringTokenizer 클래스 (개념만 숙지하는 클래스)
=================================*/

//자바 api에서 되도록이면 쓰지 말라고 하는 거라 개념만 숙지(단종된 느낌)
//토큰 분할 -> Scanner에 필기함(Test017.java)

/*
- StringTokenizer클래스는
  문자열 파싱(parsing)을 위한 정보를 제공하는 클래스로
  파싱(parsing)하고자 하는 문자열을 인자로 받아 생성하는데,
  여기에서 사용되는 파싱(parsing)이라는 개념은
  하나의 문자열을 여러 문자열로 나누는 작업을 의미하게 되며,
  이 때 나누는 단위가 되는 문자열을 토큰(token)이라고 한다.

  StringTokenizer클래스를 사용하기 위해서는
  java.util 패키지의 StringTokenizer 를 import해야 한다.

  StringTokenizer클래스는 호환성(호환서 나오면 안쓰는 게 좋음)을 유지하는 목적으로
  보관 유지되고 있으며, 문자열을 파싱(parsing)하기 위해서는
  String 클래스의 split()메소드나 javax.util.regex패키지를
  사용할 것을 권장하고 있다.

- 생성자
	: 1. 원형
	     StringTokenizer(String str)
		 StringTokenizer(String str, String delim)
		 StringTokenizer(String str, String delim, boolean returnDelims)
		 : 주어진 문자열 str을 단어로 분리하는 객체를 생성하며
		   공백(구분) 문자는 delim에 포함된 문자로 처리하게 된다.
		   만약 returnDelims가 true이면
		   구분 문자도 분리된 데이터로 처리하게 된다.
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Test140
{
	public static void main(String[] args) throws IOException
	{
		String strTemp;
		String[] strArr;
		int n;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("파싱할 문자열 입력(컴마 구분) : ");
		strTemp = br.readLine();
		//ex) 사과, 딸기, 바나나, 포도

		//StringTokenizer클래스 인스턴스 생성
		StringTokenizer st = new StringTokenizer(strTemp, ",");
		//strTemp를 대상 문자열로...(사과, 딸기, 바나나, 포도)
		// ","를 구분자로...

		//테스트
		//System.out.println(st.countTokens());
		//파싱할 문자열 입력(컴마 구분) : 사과 , 딸기, 바나나, 포도
		//4
		//StringTokenizer 의 int countTokens() 메소드는(int형을 반환하는 countTokens()메소드)
		// 파싱된 문자열의 갯수를 반환(리턴)한다.

		strArr = new String[st.countTokens()];            //st.countTokens = 4 (사과, 딸기, 바나나, 포도)

		//strArr = new String[st.countTokens]; 
		//           |
		//strArr = new String[4]; 와 같음
		n=0;
		while (st.hasMoreTokens())   //true반환           //hasMoreTokens()에서 사과, 딸기, 바나나, 포도가 있다고 알려주면(true 반환하면)
		{									              //nextToken();에서 true면 사과가져오고, true면 딸기 가져오고, true면 바나나 가져오고, true면 포도 가져옴
												          //따라서, hasMoreTokens()와 nextToken()은 짝이라고 보면 됨.
			strArr[n++] = st.nextToken();
			//strArr[0] = st.nextToken();
			//            ---------------
			//               사과
			//strArr[0] = "사과";  //hasMoreTokens()이 true일때만.
			//strArr[1] = "딸기";  //hasMoreTokens()이 true일때만.
			//strArr[2] = "바나나";  //hasMoreTokens()이 true일때만.
			//strArr[3] = "포도";  //hasMoreTokens()이 true일때만.
			//이후에 hasMoreTokens()이 false가 됨.

			// hasMoreTokens()
			//	: 사용할 수 있는 토큰이 남아있는 경우 true를 반환
			//    더 이상 사용할 토큰이 없는 경우 false를 반환.
			//    확인에 대한 결과만 반환할 뿐
			//    실제 내용을 읽어들이지도 않고,
			//    실제 내용을 읽어들이는 헤드를 이동시키지도 않는다.

			// nextToken()
			//	: 다음 토큰을 얻어온다.
			//    다음 토큰을 얻어오며 헤드를 이동시키게 된다.
			//    구분자를 바꾸었을 경우 다음 호출에도
			//    바뀐 구분자를 이용하여 토큰을 분리한다.
		}
		System.out.print("파싱된 토큰(문자열) : ");
		for (String str : strArr)
			System.out.print(str + " ");
		System.out.println();
		
		//파싱할 문자열 입력(컴마 구분) : 사과,딸기,바나나,포도
		//파싱된 토큰(문자열) : 사과 딸기 바나나 포도


	}
}
