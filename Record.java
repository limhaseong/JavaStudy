/*=================================
■■■ 클래스와 인스턴스 ■■■
- 클래스와 인스턴스 활용
=================================*/

//Test101.java와 같이 보기

// 1. Record 클래스
//  속성만 존재하는 클래스로 설계할것

// 학생 1명

public class Record
{	
	//학생 1명을 표현할 수 있는 속성들로 구성
	//String[] names; = 이름들

	//int a;           //학생수
	String name;       //이름
	int tot=0;         //총합
	double avg;        //평균

	//int kor, eng, mat; //국어 영어 수학점수
	int[] score = new int[3]; //socre[0]->국어점수, score[1]->영어점수, score[2]->수학점수


	//추가 시
	int rank;        //석차
}