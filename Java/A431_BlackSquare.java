	package codeForcesTry;

import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class A431_BlackSquare implements Closeable{
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
    	 int arr[]=new int[4];
    	 for(int i=0;i<4;i++)
    		 arr[i]=nextInt();
    	 
    	 int sum=0;
    	 String x=next();
    	 for(int i=0;i<x.length();i++){
    		sum+=arr[Integer.parseInt(Character.toString(x.charAt(i)))-1];
    	 }
    	 writer.println(sum);
    }
    public static void main(String args[]) throws IOException{ 
    	try(A431_BlackSquare c=new A431_BlackSquare()){
    	c.solve();
    	}
    }
    public void close() throws IOException {
        reader.close();
        writer.close();
    }
}
