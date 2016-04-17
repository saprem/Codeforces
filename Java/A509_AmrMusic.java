package codeForcesTry;

import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class A509_AmrMusic implements Closeable {
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
    	//int arr[]=new int[n];
    	ArrayList<B509_Pair> ans=new ArrayList<B509_Pair>();
    	for(int i=0;i<n;i++){
    		ans.add(new B509_Pair(nextInt(),i+1));
    	}
    	
    	int count=0;
    	Collections.sort(ans);
    	ArrayList<Integer> x=new ArrayList<Integer>();
    	for(int i=0;i<n;i++) {
    		k=k-ans.get(i).days;
    		if(k<0)
    			break;
    		x.add(ans.get(i).index);
    		count++;
    		
    	}
    	writer.println(count);
    	for(int i:x)
    		writer.print(i+" ");
    	
    }
    public static void main(String args[]) throws IOException{ 
    	try(A509_AmrMusic c=new A509_AmrMusic()){
    	c.solve();
    	}
    }
    public void close() throws IOException {
        reader.close();
        writer.close();
    }

}
class B509_Pair implements Comparable{
	int days;
	int index;
	public B509_Pair(int days, int index) {
		super();
		this.days = days;
		this.index = index;
	}
	@Override
	public int compareTo(Object obj) {
		// TODO Auto-generated method stub
		B509_Pair p=(B509_Pair)obj;
		if(p.days==days)
			return 0;
		else if(days>p.days)
			return 1;
		return -1;
	}
	
}