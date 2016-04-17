package codeForcesTry;

import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class A122_LuckyDivision implements Closeable {
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
    	ArrayList<Integer> divisors=new ArrayList<Integer>();
    	for(int i=1;i<=Math.sqrt(n);i++ ){
    		if(n%i==0){
    			divisors.add(i);
    			divisors.add(n/i);
    		}
    	}
    	for(int i=0;i<divisors.size();i++){
    		if(check(divisors.get(i))){
    			writer.println("YES");
    			close();
    		}
    	}
    	writer.println("NO");
    }
    public boolean check(int num){
		String x=String.valueOf(num);
		int i=0;
		for(i=0;i<x.length();i++){
			if(x.charAt(i)=='4'||x.charAt(i)=='7')
				continue;
			break;
		}
		if(i==x.length())
			return true;
    	return false;
    	
    }
    public static void main(String args[]) throws IOException{ 
    	try(A122_LuckyDivision c=new A122_LuckyDivision()){
    	c.solve();
    	}
    }
    public void close() throws IOException {
        reader.close();
        writer.close();
    }

}
