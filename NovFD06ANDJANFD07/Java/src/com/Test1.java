package com;

public class Test1 {

	public void checkForExcp(int num1, int num2) {

		int intArr[] = { 1, 2, 3 };

		String str = null;
		try {
			str.charAt(0);
			System.out.println(num1 / num2);
			System.out.println("enjoy no exp");
		} catch (ArithmeticException e) {
			System.out.println("ArithmeticException exp");
		}
		catch (NullPointerException e) {
			System.out.println("NullPointerException exp");
		}
		catch (Exception e) {
			System.out.println("Exception exp");
		}
	}
	
	public static void main(String[] args) {
		
		Test1 t =new Test1();
		  t.checkForExcp(2, 0);
	}
}
