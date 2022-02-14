package com.kh.chap01.condition;

import java.util.Scanner;

public class C_Switch {

	/*
     * *switch ��
     * ���� ǥ���ϰ� ���� ����� ���� �������� ��� ��� ����
     * ��, == (���� �� ������) �� ���Ե� ������ ��쿡�� ����� �����ϴ�.
     * 
     * switch���� if���� ������
     * if(���ǽ�)     => ���ǽ��� �����ϰ� ��� ������(��� ������ �������� �������� ����)
     *                 ���ǽĿ��� ������ ������ ǥ�� ������
     * switch ���ǽ�x => Ȯ���� ���� ���Ǹ� ��� ���� (����� ����)
     * 
     * [ ǥ���� ]
     * switch(�����ε���񱳸��Ҵ����) {
     *   case ��1 : �������ڵ�1;  // ���࿡ ������ ���� �񱳸� �� ����� == ��1 ��쿡��
     *                        //  �������ڵ�1�� �����ϰڴ�.
     *              break;    //  �������ڵ�1�� �����ϰ� switch �߰�ȣ ������ ���������ڴ�.            
     *   case ��2 : �������ڵ�2; //  ���࿡ ������ ����񱳸� �� ����� == ��2��쿡��
     *                        //  �������ڵ�2�� �����ϰڴ�.
     *              break;    //  �������ڵ�2�� �����ϰ� switch �߰�ȣ ������ ���������ڴ�.
     *   ...
     *   case ��n : �������ڵ�n;
     *              break;
     *              
     *  default : �������ڵ�;    // case ��1~��n ������ ����񱳸� �ϰ� �ϳ��� ��ġ���� ������
     *                        // ���� => if�� �迭���� ������ �������� �ʴ� else������ ���� ����
     *                        //break; �� ���� �ʴ´�.                                        
     * }               
     */
	
