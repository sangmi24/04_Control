package com.kh.chap01.practice.example;

import java.util.Scanner;

public class ConditionPractice {

	public void method1() {
		//����� �Է¹޾Ƽ� �� ���ڿ���ŭ �ݺ� index��° �ϳ��� ����
		Scanner sc = new Scanner(System.in);
	
		System.out.print("���ڿ��� �Է��ϼ���: ");
		String str = sc.nextLine();
		//�ݺ� for��, ���ڿ���ŭ �ݺ�
		for(int i = 0 ; i < str.length() ; i++) { //.length �� ���ڿ� ����
			
			System.out.println(i +"��° ���� :" + str.charAt(i) );
			
	    }
	}
	public void practice5() {
		//���ǹ� �ǽ�����
		//���̵�,��� ���صΰ� �α��� ���
		//������, ���̵� Ʋ������, ��й�ȣ�� Ʋ������,��� Ʋ������-> ���
		
		Scanner sc = new Scanner(System.in); //��ĳ��
		System.out.print("���̵�: "); //�Է�����
		String inputid = sc.nextLine();
		System.out.print("��й�ȣ: ");
		String inputpass = sc.nextLine();
		//���̵�, ��� ���ϱ�
		String id ="boram";
		String pass = "1234";
		//����� ��: ������, ���̵� Ʋ������, ��й�ȣƲ������, ��� Ʋ������ 
		if(inputid.equals(id)&&inputpass.equals(pass)) {
			System.out.println("�α��� ����");
		}else if (inputpass.equals(pass)) {
			System.out.println("���̵� Ʋ�Ƚ��ϴ�.");
		}else if(inputid.equals(id)){ 
			System.out.println("��й�ȣ�� Ʋ�Ƚ��ϴ�.");
		}else {
			System.out.println("���̵�� ��й�ȣ�� Ʋ�Ƚ��ϴ�.");
		}
	}
	  public void practice1() {
		  System.out.println("1. �Է�\n2. ����\n3. ��ȸ\n4. ����\n9. ����");		  
          
		  Scanner sc = new Scanner(System.in);
		  System.out.print("�޴� ��ȣ�� �Է��ϼ��� : ");
		  int num = sc.nextInt();
			  if(num==1) {
				  System.out.println("�Է� �޴��Դϴ�. ");
			    }else if(num==2) {
				  System.out.println("���� �޴��Դϴ�. ");	  
			    }else if(num==3) {
				  System.out.println("��ȸ �޴��Դϴ�. ");
			    }else if(num==4) {
				  System.out.println("���� �޴��Դϴ�. ");
			  }else {
				  System.out.println("���α׷��� ����˴ϴ�. ");
				
			  }
		  }
	  public void practice2() {
		  
		  Scanner sc = new Scanner(System.in);
		  System.out.print("���ڸ� �Ѱ� �Է��ϼ��� : ");
		  int num = sc.nextInt();
		  //����̸鼭 ¦��/Ȧ��   ����ƴѰ�
		  
		  if(num>0) {
			  if((num%2)==0) {
				  System.out.println("¦���� ");
				  }
				  else{
					  System.out.println("Ȧ���� "); 
				  }
		       }
		     else {
			  System.out.println("����� �Է����ּ���.");
		  }  
	  }
	  public void practice3() {
		  Scanner sc = new Scanner(System.in);
		  System.out.print("���� ���� : ");
		  int score1 = sc.nextInt();
		  System.out.print("���� ���� : ");
		  int score2 = sc.nextInt();
		  System.out.print("���� ���� : ");
		  int score3 = sc.nextInt();
		  int sum  = (score1+score2+score3);
		  double aver = sum/3 ;
		  
		  if(score1>=40&&score2>=40&&score3>=40&&aver>=60)
		     {
			  System.out.print("����: "+score1+"\n����: "+score2+"\n���� : "+score3);
			  System.out.print("\n�հ�: "+sum+"\n���: "+aver);
			  System.out.print("\n�����մϴ�, �հ��Դϴ�!");
		  }else {
			  System.out.print("���հ��Դϴ�.");
		  }
	  }
	  
