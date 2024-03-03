/*=================================
■■■ 자바의 주요(중요) 클래스 ■■■
- 자바에서 기본적으로 제공하는 주요 클래스들
- StringBuffer 클래스
=================================*/

/*
- StringBuffer 클래스                                                     //Buffer -> 버퍼링할때의 버퍼(임시로 담아두는 것)
	: 문자열을 처리하는 클래스로 String 클래스와의 차이점은
	  String 클래스는 내부 문자열 데이터의 수정이 불가능하지만
      StringBuffer 클래스는 문자열을 사용할 때
	  내부 문자열을 실행 단계에서 변경할 수 있다.

	  즉, StringBuffer 객체는 가변적인 길이(크게 만들수도, 작게 만들수도 있음)를 가지므로
	  객체를 생성하는 시점에서 미리 그 크기나 값을 지정하거나
	  실행 시점에 버퍼의 크기를 바꿀 수 있는 기능을 제공한다.

	  또한 JDK 1.5 이후부터는
	  문자열을 처리하는 StringBuilder 라는 클래스도 제공한다.
      StringBuilder 클래스의 기능은 StringBuffer 클래스와 동일하지만
	  가장 큰 차이점은 multi-thread unsafe(unsafety)라는 점이다.                  //스레드 = 자기 일만 처리하는 작은 단위, 작업자 등등 의미가 많음
	  즉, Syncronization(동기화)이 없기 때문에
	  StringBuffer 보다 빠르며, 동시성(동기화) 문제가 없다면                      //StringBuffer 는 기능은 많고 좋고 멀티스레드에서 안전하지만 느림
	  StringBuilder를 사용하는 것이 성능을 향상시킬 수 있다.                      //StringBuilder는 멀티스레드에서 안전하지 않지만 성능이 좋고 빠르다.
*/

