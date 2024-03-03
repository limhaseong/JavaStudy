/*=================================
■■■ 컬렉션(Collection) ■■■
=================================*/

// 자료구조 객체 선언 및 생성 시
// 사용자 정의 클래스 활용
// -> 자료형

import java.util.Vector;

//클래스 -> 사용자 정의 자료형으로 활용
class MyData
{
	//주요 속성 구성 -> 주요 변수 선언(멤버 변수)
	private String name;  //이름
	private int age;      //나이
	
	//private를 접근 못하니 직접 접근이 아닌 간접 접근으로 약속된 형태의 메소드 활용!
	//-> 메소드 활용시 얼마든지 규칙과 조건을 넣을 수 있다.

	//getter(가져다 쓰는 것)
	//setter(세팅하는 것)
	
	//getter / setter 구성
	public String getName()  //name을 가져다 써야되기에 String
	{
		return name; //this.name가능
	}

	public void setName(String name)  //외부 데이터를 setName에 넣을텐데 String name에 넣어줘
	{
		this.name = name;
	}

	public int getAge()
	{
		return age;
	}

	public void setAge(int age)
	{
		this.age = age;
	}
	
	//생성자 -> 사용자 정의 생성자(매개변수 2개인 생성자)
	public MyData(String name, int age)
	{
		this.name = name;
		this.age = age;
	}

	// - 사용자 정의 생성자가 구성될 경우
	//   default 생성자가 자동으로 삽입되지 않기 때문에
	//   default 생성자 형태의 생성자를 사용자 정의 생성자로
	//   추가 구성하게 되는 것이 일반적인 클래스 설계 과정
	//   (반드시 설계해야 한다는 문법적인 규칙은 없다.)

	//생성자 -> 사용자 정의 생성자(매개변수 없는 생성자)
	public MyData()
	{
		//이렇게 넣어도 됨
		//this("",0);
		
		name = "";
		age = 0;
	}

}

public class Test162
{
	public static void main(String[] args)
	{
		//벡터 자료구조 생성
		Vector<MyData> v = new Vector<MyData>(); //MyData타입만 요소로 취할 수 있음
		//MyData[] dataArr = new MyData[10]; -> 이거 가능하니 위에꺼도 가능

		//벡터 자료구조 v에
		//김수환 73세/ 김지민 7세/ 노은하 3세
		//담아내기
		
		/*
		// ①
		Mydata st1 = new MyData();
		st1.setName("김땡환");
		st1.setAge(73);
		v.add(st1);

		Mydata st2 = new MyData();
		st1.setName("김땡민");
		st1.setAge(7);
		v.add(st2);

		Mydata st3 = new MyData();
		st1.setName("노땡하");
		st1.setAge(3);
		v.add(st3);
		*/

		//---------------------------------------------------------------
		
		/*
		// ②
		Mydata st1 = new MyData("김땡환",73);
		v.add(st1);
		Mydata st2 = new MyData("김땡민",7);
		v.add(st2);
		Mydata st3 = new MyData("노땡하",3);
		v.add(st3);
		*/

		//---------------------------------------------------------------

		// ③
		v.add(new MyData("김땡환",73));
		v.add(new MyData("김땡민", 7));
		v.add(new MyData("노땡하", 3));
		
		//벡터 자료구조 v에 담긴 내용(요소) 전체 출력하기
		// 실행 예)
		//이름 : 김땡환, 나이 73세
		//이름 : 김땡민, 나이 7세
		//이름 : 노땡하, 나이 3세
		
		/*
		// ③
		for (MyData obj : v)
		{
			System.out.printf("이름 : %s, 나이 : %d세\n", obj.getName(), obj.getAge());
		}
		*/
		
		//---------------------------------------------------------------

		// ④
		/*
		for (int i=0; i<3; i++)
		{
			System.out.print("이름 : " + v.get(i).getName() + " " + "나이 : " + v.get(i).getAge());
			System.out.println();
		}
		System.out.println();
		*/

		//---------------------------------------------------------------
		
		// ⑤
		/*
		for (int i=0; i<v.size(); i++)
		{
			System.out.printf("이름 : %s, 나이 : %d세\n", v.elementAt(i).getName(), v.elementAt(i).getAge());
		}//                                               ------------- -> MyData타입
		System.out.println();
		*/

		//---------------------------------------------------------------

		// ⑥
		/*
		for (int i=0; i<v.size(); i++)
		{
			System.out.printf("이름 : %s, 나이 : %d세\n", v.get(i).getName(), v.get(i).getAge());
		}
		System.out.println();
		*/
		
		//---------------------------------------------------------------
		
		// ⑦
		for (Object obj : v)
		{
			System.out.printf("이름 : %s, 나이 : %d세\n", ((MyData)obj).getName(), ((MyData)obj).getAge());
		}                                               //------------- -> 다운 캐스팅

		//---------------------------------------------------------------
		
		/*
		// ⑧
		v.add(new MyData("김땡환", 73));
		v.add(new MyData("김땡민", 7));
		v.add(new MyData("노땡하", 3));
		
		for (int i=0; i<v.size(); i++)
		{
			System.out.print("이름 : " + v.get(i).getName());
			System.out.print("  나이 : " + v.get(i).getAge());
			System.out.println();
		}
		System.out.println();
		*/
	}
}