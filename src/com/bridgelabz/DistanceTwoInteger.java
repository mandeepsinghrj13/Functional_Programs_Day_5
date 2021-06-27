package com.bridgelabz;
import java.util.Scanner;
public class DistanceTwoInteger 
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int a = sc.nextInt();
	    int b = sc.nextInt();
	    int c = sc.nextInt();
	    int d = sc.nextInt();
	    int n = display(a, b, c, d);
	    System.out.print(n);
	  }
	  public static int display(int a, int b, int c, int d) {
	    long q = (int) Math.round(Math.sqrt(((a - c) * (a - c))
	        + ((b - d) * (b - d))));
	    return (int) q;
	  }
}
