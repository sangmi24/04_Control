package kr.or.iei.func;

import java.util.Scanner;

public class Question {
//*���� ���� �� ���� �����
//1.������ �߻� ���� �����ϰ� ���� ���� �� ���ڿ��� ����
//  1)���� ���� �� �� scanner�� ���� �Է� �ް� , 2)������ �߻����� �����ϰ� ���� ���� �� ���ڿ��� �����Ѵ�. 
//2.������ ���� ���� �� ���ڿ��� �Է��� ���ڿ��� ���Ͽ� ������ ���ٰ� ���
//3.������ ���� ���� �� ���ڿ��� �Է��� ���ڿ��� ���Ͽ� �̱� ��� �̰�ٰ� ���, ����� ���ٰ� ���
//	=>�̰� ���� 
//4.�� ������ 5ȸ �ݺ��� �Ʒ� ���� ��� ó�� �� �� �̰����, ��� ������, ��� ������ ����Ѵ�.
//5. ���� ���ڿ� �Է½� ���� ���� �� �̿��� ���ڿ��� �Է��� ��� �Ʒ� ���� ���ó�� �߸��� �Է��̶�� �����
//   �ش� ȸ���� ������ �ٽ� �����Ѵ�.
/*
 * 1 ��° ���� ���� �� ������ �����մϴ�.
���� ���� �� �� �� ���� �Է��ϼ��� : ����
����� ������ �½��ϴ�.
��ǻ�ʹ� ������ �½��ϴ�.
��! ����� �����ϴ�!
-------------------------------	
 */
   public void exam1 () {
	   
	   Scanner sc = new Scanner(System.in);
	   System.out.println("***����ִ� ���� ���� �� ����***");
	  
	   // ���� ���� ������ �ϳ� �����ϰ� 0���� �ʱ�ȭ
	   int winCount = 0;   //�̱� Ƚ�� ī��Ʈ 
	   int loseCount = 0;  //�� Ƚ�� ī��Ʈ 
	   
	   
	   for( int i =0; i<5 ; i++)  {  //�ݺ� => 5�� �ݺ�
		   
		   System.out.println((i+1)+"��° ���� ���� �� ������ �����մϴ�");
		   
		   System.out.print("���� ���� �� �� �ϳ��� �Է��ϼ��� : ");
		   String you = sc.nextLine(); //"����", "����", "��" you��� ���� ����
		   
		   //�ϴ� ���ڿ��� ��ȿ���� üũ 
		   
		   if (you.equals("����") || you.equals("����") || you.equals("��")) { //���� ��� => ���������� ����
			   
			   //����=> Math.random()
			   int random = (int)((Math.random()*3)+1); //1,2,3 �� �Ź� ����
			   
			   //1 2 3 �� ���� "����", "����","��" �� ��Ī => switch��
			   String computer = ""; //��ǻ�� ���� �ϳ� ����
			   switch (random) {
			   case 1 :
				   computer ="����";
				   break;
			   case 2 :
				   computer ="����";
				   break;
			   case 3 :
				   computer ="��";
				   break;
			   } //ȭ�鿡 ���� ���� �°�, ��ǻ�ʹ� ���� �´��� ���
			   System.out.println("����� "+you+" �½��ϴ�.");
			   System.out.println("��ǻ�ʹ� "+computer+" �½��ϴ�.");
			   
			   //�̰���� ������ ������ Ȯ��
			   if (computer.equals(you)) {//����� ���
				   System.out.println("�����ϴ�.");  
			   }
			   else { //����� �ʾ��� ��� == �̰�ų� ���� ���
				   /*
				    * �̱��� ����
				    * ���� <����  
				    * ���� <��
				    * �� < ����
				    */
				   //����� �������� 
				   if (computer.equals("����")&&you.equals("����") ||
						computer.equals("����")&&you.equals("��") ||
						computer.equals("��")&&you.equals("����")) { //�̱� ���
					   System.out.println("¦¦! ����� �̰���ϴ�!");
					   winCount++;  //winCount += 1;
				   }
				   else { //�̱��� �ʾ��� ���
					   System.out.println("��! ����� �����ϴ�.");
					   loseCount++;  //loseCount +=1;
   				      }
			        }	   
		           }
		       else { //�ƴ� ��� => �߸��� �Է��Դϴ�. 
			      System.out.println("�߸��� �Է��Դϴ�.");
		      //�ش� ȸ���� �ٽ� �����Ұſ� (������)����ؼ� 1�� �̸� ����..
			      i-- ; // i = i-1;
		        } 
		   System.out.println("---------------------");
	   }
	   //�� ���������� ���� ���� �� ������ 5�� ������ �Ϸ�� 
	   //�̱� �Ǽ�, ���Ǽ�, ����Ǽ��� ���
	   System.out.println("�̱� �Ǽ� : "+winCount);
	   System.out.println("�� �Ǽ� :" +loseCount);
	   System.out.println("��� �Ǽ� : "+(5-winCount-loseCount));
	   System.out.println("���� ���� �� ������ ���� �մϴ�.");
	   /*
	    * 1. �� �Ǵ� (�� Ƚ����) �Ͼ ���� ����� �ڵ�
	    * 2. Ƚ�� �����ؼ� for������ ���α�
	    * 3. �� ������ ���� �� �͵� �����ϱ�
	    */
	   
    }
   }	   
	   
   
	   
//	   if(comNum.equals(str1)){
//	   //String random =  str (Math.random()) ;  //math.random �տ� �������  ��� ���� �𸣰ڽ��ϴ�.
//	   //i �ݺ� 1,2,3,4,5
//	   for(int i =1; i<6 ; i++){ {
//		   System.out.println(i+"��° ���� ���� �� ������ �����մϴ�.");
//		   System.out.print("���� ���� �� �� �Ѱ��� �Է��ϼ��� : "+ conNum ); 
//		
//		   
//	   if(comNum==str1) {
//		   System.out.println( "����� ������ �½��ϴ�." );}
//		   else if (random==str2) {
//			   System.out.println("��ǻ�ʹ� ������ �½��ϴ�");}
//	       else if(random==str3) {
//		  System.out.println("��! ����� �����ϴ�.");		  
//	         }
//		   }
//	   if (random==str2) {
//		   System.out.println( "����� ������ �½��ϴ�." );}
//	   else if (random==str2) {
//		   System.out.println("��ǻ�ʹ� ������ �½��ϴ�");}
//       else if(random==str3) {
//	  System.out.println("¦¦! ����� �̰���ϴ�.");		  
//         }
//	   }
//	   if (random==str3) {
//		   System.out.println( "����� ���� �½��ϴ�." );}
//	   else if (random==str2) {
//		   System.out.println("��ǻ�ʹ� ���� �½��ϴ�");}
//       else if(random==str3) {
//	  System.out.println("�����ϴ�.");		  
//         }
//	   
//   
//   
//   }
//      
	   
	   
	   
	   
	   
	   
	   
	   
   

	
