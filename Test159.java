/*=================================
■■■ 컬렉션(Collection) ■■■
=================================*/

//Vector v = new Vector();
//-> 생성자 등이 없는데 객체 생성하면 비어있는 Vector 자료구조 생성

//Vector v = new Vector(8);
// 8개의 초기 elements를 가진 Vector 자료구조 v 생성
// 이 자료구조를 활용하는 과정에서
// 8개가 모두 채워지게 되면(모두 사용되어 모자라게 되면) 자동으로 확장된다.

//Vector v = new Vector(3, 5);
// -> 3개의 초기 elements를 가진 Vector 자료구조 v 생성
//    이 자료구조를 활용하는 과정에서
//    3개가 모두 채워지게 되면 (모두 사용되어 모자라게 되면) 자동으로 5개 증가(확장)된다.

// - 벡터는 데이터 요소로 정수형, 실수형, 문자열 ... 등을
//   담아내는 것이 가능하다.(-> 가능해졌다.)
//   -> 데이터 안정성을 확보해서 사용해야 한다.

import java.util.Vector;
import java.util.Iterator;


//myVector 클래스 설계 -> Vector 클래스 상속
class myVector extends Vector<Object>
{
	//사용자 정의 생성자
	myVector()
	{	
		//Vector(슈퍼 클래스) 생성자 호출 -> 가장 먼저 호출 되어야 한다.
		//super();
		// Vector(); (부모)
		super(1,1);
		//첫 번째 인자 : 주어진 용량
		//두 번째 인자 : 증가량
	}

	void addInt(int i)
	{
		addElement(new Integer(i));
	}

	void addFloat(float f)
	{
		addElement(new Float(f));
	}

	void addString(String s)
	{
		addElement(s);
	}

	void addCharArray(char[] a)
	{
		addElement(a);
	}

	void addObject(Record rec)
	{
		addElement(rec);
	}

	void write()
	{	
		/*//문자배열 안나오는 것
		Object o;
		int length = size();

		System.out.println("벡터 요소의 갯수 : " + length);
		//벡터 요소의 갯수 : 4

		for (int i=0; i<length; i++)
		{
			o = elementAt(i);
			System.out.println(o);
		}
		//5
		//3.14
		//안녕하세요
		//[C@15db9742
		*/

//---------------------------------------------------------------------------------------------

		/*//문자배열 안나오는 것
		Iterator<Object> it = this.iterator();   //this 대신 super도 됨.
		
		while (it.hasNext()) 
		{   
			//방법 1
			//Object a = (Object)it.next();
			//System.out.print(a + " ");
			
			//방법 2
			System.out.println(it.next() + " ");
		}
		System.out.println();
		//5
		//3.14
		//안녕하세요
		//[C@15db9742
		*/

//---------------------------------------------------------------------------------------------

		// instanceof 연산자
		//	: 처리해야 하는 대상의 객체 타입 확인

		Object o;
		int length = size();

		System.out.println("벡터 요소의 갯수 : " + length);

		for (int i=0; i<length; i++)
		{
			o = elementAt(i);            //super, this elementAt() 다 가능
			
			/*
			if (o instanceof char[])
			{
				System.out.println("문자배열");
			}
			else
			{
				System.out.println("다른형태");
			}
			*/

			//정답
			if (o instanceof char[])
			{
				//System.out.println("문자배열");
				System.out.println("문자배열 : " + String.copyValueOf((char[])o));
			}
			else if (o instanceof String)
			{
				System.out.println("문자열 : " + o.toString());
			}
			else if (o instanceof Integer)
			{
				System.out.println("정수형 : " + o);
			}
			else if (o instanceof Float)
			{
				System.out.println("실수형 : " + o);
			}
			else
			{
				System.out.println("타입 확인 요망");
			}
		}
		//정수형 : 5
		//실수형 : 3.14
		//문자열 : 안녕하세요
		//문자배열 : study
	}

}

public class Test159
{
	public static void main(String[] args)
	{
		//myVector 클래스 기반 인스턴스 생성
		myVector v = new myVector();

		//주요 변수 선언 및 초기화
		int digit = 5;
		float real = 3.14f;
		String s = new String("안녕하세요");
		char[] letters = {'s', 't', 'u', 'd', 'y'};

		v.addInt(digit);           //벡터 자료구조에 정수 저장
		v.addFloat(real);          //벡터 자료구조에 실수 저장
		v.addString(s);            //벡터 자료구조에 문자열 저장
		v.addCharArray(letters);   //벡터 자료구조에 문자 배열 저장

		v.write();
	}
}
