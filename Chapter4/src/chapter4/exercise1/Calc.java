package chapter4.exercise1;

public class Calc {
	static public int add (int a, int b)
	   {
	      return a + b;
	   }
	public static int substract(int a, int b) {
		return a-b;
	}
	public static int multiply(int a, int b) {
		return a*b;
	}
	public static int divide(int a, int b) {
		if(b == 0) return Integer.MAX_VALUE+1;//Exception: Cannot divide for 0
		return a/b;
	}
}
