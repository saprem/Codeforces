package codeForcesTry;

import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.StringTokenizer;

public class A148_InsomniaCure implements Closeable {
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
    int k,l,m,n,d;
    k=nextInt();l=nextInt();m=nextInt();n=nextInt();d=nextInt();
    boolean[] drag=new boolean[d+1];
    for(int w=k;w<=d;w=w+k){
    	drag[w]=true;
    }
    for(int w=l;w<=d;w=w+l){
    	drag[w]=true;
    }
    for(int w=m;w<=d;w=w+m){
    	drag[w]=true;
    }
    for(int w=n;w<=d;w=w+n){
    	drag[w]=true;
    }
    int c=0;
    for(int i=1;i<=d;i++)
    	if(drag[i]==true)
    		c++;
    
    writer.println(c);
    }
    public static void main(String args[]) throws IOException{ 
    	try(A148_InsomniaCure c=new A148_InsomniaCure()){
    	c.solve();
    	}
    }
    public void close() throws IOException {
        reader.close();
        writer.close();
    }


}
