package codeForcesTry;

import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class A4_WaterMellon implements Closeable {
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
    
    		int w=nextInt();
   
    		if(w%2==0&&w!=2)
    			writer.println("YES");
    		else
    			writer.println("NO");
    	
    	
    }
    public static void main(String args[]) throws IOException{ 
    	try(A4_WaterMellon c=new A4_WaterMellon()){
    	c.solve();
    	}
    }
    public void close() throws IOException {
        reader.close();
        writer.close();
    }


}
