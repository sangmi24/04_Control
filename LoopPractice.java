package com.kh.chap02.practice.example;

import java.util.Scanner;

public class LoopPractice {
 
	public void practice12() {
		
		//���� 2���� ������(���ڿ��� �Է� �ް� �Էµ� ������)�� ���� ��� ���
		//��, �ش� ���α׷��� ������ �Է¿� "exit"��� ���� ��� �ö����� ���� �ݺ�
		
		//  * �ȵǴ� ��� = 1. �����ڰ� ������&& �ι�° ������ 0�� ��� =>"0���� ���� �� �����ϴ�. �ٽ� �Է����ּ���."
		//              2. ���� ������ => "���� �������Դϴ�. �ٽ� �Է����ּ���."
		//       �� ��� ��� ó������ ���ư� ����ڰ� �ٽ� �����ں��� �Է��ϵ��� �ϼ���.    
		
		
		
		Scanner sc = new Scanner(System.in); //��ĳ��
		//�ݺ� �ؾ� �� (exit�� ������ ����ϰ� ����.)
		for(int i=0; i<1 ;i++)  {
			
		System.out.print("������(+, -, *, /, % ) : ");//�Է�����
		String oper= sc.nextLine(); //���� ���� 
		//������ �Է¿� exit�� ������ ����Ǿ� �ϴϱ� i--�� ����
		if(oper.equals("exit")){
			System.out.println("���α׷��� �����մϴ�.") ;	
		  break;	
		} else {
		
		System.out.print("����1 : "); //���� �Է� ����
		int num1 = sc.nextInt(); //���� ����
		sc.nextLine();
		System.out.print("����2 : ");
		int num2 = sc.nextInt();
        sc.nextLine();
        
		//������ ���̽�
		switch(oper){
		 
		case "+" :
		System.out.printf("%d + %d = %d",num1,num2,num1+num2  ) ;
		i--;
		break;
		
		case "-":
		 System.out.printf("%d - %d = %d",num1,num2,num1-num2 ) ;
		 i--;
		 break;
		 	
		case "*":
		System.out.printf("%d * %d = %d",num1,num2,num1*num2 ) ;
		i--;
		break;
		
		case "/":
		 if(num2==0) { //�ȵǴ� ���1. �����ڰ� ������&& �ι�° ������ 0�� ���
	     System.out.println("0���� ������ �����ϴ�. �ٽ� �Է����ּ���.");
		 i--;
		 }else
		System.out.printf("%d / %d = %d",num1,num2,num1/num2 ) ;
		i--;
		 break; 
		
		case "%":
		System.out.printf("%d / %d = %d",num1,num2,num1%num2 ) ;	
		i--;
		break;
		 
		default : //�ȵǴ� ���2. ���� ������ 
			System.out.println("���� �������Դϴ�. �ٽ� �Է����ּ���. ") ;	
			i--;
		   }	
	 	
	  }
		System.out.println("") ;
			
	}
			
			
  }
		
		
}
	

			
			
			
	