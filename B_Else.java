package com.kh.chap01.condition;

import java.util.Scanner;

public class B_Else {

	/*
	 * *if-else ��
	 * �ΰ��� �������� ����� ���� ���� ���
	 * 
	 * [ ǥ���� ]
	 * if(���ǽ�)  {
	 *     ���ǽ��� true�� ��� ������ ����
	 *  } 
	 *  else {
	 *     ���ǽ��� false�� ��� ������ ���� 
	 *   }
	 *   
	 * => ���ǽ��� ����� true �ϰ�� if ������ �ִ� �ڵ带 �����ϰ� 
	 *                false �ϰ�� else������ �ִ� �ڵ带 �����Ѵ�.                 
	 */
	
	public void method1() {
		//�ܵ� if���� method2 ����
		//����ڰ� �Է��� �������� ¦������, Ȧ�������� �Ǻ��ؼ� ����
		//"¦����." , "Ȧ����." �� ���
		
		//if-else ����
		Scanner sc =new Scanner(System.in);
		System.out.print("���� �Է� : ");
		int num = sc.nextInt();
		
		//¦���� ���
		if((num %2)==0) {  //¦���� ���
			System.out.println("¦����.");
		 }
		else {   //Ȧ���� ���
			System.out.println("Ȧ����.");
		}
	}
	// ��ø if�� : if ���� �ȿ� �� if���� ���� ��� 
	//=> ���׿������� ��ø Ȱ�� ����!
	public void method2() {
		//����ڰ� �Է��� ������� ¦������, Ȧ�������� �Ǻ��ؼ� ����
		//"¦����." , "Ȧ����." �� ���
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("��� �Է� : ");
		int num = sc.nextInt();
		//�켱������ ������� �ƴ��� ���� �Ǻ�
		//�� ���Ŀ� ¦������ Ȧ������ �Ǻ�
				
		//����� ���
		if (num > 0) { //����� ���
			System.out.println("�����.");
			//¦������ Ȧ������ �Ǻ� 
		  if((num %2 )==0) {  //¦���� ���
			System.out.println("¦����.");  
		  }			
		 else { //¦���� �ƴҰ��
			System.out.println("Ȧ���Դϴ�.");
		  }				
		}
		else {//����� �ƴ� ���
			System.out.println("����� �Է��ؾ� �մϴ�."); //���
		}
	}
	
	public void method3() {
		//����ڷκ��� �̸��� �Է¹޾�
		//��ȿ�� �̸��̶�� �����Դϴ�. �������. ��� ���� ���
		//�ƴ϶�� ������ �ƴմϴ�. ���ư��ּ���. ���� ���
		//=> ���ڿ��� �����
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�����ϱ� ���ؼ� �̸��� �Է��ϼ��� : ");
		String name =sc.nextLine();
		
		//��ȿ�� �̸� => "ȫ�浿"
		/*if(name==  "ȫ�浿") {
			
			System.out.println("�����Դϴ�. �������. ");
		
		}else {
			
			System.out.println("������ �ƴմϴ�. ���ư��ּ���.");
		
		}
		*/
		
		/*
		 * �⺻�ڷ��� (boolean, byte, short, int, long, float, double,char)
		 * �鳢���� ���� �񱳽� == �Ǵ� != �� ������ �� �񱳵�
		 * 
		 *  String (�����ڷ���) �� ������ϰ��� �Ҷ� ==, !=  ���� �� �񱳰� ���� ����
		 *  ��? => �ּҰ��� �񱳵Ǳ� ������!
		 *  
		 *  ���ڿ������� ����񱳽� �̿��� �� �ִ� �޼ҵ�
		 *  equals()
		 *  => ���� �� ���ڿ��� ������ �����ϴٸ� true �� ��ȯ
		 *                      �������� �ʴٸ� false�� ��ȯ
		 *                      
		 *  
		 *  [ ǥ���� ]
		 *  ���ϰ����ϴ¹��ڿ�1.equals(���ϰ����ϴ¹��ڿ�2);  (;�� ������ ��ħǥ)
		 *  if(���ڿ�1.equals(���ڿ�2)) ������ �������
		 */
		
		if(name.equals("ȫ�浿"))  {  // "ȫ�浿".equals(name)
			
			System.out.println("�����Դϴ�. �������.");
			
		}
		else {
			
			System.out.println("������ �ƴմϴ�. ���ư��ּ���.");
			
		}
		
		
	}
	/*
	 * if-else if��
	 * ������ �񱳴���� ������ ���� ���� ������ ������ �ΰ��� �� ��� ����
	 * 
	 * [ ǥ���� ]
	 * if (���ǽ�1) {
	 *     ������ �ڵ�1;
	 * }
	 * else if (���ǽ�2) 
	 *     ������ �ڵ�2;
	 *  }
	 *  else if(���ǽ�3 ) {
	 *     ������ �ڵ�3;
	 *  } ...
	 *  else {
	 *      ���� ���ǵ��� ���  false ��  ��� �ݵ�� �����ؾ� �� ������ ���� ��� �����Ѵ�.
	 *  }
	 */
	
	
	public void method4() {
		
		// ���, 0, ����
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է� : ");
		int num =sc.nextInt();
		
		if( num>0 ) { //1. ����� ��� => num > 0 
			System.out.println("�����.");
		}
		else if( num==0 ) { //2. 0�� ��� =>num==0
			System.out.println("0�̴�.");
		}
		else {  //3. ����� �ƴϰ�, 0�� �ƴҰ�� =>���� ���� ���� �ʿ䰡 ����!
			System.out.println("�����̴�.");
		}		
	}
	
