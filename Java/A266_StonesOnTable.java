package codeForcesTry;

import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class A266_StonesOnTable implements Closeable {
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
    		ArrayList<Character> l=new ArrayList<Character>();
    		int i=1,j=1;
    		String y=next();
    		l.add(y.charAt(0));
    		while(i<n){
    			if(l.get(j-1)!=y.charAt(i)){
    				l.add(y.charAt(i));j++;
    			}
    			i++;
    		}
    	writer.println(y.length()-l.size());
    }
    public static void main(String args[]) throws IOException{ 
    	try(A266_StonesOnTable c=new A266_StonesOnTable()){
    	c.solve();
    	}
    }
    public void close() throws IOException {
        reader.close();
        writer.close();
    }


}
