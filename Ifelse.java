package oop;
import java.util.Scanner;
public class Ifelse {
public static void main(String[] args) {
	int num;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number ");
	num=sc.nextInt();
	if(num%2==0)
	{
		System.out.println("Even Number ");
	}else
	{
		System.out.println("Odd Number ");
	}
}
}
