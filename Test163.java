/*=================================
■■■ 컬렉션(Collection) ■■■
=================================*/

//Test163 클래스를 완성하여 다음 기능을 가진 프로그램을 구현한다.

/*
실행 예)

	[메뉴선택]===============
	1. 요소 추가
	2. 요소 출력
	3. 요소 검색
	4. 요소 삭제
	5. 요소 변경
	6. 종료
	=========================
>> 메뉴 선택(1-6) : 1

1번째 요소 입력 : 최땡인
1번째 요소 입력 성공
요소 입력 계속(Y/N)? : y

2번째 요소 입력 : 채땡선
2번째 요소 입력 성공
요소 입력 계속(Y/N)? : n

	[메뉴선택]===============
	1. 요소 추가
	2. 요소 출력
	3. 요소 검색
	4. 요소 삭제
	5. 요소 변경
	6. 종료
	=========================
>> 메뉴 선택(1-6) : 2

[벡터 전체 출력]
최땡인
채땡선
벡터 전체 출력 완료

	[메뉴선택]===============
	1. 요소 추가
	2. 요소 출력
	3. 요소 검색
	4. 요소 삭제
	5. 요소 변경
	6. 종료
	=========================
>> 메뉴 선택(1-6) : 3

검색할 요소 입력 : 채땡선

[검색 결과 출력]
- 항목이 존재합니다.

	[메뉴선택]===============
	1. 요소 추가
	2. 요소 출력
	3. 요소 검색
	4. 요소 삭제
	5. 요소 변경
	6. 종료
	=========================
>> 메뉴 선택(1-6) : 3

검색할 요소 입력 : 정땡욱

[검색 결과 출력]
- 항목이 존재하지 않습니다.

	[메뉴선택]===============
	1. 요소 추가
	2. 요소 출력
	3. 요소 검색
	4. 요소 삭제
	5. 요소 변경
	6. 종료
	=========================
>> 메뉴 선택(1-6) : 4

삭제할 요소 입력 : 정땡울

[삭제 결과 출력]
항목이 존재하지 않아 삭제할 수 없습니다.

	[메뉴선택]===============
	1. 요소 추가
	2. 요소 출력
	3. 요소 검색
	4. 요소 삭제
	5. 요소 변경
	6. 종료
	=========================
>> 메뉴 선택(1-6) : 4

삭제할 요소 입력 : 최땡인

[삭제 결과 출력]
최땡인 항목이 삭제되었습니다.

	[메뉴선택]===============
	1. 요소 추가
	2. 요소 출력
	3. 요소 검색
	4. 요소 삭제
	5. 요소 변경
	6. 종료
	=========================
>> 메뉴 선택(1-6) : 5

변경할 요소 입력 : 임땡성

[변경 결과 출력]
변경할 대상이 존재하지 않습니다.

	[메뉴선택]===============
	1. 요소 추가
	2. 요소 출력
	3. 요소 검색
	4. 요소 삭제
	5. 요소 변경
	6. 종료
	=========================
>> 메뉴 선택(1-6) : 5

변경할 요소 입력 : 채땡선
수정할 내용 입력 : 이땡형

[변경 결과 출력]
변경이 완료되었습니다.

	[메뉴선택]===============
	1. 요소 추가
	2. 요소 출력
	3. 요소 검색
	4. 요소 삭제
	5. 요소 변경
	6. 종료
	=========================
>> 메뉴 선택(1-6) : 2

[벡터 전체 출력]
이땡형
벡터 전체 출력 완료

	[메뉴선택]===============
	1. 요소 추가
	2. 요소 출력
	3. 요소 검색
	4. 요소 삭제
	5. 요소 변경
	6. 종료
	=========================
>> 메뉴 선택(1-6) : 6

프로그램 종료
계속하려면 아무 키나 누르세요...
*/

import java.util.Vector;
import java.util.Enumeration;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

class Menus // -> 완성된 클래스
{
	public static final int E_ADD = 1;      //요소 추가
	public static final int E_DISP = 2;     //요소 출력
	public static final int E_FIND = 3;     //요소 검색
	public static final int E_DEL = 4;      //요소 삭제
	public static final int E_CHA = 5;      //요소 변경
	public static final int E_EXIT = 6;     //종료

}

public class Test163
{
	//주요 속성 구성 -> 완료
	private static final Vector<Object> vt; // 자료구조
	private static BufferedReader br;      //입력 시 활용
	private static Integer sel;            //선택 값
	private static String con;             //계속 진행 여부

	//static 초기화 블럭 -> 완성
	static
	{
		//Vector 자료구조 생성
		vt = new Vector<Object>();

		//BufferedReader 객체 생성
		br = new BufferedReader(new InputStreamReader(System.in));

		//사용자 입력값 초기화
		sel =1;
		con = "Y";
	}