	public void method1() {
		
	 /*
	  * 1 ~ 3������ ���ڸ� �Է¹޾�
	  * 1�� ��� : "�������Դϴ�.";
	  * 2�� ��� : "�Ķ����Դϴ�.";
	  * 3�� ��� : "�ʷϺ��Դϴ�.";
	  * �߸� �Է��� ��� : "�߸� �Է��߽��ϴ�."; 
	  */
		Scanner sc= new Scanner(System.in);
		System.out.print("1 ~ 3 ������ ���� �Է� : ");
		int num = sc.nextInt();
		sc.nextLine();
		
		//if�� �迭 ����
//		if(num == 1) { //������
//			System.out.println("�������Դϴ�.");
//		} 
//		else if (num == 2 ) { //�Ķ���
//			System.out.println("�Ķ����Դϴ�.");
//		}else if (num ==3 ) { //�ʷϺ�
//				System.out.println("�ʷϺ��Դϴ�");
//			}
//		else {
//			System.out.println("�߸� �Է��߽��ϴ�.");
//		}
		//switch ������ ���� => ����񱳸� �� ���
		
//		
//		switch(num) { 
//		
//		case 1 : // num == 1 �� ���� => true 
//			  
//	   	     System.out.println("�������Դϴ�.");
//		     break;          
//		
//		case 2 : //num == 2 �� ���� => true
//			  
//			 //System.out.println("�Ķ����Դϴ�.");
//			 break;
//	
//		case 3 :
//		     
//			System.out.println("�ʷϺ��Դϴ�.");
//			break;
//			
//		default :
//
//			  System.out.println("�߸� �Է��߽��ϴ�.");
//			//break; //�־ �׸� ��� �׸� => �Ⱦ���!
//			 
//		}
		
	   // ��¹� ����! => "~~"  (���ڿ� ������ Ȱ��)
		String result = "";
		
		switch (num) {
		
		case 1: 
			result = "������";
			break;
			
		case 2 :
			result = "�Ķ���";
			break;
		case 3 :
			result = "�ʷϺ�";
			break;
		default :
			System.out.println("�߸� �Է��߽��ϴ�.");
			return; // return ���� ���� �������� �޼ҵ� ��ü�� ���������ڴ�. 
			        // ==���� �������� �޼ҵ带 ȣ���� ���ʸ����� ���ư��ڴ�.  
		}
		
		System.out.printf("%s�Դϴ�.",result);
		
	}
	public void method2() {
		//����ڿ��� ������ ���ϸ� (���, �ٳ���, ������ ) �� �Է¹޾�
		//�� ������ ������ ���(���: 1000��, �ٳ���: 2000�� , ������: 5000��)
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("-----Welcome ���ϰ��� -----");
		System.out.print("������ ���ϸ� �Է�(���, �ٳ���, ������): ");
		String fruit = sc.nextLine(); //���ϸ�
		
		int price = 0; //������ ��� ���� 0���� �ϴ� �ʱ�ȭ��Ŵ
		
		//��쿡 ���� �� ������ ������ å��=> switch �� �̿�!
		switch(fruit) {
		
		case "���":  //if(fruit.equlas("���")) { }
			price = 1000;
			break;	
		case "�ٳ���":  //else if(fruit.equlas("�ٳ���")) { }
			price = 2000;
			break;
		case "������":  //else if(fruit.equlas("������")) { ]
			price = 5000;
			break;
		default :   //else { }
			System.out.println("���� ���Կ��� �Ǹ��ϴ� ������ �ƴմϴ�.");
			return;
		}
		 System.out.printf("%s�� ������ %d���Դϴ�.", fruit, price);

		 //������ ��: ���ڿ��� ����񱳸� ���������� switch�� �����ش�.
	}
	public void method3() {
		
		//�ֹι�ȣ �Է¹޾Ƽ� �������� �������� üũ
		// => �ֹι�ȣ : ���ڿ��� ���, 7��° ���ڰ� ������ ��Ÿ��! 
		
		//switch�� ����
		
		Scanner sc = new Scanner(System.in);
		
		String personId = sc.nextLine(); 
		
		char gender = personId.charAt(7); //'1','2','3','4'
		
		String result =""; //switch�ۿ� �����ϴ� ����?
		                   //�߰�ȣ �ȿ����� ��ȿ�ϱ� ������ �̸� �ۿ��ٰ� ���ִ°�! 
		
		//gender �� '1'�Ǵ� '3'�� ���� ���� / '2'�Ǵ� '4' �ϰ��� ����
		switch(gender) {
		
		case '1':
		    //result = "����";
		    //break;		    
		case '3':
			result = "����";
			break;
			//'1'�Ǵ� '3'�� ��� (������ ���빰�� ���� ���)
			//case�� �ѹ��� ��� ����, �� ���̿��� break;�� ���� �ʴ´�.(�ڹ��ڵ�� ������ �Ʒ��� �帣�Ƿ� ����)
			
			
		case '2':
			// result ="����";
			// break;
		case '4':
			result = "����";
			break;
			
		default :
			System.out.println("�߸��� �ֹι�ȣ�� �Է��߽��ϴ�.");
		    return;
		}
		//�ѹ��� ���
		System.out.println(result+"�Դϴ�.");
		
		
	}
	public void method4() {
		
		//����ڿ��� 1~12�� ������ ���� �Է¹޾� �ش� �޿� �ش��ϴ� ������ ���
		//12~2�� : �ܿ�
		//3~5�� : ��
		//6~8�� : ����
		//9~11�� : ���� 
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1�� ~ 12�� ������ �� �Է� :" );
		int month = sc.nextInt();
		sc.nextLine();
		
		switch (month) {
		
		case 12 :
		case 1 :
		case 2 :
			System.out.println("�ܿ��Դϴ�.");
			 break;
		case 3 :
		case 4 :
		case 5 :
			System.out.println("���Դϴ�.");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("�����Դϴ�.");
			break;
		case 9 :
		case 10 :
		case 11 :
			System.out.println("�����Դϴ�.");
			break;
		default :
			System.out.println("�ݵ�� 1~ 12 ������ ���ڸ� �Է��ؾ� �մϴ�. ");
			return; //�־ �׸� ��� �׸�/ ���Ŀ� �ڵ尡 ����. �Ⱦ�.
		
		} //switch ���� ��
	}//method ���� ��
	//method �� ������ ���� �������� return; ������ ���� ������ �����̱� ������
	//return; �� �־ ���ʸ�����, return; ������ ��� ���ʸ�����!
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
