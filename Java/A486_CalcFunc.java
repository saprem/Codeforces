package codeForcesTry;

import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

class A486_CalcFunc  implements Closeable {
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
    	long n=nextLong(),ans=0;
    	if(n%2==0){
    		ans-=(n/2)*(n/2);
    		ans+=(n/2)*(n/2+1);
    	}
    	else{
    		ans-=(n/2+1)*(n/2+1);
    		ans+=((n-1)/2)*((n-1)/2+1);
    	}
    	writer.println(ans);
    }
    
    public static void main(String args[]) throws IOException{ 
    	try(A486_CalcFunc c=new A486_CalcFunc()){
    	c.solve();
    	}
    }
    public void close() throws IOException {
        reader.close();
        writer.close();
    }


}
