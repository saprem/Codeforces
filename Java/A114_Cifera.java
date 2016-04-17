package codeForcesTry;

import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class A114_Cifera implements Closeable{
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
	 int k=nextInt();int l=nextInt();
	 if(l%k!=0)
		 System.out.println("NO");
	 else if(l==k){
		 System.out.println("YES");
		 System.out.println(0);
	 }
	 else{
		 int count=0;
	 
		 while(l%k==0){
			 l=l/k;
			 count++;
			 if(k==l)
				 break;
		 }
		 if(l==k){
			 System.out.println("YES");
			 System.out.println(count);
		 }	 
		 else{
			 System.out.println("NO");
		 }
	 }
	}
	public static void main(String args[]) throws IOException{ 
		try(A114_Cifera c=new A114_Cifera()){
		c.solve();
		}
	}
	public void close() throws IOException {
	    reader.close();
	    writer.close();
	}


}
