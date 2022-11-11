package com;


public class Test3 {

}
 interface Interone{
	 int one = 1000;
	 int two = 2000;
	 void display();
	 
 }
 abstract class AbstractOne{
	 static int three;
	 abstract void disp();
	 
	 public static void modify(int val) {
		
		 AbstractOne.three = AbstractOne.three+val;
	}
	 
 }
 
 class Exp extends AbstractOne implements Interone{

	 int fpour ;
	 public Exp() {
		// TODO Auto-generated constructor stub
	    AbstractOne.three+=1;
	    this.fpour= 10 + AbstractOne.three;
	 }
	@Override
	public void display() {
	   System.out.println("VAr One "+this.one);
   	}

	@Override
 public	void disp() {
		
		display();
		System.out.println("Var Two "+this.two);
		System.out.println("Var Three "+AbstractOne.three);
		System.out.println("Var Four "+this.fpour);
	}
	
	public static void main(String[] args) {
		
		Exp name = new Exp();
		AbstractOne.modify(name.one);
	   Exp name1 = new Exp();
	   name1.disp();
	   
	}
	 
 }