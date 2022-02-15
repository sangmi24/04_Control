package kr.or.iei.func;

import java.util.Scanner;

public class Question {
//*가위 바위 보 게임 만들기
//1.난수를 발생 시켜 랜덤하게 가위 바위 보 문자열을 생성
//  1)가위 바위 보 중 scanner로 부터 입력 받고 , 2)난수를 발생시켜 랜덤하게 가위 바위 보 문자열을 생성한다. 
//2.랜덤한 가위 바위 보 문자열과 입력한 문자열이 비교하여 같으면 비겼다고 출력
//3.랜덤한 가위 바위 보 문자열과 입력한 문자열이 비교하여 이긴 경우 이겼다고 출력, 진경우 졌다고 출력
//	=>이게 한판 
//4.이 과정을 5회 반복후 아래 실행 결과 처럼 몇 번 이겼는지, 몇번 졌는지, 몇번 비겼는지 출력한다.
//5. 만약 문자열 입력시 가위 바위 보 이외의 문자열을 입력한 경우 아래 실행 결과처럼 잘못된 입력이라고 출력후
//   해당 회차의 게임을 다시 진행한다.
/*
 * 1 번째 가위 바위 보 게임을 시작합니다.
가위 바위 보 중 한 개를 입력하세요 : 가위
당신은 가위를 냈습니다.
컴퓨터는 바위를 냈습니다.
꽝! 당신이 졌습니다!
-------------------------------	
 */
   public void exam1 () {
	   
	   Scanner sc = new Scanner(System.in);
	   System.out.println("***재미있는 가위 바위 보 게임***");
	  
	   // 합을 위한 변수를 하나 선언하고 0으로 초기화
	   int winCount = 0;   //이긴 횟수 카운트 
	   int loseCount = 0;  //진 횟수 카운트 
	   
	   
	   for( int i =0; i<5 ; i++)  {  //반복 => 5번 반복
		   
		   System.out.println((i+1)+"번째 가위 바위 보 게임을 시작합니다");
		   
		   System.out.print("가위 바위 보 중 하나를 입력하세요 : ");
		   String you = sc.nextLine(); //"가위", "바위", "보" you라는 변수 생성
		   
		   //일단 문자열이 유효한지 체크 
		   
		   if (you.equals("가위") || you.equals("바위") || you.equals("보")) { //맞을 경우 => 가위바위보 진행
			   
			   //난수=> Math.random()
			   int random = (int)((Math.random()*3)+1); //1,2,3 중 매번 랜덤
			   
			   //1 2 3 을 각각 "가위", "바위","보" 로 매칭 => switch문
			   String computer = ""; //컴퓨터 변수 하나 생성
			   switch (random) {
			   case 1 :
				   computer ="가위";
				   break;
			   case 2 :
				   computer ="바위";
				   break;
			   case 3 :
				   computer ="보";
				   break;
			   } //화면에 나는 뭐를 냈고, 컴퓨터는 뭐를 냈는지 출력
			   System.out.println("당신은 "+you+" 냈습니다.");
			   System.out.println("컴퓨터는 "+computer+" 냈습니다.");
			   
			   //이겼는지 졌는지 비겼는지 확인
			   if (computer.equals(you)) {//비겼을 경우
				   System.out.println("비겼습니다.");  
			   }
			   else { //비기지 않았을 경우 == 이겼거나 졌을 경우
				   /*
				    * 이김의 조건
				    * 가위 <바위  
				    * 바위 <보
				    * 보 < 가위
				    */
				   //사용자 시점에서 
				   if (computer.equals("가위")&&you.equals("바위") ||
						computer.equals("바위")&&you.equals("보") ||
						computer.equals("보")&&you.equals("가위")) { //이길 경우
					   System.out.println("짝짝! 당신이 이겼습니다!");
					   winCount++;  //winCount += 1;
				   }
				   else { //이기지 않았을 경우
					   System.out.println("꽝! 당신이 졌습니다.");
					   loseCount++;  //loseCount +=1;
   				      }
			        }	   
		           }
		       else { //아닐 경우 => 잘못된 입력입니다. 
			      System.out.println("잘못된 입력입니다.");
		      //해당 회차를 다시 진행할거에 (증감식)대비해서 1을 미리 뺀것..
			      i-- ; // i = i-1;
		        } 
		   System.out.println("---------------------");
	   }
	   //이 시점까지는 가위 바위 보 게임을 5판 진행이 완료됨 
	   //이긴 판수, 진판수, 비긴판수를 출력
	   System.out.println("이긴 판수 : "+winCount);
	   System.out.println("진 판수 :" +loseCount);
	   System.out.println("비긴 판수 : "+(5-winCount-loseCount));
	   System.out.println("가위 바위 보 게임을 종료 합니다.");
	   /*
	    * 1. 한 판당 (한 횟수당) 일어날 일을 제대로 코딩
	    * 2. 횟수 생각해서 for문으로 감싸기
	    * 3. 그 나머지 보완 할 것들 생각하기
	    */
	   
    }
   }	   
	   
   
	   
//	   if(comNum.equals(str1)){
//	   //String random =  str (Math.random()) ;  //math.random 앞에 어떤변수를  써야 할지 모르겠습니다.
//	   //i 반복 1,2,3,4,5
//	   for(int i =1; i<6 ; i++){ {
//		   System.out.println(i+"번째 가위 바위 보 게임을 시작합니다.");
//		   System.out.print("가위 바위 보 중 한개를 입력하세요 : "+ conNum ); 
//		
//		   
//	   if(comNum==str1) {
//		   System.out.println( "당신은 가위를 냈습니다." );}
//		   else if (random==str2) {
//			   System.out.println("컴퓨터는 바위를 냈습니다");}
//	       else if(random==str3) {
//		  System.out.println("꽝! 당신이 졌습니다.");		  
//	         }
//		   }
//	   if (random==str2) {
//		   System.out.println( "당신은 바위를 냈습니다." );}
//	   else if (random==str2) {
//		   System.out.println("컴퓨터는 가위를 냈습니다");}
//       else if(random==str3) {
//	  System.out.println("짝짝! 당신이 이겼습니다.");		  
//         }
//	   }
//	   if (random==str3) {
//		   System.out.println( "당신은 보를 냈습니다." );}
//	   else if (random==str2) {
//		   System.out.println("컴퓨터는 보를 냈습니다");}
//       else if(random==str3) {
//	  System.out.println("비겼습니다.");		  
//         }
//	   
//   
//   
//   }
//      
	   
	   
	   
	   
	   
	   
	   
	   
   

	
