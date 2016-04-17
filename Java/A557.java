package codeForcesTry;

import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class A557 implements Closeable {
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
    	int am=nextInt();
    	int aM=nextInt();
    	int bm=nextInt();
    	int bM=nextInt();
    	int cm=nextInt();
    	int cM=nextInt();
    	int aC=0,bC=0,cC=0;
    	//int search;
    	if(n<=aM+bM+cM&&n>aM+bM+cm){
    		int sum=aM+bM+cM;
    		aC=aM;
    		bC=bM;
    		cC=cM;
    		while(sum!=n){
    			cC--;
    			sum--;
    		}
    		writer.println(aC+" "+bC+" "+cC);
    		close();
    	}
    	if(n>aM+bm+cm&&aM+bM+cm>=n){
    		int sum=aM+bM+cm;
    		aC=aM;
    		bC=bM;
    		cC=cm;
    		while(sum!=n){
    			bC--;
    			sum--;
    		}
    		writer.println(aC+" "+bC+" "+cC);
    		close();
    	}
    	else if(n<=aM+bm+cm){
    		int sum=aM+bm+cm;
    		aC=aM;
    		bC=bm;
    		cC=cm;
    		while(sum!=n){
    			//if(cC>=)
    				aC--;
    			sum--;
    		}
    		writer.println(aC+" "+bC+" "+cC);
    		close();
    	}
    	
   }

public static void main(String args[]) throws IOException{ 
	try(A557 c=new A557()){
	c.solve();
	}
}
public void close() throws IOException {
    reader.close();
    writer.close();
}
}
