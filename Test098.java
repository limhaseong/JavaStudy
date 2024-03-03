/*=================================
■■■ 클래스와 인스턴스 ■■■
- 정보 은닉과 접근제어지시자(접근 지시자, 접근 제어자, 접근 지정자, 접근 제한자...)
=================================*/

import java.util.Scanner;

class CircleTest2  //class CircleTest2 그냥 이렇게 써있으면 default 사용이므로 아래 public을 적어도 사용 못함
{
	// 멤버 변수, 인스턴스 변수, 전역 변수
	//int num;             //int num; 이라고 되어있으면 default

	//    |

	// 정보 은닉(Information Hiding)
	// private 이라는 접근제어지시자의 선언은
	// 클래스 내부에서만 접근 및 참조가 가능하게 하겠다는 의미
	// int 형 전역 변수 -> 자동 0으로 초기화 지원
	private int num;
	
	/*
	//getter / setter 구성(private으로 사용 못하는 것을 쓸 수 있게끔 해주는 것)-나중에 배울 것임.
	public int getNum()
	{
		return num;
	}

	public setNum(int num)
	{
		this.num=num;     //this.num=CircleTest2.num
	}*/

	public void input()
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("반지름 입력 : ");
		num = sc.nextInt();
	}

	public double calArea()
	{
		return num * num * 3.141592;
	}

	public void write(double area)
	{
		System.out.println(">>반지름 : " + num);
		System.out.println(">> 길이 : " + area);
	}

}

// 한 파일에 2개 클래스가 있으면 같은 패키지에 있다고 봄.
//(CircleTest2와 Test098이 같은 패키지라고 봄)


public class Test098
{
	public static void main(String[] args)
	{
		//CircleTest2 인스턴스 생성
		CircleTest2 ob1 = new CircleTest2();

		//ob1.num = 10; //private int num;을 해놨기 때문에 불가능
		//    |
		//ob1.setNum(10);  //set도 구성하지 않았음
		//따라서 값을 담으려면 input()메소드 호출

		//System.out.println("원의 반지름 : " + ob1.num); 이게 안돼서
		//    |
		//System.out.println("원의 반지름 : " + ob1.gerNum()); 이거 사용

		//현재로써는 유일하게 CircleTest2의 num에 데이터를 전달할 수 있는 방법
		ob1.input();
		//반지름 입력: 500
		//ob1.num  = 500이라고 볼 수 있음

		double result = ob1.calArea();
		
		ob1.write(result);
	}
}

/*실행결과
반지름 입력 : 5
>>반지름 : 5
>> 길이 : 78.5398
계속하려면 아무 키나 누르십시오 . . .
*/