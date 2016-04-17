package codeForcesTry;

import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class B359_Permutation implements Closeable {
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
    	int n,k;
    	n=nextInt();
    	k=nextInt();
    	int a[] =new int[2*n+1];
        for(int i=1;i<=2*n;i++){
            a[i]=i;
        }
        for(int i=1;i<=k;i++){
            int temp=a[2*i];
            a[2*i]=a[2*i-1];
            a[2*i-1]=temp;
        }
        for(int i=1;i<=2*n;i++){
            writer.print(a[i]+" ");
        }
    }
    public static void main(String args[]) throws IOException{ 
    	try(B359_Permutation c=new B359_Permutation()){
    	c.solve();
    	}
    }
    public void close() throws IOException {
        reader.close();
        writer.close();
    }

}
