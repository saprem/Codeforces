package codeForcesTry;

import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B557 implements Closeable{
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

    final int MOD = 1000 * 1000 * 1000 + 7;

    int sum(int a, int b) {
        a += b;
        return a >= MOD ? a - MOD : a;
    }

    int product(int a, int b) {
        return (int) (1l * a * b % MOD);
    }

    int pow(int x, int k) {
        int result = 1;
        while (k > 0) {
            if (k % 2 == 1) {
                result = product(result, x);
            }
            x = product(x, x);
            k /= 2;
        }
        return result;
    }

    int pow(int x, long k) {
        int result = 1;
        while (k > 0) {
            if (k % 2 == 1) {
                result = product(result, x);
            }
            x = product(x, x);
            k /= 2;
        }
        return result;
    }

    int inv(int x) {
        return pow(x, MOD - 2);
    }
    void solve() throws IOException {
    	
    	int n=nextInt();
    	int w=nextInt();
    	int arr[]=new int[n*2];
    	for(int i=0;i<n*2;i++)
    		arr[i]=nextInt();
    	Arrays.sort(arr);
    	
    	double sum=w;
    	if(arr[0]*2>=arr[n]){
    		if(n*(arr[n]+(double)arr[n]/(double)2)<=w)
    			sum=n*arr[n]+n*(double)arr[n]/(double)2;
    	}
    	else if((double)arr[n]/(double)2>arr[0]){
    		if(n*(arr[0]+arr[0]*2)<=w)
    			sum=n*(arr[0]+arr[0]*2);
    	}
    	if(sum==(int)sum)
    		writer.println((int)sum);
    	else
    		writer.println(sum);
    }

public static void main(String args[]) throws IOException{ 
	try(B557 c=new B557()){
	c.solve();
	}
}
public void close() throws IOException {
    reader.close();
    writer.close();
}
}
