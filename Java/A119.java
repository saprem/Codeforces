package codeForcesTry;

import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class A119 implements Closeable{
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
    static int gcd(int a, int b) {
    	  int r;
    	  while(b!=0){
    	    r = a % b;
    	    a = b;
    	    b = r;
    	  }
    	  return a;
    	}
    void solve() throws IOException {
    	int p1=nextInt();
    	int p2=nextInt();
    	int n=nextInt();
    	boolean flag=true;
    	int i=0,p=0;
    	//writer.println(gcd(1,1));
    	while(true){
    		if(i%2==0)
    			p=p1;
    		else
    			p=p2;
    		
    	
    		
    		//writer.println("B "+p+" "+gcd(p,n)+" "+n);
    		n=n-gcd(p,n);
    		//writer.println("A "+p+" "+gcd(p,n)+" "+n);
    		if(n==0)
    			break;
    		
    		i++;
    	}
    	if(i%2!=0)
    		flag=false;
    	if(flag)
    		writer.println(0);
    	else
    		writer.println(1);
    	close();
    }
    public static void main(String args[]) throws IOException{ 
    	try(A119 c=new A119()){
    	c.solve();
    	}
    }
    public void close() throws IOException {
        reader.close();
        writer.close();
    }

}
