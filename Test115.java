/*=================================
■■■ 클래스 고급 ■■■
- 추상 클래스(abstract)
=================================*/

//클래스 == 설계도 -> 객체생성
//추상 클래스 == 미완성된 설계도 -> 객체생성 불가능
//추상 클래스는 상속이란 문법과 결합해야지 존재가치가 있다.

/*
- 추상(abstract) 클래스는
	: 선언만 있고 정의가 없는 하나 이상의 메소드(추상 메소드)를 갖는 클래스로
	  하위 클래스(자식 클래스)에서 오버라이딩(Overriding)할 것으로 예상되는 메소드에 대해
	  메모리 낭비 없이 미리 호출 계획을 세워두기 위해 만든다.

- 형식 및 구조
	: [접근제어지시자] abstract class 클래스명
	  {
		  [접근제어지시자] abstract 반환자료형 메소드명([매개변수]. ...);
	  }

//ex) 추상 클래스, 추상 메소드
//public abstract class Test105
//{
//	 public abstract String abc();  -> 접근제어지시자 반환자료형 메소드명(매개변수); --> 선언만 있고 정의는 없음.
//}

- 특징
	: 클래스가 적어도 하나 이상의 추상 메소드를 포함할 때
	  그 클래스는 클래스 앞에 abstract키워드를 붙여
	  추상 클래스로 명시해야 하며,
	  추상 클래스로 선언한 경우에는
	  불완전한 형태의 클래스이므로 객체를 생성할 수 없다.(인스턴스 생성 불가!)
	  추상 메소드가 존재하지 않는 추상 클래스마저도
	  객체를 생성할 수 없는 것이다.

	  즉, 추상 클래스는 독립적으로 존재할 수 없기 때문에
	  상속을 위해서만 존재하며
	  추상 클래스를 상속받은 하위 클래스에서는
	  반드시 추상 메소드를 오버라이딩(Overriding) 해야 한다.

//ex)
//abstract class 부모                
//{
//	메소드1 ()
//	{
//	}
//  메소드2 ()
//	{
//	}
//	abstract 메소드3 ();
//}

//abstract class 자식 extends 부모
//class 자식 extends 부모
//{
//	/ *
//	메소드1 ()
//	{
//	}
//  메소드2 ()
//	{
//	}
//	abstract 메소드();  ---------------> 이런 경우 abstract 메소드도 포함되어 자식 클래스도 추상 클래스가 됨(abstract class 자식 extends 부모)
//	* /
//	메소드96 ()
//	{
//	}
//  메소드95 ()
//	{
//	}
//	@Override          ----------------> 이렇게 오버라이딩으로 재정의 하면 class 자식 extends 부모 이렇게 추상 클래스가 아닌 클래스 사용 가능.
//	메소드3 ()
//	{
//	}
//}

- abstract키워드는
  클래스의 메소드에서만 사용할 수 있으며
  멤버 변수나 로컬 변수에서는 사용할 수 없다.
*/

//protected abstract void sorting(); 메소드를 가진 추상 클래스 이므로
//class SortInt115 가 아닌
abstract class SortInt115
{
	private int[] value;

	protected void sort(int[] value)
	{
		this.value = value;
		sorting();
	}
	
	//추상 메소드 이므로
	//protected void sorting(); 이 아닌
	protected abstract void sorting();

	protected int dataLength()
	{
		return value.length;
	}
	
	//메소드에 final이 붙으면 오버라이딩
	//final 키워드로 인해
	//이 클래스(SortInt115)를 상속받는 클래스에서
	//이 메소드를 재정의(Method Overriding) 할 수 없다.
	protected final int compare(int i, int j)
	{
		int x = value[i];
		int y = value[j];

		if (x==y)
			return 0;
		else if (x>y)
			return 1;
		else
			return -1;
	}
	
	//final 키워드로 인해
	//이 클래스(SortInt115)를 상속받는 클래스에서
	//이 메소드를 재정의(Method Overriding) 할 수 없다.
	protected final void swap(int i, int j)
	{
		int temp = value[i];
		value[i] = value[j];
		value[j] = temp;
	}
} //end SortInt115

//public class Test115  //이거였는데
public class Test115 extends SortInt115 //상속 받겠다는 클래스 //@Override protected void sorting()로 재정의로 해주었기 때문에 abstract 지운 걸로 사용 가능.
//public abstract class Test115 extends SortInt115    //추상클래스를 상속 받아 왔기에 추상 클래스가 됨.
{
	/*//부모 클래스의 것들을 가져옴 단, private은 상속 x
	protected void sort(int[] value)
	{
		this.value = value;
		sorting();
	}
	
	//추상 메소드 이므로
	//protected void sorting(); 이 아닌
	protected abstract void sorting();

	protected int dataLength()
	{
		return value.length;
	}
	
	//메소드에 final이 붙으면 오버라이딩
	//final 키워드로 인해
	//이 클래스(SortInt115)를 상속받는 클래스에서
	//이 메소드를 재정의(Method Overriding) 할 수 없다.
	protected final int compare(int i, int j)
	{
		int x = value[i];
		int y = value[j];

		if (x==y)
			return 0;
		else if (x>y)
			return 1;
		else
			return -1;
	}
	
	//final 키워드로 인해
	//이 클래스(SortInt115)를 상속받는 클래스에서
	//이 메소드를 재정의(Method Overriding) 할 수 없다.
	protected final void swap(int i, int j)
	{
		int temp = value[i];
		value[i] = value[j];
		value[j] = temp;
	}
	*/

	int i, j;

	static int[] data = {7, 10, 3, 28, 7};

	
	@Override
	protected void sorting()
	{	
		
		//selection sort
		for (i=0; i<dataLength()-1; i++)
		{
			for (j=i+1; j<dataLength(); j++)
			{
				//크기 비교
				if (compare(i,j)>0)
				{
					//자리바꿈
					swap(i,j);
				}
			}
		}
		

//-------------------------------------------------------------------------

		/*
		for (i=0; i<dataLength()-1; i++)
		{
			for (j=i+1; j<dataLength(); j++)
			{
				if (compare(i,j)==1)
				{
					swap(i,j);
				}
			}
		}*/
		
		
		/*
		for (i=0; i<data.length-1; i++) 
		{
			for (j=i+1; j<data.length; j++)
			{
				if (data[i]>data[j])                 
				{
					data[i]=data[i]^data[j];
					data[j]=data[j]^data[i];
					data[i]=data[i]^data[j];
				}
			}
		}
		*/
	}

	public static void main(String[] args)
	{
		System.out.print("Source Data : ");
		for (int n : data )
			System.out.print(n+" ");
		System.out.println();

		//Source Data : 7 10 3 28 7

		Test115 ob = new Test115();
		ob.sort(data);
		
		System.out.print("Sorted Data : ");
		for (int n : data )
			System.out.print(n+" ");
		System.out.println();

	}
}