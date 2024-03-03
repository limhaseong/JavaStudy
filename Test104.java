/*=================================
■■■ 클래스와 인스턴스 ■■■
- 메소드 오버로딩(Method Overloading)이 가능한 형태와 불가능한 형태
=================================*/

public class Test104
{
	public static void main(String[] args)
	{
		print();

		print(20);


		print(3.14);

		double result = print(3.14);
	}

	public static void print() {}                          // 가능하다
	//public static void print() {}                          // 불가능하다 -> 모든 것이 일치하면 메소드 오버로딩에 적용되지 않음

	public static void print(int i) {}                     // 가능하다
	//public static void print(int j) {}                     // 불가능하다 -> print메소드를 호출하기 때문에 매개변수 이름이 다르다고 해서 허용된다고 생각하면 안된다.

	public static void print(char c) {}                    // 가능하다 -> 되긴하지만 자동형변환 규칙이라는 것이 있기 때문에 조심해야 됨. print('A');라고 가정하면 되긴 하지만
											               //             public static void print(char c) {} 이게 없더라도 위에 public static void print(int i) {}이걸로 자동형변환이 되기때문에
											               //			  꼭 체크 필요!!
	public static void print(int i, int j) {}              // 가능하다

	public static void print(double j) {}                  // 가능하다 -> 단, 이것도 자동형변환 규칙 조심해야됨 print(20); 이렇게 되면 int형이 없으면 double로 받기 때문에 조심
	//public static void print(double e) {return 10.0}       // 불가능하다 -> 리턴 자료형이 10.0이라고 되어있는데 void로 리턴을 받기 때문에 불가능
	//public static double print(double e) {return 10.0}     // 불가능하다 -> double result = print(3.14); 대입연산자가 등장하면 오른쪽처리를 먼저 하고 왼쪽을 바라봄
														   //               즉, = print(3.14);이 부분을 먼저 처리함.
														   //               반환자료형이 다르다고 해서 메소드 호출에 영향을 주지 않음.

	
}