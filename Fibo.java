package bhagirath;

import java.util.Scanner;
public class Fibo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =  new Scanner (System.in);
		int n= sc.nextInt();
		int a=0,b=1,count=0,c=0;
		while(count<n) {
			System.out.println(c);
			
			a=b;
			b=c;
			c=a+b;
			count++;
		}
		
		
	}

}
