/*=================================
■■■ 배열 ■■■
- 배열의 복사
=================================*/

//Test096.java 파일과 비교해서 보기.

// 자바에서 배열 변수의 복사에는 데이터 복사, 주소값 복사 두 가지 형태가 존재한다.

// 주소값 복사 -> 얕은 복사
// 원본을 수정하면 복사본에 영향을 미치게 되는 복사 방법
// (자바의 배열 뿐 아니라 모든 참조형 데이터에 해당하는 복사 방법)

// 데이터 복사 -> 깊은 복사
// 실제 요소로 들어있는 값에 대한 복사로
// 원본을 수정해도 복사본에 영향을 미치지 않는 복사 방법

// 데이터 복사 수행
// - int 형 배열에 대한 깊은 복사를 처리하는
// 메소드를 정의하는 형태로 실습 진행

public class Test097 //extend object가 붙어있음.
{
	public static void main(String[] args)
	{
		int[] nums = {10, 20, 30, 40, 50};    // 배열 원본
		
		int[] copys1 = nums;                  // 얕은 의미의 배열 복사 수행(주소값 복사)
		
		int[] copys2 = copyArray(nums);       // copyArray()메소드 호출 하면서 nums를 넘겨받겠다.
											  // 깊은 의미의 배열 복사 수행->사용자 정의 메소드 호출->데이터 복사

		int[] copys3 = (int[])nums.clone();   // nums에 clone()이라는 메소드를 호출(자바에서 이미 clone()이라는 메소드를 반환해놓음)
											  // copys3>nums.clone()이므로 int로 형변환
											  // 깊은 의미의 배열 복사 수행(데이터 복사)->자바가 제공하는 clone()메소드 사용
											  // nums.clone(); = object 타입을 반환하는 것이고 (int[])nums.clone(); = int배열타입을 반환하므로 다운 캐스팅이 된 것임.
											  //                                                                    = 이유는 object는 최상의 클래스이기 때문.
											  //                                                                    = 어떤 타입이 와도 object보다 아래이기 때문에 다운캐스팅 됨.
											  // clone() = object 안에 있는 메소드


		// 원본 배열(nums) 요소의 수정 발생
		nums[1] = 2345;


		//결과 확인
		for (int i=0; i<nums.length; i++)
		{
			System.out.printf("%5d", nums[i]);
		}
		System.out.println();
		//   10 2345   30   40   50

		for (int i=0; i<copys1.length; i++)
		{
			System.out.printf("%5d", copys1[i]);
		}
		System.out.println();
		//   10 2345   30   40   50

		for (int i=0; i<copys2.length; i++)
		{
			System.out.printf("%5d", copys2[i]);
		}
		System.out.println();
		//   10   20   30   40   50

		for (int i=0; i<copys3.length; i++)
		{
			System.out.printf("%5d", copys3[i]);
		}
		System.out.println();
		//   10   20   30   40   50
	}
	
	// 매개변수로  int배열 타입을 넘겨받아
	// 이 배열을 복사한 후
	// 복사한 배열을 반환하는 기능을 가진 메소드 정의
	public static int[] copyArray(int[] os)
		       //------                ----
			 //복사한 배열           배열 변수명
		 //어디로 반환할 것인가
	{
		//매개변수로 넘겨받은 배열(os)
		//즉, 원본 배열만큼의 배열방(메모리 공간)을 확보한
		//복사할 배열 생성
		//int[] result;
		//     +
		//result = new int[]
		int[] result = new int[os.length];
		
		//원본 배열(os)에 담겨있는 각각의 요소들을 복사 배열(result)에 담아내기
		//result = os; -> 주소값만 담는 것이라 안됨.
		for (int i=0; i<os.length; i++)       //result.length=os.length
		{
			result[i] = os[i];
		}
		
		//복사한 배열(result) 반환
		return result;
	}
}