package codeForcesTry;

import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class A479_Expression  implements Closeable {
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
    	int a[]=new int[3];
    	a[0]=nextInt();a[1]=nextInt();a[2]=nextInt();
    	int ans=0;
    	if(a[0]==1){
    		ans=a[0]+a[1];
    		if(a[2]==1)
    			ans=ans+a[2];
    		else
    			ans*=a[2];
    	}
    	else if(a[2]==1){
    		ans=a[1]+a[2];
    		if(a[0]==1)
    			ans=ans+a[0];
    		else
    			ans*=a[0];
    	}
    	else if(a[1]==1){
    		ans=a[1]+Math.min(a[0], a[2]);
    		ans*=Math.max(a[0], a[2]);
    	}
    	else{
    		ans=a[0]*a[1]*a[2];
    	}
    	writer.println(ans);
    }
    public static void main(String args[]) throws IOException{ 
    	try(A479_Expression c=new A479_Expression()){
    	c.solve();
    	}
    }
    public void close() throws IOException {
        reader.close();
        writer.close();
    }


}
