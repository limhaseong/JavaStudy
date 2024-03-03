/*=================================
■■■ 컬렉션 프레임워크(Collection Framework) ■■■
=================================*/

/*
- 큐(Queue) -> 방향성(→)이 있음
	: 큐(Queue)는 선입선출의 FIFO(First Input First Output)구조로
	  먼저 입력한 자료를 먼저 출력하며
	  Queue 인터페이스를 구현한 클래스는 큐와 관련한 다양한 기능을 제공한다.
	  (나가는 구멍 1개, 들어오는 구멍 1개로 Stack과 다르게 구멍이 2개임(빨 - 주 - 노 - 초가 들어오면 빨 - 주 - 노 - 초 순으로 나갈 수 있음))

- Queue 인터페이스 인스턴스를 생성하기 위해서는
  new 연산자를 이용하여 Queue 인터페이스를 구현한(implements)
  클래스의 생성자를 호출한다.
  ex) Queue ob = new LinkedList();

- 주요 메소드
	: 1. E element()
		: 큐의 head 요소를 반환하며 제거하지 않는다.    //head 요소 = 나오는 입구

	  2. boolean offer(E o)
	  	: 지정된 요소를 큐에 삽입한다.
	  
	  3. E peek()
	  	: 큐의 head 요소를 반환하고 삭제하지 않으며
		  큐 자료구조가 empty인 경우 null을 반환한다.

	  4. E poll()
	  	: 큐의 head 요소를 반환하고 삭제하며
		  큐 자료구조가 empty인 경우 null을 반환한다.

	  5. E remove()
	  	: 큐의 head 요소를 반환하고 삭제한다.
*/

import java.util.Queue;
import java.util.LinkedList;

public class Test156
{
	public static void main(String[] args)
	{
		//Queue 자료구조 생성
		//Queue myQue = new Queue();     //->인터페이스기에 이렇게 생성 불가
		Queue<Object> myQue = new LinkedList<Object>();  //Queue도 제네릭 사용가능하다.

		//데이터 준비
		String str1 = "강땡성";
		String str2 = "길땡욱";
		String str3 = "김땡태";
		String str4 = "김땡슬";

		//myQue 라는 Queue 자료구조에 데이터 추가
		myQue.offer(str1);
		myQue.offer(str2);
		myQue.offer(str3);
		//myQue.offer(str4);
		boolean test = myQue.offer(str4);
		System.out.println("test : " + test);
		//test : true (적재된 것을 보고 맞으면 true)
		
		//테스트(확인)
		System.out.println(myQue);
		//[강땡성, 길땡욱, 김땡태, 김땡슬] -> 더미데이터 = 실제 데이터가 제대로 출력되는 거 같으나 아닌 가짜 데이터임.
		
		//Queue 자료구조 myQue에서
		//요소를 제거하지 않고 head 요소 반환
		System.out.println("값 1 : " + (String)myQue.element());  //myQue.element() 요소가 Object 타입으로 나옴 따라서 String 써줘야됨
		System.out.println("값 2 : " + (String)myQue.element());
		System.out.println("값 3 : " + (String)myQue.element());
		//값 1 : 강땡성
		//값 2 : 강땡성
		//값 3 : 강땡성
		System.out.println();   //개행

		String val;

		/*
		//①

		//peek()
		//->큐의 head 요소 반환. 제거 안함
		//  큐가 empty일 경우 null 반환.
		while (myQue.peek() != null)            //myQue.peek() -> 강땡성 반환 -> 제거 안함
		{
			//poll()
			//-> 큐의 head 요소 반환. 제거함
			//   큐가 empty일 경우 null 을 반환
			val = (String)myQue.poll();         //myQue.poll() -> 강땡성 반환 -> 제거 -> 다음 사람 데려옴
			System.out.println("요소 : " + val);
		}
		System.out.println();
		//요소 : 강땡성
		//요소 : 길땡욱
		//요소 : 김땡태
		//요소 : 김땡슬
		*/

//------------------------------------------------------------------------------------------------------------------------

		//테스트
		/*
		while (myQue.poll() != null)            //myQue.poll() -> 강땡성 반환 -> 제거 -> 다음 사람 데려옴
		{
			
			val = (String)myQue.poll();    //val에서 출력되는건 -> 길땡욱     //myQue.poll() -> 길땡욱 반환 -> 제거 -> 다음 사람 데려옴
			System.out.println("요소 : " + val);
		}
		System.out.println();
		//요소 : 길땡욱
		//요소 : 김땡슬
		*/

//------------------------------------------------------------------------------------------------------------------------

		// ②
		/*
		while (true)   //무한 루프
		{
			val = (String)myQue.poll();
			if (val==null)
			{
				break; //while 문 빠져나감.
			}
			else
			{
				System.out.println("요소 : " + val);
			}
		}
		//요소 : 강땡성
		//요소 : 길땡욱
		//요소 : 김땡태
		//요소 : 김땡슬
		*/

//------------------------------------------------------------------------------------------------------------------------

		//③

		while (!myQue.isEmpty())
		{
			val = (String)myQue.poll();
			System.out.println("요소 : " + val);
		}
		System.out.println();
		//요소 : 강땡성
		//요소 : 길땡욱
		//요소 : 김땡태
		//요소 : 김땡슬
	}
}