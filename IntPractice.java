package kr.or.iei.func;

public class IntPractice {
	
	public void method1() {
		int a = 5;
		int b = 10;
		int c = (++a)+b;
		//⇒  6+10= 16   c=16 a=6
		int d = c/a;     
		//⇒ 16 / 6 =2   d=2
		int e = c%a;   
		// ⇒ 16 % 6 = 4   e=4
		int f = e++;  
		//⇒f= 4 / e=5     
		int g = (--b)+(d--);
		/*
		 * ⇒ b=9, d=2 ⇒ g=11
                    ⇒ 나중에 후위연산자 연산됨
          b=9,  d=1, g=11
		 */
		int h= 2;
		int i = a++ +b /(--c /f )*(g-- -d)%(++e +h);
		/*
		 * ⇒ a =6, b=9, (c=15, f=4,)⇒ 3  (g=11, d=1)⇒ 10
          (e=6, h=2) ⇒8
          a++ +9/3  * 10  % 8
                       ⇒ a++ +3*10 %8 
                       ⇒ a++ +6
                       ⇒ 6+6 = 12
         a=7
		 */
		
		
		System.out.println("a : "+a);
		System.out.println("b : "+b);
		System.out.println("c : "+c);
		System.out.println("d : "+d);
		System.out.println("e : "+e);
		System.out.println("f : "+f);
		System.out.println("g : "+g);
		System.out.println("h : "+h);
		System.out.println("i : "+i);
		
	}
}
