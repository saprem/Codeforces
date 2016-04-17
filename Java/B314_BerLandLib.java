package codeForcesTry;

import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.StringTokenizer;

public class B314_BerLandLib  implements Closeable{
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
		int n=nextInt();String x;
		int max=0,seats=0,empty=0;
		HashSet<String> h=new HashSet<String>();
		for(int i=0;i<n;i++){
			x=reader.readLine();
			String[] y=x.split(" ");
			char z=y[0].charAt(0);
				if(z=='-'){
					if(h.contains(y[1]))
						empty++;
					else{
						empty++;
						seats++;
					}
				}
				else if(z=='+'){
					if(empty==0){
						seats++;
					}
					else
						empty--;
					h.add(y[1]);
				}
		}
		System.out.println(seats);
	}
	public static void main(String args[]) throws IOException{ 
		try(B314_BerLandLib c=new B314_BerLandLib()){
		c.solve();
		}
	}
	public void close() throws IOException {
	    reader.close();
	    writer.close();
	}

}
