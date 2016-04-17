package codeForcesTry;

import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class A313_GeraldHexagon implements Closeable{
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
		 int arr[]=new int[n];
		 for(int i=0;i<n;i++){
			 arr[i]=nextInt();
		 }
		 Arrays.sort(arr);
		 if(arr[0]!=1){
			 System.out.println(1);
			 close();
		 }
		 else if(arr[0]==1){
			 System.out.println(-1);
			 close();
		 }
		 
	}
	public static void main(String args[]) throws IOException{ 
		try(A313_GeraldHexagon c=new A313_GeraldHexagon()){
		c.solve();
		}
	}
	public void close() throws IOException {
	    reader.close();
	    writer.close();
	}

}
