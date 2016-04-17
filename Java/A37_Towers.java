package codeForcesTry;

import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class A37_Towers implements Closeable{
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
	public void solve() throws IOException{
	int n=nextInt();
	int num[]=new int[1001];
	int max=0,sum=0;
	for(int i=0;i<n;i++){
		num[nextInt()]++;
	}
	for(int i=0;i<1001;i++){
		if(num[i]!=0)
			sum++;
		max=Math.max(max,num[i]);
	}
	writer.println(max+" "+sum);
	}
	public static void main(String args[]) throws IOException{ 
		try(A37_Towers c=new A37_Towers()){
		c.solve();
		}
	}
	public void close() throws IOException {
	    reader.close();
	    writer.close();
	}


}