	//메뉴 출력 메소드
	public static void menuDisp()
	{
		//사용자에게 안내하기 위한 메세지만을 출력하는 기능
		//메뉴를 선택하는 기능의 메소드(menuSelect())를 별도로 정의했기 때문에
		//이 과정에서는 사용자의 선택값을 받아오지 않아도 무방함.

		System.out.println("\n\n\t[메뉴선택]===============");
		System.out.println("\t1. 요소 추가");
		System.out.println("\t2. 요소 출력");
		System.out.println("\t3. 요소 검색");
		System.out.println("\t4. 요소 삭제");
		System.out.println("\t5. 요소 변경");
		System.out.println("\t6. 종료");
		System.out.println("\t=========================");

		System.out.print("\t>>메뉴 선택(1-6) : ");

//-------------------------------------------------------------------------------------------------------------
		
		/*//방법2
		System.out.println("[메뉴선택]===============");
		System.out.println("1. 요소 추가");
		System.out.println("2. 요소 출력");
		System.out.println("3. 요소 검색");
		System.out.println("4. 요소 삭제");
		System.out.println("5. 요소 변경");
		System.out.println("6. 종료");
		System.out.println("=========================");
		*/
	}

	//메뉴 선택 메소드
	public static void menuSelect() throws IOException, NumberFormatException
	{
		//선택한 메뉴에 따른 기능 분기는
		//menuRun() 에서 처리할 예정이기 때문에
		//입력값을 받아오는 기능만 정의
		sel = Integer.parseInt(br.readLine());

//-------------------------------------------------------------------------------------------------------------
		
		//방법2
		/*System.out.print("\t메뉴 선택(1-6) : ");
		sel = Integer.parseInt(br.readLine());*/
	}

	//선택된 메뉴 실행에 따른 기능 호출 메소드
	public static void menuRun() throws IOException
	{
		//Menus 클래스를 활영하여 처리
		switch (sel)
		{
			case Menus.E_ADD : addElement() ; break;
			case Menus.E_DISP : dispElement() ; break;
			case Menus.E_FIND : findElement() ; break;
			case Menus.E_DEL : delElement() ; break;
			case Menus.E_CHA : chaElement() ; break;
			case Menus.E_EXIT : exit() ; break;
			default : System.out.println("\n\t메뉴 선택 오류~");
		}
		
	}

	//자료구조에 요소 추가(입력) 메소드
	public static void addElement() throws IOException
	{
		/*//방법1
		//Test064, 136, 161참고
		System.out.println();
		int n =1;
		
		do
		{
			System.out.printf("%d번째 요소 입력 : ", n);        //n을 다 지우고 아래 처럼 vt.size()+1 -> vt.size()는 0부터 시작이기 때문에 플러스
			vt.add(br.readLine());
			System.out.printf("%d번째 요수 입력 성공! \n",n);   //vt.size() 로 해줘도 됨 -> 위에서 입력이 되어서 이미 1이 되어있으므로 vt.size() 작성

			System.out.print("요소 입력 계속(Y/N)? : "); 
			con = br.readLine();
			if (con.equalsIgnoreCase("Y"))
			{
				n++;
			}
			else
			{
				break;
			}
		}
		while (true);
		*/

//------------------------------------------------------------------------

		/*//방법2
		System.out.println();
		//int n =1;
		
		do
		{
			System.out.printf("%d번째 요소 입력 : ", vt.size()+1); //n
			vt.add(br.readLine());
			System.out.printf("%d번째 요수 입력 성공! \n", vt.size());  //n

			System.out.print("요소 입력 계속(Y/N)? : ");
			con = br.readLine();
			//n++;
		}
		while (con.equals("Y") || con.equals("y"));
		*/

//------------------------------------------------------------------------
		
		//방법3
		do
		{
			System.out.printf("\n\t%d번째 요소 입력 : ", vt.size()+1);   //vt의 배열방 입력 vt.size()는 0부터 시작이기 때문에 +1
			String element = br.readLine();
			boolean b = vt.add(element);          //출력을 성공할때 b에 true가 담기게 함
			if (b)
			{
				System.out.printf("\t%d번째 요소 입력 성공!\n", vt.size());
			}

			System.out.print("\n\t요소 입력 계속(Y/N)? : ");
			con = br.readLine().toUpperCase(); //  toUpperCase(); -> 다 대문자로 바꿔준다.   //br.readLine(). 뒤에 . 을 붙이면 String메소드 가져올 수 있음.
		}
		while (con.equals("Y"));	
	}
	
