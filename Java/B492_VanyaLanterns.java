package codeForcesTry;

import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B492_VanyaLanterns implements Closeable {
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
    public void solve()throws IOException {
    	int n=nextInt();
		int l=nextInt();
		int arr[]=new int[n];
		
		for(int i=0;i<n;i++){
			arr[i]=nextInt();
		}
		Arrays.sort(arr);
		double maxD=Math.max(arr[0]-0,l-arr[n-1]);
		
		for(int i = 0;i<n-1;i++){
			maxD = Math.max(maxD, (arr[i+1]-arr[i])/2.0);
		}
		System.out.printf("%.10f",maxD);
		close();
    	
    	
    }
    public static void main(String args[]) throws IOException{ 
    	try(B492_VanyaLanterns c=new B492_VanyaLanterns()){
    	c.solve();
    	}
    }
    public void close() throws IOException {
        reader.close();
        writer.close();
    }

}
