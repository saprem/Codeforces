package codeForcesTry;

import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class B509_AmrPins implements Closeable {
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
    	long r,x,y,x1,y1;
    	r=nextLong();x=nextLong();y=nextLong();x1=nextLong();y1=nextLong();
    	long xy=(x-x1)*(x-x1)+(y-y1)*(y-y1);
    	double dist=Math.sqrt(xy);
    	//System.out.println(dist);
    	int ans=(int) Math.ceil((double)(Math.ceil(dist)/((double)2*r)));
    	
    	if(dist==0){
    		ans=0;
    	}
    	writer.println(ans);
    }
    public static void main(String args[]) throws IOException{ 
    	try(B509_AmrPins c=new B509_AmrPins()){
    	c.solve();
    	}
    }
    public void close() throws IOException {
        reader.close();
        writer.close();
    }

}
