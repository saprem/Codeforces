package codeForcesTry;

import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class A339_HelpFulMaths implements Closeable {
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
    String x=next();
    ArrayList<Character> l=new ArrayList<Character>();
    for(int i=0;i<x.length();i=i+2)
    	l.add(x.charAt(i));
    Collections.sort(l);
    String y="";
    for(int i=0;i<l.size()-1;i++)
    	y+=l.get(i)+"+";
    y=y+l.get(l.size()-1);
    writer.println(y);
    }
    public static void main(String args[]) throws IOException{ 
    	try(A339_HelpFulMaths c=new A339_HelpFulMaths()){
    	c.solve();
    	}
    }
    public void close() throws IOException {
        reader.close();
        writer.close();
    }



}