	//자료구조 전체 요소 출력 메소드
	public static void dispElement()
	{
		//Test158과 참고
		System.out.println("\n\t[벡터 전체 출력]");
		for (Enumeration e = vt.elements(); e.hasMoreElements(); )        //Iterator와 Enumeration는 같은 기능 수행! 구조만 좀 다르다.
		{                                                                 //hasMoreElements와 hasNext같음.
			System.out.printf("\t%10s\n", e.nextElement());               //nextElement와 next같음.
		}
		System.out.println("\t벡터 전체 출력 완료~");

//------------------------------------------------------------------------
		
		/*//방법2
		System.out.print("[벡터 전체 출력]\n");
		for (Object obj : vt )
		{
			System.out.println((String)obj);
		}
		System.out.println("벡터 전체 출력 완료~");
		*/
	}

	//자료구조 내 요소 검색 메소드
	public static void findElement() throws IOException
	{
		System.out.print("\n\t검색할 요소 입력 : ");
		String element = br.readLine();

		
		System.out.println("\n\t[검색 결과 출력]");
		if (vt.contains(element))
		{
			System.out.println("\t항목이 존재합니다.");

			//추가 확인
			int i = vt.indexOf(element);
			System.out.println("\t(" + element + "위치 : " + i + ")");
		}
		else
		{
			System.out.println("\t항목이 존재하지 않습니다.");
		}

//------------------------------------------------------------------------

		/*//방법2
		System.out.print("검색할 요소 입력 : ");
		String temp = br.readLine();
		if (vt.contains(temp))
		{
			int i = vt.indexOf(temp);
			System.out.println("[검색 결과 출력]");
			System.out.println("항목이 존재합니다.");
		}
		else
		{
			System.out.println("[검색 결과 출력]");
			System.out.println("항목이 존재하지 않습니다.");
		}
		System.out.println();
		*/
	}
	
	//자료구조 내 요소 삭제 메소드
	public static void delElement() throws IOException
	{
		System.out.print("\n\t삭제할 요소 입력 : ");
		String element = br.readLine();
		
		System.out.println("\n\t[삭제 결과 출력]");
		if (vt.contains(element))
		{
			int i = vt.indexOf(element);
			vt.remove(i);
			System.out.println("\t" + element + "항목이 삭제되었습니다.");
		}
		else
		{
			System.out.println("\t항목이 존재하지 않아 삭제할 수 없습니다.");
		}
		System.out.println();

//------------------------------------------------------------------------

		/*//방법2
		System.out.print("삭제할 요소 입력 : ");
		String st1 = br.readLine();
		System.out.println();
		System.out.println("[삭제 결과 출력]");

		if (vt.contains(st1))
		{
			int i = vt.indexOf(st1);
			vt.remove(i);
			System.out.printf("%s항목이 삭제되었습니다.", st1);
		}
		else
		{
			System.out.println("항목이 존재하지 않아 삭제할 수 없습니다.");
		}
		System.out.println();
		*/
	}


	//자료구조 내 요소 수정(변경) 메소드
	public static void chaElement() throws IOException
	{
		System.out.print("\n\t변경할 요소 입력 : ");
		String oldElement = br.readLine();               //갱신할 요소가 있기 때문에 element가 아닌 oldElement사용

		//System.out.println("\n\t[변경 결과 출력]");

		if (vt.contains(oldElement))
		{
			int i = vt.indexOf(oldElement);

			System.out.print("\t수정할 내용 입력 : ");
			String newElement = br.readLine();

			vt.set(i, newElement); //-> set은 덮어쓰기!

			System.out.println("\n\t[변경 결과 출력]");
			System.out.println("\t변경이 완료되었습니다.");

		}
		else
		{
			System.out.println("\n\t[변경 결과 출력]");
			System.out.println("\t변경할 대상이 존재하지 않습니다.");
		}

//------------------------------------------------------------------------
		
		/*//방법2
		//Test160 참고
		System.out.println();
		System.out.print("변경할 요소 입력 : ");
		String st2 = br.readLine();
		if (vt.contains(st2))
		{
			System.out.print("수정할 내용 입력 : ");
			String change = br.readLine();
			int i = vt.indexOf(st2);
			vt.set(i, change);

			System.out.println();
			System.out.println("[변경 결과 출력]");
			System.out.println("변경이 완료되었습니다.");
		}
		else
		{
			System.out.println();
			System.out.println("[변경 결과 출력]");
			System.out.println("변경할 대상이 존재하지 않습니다.");
		}
		*/
	}


	//프로그램 종료 메소드 -> 완성된 메소드
	public static void exit()
	{
		System.out.println("\n\t프로그램 종료!!!");
		System.exit(-1);
	}

	//main() 메소드 -> 완성된 클래스
	public static void main(String[] args) throws IOException, NumberFormatException
	{
		do
		{
			menuDisp();
			menuSelect();
			menuRun();
		}
		while (true);
	}
}