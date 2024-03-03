/*=================================
���� �ڹ��� �ֿ�(�߿�) Ŭ���� ����
- �ڹٿ��� �⺻������ �����ϴ� �ֿ� Ŭ������
- StringBuffer Ŭ����
=================================*/

/*
- StringBuffer Ŭ����                                                     //Buffer -> ���۸��Ҷ��� ����(�ӽ÷� ��Ƶδ� ��)
	: ���ڿ��� ó���ϴ� Ŭ������ String Ŭ�������� ��������
	  String Ŭ������ ���� ���ڿ� �������� ������ �Ұ���������
      StringBuffer Ŭ������ ���ڿ��� ����� ��
	  ���� ���ڿ��� ���� �ܰ迡�� ������ �� �ִ�.

	  ��, StringBuffer ��ü�� �������� ����(ũ�� �������, �۰� ������� ����)�� �����Ƿ�
	  ��ü�� �����ϴ� �������� �̸� �� ũ�⳪ ���� �����ϰų�
	  ���� ������ ������ ũ�⸦ �ٲ� �� �ִ� ����� �����Ѵ�.

	  ���� JDK 1.5 ���ĺ��ʹ�
	  ���ڿ��� ó���ϴ� StringBuilder ��� Ŭ������ �����Ѵ�.
      StringBuilder Ŭ������ ����� StringBuffer Ŭ������ ����������
	  ���� ū �������� multi-thread unsafe(unsafety)��� ���̴�.                  //������ = �ڱ� �ϸ� ó���ϴ� ���� ����, �۾��� ��� �ǹ̰� ����
	  ��, Syncronization(����ȭ)�� ���� ������
	  StringBuffer ���� ������, ���ü�(����ȭ) ������ ���ٸ�                      //StringBuffer �� ����� ���� ���� ��Ƽ�����忡�� ���������� ����
	  StringBuilder�� ����ϴ� ���� ������ ����ų �� �ִ�.                      //StringBuilder�� ��Ƽ�����忡�� �������� ������ ������ ���� ������.
*/

