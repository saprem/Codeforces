package codeForcesTry;

import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class A355_VasyaDigitalRoot implements Closeable {
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
    	int k,d;
    	k=nextInt();
    	d=nextInt();
    	int num2D=(int) (Math.pow(10,1))+(d-1);
    	//System.out.println(num2D);
    	String ans="";
    	if(k==1){
    		writer.println(d);
    		close();
    	}
    	if(k>1&&d==0){
    		writer.println("No solution");
    		close();
    	}
     	while(k!=0){
     		if(num2D<9){
     			String x=String.valueOf(num2D);
     			ans=ans+x;
     			num2D=0;
     		}
     		else if(num2D>=9){
     			ans=ans+"9";
     			num2D=num2D-9;
     		}
     		k--;
     	}
     	writer.println(ans);
    }
    public static void main(String args[]) throws IOException{ 
    	try(A355_VasyaDigitalRoot c=new A355_VasyaDigitalRoot()){
    	c.solve();
    	}
    }
    public void close() throws IOException {
        reader.close();
        writer.close();
    }

}
