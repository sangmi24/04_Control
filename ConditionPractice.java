package com.kh.chap01.practice.example;

import java.util.Scanner;

public class ConditionPractice {

	public void method1() {
		//사용자 입력받아서 그 문자열만큼 반복 index번째 하나씩 추출
		Scanner sc = new Scanner(System.in);
	
		System.out.print("문자열을 입력하세요: ");
		String str = sc.nextLine();
		//반복 for문, 문자열만큼 반복
		for(int i = 0 ; i < str.length() ; i++) { //.length 는 문자열 길이
			
			System.out.println(i +"번째 문자 :" + str.charAt(i) );
			
	    }
	}
	public void practice5() {
		//조건문 실습예제
		//아이디,비번 정해두고 로그인 기능
		//성공시, 아이디가 틀렸을시, 비밀번호가 틀렸을시,모두 틀렸을시-> 출력
		
		Scanner sc = new Scanner(System.in); //스캐너
		System.out.print("아이디: "); //입력유도
		String inputid = sc.nextLine();
		System.out.print("비밀번호: ");
		String inputpass = sc.nextLine();
		//아이디, 비번 정하기
		String id ="boram";
		String pass = "1234";
		//경우의 수: 성공시, 아이디가 틀렸을시, 비밀번호틀렸을시, 모두 틀렸을시 
		if(inputid.equals(id)&&inputpass.equals(pass)) {
			System.out.println("로그인 성공");
		}else if (inputpass.equals(pass)) {
			System.out.println("아이디가 틀렸습니다.");
		}else if(inputid.equals(id)){ 
			System.out.println("비밀번호가 틀렸습니다.");
		}else {
			System.out.println("아이디와 비밀번호가 틀렸습니다.");
		}
	}
	  public void practice1() {
		  System.out.println("1. 입력\n2. 수정\n3. 조회\n4. 삭제\n9. 종료");		  
          
		  Scanner sc = new Scanner(System.in);
		  System.out.print("메뉴 번호를 입력하세요 : ");
		  int num = sc.nextInt();
			  if(num==1) {
				  System.out.println("입력 메뉴입니다. ");
			    }else if(num==2) {
				  System.out.println("수정 메뉴입니다. ");	  
			    }else if(num==3) {
				  System.out.println("조회 메뉴입니다. ");
			    }else if(num==4) {
				  System.out.println("삭제 메뉴입니다. ");
			  }else {
				  System.out.println("프로그램이 종료됩니다. ");
				
			  }
		  }
	  public void practice2() {
		  
		  Scanner sc = new Scanner(System.in);
		  System.out.print("숫자를 한개 입력하세요 : ");
		  int num = sc.nextInt();
		  //양수이면서 짝수/홀수   양수아닌거
		  
		  if(num>0) {
			  if((num%2)==0) {
				  System.out.println("짝수다 ");
				  }
				  else{
					  System.out.println("홀수다 "); 
				  }
		       }
		     else {
			  System.out.println("양수만 입력해주세요.");
		  }  
	  }
	  public void practice3() {
		  Scanner sc = new Scanner(System.in);
		  System.out.print("국어 점수 : ");
		  int score1 = sc.nextInt();
		  System.out.print("수학 점수 : ");
		  int score2 = sc.nextInt();
		  System.out.print("영어 점수 : ");
		  int score3 = sc.nextInt();
		  int sum  = (score1+score2+score3);
		  double aver = sum/3 ;
		  
		  if(score1>=40&&score2>=40&&score3>=40&&aver>=60)
		     {
			  System.out.print("국어: "+score1+"\n수학: "+score2+"\n영어 : "+score3);
			  System.out.print("\n합계: "+sum+"\n평균: "+aver);
			  System.out.print("\n축하합니다, 합격입니다!");
		  }else {
			  System.out.print("불합격입니다.");
		  }
	  }
	  
