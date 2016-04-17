package codeForcesTry;

import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class A400_InaaAndChoices implements Closeable {
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
    	String[] x=new String[n];
    	int mul[]={1,2,3,4,6,12};
    	//int ans[]=new int[6];
    	for(int i=0;i<n;i++){
    		x[i]=next();
    	}
    	for(int i=0;i<n;i++){
    		int count=0;
    		String ans="";
    		for(int j=0;j<6;j++){
    			int test[]=new int[12/mul[j]];
    			for(int k=0;k<12;k++){
    				if(x[i].charAt(k)=='X')
    					test[k%(12/mul[j])]++;
    				if(test[k%(12/mul[j])]==mul[j]){
    					count++;
    					ans+=(mul[j]+"x"+12/mul[j]+" ");
    					break;
    				}
    			}
    			
    		}
    		writer.println(count+" "+ans);
    	}
    }
    public static void main(String args[]) throws IOException{ 
    	try(A400_InaaAndChoices c=new A400_InaaAndChoices()){
    	c.solve();
    	}
    }
    public void close() throws IOException {
        reader.close();
        writer.close();
    }

}