public class Test138
{
	public static void main(String[] args)
	{
		String str1 = new String("seoul");
		String str2 = new String("seoul");

		System.out.println(str1 == str2);
		System.out.println(str1.equals(str2));        //String에서 Object껄 받아서 값을 비교하는 것 = equals() -> 오버라이딩 함
		//false
		//true

		StringBuffer sb1 = new StringBuffer("korea");
		StringBuffer sb2 = new StringBuffer("korea");

		System.out.println(sb1 == sb2);
		System.out.println(sb1.equals(sb2));         //StringBuffer에서든 equals를 오버라이딩 하지 않음.
		//false
		//false
		
		System.out.println("------------------------------------------------------------------------------------------");

		System.out.println(sb1);
		//korea
		//스트링 버퍼에서 Object의 toString()을 오버라이딩 했다는 거 알아야됨

		System.out.println(sb1.toString());
		//                 ---
		//             스트링 버퍼 객체 출력
		//sb1.toString() = 스트링을 출력한 것.
		//korea

		System.out.println(sb1.toString().equals(sb2.toString()));
		//true
		//이것은 스트링의 equals임. 따라서 sb2.toString() 비교 대상을 이렇게 작성

		System.out.println("------------------------------------------------------------------------------------------");
		
		StringBuffer sb3 = new StringBuffer();
		//StringBuffer 기본 생성자 호출(인스턴스 생성 과정)
		//기본적으로 생성되는 버퍼의 크기는 16

		//capacity() -> 버퍼의 크기 알 수 있음
		System.out.println("버퍼 크기 : " + sb3.capacity());
		//버퍼 크기 : 16

		//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

		System.out.println(sb3);
		// 아무것도 안찍힘
		
		/*
		String name = "박땡영";
		name += "박땡영"; //박땡영 소실 박땡영박땡영 참조
		name += "박땡구"; //박땡영박땡영 소실 박땡영박땡영박땡구 참조
		name += "엄땡용"; //박땡영박땡영박땡구 소실 박땡영박땡영박땡구엄땡용 참조 -> 메모리차지가 동적임
		
		System.out.println(name);
		//박땡영박땡영박땡구엄땡용
		*/

		sb3.append("seoul");          //sb3+="seoul";
		sb3.append("korea");          //sb3+="korea";
		sb3.append("우리나라");       //sb3+="우리나라";
		sb3.append("대한민국");       //sb3+="대한민국";
		//오른쪽 보다 메모리를 훨씬 덜 쓰게 됨
		System.out.println(sb3);
		//seoulkorea우리나라대한민국
		//StringBuffer 타입
		System.out.println(sb3.toString());
		//seoulkorea우리나라대한민국
		//String 타입

		//버퍼 크기 다시 확인
		System.out.println("버퍼 크기 : " + sb3.capacity());
		//버퍼 크기 : 34

		//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

		String temp1 = "java and oracle";
		//String 타입

		System.out.println(temp1.toUpperCase());          //to~ = 변환
		//JAVA AND ORACLE
		//소문자가 대문자로 변환

		String temp2 = "JAVA AND ORACLE";
		System.out.println(temp2.toLowerCase());
		//java and oracle
		//대문자가 소문자로 변환
		//String타입꺼를 사용

		//System.out.println(sb3.toUpperCase());
		//System.out.println(sb3.toLowerCase());
		//컴파일 에러 발생

		//seoulkorea우리나라대한민국
		String temp3 = sb3.toString();
		System.out.println(temp3.toUpperCase());
		//SEOULKOREA우리나라대한민국
		System.out.println(sb3.toString().toUpperCase()); //바로 위 2줄을 1줄로 쓴 것.
		//SEOULKOREA우리나라대한민국

		//seoulkorea우리나라대한민국
		// - 대상 문자열(sb3 -> "seoulkorea우리나라대한민국") 중
		//   "seoul" 문자열 앞에 "한국"이라는 문자열 추가
		//   즉, 한국seoulkorea우리나라대한민국 으로 구성
		sb3.insert(0, "한국");        //insert(몇번째 자리, "들어갈 문자열")
		System.out.println("seoul 앞에 한국 추가 : " + sb3);
		//seoul 앞에 한국 추가 : 한국seoulkorea우리나라대한민국
		System.out.println("seoul 앞에 한국 추가 : " + sb3.toString());
		//seoul 앞에 한국 추가 : 한국seoulkorea우리나라대한민국

		//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

		// - 대상 문자열(sb3 -> "한국seoulkorea우리나라대한민국")
		//   "korea" 문자열 뒤에 "사람"이라는 문자열 추가
		//   단, 대상 문자열의 인덱스를 눈으로 직접 확인하지 않고
		//   즉, 한국seoulkorea사람우리나라대한민국 으로 구성

		//테스트1
		System.out.println(sb3.toString());
		//한국seoulkorea우리나라대한민국

		//테스트2 -> 직접 인덱스를 확인하지 말고 하기라서 테스트 2는 원하는 답이 아님
		//sb3.insert(12, "사랑");
		//System.out.println("korea 뒤에 사랑 추가 : " + sb3);
		//korea 뒤에 사랑 추가 : 한국seoulkorea사랑우리나라대한민국
		//System.out.println("korea 뒤에 사랑 추가 : " + sb3.toString());
		//korea 뒤에 사랑 추가 : 한국seoulkorea사랑우리나라대한민국
		
		//테스트3
		//sb.indexOf("korea");  //korea라는 단어를 찾아라
		//System.out.println(sb3.indexOf("korea"));
		//7

		//테스트4
		//System.out.println(sb3.insert(sb3.indexOf("korea"), "사랑"));
		//한국seoul사랑korea우리나라대한민국

		//테스트5
		//System.out.println(sb3.insert(sb3.indexOf("korea") + 5, "사랑"));
		//한국seoul사랑korea사랑우리나라대한민국

		//테스트6
		System.out.println(sb3.insert(sb3.indexOf("korea") + "korea".length(), "사랑"));
		//한국seoulkorea사랑우리나라대한민국
		
		System.out.println(sb3.toString());
		//한국seoulkorea사랑우리나라대한민국
		
		//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

		// - 대상 문자열(sb3)에서
		//   우리나라 문자열 삭제
		//sb3.delete(14, 18);
		//System.out.println(sb3);
		//한국seoulkorea사랑대한민국
		sb3.indexOf("우리나라");
		//System.out.println(sb3.indexOf("우리나라"));
		System.out.println(sb3.delete(sb3.indexOf("우리나라"), sb3.indexOf("우리나라")+"우리나라".length()));
		//sb3.delete(14, 18);
		//           --- ---
		//            |   |
		//            |   sb3.indexOf("우리나라")+"우리나라".length()
		//            |
		//    sb3.indexOf("우리나라")

		// - 대상 문자열(sb3)에서
		//   korea이후 모든 문자열 삭제(korea 포함)
		//   한국seoulkorea사랑대한민국 -> 한국seoul
		/*
		sb3.indexOf("korea");
		sb3.indexOf("민국");
		System.out.println(sb3.delete(sb3.indexOf("korea"), sb3.indexOf("민국")+"민국".length()));
		//한국seoul
		*/
		//sb3.delete(7, 18);
		//System.out.println(sb3.toString());
		//한국seoul

		//sb3.delete(7);                        //--> 매개변수 하나 넘기는 건 안됨
		//System.out.println(sb3.toString());

		//sb3.delete(7, 18);
		//        --- ---
		//         |   |
		//         |  sb3.length()
		//         |
		// sb3.indexOf("korea");
		sb3.delete(sb3.indexOf("korea"), sb3.length());
		System.out.println(sb3);
		//한국seoul

		//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

		//버퍼 크기 다시 확인
		System.out.println("버퍼 크기 : " + sb3.capacity());
		//버퍼 크기 : 34
		//증가는 자동 증가인데 감소는 자동 감소가 아님

		//문자열(sb3)의 길이 확인
		System.out.println("문자열 길이 : " + sb3.length());
		//문자열 길이 : 7

		//버퍼 크기 조절
		// -> 현재 문자열을 담아둘 수 있는 버퍼의 크기로...
		//trimToSize()
		sb3.trimToSize();

		//버퍼 크기 조절 이후 버퍼 크기 다시 확인
		System.out.println("버퍼 크기 : " + sb3.capacity());
		//버퍼 크기 : 7

		





		




	}
}