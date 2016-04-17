package codeForcesTry;

import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class A416_GuessNumber implements Closeable{
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	PrintWriter writer = new PrintWriter(System.out);
	StringTokenizer stringTokenizer;

	String next() throws IOException {
	    while (stringTokenizer == null || !stringTokenizer.hasMoreTokens()) {
	        stringTokenizer = new StringTokenizer(reader.readLine());
	    }
	    return stringTokenizer.nextToken();
	}

	double nextDouble() throws IOException {
	    return Double.parseDouble(next());
	}

	int nextInt() throws IOException {
	    return Integer.parseInt(next());
	}

	long nextLong() throws IOException {
	    return Long.parseLong(next());
	}
	String comp[]={">","<",">=","<="};
	public void solve() throws IOException{
	int n=nextInt();
	String a[]=new String[n];
	int num[]=new int[n];
	String b[]=new String[n];
	int min=(int) (Math.pow(10,9)*2),max=(int) (-Math.pow(10,9)*2);

	
	for(int i=0;i<n;i++){
		String x=reader.readLine();
		String y[]=x.split(" ");
		a[i]=y[0];
		num[i]=Integer.parseInt(y[1]);
		b[i]=y[2];
		if (b[i].equals("N")) {
			if (a[i].equals(">")) a[i] = comp[3]; 
			else if (a[i].equals("<")) a[i] = comp[2]; 
			else if (a[i].equals(">=")) a[i] = comp[1]; 
			else if (a[i].equals("<=")) a[i] = comp[0];				
		}
		if(a[i].equals(comp[0])){
	
				max=Math.max(max,num[i]+1);
		
		}
		else if(a[i].equals(comp[1])){
		
				min=Math.min(min,num[i]-1);
		
		}
		else if(a[i].equals(comp[2])){
			max=Math.max(num[i],max);
		}
		else if(a[i].equals(comp[3])){
			
				min=Math.min(min,num[i]);
			
		}
		//System.out.println(min+" "+max+" "+num[i]+" "+a[i]);
	}
	if(min<max)
		writer.println("Impossible");
	else
		writer.println(max);
	
	}
	public static void main(String args[]) throws IOException{ 
		try(A416_GuessNumber c=new A416_GuessNumber()){
		c.solve();
		}
	}
	public void close() throws IOException {
	    reader.close();
	    writer.close();
	}

}
