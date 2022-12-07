package edu.kh.variable.practice;

public class CastingPractice1 {
public static void main(String[] args) {
		
		int iNum1 = 10;
		int iNum2 = 4;
		float fNum = 3.0f;
		double dNum = 2.5;
		char ch = 'A';
		
		/*System.out.println(iNum1 - (iNum2 * 2)); //2
		
		int temp;
		
		temp = (int)dNum;
		System.out.println(temp); //2
		
		//-------------------------------
		
		System.out.println(dNum * 4); //10.0
		
		float temp1 = (float)iNum1;
		System.out.println(temp1); //10.0
		
		
		//-------------------------------
		
		System.out.println((iNum2 * 5) - (dNum * 7)); //2.5
		
		System.out.println(dNum); //2.5
		
		//------------------------------------
		
		int temp2;
		
		temp2 = (int)fNum;
		System.out.println(temp2); //3
		
		System.out.println((iNum1 * 3) - (temp2 * 9));
		
		//---------------------------------------
		
		System.out.println(iNum1 / fNum); //3.3333333
		
		// 3.333333333335 ?? 어케 하는지 모르겠음
		
		//------------------------------------------
		
		
	
		//System.out.println('ch'); 아니 따옴표까지 어케 출력하는거임
		System.out.println((int)'A'); //65
		System.out.println((int)'A' + iNum1); //75
		*/
		
//근데 아무래도 너무 긴듯
		
		//----------------------------------------------
		System.out.println( iNum2 /2 ); // 2
		System.out.println( (int)dNum ); // 2
		System.out.println( iNum2 * dNum ); // 10.0
		System.out.println( (double)iNum1 ); // 10.0
		System.out.println( (double)iNum1 / (double)iNum2 ); // 2.5
		System.out.println( dNum ); // 2.5
		System.out.println( (int)fNum ); // 3
		System.out.println( iNum1 / (int)fNum ); // 3
		System.out.println( (float)iNum1 / fNum );// 3.3333333
		System.out.println( (double)iNum1 / fNum ); // 3.3333333333333335
		System.out.println( "'" + ch + "'"); // 'A'
		System.out.println( (int)ch ); // 65
		System.out.println( (int)ch + iNum1 ); // 75
		//System.out.println( (ch iNum1) ); // 'K
		
	}
}
