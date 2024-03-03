/*=================================
■■■ 자바의 주요(중요) 클래스 ■■■
- 자바에서 기본적으로 제공하는 주요 클래스들
- Wrapper 클래스
=================================*/

public class Test131
{
	public static void main(String[] args)
	{
		boolean bi = true;
		Boolean wrapBi = new Boolean(bi); //인스턴스 생성 구문
		Boolean wBi = bi;                 //오토 박싱

		int n = 30;                       //int 형에 객체 담기는 불가능 하다.
		Integer wrapN = new Integer(n);
		int n2 = wrapN;                   //오토 언박싱을 통해 가능

		float f = 300.3f;                
		//        -----
		// 300.3 이라고 쓰면 double 형이라 안됨
		Float wrapF = new Float(f);

		System.out.println(wrapBi.toString());
		System.out.println(wrapN.toString());
		System.out.println(wrapF.toString());
		//                       ------------
		//                     Object것 -> 문자열로 출력하기에 원래 해쉬코드로 나와야 되겠지만 각각에서 자리에서 오버라이딩을 함.
		//true
		//30
		//300.3

		System.out.println(wrapBi);
		System.out.println(wrapN);
		System.out.println(wrapF);
		//true
		//30
		//300.3

		//Integer 클래스
		String sn = "12";
		int ni = Integer.parseInt(sn);
		System.out.printf("ni : %3d\n", ni);
		//ni :  12

		ni = Integer.parseInt("0101", 2);
		System.out.printf("ni : %3d\n", ni);
		//ni :   5
		// 2진수 값의 형태

		ni = Integer.parseInt("12", 8);
		System.out.printf("ni : %3d\n", ni);
		//ni :  10
		//8진수 형태

		ni = Integer.parseInt("A", 16);
		System.out.printf("ni : %3d\n", ni);
		//ni :  10
		//16진수 형태

		//toxxx() 는 뭔가를 변환하는 메소드라고 생각하면 됨. isxxx() 메소드는 이거인지 아닌지 확인하는 메소드라고 생각하면됨.

		sn = Integer.toBinaryString(20);          //static이 붙어있는 메소드
		System.out.printf("sn : %3s\n", sn);
		//sn : 10100
		//2진수 문자열로 변환

		sn = Integer.toOctalString(31);
		System.out.printf("sn : %3s\n", sn);
		//sn :  37
		//10진수를 8진수로 변환

		sn = Integer.toHexString(31);
		System.out.printf("sn : %3s\n", sn);
		//sn :  1f
		//16진수

		Integer num = new Integer(50);
		System.out.println("num.toString() : " + num.toString());
		//                                       ---
		//                                       int형
		//                                       ----------------
		//                                           문자열형
		//num.toString() : 50  //문자열 String 타입임

		int n3 = 345;
		Integer n4 = Integer.valueOf(n3);             //static이 붙어있는 메소드
		//                           ---
		//                         정수형태
		//Integer.valueOf(n3); 전체는 Integer 타입의 345
		System.out.println("n4 : " + n4);    //->Integer타입
		//n4 : 345
		//toString()이 오버라이딩 되어서 345가 나온 것, 오버라이딩이 없었다면 해쉬코드 나옴.


	}
}