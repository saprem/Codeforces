package codeForcesTry;

import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class A41_Translation implements Closeable {
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
    	String x=next();
    	//x=next();
    	String z=next();
    	//z=next();
    	String rev=reverse(x);
    	System.out.println(rev+" "+x+" "+z);
    	if(rev.equals(z))
    		writer.println("YES");
    	else
    		writer.println("NO");
    	close();
    }
    public static String reverse(String x){
    	char arr[]=x.toCharArray();
    	int len=arr.length;
    	for(int i=0;i<len;i++){
    		char temp=arr[i];
    		arr[i]=arr[len-i-1];
    		arr[len-i-1]=temp;
    	}
    	String y=String.valueOf(arr);
    	System.out.println(arr);
		return y;
    	
    }
    public static void main(String args[]) throws IOException{ 
    	try(A41_Translation c=new A41_Translation()){
    	c.solve();
    	}
    }
    public void close() throws IOException {
        reader.close();
        writer.close();
    }


}
