package codeForcesTry;

import java.util.Scanner;

public class A469_IwannaBeGuy {
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		
		int n=Integer.parseInt(s.nextLine());
		String p[]=s.nextLine().split(" ");
		String q[]=s.nextLine().split(" ");
		
		int len1=Integer.parseInt(p[0]);
		int len2=Integer.parseInt(q[0]);
		
		int p1[] = new int[len1];
		int q1[] = new int[len2];
		int count[] = new int[n+1];
		
		for(int i=0; i<len1; i++)
			p1[i]=Integer.parseInt(p[i+1]);
		
		for(int i=0; i<len2; i++)
			q1[i]=Integer.parseInt(q[i+1]);
		
		for(int i=0; i<len1; i++){
			count[p1[i]]++;
		}
		for(int i=0; i<len2; i++){
			count[q1[i]]++;
		}
		
		int i=1;
		for( i=1; i<=n; i++)
		{
			if(count[i]==0)
				break;
		}
		
		if(i==n+1)
			System.out.println("I become the guy.");
		else
			System.out.println("Oh, my keyboard!");
		
	}
}
