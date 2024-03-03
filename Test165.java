/*=================================
■■■ 컬렉션(Collection) ■■■
=================================*/

//List -> Vector, ArrayList, LinkedList...

// - 순서가 의미가 있다.
// - 배열과 상당히 유사하다
// - 순서가 있기 때문에 중복을 허용한다.

/*
- ArrayList 클래스
	: 1. ArrayList 와 Vector 클래스는
	     List를 크기 변경이 가능한 배열로 구성한 것으로
		 차이점은 Vector 클래스의 객체는 기본적으로 동기화 되지만,
		 ArrayList 는 그렇지 않다는 점이다.
		 (멀티스레드에서 safety하게 처리해야하지 않는 상황에서는 무조건 ArrayList를 사용한다.)
	  
	  2. 비동기화 컬렉션은 동기화된 컬렉션보다 더 나은 성능을 제공하며
	     스레드들이 컬렉션을 공유할 필요가 없는 프로그램에서는
		 일반적으로 ArrayList 를 Vector 보다 더 선호하며,
		 ArrayList 는 동기화를 고려하지 않은 Vector 처럼 동작함으로써
		 스레드 동기화에 따르는 부담을 가지지 않기 때문에
		 Vector 보다 더 빠르게 실행된다.

	  3. null 을 포함한 모든 요소를 허용하며
	     List 인터페이스를 구현하는 것 외에 리스트에 격납하기 위해
		 내부적으로 사용되는 배열의 사이즈를 조작하는 메소드를 제공한다.
*/

import java.util.Vector;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Test165
{
	public static void main(String[] args)
	{
		//ArrayList 자료구조 생성
		//ArrayList<String> list = new ArrayList<String>();
		//ArrayList 가 아닌 List 자료구조를 만들어야 한다면
		//Vector<String> list = new Vector<String>();
		//List<String> list = new Vector<String>();
		List<String> list1 = new ArrayList<String>();  //위에꺼와 아래꺼중 빠른 거 비교하고 사용할때의 것 비교해서 더 좋은 거 사용 가능
		//List 안에 Vector, ArrayList, LinkedList... 있음을 알기!
		//List에 add() 와 같은 메소드등이 있을 텐데 다른 Vector와 ArrayList에도 이러한 메소드 들이 있어서
		//Vector<String> list = new Vector<String>(); 이런식으로 하면 나중에 List나 ArrayList로 바꿀때 다 바꿔줘야됨

		//List 자료구조를 만든다고 아래처럼 가능?
		//List<String> list = new List<String>();   //List, Set, Map은 인터페이스라서 불가능하다.

		//list1 자료구조에 요소 추가 -> add()
		list1.add("오펜하이머");
		list1.add("엘리멘탈");
		list1.add("알라딘");

		List<String> list2 = new ArrayList<String>(list1); //->list1 객체를 받은 생성자

		//list2 자료구조에 요소 추가 -> add()
		list2.add("스파이더맨");

		List<String> list3 = new ArrayList<String>();

		//list3 에 list2 의 전체 요소 추가 -> addAll()
		list3.addAll(list2);

		//"알라딘" 앞에 "탑건" 추가
		//[오펜하이머, 엘리멘탈, 알라딘, 스파이더맨] -> 현재
		//[오펜하이머, 엘리멘탈, 탑건, 알라딘, 스파이더맨] -> 이렇게 만들고 싶으면.

		//① "알라딘" 찾기 -> indexOf() -> "알라딘"이 있나 없나 와 위치 인덱스 반환함
		int n = list3.indexOf("알라딘");

		//테스트
		//System.out.println("n : " + n);
		//n : 2

		//② "알라딘" 찾은 인덱스 위치에 "탑건" 삽입 -> add()
		list3.add(n, "탑건");
		//[오펜하이머, 엘리멘탈, 탑건, 알라딘, 스파이더맨]


		//출력 -> 더미데이터로 확인
		System.out.println("===============================================");
		System.out.println(list1);
		//[오펜하이머, 엘리멘탈, 알라딘]
		System.out.println(list2);
		//[] -> list2는 생성만 해놨기 때문
		//[오펜하이머, 엘리멘탈, 알라딘] -> list1을 넘겨 받으면서 자료구조가 생성되어서 결과 나옴.
		//[오펜하이머, 엘리멘탈, 알라딘, 스파이더맨] -> add로 list2에 자료구조 요소 추가한 결과
		System.out.println(list3);
		//[오펜하이머, 엘리멘탈, 알라딘, 스파이더맨]


		//출력 -> ListIterator() 메소드 활용하여 출력
		System.out.println("===============================================");

		ListIterator<String> li = list3.listIterator();
		while (li.hasNext())
		{
			System.out.print(li.next() + " ");
		}
		System.out.println();
		//오펜하이머 엘리멘탈 탑건 알라딘 스파이더맨

		//출력 -> 역순으로 접근
		while (li.hasPrevious())   // -> 이전에 있는지 없는지 확인
		{
			System.out.print(li.previous() + " ");
		}
		System.out.println();
		//스파이더맨 알라딘 탑건 엘리멘탈 오펜하이머
	}
}