	public void method5() {
		
		/*
		 * ����ڷκ��� Ű����� ������ �Է¹ޱ�
		 * 90�� �̻��� ��� : "A���"
		 * 80�� �̻� 90�� �̸��� ��� : "B���"
		 * 70�� �̻� 80�� �̸��� ���: "C���"
		 * 70�� �̸��� ��� : "D���" 
		 * 
		 * => "����� ������ XX���̰�, ����� X �Դϴ�." ���
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �Է��ϼ��� : ");
		int score = sc.nextInt();
		sc.nextLine();
		
	    char grade = ' ';  //��� / ��ĭ �پ�� �� (����)
		//char �ڷ����� ���� ��쿡�� ���� ���� ��ĭ���� �ʱ�ȭ �Ѵ�.
		
	    //�켱������ 0 ~ 100���������� ���� üũ
	    
		//if(score < 0 || score > 100) { //0~100 ���̰� �ƴ� ���
		if(0 <=score && score <=100 ) { //0~100������ ���
		
			//4���� ����� ���� ���� ����� �Ǻ�
			if (score >= 90) { //90�� �̻� => A���
				grade = 'A';
			}
			else if (score  >= 80) { //80�� �̻� => B���
				grade ='B';
			}
			else if(score >= 70) { //70�� �̻� => C���
				grade = 'C';
			}
			//else if (score < 70 ) {
			else {  // A�� �ƴϰ� B�� �ƴϰ� C�� �ƴ� ���=> D���
				grade = 'D';
			}	
			//�� �������� ������ ���� grade ������ ��� ���� �Ǻ� �Ϸ� 
			
			System.out.printf("����� ������ %d ���̰�, ����� %c ����Դϴ�.", score, grade);
		}
		else { //0~ 100 ���̰� �ƴ� ���
			System.out.println("�߸� �Է��߽��ϴ�.");
	  }
	
	}
	public void method6() {
		//���� => ���, û�ҳ�, ���� 
		
		Scanner sc= new Scanner(System.in);
		System.out.print("���̸� �Է��ϼ��� : ");
		int age = sc.nextInt();
		sc.nextLine();
		
		// �켱������ ��������� ���� �Ǵ�
		if(0 <age) { //������ ��ȿ�� ���̴�
	
			String person =""; //"���" , "û�ҳ�", "����"
			
			if(age <= 13) {//1. age ���� 13������ ��� : ���
               person = "���";
			}
			else if(age <=19) {//2. age ���� 13�ʰ� 19������ ���: û�ҳ�
				//�̹� �տ��� age <=13 ������ false ���� �̹� ������ �����̱� ������
	            //age >13 ��� ������ ���� �ۼ����� �ʾƵ� �ȴ�.
               person = "û�ҳ�";
			}
			else{ //3. age ���� 19 �ʰ��� ��� : ���� => ��̵� �ƴϰ� �׸��� û�ҳ⵵ �ƴ� ���
				person = "����";
			}
			//�� �������� person�̶�� ������ ��� ���� �Ǻ��� �Ϸ��
		 System.out.println("����� ���̴� "+age +"���̰�, ����� "+person +"�Դϴ�.");
		}
		else { //����� �ƴ϶�� ��ȿ�� ���̴밡 �ƴ�
			System.out.println("�߸� �Է��߽��ϴ�.");
		}
	}
	
	
	
	
	
}