public class Test138
{
	public static void main(String[] args)
	{
		String str1 = new String("seoul");
		String str2 = new String("seoul");

		System.out.println(str1 == str2);
		System.out.println(str1.equals(str2));        //String���� Object�� �޾Ƽ� ���� ���ϴ� �� = equals() -> �������̵� ��
		//false
		//true

		StringBuffer sb1 = new StringBuffer("korea");
		StringBuffer sb2 = new StringBuffer("korea");

		System.out.println(sb1 == sb2);
		System.out.println(sb1.equals(sb2));         //StringBuffer������ equals�� �������̵� ���� ����.
		//false
		//false
		
		System.out.println("------------------------------------------------------------------------------------------");

		System.out.println(sb1);
		//korea
		//��Ʈ�� ���ۿ��� Object�� toString()�� �������̵� �ߴٴ� �� �˾ƾߵ�

		System.out.println(sb1.toString());
		//                 ---
		//             ��Ʈ�� ���� ��ü ���
		//sb1.toString() = ��Ʈ���� ����� ��.
		//korea

		System.out.println(sb1.toString().equals(sb2.toString()));
		//true
		//�̰��� ��Ʈ���� equals��. ���� sb2.toString() �� ����� �̷��� �ۼ�

		System.out.println("------------------------------------------------------------------------------------------");
		
		StringBuffer sb3 = new StringBuffer();
		//StringBuffer �⺻ ������ ȣ��(�ν��Ͻ� ���� ����)
		//�⺻������ �����Ǵ� ������ ũ��� 16

		//capacity() -> ������ ũ�� �� �� ����
		System.out.println("���� ũ�� : " + sb3.capacity());
		//���� ũ�� : 16

		//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

		System.out.println(sb3);
		// �ƹ��͵� ������
		
		/*
		String name = "�ڶ���";
		name += "�ڶ���"; //�ڶ��� �ҽ� �ڶ����ڶ��� ����
		name += "�ڶ���"; //�ڶ����ڶ��� �ҽ� �ڶ����ڶ����ڶ��� ����
		name += "������"; //�ڶ����ڶ����ڶ��� �ҽ� �ڶ����ڶ����ڶ��������� ���� -> �޸������� ������
		
		System.out.println(name);
		//�ڶ����ڶ����ڶ���������
		*/

		sb3.append("seoul");          //sb3+="seoul";
		sb3.append("korea");          //sb3+="korea";
		sb3.append("�츮����");       //sb3+="�츮����";
		sb3.append("���ѹα�");       //sb3+="���ѹα�";
		//������ ���� �޸𸮸� �ξ� �� ���� ��
		System.out.println(sb3);
		//seoulkorea�츮������ѹα�
		//StringBuffer Ÿ��
		System.out.println(sb3.toString());
		//seoulkorea�츮������ѹα�
		//String Ÿ��

		//���� ũ�� �ٽ� Ȯ��
		System.out.println("���� ũ�� : " + sb3.capacity());
		//���� ũ�� : 34

		//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

		String temp1 = "java and oracle";
		//String Ÿ��

		System.out.println(temp1.toUpperCase());          //to~ = ��ȯ
		//JAVA AND ORACLE
		//�ҹ��ڰ� �빮�ڷ� ��ȯ

		String temp2 = "JAVA AND ORACLE";
		System.out.println(temp2.toLowerCase());
		//java and oracle
		//�빮�ڰ� �ҹ��ڷ� ��ȯ
		//StringŸ�Բ��� ���

		//System.out.println(sb3.toUpperCase());
		//System.out.println(sb3.toLowerCase());
		//������ ���� �߻�

		//seoulkorea�츮������ѹα�
		String temp3 = sb3.toString();
		System.out.println(temp3.toUpperCase());
		//SEOULKOREA�츮������ѹα�
		System.out.println(sb3.toString().toUpperCase()); //�ٷ� �� 2���� 1�ٷ� �� ��.
		//SEOULKOREA�츮������ѹα�

		//seoulkorea�츮������ѹα�
		// - ��� ���ڿ�(sb3 -> "seoulkorea�츮������ѹα�") ��
		//   "seoul" ���ڿ� �տ� "�ѱ�"�̶�� ���ڿ� �߰�
		//   ��, �ѱ�seoulkorea�츮������ѹα� ���� ����
		sb3.insert(0, "�ѱ�");        //insert(���° �ڸ�, "�� ���ڿ�")
		System.out.println("seoul �տ� �ѱ� �߰� : " + sb3);
		//seoul �տ� �ѱ� �߰� : �ѱ�seoulkorea�츮������ѹα�
		System.out.println("seoul �տ� �ѱ� �߰� : " + sb3.toString());
		//seoul �տ� �ѱ� �߰� : �ѱ�seoulkorea�츮������ѹα�

		//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

		// - ��� ���ڿ�(sb3 -> "�ѱ�seoulkorea�츮������ѹα�")
		//   "korea" ���ڿ� �ڿ� "���"�̶�� ���ڿ� �߰�
		//   ��, ��� ���ڿ��� �ε����� ������ ���� Ȯ������ �ʰ�
		//   ��, �ѱ�seoulkorea����츮������ѹα� ���� ����

		//�׽�Ʈ1
		System.out.println(sb3.toString());
		//�ѱ�seoulkorea�츮������ѹα�

		//�׽�Ʈ2 -> ���� �ε����� Ȯ������ ���� �ϱ�� �׽�Ʈ 2�� ���ϴ� ���� �ƴ�
		//sb3.insert(12, "���");
		//System.out.println("korea �ڿ� ��� �߰� : " + sb3);
		//korea �ڿ� ��� �߰� : �ѱ�seoulkorea����츮������ѹα�
		//System.out.println("korea �ڿ� ��� �߰� : " + sb3.toString());
		//korea �ڿ� ��� �߰� : �ѱ�seoulkorea����츮������ѹα�
		
		//�׽�Ʈ3
		//sb.indexOf("korea");  //korea��� �ܾ ã�ƶ�
		//System.out.println(sb3.indexOf("korea"));
		//7

		//�׽�Ʈ4
		//System.out.println(sb3.insert(sb3.indexOf("korea"), "���"));
		//�ѱ�seoul���korea�츮������ѹα�

		//�׽�Ʈ5
		//System.out.println(sb3.insert(sb3.indexOf("korea") + 5, "���"));
		//�ѱ�seoul���korea����츮������ѹα�

		//�׽�Ʈ6
		System.out.println(sb3.insert(sb3.indexOf("korea") + "korea".length(), "���"));
		//�ѱ�seoulkorea����츮������ѹα�
		
		System.out.println(sb3.toString());
		//�ѱ�seoulkorea����츮������ѹα�
		
		//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

		// - ��� ���ڿ�(sb3)����
		//   �츮���� ���ڿ� ����
		//sb3.delete(14, 18);
		//System.out.println(sb3);
		//�ѱ�seoulkorea������ѹα�
		sb3.indexOf("�츮����");
		//System.out.println(sb3.indexOf("�츮����"));
		System.out.println(sb3.delete(sb3.indexOf("�츮����"), sb3.indexOf("�츮����")+"�츮����".length()));
		//sb3.delete(14, 18);
		//           --- ---
		//            |   |
		//            |   sb3.indexOf("�츮����")+"�츮����".length()
		//            |
		//    sb3.indexOf("�츮����")

		// - ��� ���ڿ�(sb3)����
		//   korea���� ��� ���ڿ� ����(korea ����)
		//   �ѱ�seoulkorea������ѹα� -> �ѱ�seoul
		/*
		sb3.indexOf("korea");
		sb3.indexOf("�α�");
		System.out.println(sb3.delete(sb3.indexOf("korea"), sb3.indexOf("�α�")+"�α�".length()));
		//�ѱ�seoul
		*/
		//sb3.delete(7, 18);
		//System.out.println(sb3.toString());
		//�ѱ�seoul

		//sb3.delete(7);                        //--> �Ű����� �ϳ� �ѱ�� �� �ȵ�
		//System.out.println(sb3.toString());

		//sb3.delete(7, 18);
		//        --- ---
		//         |   |
		//         |  sb3.length()
		//         |
		// sb3.indexOf("korea");
		sb3.delete(sb3.indexOf("korea"), sb3.length());
		System.out.println(sb3);
		//�ѱ�seoul

		//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

		//���� ũ�� �ٽ� Ȯ��
		System.out.println("���� ũ�� : " + sb3.capacity());
		//���� ũ�� : 34
		//������ �ڵ� �����ε� ���Ҵ� �ڵ� ���Ұ� �ƴ�

		//���ڿ�(sb3)�� ���� Ȯ��
		System.out.println("���ڿ� ���� : " + sb3.length());
		//���ڿ� ���� : 7

		//���� ũ�� ����
		// -> ���� ���ڿ��� ��Ƶ� �� �ִ� ������ ũ���...
		//trimToSize()
		sb3.trimToSize();

		//���� ũ�� ���� ���� ���� ũ�� �ٽ� Ȯ��
		System.out.println("���� ũ�� : " + sb3.capacity());
		//���� ũ�� : 7

		





		




	}
}