	      public void practice4() {
	    	  
	    	 Scanner sc = new Scanner(System.in);
	    	 System.out.print("1~12사이의 정수 입력: ");
	    	 int month =sc.nextInt();
	    	 sc.nextLine();
	    	 
	    	 String result=""; //문자열 변수를 활용

	    	 switch(month) {
	    	
	    	 case 12:
	    	 case 1:
	    	 case 2:
	    		 result ="겨울";
	    		 break;
	    	 case 3:
	    	 case 4:
	    	 case 5:
	    		 result="봄";
	    		 break;
	    	 case 6:
	    	 case 7:
	    	 case 8:
	    		 result="여름";
	    		 break; 
	    	 case 9:
	    	 case 10:
	    	 case 11:
	    		 result="가을";
	    		 break; 
	    	default:
	    		result= "잘못 입력된 달";
	    	    System.out.printf("%d월은 %s입니다.",month,result);
	    	    return;	 
	    	 }	    	  
	    	  System.out.printf("%d월은 %s입니다.",month,result);
	      }
	      public void practice6() {
	    	 
	    	  Scanner sc = new Scanner(System.in);
	    	  System.out.print("권한을 확인하고자 하는 회원 등급 : ");
	    	  String rating = sc.nextLine();
	    	  String result="";
	    	  
	    	  switch(rating) {
	    	  case "관리자": 
	    		result="회원관리, 게시글 관리\n게시글 작성, 댓글 작성\n게시글 조회";
	    		break;
	    	  case "회원"	 :
	    		 result="게시글 작성, 댓글 작성\n게시글 조회";
	    		 break;
	    	  case "비회원" :
	    		  result="게시글 조회";
	    		  break;
	    	  default :
	    		  result="잘못 입력했습니다.";
	    		  System.out.println(result);
	    		  return;   		  
	    	  }
	    	  System.out.println(result); 	  
	      }
	      
	      public void practice7() {
	    	Scanner sc = new Scanner(System.in);
	    	System.out.print("키(m)를 입력해 주세요 : ");
	    	double height = sc.nextDouble();
	    	sc.nextLine();
	    	System.out.print("몸무게(kg)를 입력해 주세요 : ");
	    	double weight =sc.nextDouble();
	    	sc.nextLine();
	    	double bmi = weight/(height*height);
	    	System.out.println("BMI 지수: "+bmi);
	    	
	    	if(bmi<18.5) {
	    		System.out.println("저체중");
	    	}else if(bmi<23) {
	    		System.out.println("정상체중");
	    	}else if(bmi<25) {
	    		System.out.println("과체중");
	    	}else if(bmi<30) {
	    		System.out.println("비만");
	    	}else {
	    		System.out.println("고도 비만");
	    	}

	      }
	     public void practice8() {
	    	
	    	 Scanner sc = new Scanner(System.in);
	    	 System.out.print("피연산자1 입력 : ");
	    	 int num1 = sc.nextInt();
	    	 sc.nextLine();
	    	 System.out.print("피연산자2 입력 : ");
	    	 int num2 = sc.nextInt();
	    	 sc.nextLine();
	    	 System.out.print("연산자를 입력(+,-,*,/,%) :");
	    	 String sign = sc.nextLine();
	    	 	    			 
	    	 if(num1>0 && num2>0 && (sign.equals("+") || sign.equals("-")
	    	    || sign.equals("*") || sign.equals("/") || sign.equals("%")) ) 
	    	  {
	    		 
	    	   if(sign.equals("+")) {
	    		   System.out.printf("%d %s %d = %d",num1,sign,num2,num1+num2);
	    	   }else if(sign.equals("-")) {
	    		    System.out.printf("%d %s %d = %d",num1,sign,num2,num1-num2);
	    	   }else if(sign.equals("*")) {
	    		   System.out.printf("%d %s %d = %d",num1,sign,num2,num1*num2);
	    	   }else if(sign.equals("/")) {
	    		   System.out.printf("%d %s %d = %d",num1,sign,num2,num1/num2);
	    	   }else if(sign.equals("%")) {
	    		   System.out.printf("%d %s %d = %d",num1,sign,num2,num1%num2);
	    	   }    
	    		 	 
	    	 }else {
	    		 System.out.println("잘못 입력하셨습니다. 프로그램을 종료합니다.");
	    	 }
    	 
	     }
	      public void practice9() {
	    	  
	    	 
	    	  
	    	  
	    	  
	    	  
	    	  
	    	  
	    	  
	    	  
	    	  
	      }
	      
	      
	      
	  
	  
	  
	  
	  }
	
	
	

	
	
	

