package com.kh.chap01.condition;

import java.util.Scanner;

public class A_If {

	/*
	 * *단독 if문
	 * 조건을 단독적으로 한개만 제시할 경우
	 * 
	 * [ 표현법 ] 
	 * if(조건식) { 
	 *     해당 조건식의 결과가 true 일 경우에 실행할 코드 
	 * }
	 * 
	 * => 조건식의 결과가 참(true) 일경우 중괄호 블럭 안에 있는 코드가 실행됨
	 * => 조건식의 결과가 거짓(false) 일경우 중괄호 블럭 안의 코드를 무시하고 넘어감
	 */
	
	public void method1() {
		
		//삼항연산자에서 양수, 0, 음수  (method4)
		//사용자로부터 정수값을 입력받은 후 "양수다.", "0이다.", "음수다." 문구 출력
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : " );
		int num =sc.nextInt();
		
		// (조건식)? true일경우 : false일경우 ->삼항연산자
		// 단독 if문 사용 
		
		// 경우의 수 1. 양수일 경우 (num > 0 )		
		if ( num >0 ) { 
			System.out.println("양수다.");	
		}
		//경우의 수 2. 0일 경우 (num == 0)
		if  (num == 0) {
			System.out.println("0이다.");
		}
		//경우의 수3. 음수일 경우 (num < 0 )
		if (num < 0) {
			System.out.println("음수이다.");			
		}
	}
	public void method2() {
		
		//사용자가 입력한 정수값이 짝수인지, 홀수인지를 판별해서 각각
		//"짝수다." , "홀수다." 를 출력
        
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 :" );
		int num = sc.nextInt();
		
		// 경우의 수1.짝수일 경우  (( num  %2 ) == 0 )
		if((num %2)==0) {
			System.out.println("짝수다.");
		} 
		//경우의 수2.홀수일 경우( (num % 2) == 1)
		if ((num%2) ==1) {
			System.out.println("홀수다.");
		}		
 	}
	//쉬는시간 실습문제
	public void method3() {
		// 사용자가 입력한 나이값을 가지고 
		//13세 이하면 "어린이 입니다."
		//13 초과~19세 이하까지 "청소년입니다."
		//19세초과면 "성인입니다." 출력
		
//		//버전1. 삼항연산자 사용
//		Scanner sc = new Scanner(System.in);
//		System.out.print("나이를 입력하세요. :");
//		int num = sc.nextInt();
//		// 결과값이 String이기 때문에 string 변수에 선언하여 대입, 중첩하기 
//		//(13세 이하)? "어린이" :(19세이하?) "청소년":"성인"
//		String age = (num <= 13)? "어린이입니다." :(num <=19)? 
//				"청소년입니다.":"성인입니다.";
//		System.out.printf( "%s", age );
//	}	  
		//버전2. 단독 if문 사용 
		Scanner sc = new Scanner(System.in);
		System.out.print("나이를 입력하세요. :");
		int num = sc.nextInt();
		//1.경우의수: 13세 이하
		if(num <= 13) {
			System.out.println("어린이입니다.");
		}
		//2.13초과~19세 이하
		if(13 <num && num <=19) {
			System.out.println("청소년입니다.");
		}
		//3.19세 초과
		if(19 <num) { 
			System.out.println("성인입니다.");		
		}
	}	
		public void method4() {
			//사용자에게 입력받은 주민등록번호를 가지고
			//남자 /여자 인지 판별 후 "남자입니다.", "여자입니다." 출력
			
			//1.사용자에게 주민등록번호 입력받기
			Scanner sc = new Scanner(System.in);
			System.out.print ("주민번호 입력 (-포함 ): ");
			//주민번호 : 생년월일 6글자 -(성별1자리)(6자리 숫자)
			//220211 => 숫자로 취급x , 문자열로 취급 
			String personId = sc.nextLine();
			
			//2.입력받은 주민번호로 부터 성별에 해당되는 문자를 추출해서 변수에 담기 (charAt 메소드)
			//220211-X000000
			//X: 성별에 해당 ( 7번째 인덱스)
			char gender = personId.charAt(7);
            
			//3. 성별에 해당되는 문자를 경우의 수로 나누기
			//=> 1 또는 3일 경우에는 남자
			//=> 2 또는 4일 경우에는 여자
			
			//남자일 경우 (gender == '1'(문자) ) || (gender == '3'(문자))
			if((gender=='1') || (gender=='3')) {
				System.out.println("남자입니다.");
		}
		   //여자일 경우 (gender == '2'(문자) ) || (gender == '4'(문자))
			if( (gender=='2')||(gender=='4')) {
				System.out.println("여자입니다.");
			}
			
			//그 이외의 숫자인 경우 => 잘못된 주민번호입니다.
			//'1'도 아니고 그리고  '2'도 아니고 그리고 '3'도 아니고 그리고'4'도 아닐경우 
			//(gender != '1') &&( gender !='2' ) && (gender !='3') &&(gender != '4')
            if((gender != '1') &&( gender !='2' ) && (gender !='3') &&(gender != '4')) {
            	System.out.println("잘못된 주민번호입니다.");
            }
            
	}
	
}





