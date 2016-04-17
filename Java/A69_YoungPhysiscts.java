package codeForcesTry;

import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class A69_YoungPhysiscts implements Closeable {
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
    	int xC=0,yC=0,zC=0;
    	while(n!=0){
    		xC=xC+nextInt();
    		yC=yC+nextInt();
    		zC=zC+nextInt();
    		n--;
    	}
    	if(xC==yC&&yC==zC&&zC==0)
    		writer.println("YES");
    	else
    		writer.println("NO");
    	
    	close();
    }
    public static void main(String args[]) throws IOException{ 
    	try(A69_YoungPhysiscts c=new A69_YoungPhysiscts()){
    	c.solve();
    	}
    }
    public void close() throws IOException {
        reader.close();
        writer.close();
    }

}
