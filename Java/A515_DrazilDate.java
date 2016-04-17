package codeForcesTry;

import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class A515_DrazilDate implements Closeable {
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
    	 int a,b,s;
    	 a=nextInt();
    	 b=nextInt();
    	 s=nextInt();
    	 int min=Math.abs(a)+Math.abs(b);
    	 if(s>=min&&(s-min)%2==0)
    		 writer.println("YES");
    	 else
    		 writer.println("NO");
    			 
    	close();	 
    	 
    }
    public static void main(String args[]) throws IOException{ 
    	try(A515_DrazilDate c=new A515_DrazilDate()){
    	c.solve();
    	}
    }
    public void close() throws IOException {
        reader.close();
        writer.close();
    }
}
