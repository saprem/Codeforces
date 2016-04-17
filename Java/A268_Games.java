package codeForcesTry;

import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class A268_Games  implements Closeable {
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
    int h[]=new int[n];
    int g[]=new int[n];
    int i=0;
    for(i=0;i<n;i++){
    	h[i]=nextInt();
    	g[i]=nextInt();
    	//System.out.println("wdw");
    }
    int c=0;
    for(int k=0;k<n;k++){
    	for(int j=0;j<n;j++){
    		if(h[k]==g[j])
    			c++;
    	}
    	//System.out.println("ihih");
    }
    writer.println(c);
    }
    public static void main(String args[]) throws IOException{ 
    	try(A268_Games c=new A268_Games()){
    	c.solve();
    	}
    }
    public void close() throws IOException {
        reader.close();
        writer.close();
    }


}
