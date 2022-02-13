package com.kh.chap01.condition;

import java.util.Scanner;

public class A_If {

	/*
	 * *�ܵ� if��
	 * ������ �ܵ������� �Ѱ��� ������ ���
	 * 
	 * [ ǥ���� ] 
	 * if(���ǽ�) { 
	 *     �ش� ���ǽ��� ����� true �� ��쿡 ������ �ڵ� 
	 * }
	 * 
	 * => ���ǽ��� ����� ��(true) �ϰ�� �߰�ȣ �� �ȿ� �ִ� �ڵ尡 �����
	 * => ���ǽ��� ����� ����(false) �ϰ�� �߰�ȣ �� ���� �ڵ带 �����ϰ� �Ѿ
	 */
	
	public void method1() {
		
		//���׿����ڿ��� ���, 0, ����  (method4)
		//����ڷκ��� �������� �Է¹��� �� "�����.", "0�̴�.", "������." ���� ���
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �Է� : " );
		int num =sc.nextInt();
		
		// (���ǽ�)? true�ϰ�� : false�ϰ�� ->���׿�����
		// �ܵ� if�� ��� 
		
		// ����� �� 1. ����� ��� (num > 0 )		
		if ( num >0 ) { 
			System.out.println("�����.");	
		}
		//����� �� 2. 0�� ��� (num == 0)
		if  (num == 0) {
			System.out.println("0�̴�.");
		}
		//����� ��3. ������ ��� (num < 0 )
		if (num < 0) {
			System.out.println("�����̴�.");			
		}
	}
	public void method2() {
		
		//����ڰ� �Է��� �������� ¦������, Ȧ�������� �Ǻ��ؼ� ����
		//"¦����." , "Ȧ����." �� ���
        
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �Է� :" );
		int num = sc.nextInt();
		
		// ����� ��1.¦���� ���  (( num  %2 ) == 0 )
		if((num %2)==0) {
			System.out.println("¦����.");
		} 
		//����� ��2.Ȧ���� ���( (num % 2) == 1)
		if ((num%2) ==1) {
			System.out.println("Ȧ����.");
		}		
 	}
	//���½ð� �ǽ�����
	public void method3() {
		// ����ڰ� �Է��� ���̰��� ������ 
		//13�� ���ϸ� "��� �Դϴ�."
		//13 �ʰ�~19�� ���ϱ��� "û�ҳ��Դϴ�."
		//19���ʰ��� "�����Դϴ�." ���
		
//		//����1. ���׿����� ���
//		Scanner sc = new Scanner(System.in);
//		System.out.print("���̸� �Է��ϼ���. :");
//		int num = sc.nextInt();
//		// ������� String�̱� ������ string ������ �����Ͽ� ����, ��ø�ϱ� 
//		//(13�� ����)? "���" :(19������?) "û�ҳ�":"����"
//		String age = (num <= 13)? "����Դϴ�." :(num <=19)? 
//				"û�ҳ��Դϴ�.":"�����Դϴ�.";
//		System.out.printf( "%s", age );
//	}	  
		//����2. �ܵ� if�� ��� 
		Scanner sc = new Scanner(System.in);
		System.out.print("���̸� �Է��ϼ���. :");
		int num = sc.nextInt();
		//1.����Ǽ�: 13�� ����
		if(num <= 13) {
			System.out.println("����Դϴ�.");
		}
		//2.13�ʰ�~19�� ����
		if(13 <num && num <=19) {
			System.out.println("û�ҳ��Դϴ�.");
		}
		//3.19�� �ʰ�
		if(19 <num) { 
			System.out.println("�����Դϴ�.");		
		}
	}	
		public void method4() {
			//����ڿ��� �Է¹��� �ֹε�Ϲ�ȣ�� ������
			//���� /���� ���� �Ǻ� �� "�����Դϴ�.", "�����Դϴ�." ���
			
			//1.����ڿ��� �ֹε�Ϲ�ȣ �Է¹ޱ�
			Scanner sc = new Scanner(System.in);
			System.out.print ("�ֹι�ȣ �Է� (-���� ): ");
			//�ֹι�ȣ : ������� 6���� -(����1�ڸ�)(6�ڸ� ����)
			//220211 => ���ڷ� ���x , ���ڿ��� ��� 
			String personId = sc.nextLine();
			
			//2.�Է¹��� �ֹι�ȣ�� ���� ������ �ش�Ǵ� ���ڸ� �����ؼ� ������ ��� (charAt �޼ҵ�)
			//220211-X000000
			//X: ������ �ش� ( 7��° �ε���)
			char gender = personId.charAt(7);
            
			//3. ������ �ش�Ǵ� ���ڸ� ����� ���� ������
			//=> 1 �Ǵ� 3�� ��쿡�� ����
			//=> 2 �Ǵ� 4�� ��쿡�� ����
			
			//������ ��� (gender == '1'(����) ) || (gender == '3'(����))
			if((gender=='1') || (gender=='3')) {
				System.out.println("�����Դϴ�.");
		}
		   //������ ��� (gender == '2'(����) ) || (gender == '4'(����))
			if( (gender=='2')||(gender=='4')) {
				System.out.println("�����Դϴ�.");
			}
			
			//�� �̿��� ������ ��� => �߸��� �ֹι�ȣ�Դϴ�.
			//'1'�� �ƴϰ� �׸���  '2'�� �ƴϰ� �׸��� '3'�� �ƴϰ� �׸���'4'�� �ƴҰ�� 
			//(gender != '1') &&( gender !='2' ) && (gender !='3') &&(gender != '4')
            if((gender != '1') &&( gender !='2' ) && (gender !='3') &&(gender != '4')) {
            	System.out.println("�߸��� �ֹι�ȣ�Դϴ�.");
            }
            
	}
	
}





