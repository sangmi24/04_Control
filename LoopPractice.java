package com.kh.chap02.practice.example;

import java.util.Scanner;

public class LoopPractice {

	public void practice12() {
		//�ݺ��� ����
		//���� 2���� ������(���ڿ��� �Է� �ް� �Էµ� ������)�� ���� ��� ���
		//��, �ش� ���α׷��� ������ �Է¿� "exit"��� ���� ��� �ö����� ���� �ݺ�
		
		//  * �ȵǴ� ��� = 1. �����ڰ� ������&& �ι�° ������ 0�� ��� =>"0���� ���� �� �����ϴ�. �ٽ� �Է����ּ���."
		//              2. ���� ������ => "���� �������Դϴ�. �ٽ� �Է����ּ���."
		//       �� ��� ��� ó������ ���ư� ����ڰ� �ٽ� �����ں��� �Է��ϵ��� �ϼ���.    
			
        Scanner sc = new Scanner(System.in);
		
		while (true) {
			System.out.print("������(+, -, *, /, %) : ");
			String operator = sc.nextLine();  //exit ������ string �̾�� �Ѵ�. 
			                                  //char���ڷ� �������� ���� ����
			
			//���⿡�� �����ڸ� üũ�ϸ� ���ڸ� �Է¹ޱ� ���� �̸� ������ ��� �� ����!
			if(operator.equals("exit"))  {
			System.out.println("���α׷��� ���� �մϴ�.");
			break;
			}	
				
			System.out.print("����1 : ");
			int num1 = sc.nextInt();
			
			System.out.print("����2 : ");
            int num2 = sc.nextInt();
            sc.nextLine();
            //� ������ ������ �Ұ��ΰ��� �켱 �Ǻ�
            switch(operator){
            case "+" : System.out.println(num1+"+"+num2+ "="+(num1+num2));break;
            case "-" : System.out.println(num1+"-"+num2+ "="+(num1-num2));break;
            case "*" : System.out.println(num1+"*"+num2+ "="+(num1*num2));break;
            case "/" :
            	if(num2==0) {
            		System.out.println("0���� ���� �� �����ϴ�. �ٽ� �Է����ּ���.");
            		continue;  //���� while�� �ö� 
            	} 
            	System.out.println(num1+"/"+num2+ "="+(num1/num2));break;
            case "%" :
            	if(num2==0) {
            		System.out.println("0���� ������ �����ϴ�. �ٽ� �Է����ּ���.");
            		continue; //���� while�� �ö�
            	} 
            	System.out.println(num1+"%"+num2+ "="+(num1%num2));break;
            default : System.out.println("���� �������Դϴ�.�ٽ� �Է����ּ���. ");
            }
            
		}
		 
	} 	
	
	
}
