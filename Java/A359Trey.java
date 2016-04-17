package codeForcesTry;

import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class A359Trey implements Closeable {
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
    	int n,m,k=0;
        n=nextInt();
        m=nextInt();
        ArrayList<Integer> goodx=new ArrayList<Integer>();
        ArrayList<Integer> goody=new ArrayList<Integer>();
        //boolean cell[][]=new boolean[n][m];
        for(int i=0;i<n;i++){
        	for(int j=0;j<m;j++){
        		if(nextInt()==1){
        			//cell[i][j]=true;
        			goodx.add(i);
        			goody.add(j);
        		}
        	}
        }
        if(goodx.contains(0)||goodx.contains(n-1)||goody.contains(0)||goody.contains(m-1))
        	writer.println(2);
        else
        	writer.println(4);
        close();
    }
        	
    public static void main(String args[]) throws IOException{ 
    	try(A359Trey c=new A359Trey()){
    	c.solve();
    	}
    }
    public void close() throws IOException {
        reader.close();
        writer.close();
    }

}
