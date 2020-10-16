package chapter4.exercise1;

import java.util.HashSet;
import java.util.Set;

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
	public static void main (String[] args) {
		Set<Integer> set = null;
		Set<Integer> set1 = new HashSet<Integer>();
		set1.add(null);
		if(set1.isEmpty()) System.out.print("set1 is null");
		else System.out.print("set1 is not null");
		if(set1 == null) System.out.print("set1 = null");
	}
}
