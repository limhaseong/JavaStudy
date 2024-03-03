/*=================================
■■■ 컬렉션 프레임워크(Collection Framework) ■■■
=================================*/

import java.util.Stack;

public class Test155
{	
	//정적 문자열 배열 선언 및 초기화
	private static final String[] colors = {"검정", "노랑", "초록", "파랑", "빨강", "연두"};

	//생성자
	public Test155()
	{
		//st라는 Stack 자료구조 생성
		//제네렉을 활용하여 자료구조에 담기는 데이터에 대한 표현 -> <String>
		Stack<String> st = new Stack<String>();
		
		//st 라는 Stack 자료구조에 데이터(colors) 담기
		//st = colors;  -> 이렇게 담는 구조가 아님
		
		/*
		st.push(colors[0]);    // = st.add(colors[0]);
		st.push(colors[1]);    // = st.add(colors[1]);
		st.push(colors[2]);    // = st.add(colors[2]);
		st.push(colors[3]);    // = st.add(colors[3]);
		st.push(colors[4]);    // = st.add(colors[4]);
		st.push(colors[5]);    // = st.add(colors[5]);
		*/
		
		/*
		for (int i=0; i<colors.length; i++)
		{
			st.push(colors[i]);      // = st.add(colors[i]);
		}
		*/

		//향상된 for문
		for (String color : colors)        //String color -> 어떤 타입에 이름, colors->자료구조형
		{
			st.push(color);    // = st.add(color);
		}
		
		//st.push(10.0); -> 제네릭으로 String을 담아놨기 때문에 실수형태인 10.0을 넣으면 안됨.
		//st.push(10);
		//컴파일 에러 발생
		// -> 제네릭 표현식을 통해 선언하고 있는
		//    String 이 아닌 다른 자료형(double 이나 int)을
		//    스택 자료구조 st에 push() 하려고 했기 때문에...

		st.push("보라");  //이건 가능 -> 제일 마지막에 넣음. ->후입선출이므로 마지막에 넣었으므로 제일 먼저 출력됨

		//출력 메소드 호출
		popStack(st);

	}

	//출력 메소드
	private void popStack(Stack<String> st)    //또 st라고 이름 저장 가능! -> 메소드 안에서만 보이기 때문
	{
		System.out.print("pop : ");
		//System.out.println(st); -> 이렇게 안됨 -> 개별마다 접근해야됨
		while (!st.empty())   //st.empty() -> 이만큼이 비어 있지 않다면~? -> ! 부정이 있기 때문   //Test154.java에서의 !myStack.isEmpty() 이거와 같이 보기
		{
			System.out.print(st.pop() + " ");        //peek은 제거를 안함. pop은 제거함.
		}
		System.out.println();
	}

	public static void main(String[] args)
	{
		new Test155();   //생성자 호출
	}
}

//실행결과
//pop : 보라 연두 빨강 파랑 초록 노랑 검정