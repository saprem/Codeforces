package codeForcesTry;

import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B558Try implements Closeable {
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
    	int n;
    	n=nextInt();
    	//int n=in.nextInt();
		int a[]=new int[n];
		int count[]=new int[1000001];
		int start[]=new int[1000001];
		int end[]=new int[1000001];
		for(int i=0;i<n;i++){
			a[i]=nextInt();
			count[a[i]]++;
		}
		for(int i=0;i<n;i++){
			if(start[a[i]]==0){
				start[a[i]]=i+1;
			}
		}
		for(int i=n-1;i>=0;i--){
			if(end[a[i]]==0){
				end[a[i]]=i+1;
			}
		}
		int ind=-1;
		int max=-1;
		int len=100000000;
		int l=-1;
		int r=-1;
		for(int i=0;i<=1000000;i++){
			max=Math.max(count[i],max);
		}
		for(int i=0;i<=1000000;i++){
			if(count[i]==max){
				max=count[i];
				if((end[i]-start[i])<len && count[i]>0){
					len=end[i]-start[i];
					ind=i;
					l=start[i];
					r=end[i];
				}
			}
		}
		writer.println(l+" "+r);
    }
    public static void main(String args[]) throws IOException{ 
    	try(B558Try c=new B558Try()){
    	c.solve();
    	}
    }
    public void close() throws IOException {
        reader.close();
        writer.close();
    }

}
