package edu.kh.variable.ex1;

public class VariableExample4 {
	public static void main(String[] args) {
		/*강제 형변환
		 *-기존 자료형을 원하는 자료형으로 강제 변환시키는 것
		 *
		 * 1) 값의 범위가 큰 자료형을 작은걸로 변환시킬 때
		 * 2) 출력되는 데이터의 표기법을 변화시키고 싶을 때
		 * 
		 * 강제 형변환 방법
		 * -자료형을 변환시키고 싶은 값 또는 변수 앞에 (자료형)을 작성
		 * ex) double temp = 3.14;
		 * 		int num = (int)temp;
		 * */
		
		double temp = 3.14; //temp : 빈공간을 알려줄때 사용하는 변수?
		int num = (int) temp;
		System.out.println("temp: " + temp); //3.14
		System.out.println("num: " + num); //3
		
		//실수 -> 정수형 변환 시 소수점 버림처리 (데이터 손실)
		System.out.println();
	}
}
