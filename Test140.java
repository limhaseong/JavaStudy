/*=================================
���� �ڹ��� �ֿ�(�߿�) Ŭ���� ����
- �ڹٿ��� �⺻������ �����ϴ� �ֿ� Ŭ������
- StringTokenizer Ŭ���� (���丸 �����ϴ� Ŭ����)
=================================*/

//�ڹ� api���� �ǵ����̸� ���� ����� �ϴ� �Ŷ� ���丸 ����(������ ����)
//��ū ���� -> Scanner�� �ʱ���(Test017.java)

/*
- StringTokenizerŬ������
  ���ڿ� �Ľ�(parsing)�� ���� ������ �����ϴ� Ŭ������
  �Ľ�(parsing)�ϰ��� �ϴ� ���ڿ��� ���ڷ� �޾� �����ϴµ�,
  ���⿡�� ���Ǵ� �Ľ�(parsing)�̶�� ������
  �ϳ��� ���ڿ��� ���� ���ڿ��� ������ �۾��� �ǹ��ϰ� �Ǹ�,
  �� �� ������ ������ �Ǵ� ���ڿ��� ��ū(token)�̶�� �Ѵ�.

  StringTokenizerŬ������ ����ϱ� ���ؼ���
  java.util ��Ű���� StringTokenizer �� import�ؾ� �Ѵ�.

  StringTokenizerŬ������ ȣȯ��(ȣȯ�� ������ �Ⱦ��� �� ����)�� �����ϴ� ��������
  ���� �����ǰ� ������, ���ڿ��� �Ľ�(parsing)�ϱ� ���ؼ���
  String Ŭ������ split()�޼ҵ峪 javax.util.regex��Ű����
  ����� ���� �����ϰ� �ִ�.

- ������
	: 1. ����
	     StringTokenizer(String str)
		 StringTokenizer(String str, String delim)
		 StringTokenizer(String str, String delim, boolean returnDelims)
		 : �־��� ���ڿ� str�� �ܾ�� �и��ϴ� ��ü�� �����ϸ�
		   ����(����) ���ڴ� delim�� ���Ե� ���ڷ� ó���ϰ� �ȴ�.
		   ���� returnDelims�� true�̸�
		   ���� ���ڵ� �и��� �����ͷ� ó���ϰ� �ȴ�.
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Test140
{
	public static void main(String[] args) throws IOException
	{
		String strTemp;
		String[] strArr;
		int n;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("�Ľ��� ���ڿ� �Է�(�ĸ� ����) : ");
		strTemp = br.readLine();
		//ex) ���, ����, �ٳ���, ����

		//StringTokenizerŬ���� �ν��Ͻ� ����
		StringTokenizer st = new StringTokenizer(strTemp, ",");
		//strTemp�� ��� ���ڿ���...(���, ����, �ٳ���, ����)
		// ","�� �����ڷ�...

		//�׽�Ʈ
		//System.out.println(st.countTokens());
		//�Ľ��� ���ڿ� �Է�(�ĸ� ����) : ��� , ����, �ٳ���, ����
		//4
		//StringTokenizer �� int countTokens() �޼ҵ��(int���� ��ȯ�ϴ� countTokens()�޼ҵ�)
		// �Ľ̵� ���ڿ��� ������ ��ȯ(����)�Ѵ�.

		strArr = new String[st.countTokens()];            //st.countTokens = 4 (���, ����, �ٳ���, ����)

		//strArr = new String[st.countTokens]; 
		//           |
		//strArr = new String[4]; �� ����
		n=0;
		while (st.hasMoreTokens())   //true��ȯ           //hasMoreTokens()���� ���, ����, �ٳ���, ������ �ִٰ� �˷��ָ�(true ��ȯ�ϸ�)
		{									              //nextToken();���� true�� �����������, true�� ���� ��������, true�� �ٳ��� ��������, true�� ���� ������
												          //����, hasMoreTokens()�� nextToken()�� ¦�̶�� ���� ��.
			strArr[n++] = st.nextToken();
			//strArr[0] = st.nextToken();
			//            ---------------
			//               ���
			//strArr[0] = "���";  //hasMoreTokens()�� true�϶���.
			//strArr[1] = "����";  //hasMoreTokens()�� true�϶���.
			//strArr[2] = "�ٳ���";  //hasMoreTokens()�� true�϶���.
			//strArr[3] = "����";  //hasMoreTokens()�� true�϶���.
			//���Ŀ� hasMoreTokens()�� false�� ��.

			// hasMoreTokens()
			//	: ����� �� �ִ� ��ū�� �����ִ� ��� true�� ��ȯ
			//    �� �̻� ����� ��ū�� ���� ��� false�� ��ȯ.
			//    Ȯ�ο� ���� ����� ��ȯ�� ��
			//    ���� ������ �о�������� �ʰ�,
			//    ���� ������ �о���̴� ��带 �̵���Ű���� �ʴ´�.

			// nextToken()
			//	: ���� ��ū�� ���´�.
			//    ���� ��ū�� ������ ��带 �̵���Ű�� �ȴ�.
			//    �����ڸ� �ٲپ��� ��� ���� ȣ�⿡��
			//    �ٲ� �����ڸ� �̿��Ͽ� ��ū�� �и��Ѵ�.
		}
		System.out.print("�Ľ̵� ��ū(���ڿ�) : ");
		for (String str : strArr)
			System.out.print(str + " ");
		System.out.println();
		
		//�Ľ��� ���ڿ� �Է�(�ĸ� ����) : ���,����,�ٳ���,����
		//�Ľ̵� ��ū(���ڿ�) : ��� ���� �ٳ��� ����


	}
}