	      public void practice4() {
	    	  
	    	 Scanner sc = new Scanner(System.in);
	    	 System.out.print("1~12������ ���� �Է�: ");
	    	 int month =sc.nextInt();
	    	 sc.nextLine();
	    	 
	    	 String result=""; //���ڿ� ������ Ȱ��

	    	 switch(month) {
	    	
	    	 case 12:
	    	 case 1:
	    	 case 2:
	    		 result ="�ܿ�";
	    		 break;
	    	 case 3:
	    	 case 4:
	    	 case 5:
	    		 result="��";
	    		 break;
	    	 case 6:
	    	 case 7:
	    	 case 8:
	    		 result="����";
	    		 break; 
	    	 case 9:
	    	 case 10:
	    	 case 11:
	    		 result="����";
	    		 break; 
	    	default:
	    		result= "�߸� �Էµ� ��";
	    	    System.out.printf("%d���� %s�Դϴ�.",month,result);
	    	    return;	 
	    	 }	    	  
	    	  System.out.printf("%d���� %s�Դϴ�.",month,result);
	      }
	      public void practice6() {
	    	 
	    	  Scanner sc = new Scanner(System.in);
	    	  System.out.print("������ Ȯ���ϰ��� �ϴ� ȸ�� ��� : ");
	    	  String rating = sc.nextLine();
	    	  String result="";
	    	  
	    	  switch(rating) {
	    	  case "������": 
	    		result="ȸ������, �Խñ� ����\n�Խñ� �ۼ�, ��� �ۼ�\n�Խñ� ��ȸ";
	    		break;
	    	  case "ȸ��"	 :
	    		 result="�Խñ� �ۼ�, ��� �ۼ�\n�Խñ� ��ȸ";
	    		 break;
	    	  case "��ȸ��" :
	    		  result="�Խñ� ��ȸ";
	    		  break;
	    	  default :
	    		  result="�߸� �Է��߽��ϴ�.";
	    		  System.out.println(result);
	    		  return;   		  
	    	  }
	    	  System.out.println(result); 	  
	      }
	      
	      public void practice7() {
	    	Scanner sc = new Scanner(System.in);
	    	System.out.print("Ű(m)�� �Է��� �ּ��� : ");
	    	double height = sc.nextDouble();
	    	sc.nextLine();
	    	System.out.print("������(kg)�� �Է��� �ּ��� : ");
	    	double weight =sc.nextDouble();
	    	sc.nextLine();
	    	double bmi = weight/(height*height);
	    	System.out.println("BMI ����: "+bmi);
	    	
	    	if(bmi<18.5) {
	    		System.out.println("��ü��");
	    	}else if(bmi<23) {
	    		System.out.println("����ü��");
	    	}else if(bmi<25) {
	    		System.out.println("��ü��");
	    	}else if(bmi<30) {
	    		System.out.println("��");
	    	}else {
	    		System.out.println("�� ��");
	    	}

	      }
	     public void practice8() {
	    	
	    	 Scanner sc = new Scanner(System.in);
	    	 System.out.print("�ǿ�����1 �Է� : ");
	    	 int num1 = sc.nextInt();
	    	 sc.nextLine();
	    	 System.out.print("�ǿ�����2 �Է� : ");
	    	 int num2 = sc.nextInt();
	    	 sc.nextLine();
	    	 System.out.print("�����ڸ� �Է�(+,-,*,/,%) :");
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
	    		 System.out.println("�߸� �Է��ϼ̽��ϴ�. ���α׷��� �����մϴ�.");
	    	 }
    	 
	     }
	      public void practice9() {
	    	  
	    	 
	    	  
	    	  
	    	  
	    	  
	    	  
	    	  
	    	  
	    	  
	    	  
	      }
	      
	      
	      
	  
	  
	  
	  
	  }
	
	
	

	
	
	

