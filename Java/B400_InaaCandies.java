package codeForcesTry;

import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class B400_InaaCandies implements Closeable {
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
    	int m=nextInt();
    	List<Integer> dist=new ArrayList<Integer>();
    	boolean flag=true;
    	for(int i=0;i<n;i++){
    		String x=next();
    		int i1=x.indexOf("G");
    		int i2=x.indexOf("S");
    		if(i1>i2){
    			flag=false;
    		}
    		if(!dist.contains(i2-i1))
    			dist.add(i2-i1);
    	}
    	if(flag==false){
    		writer.println(-1);
    		close();
    	}
    	Collections.sort(dist);
    	writer.println(dist.toArray().length);
    	/*int moves=1;
    	for(int j=dist.get(0),k=0;k<n;j++){
    		if()
    	}*/
    	
    }
    public static void main(String args[]) throws IOException{ 
    	try(B400_InaaCandies c=new B400_InaaCandies()){
    	c.solve();
    	}
    }
    public void close() throws IOException {
        reader.close();
        writer.close();
    }


}
