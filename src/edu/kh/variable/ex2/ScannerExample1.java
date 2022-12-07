package edu.kh.variable.ex2;

import java.util.Scanner; // 스캐너는 여기에다가 적아야댐

public class ScannerExample1 {

	public static void main(String[] args) {

		//Scanner : 프로그램 실행 중 키보드 입력을 받을 수 있게하는 역할
		
		//Scanner 생성
		//-> 프로그램 안에 스캐너라는 기계를 만든 것
		Scanner sc = new Scanner(System.in );
		// import를 안해와서 오류
		// Scanner를 만들어서 쓰고싶은데 설계도가 없음
		// import 해오라는 에러 발생! ==> 임포트 해오면 오류 해결
		
		//System.out.println("값을 입력하시오 : ");
		//int input1 = sc.nextInt();  //입력받은 정수를 input1에 대입
		// nextInt() : 다음 임력된 정수를 읽어옴 (키보드로 입력된 정수를 읽어옴)
		//System.out.println(input1);
		
		
		//System.out.println("실수만 입력해 : ");
		//double input2 = sc.nextDouble();
		//System.out.println(input2);
		
		//안녕? 반가워! 밥먹을래?
		System.out.print("입력1: ");
		String input3 = sc.next();
		//next() : 다음 입력된 한 단어를 읽어옴
		//nextLine() : 띄어쓰기 한 문장도 읽어 옴
		System.out.println(input3);
		
		System.out.print("입력2: ");
		String input4 = input3 + sc.next(); 
		//여기에 input3를 적은 이유 안녕반가워 같이 나오게 하고 싶어서
		System.out.println(input4);
		
	}

}
