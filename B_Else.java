package com.kh.chap01.condition;

import java.util.Scanner;

public class B_Else {

	/*
	 * *if-else ��
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
		  if((num %2)==0) {  //¦���� ���
			System.out.println("¦����.");  
		  }			
		 else { //¦���� �ƴҰ��
			System.out.println("¦���� �ƴϴ�.");
		  }				
		}
		else {//����� �ƴ� ���
			System.out.println("����� �Է��ؾ� �մϴ�."); //���
		}
	}
	
	
	
	
	
	
}
