package com.bldea.javatraning.patterns;
import java.util.Scanner;
public class program1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Size:");
		int n=sc.nextInt();
		for(int i=0;i<=n;i++)
		{
			for(int j=0;j<=n;j++)
			{
				if((i==0 && j<=(n/2)) && j!=0||
						j==0 && i<(n/2)||
						i==(n/2) && j<(n/2)||
						j==(n/2) && i>=(n/2) && j!=(n)||
						i==(n) && j<(n/2))
				{
					System.out.print("*");
				}
				else
				{	
					System.out.print(1);
				}
			}

			{
				if((j==(n/2))||
						(i==(n/2) && j<=(n/2))||
						((j==0)))
				{
					System.out.print("*");
				}
				else
				{	
					System.out.print(1);
				}
			}
			{
				{
					System.out.println();
				}
			}
		}
	}
}


