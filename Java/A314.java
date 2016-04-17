package codeForcesTry;

import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class A314 implements Closeable{
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
	public void solve() throws IOException{
		int n=nextInt();
		int []a=new int[n];
		for(int i=0;i<n;i++)
			a[i]=nextInt();
		int max[]=new int[n];
		int min[]=new int[n];
		max[0]=(int) Math.sqrt(Math.pow(a[0]-a[n-1],2));
		min[0]=(int) Math.sqrt(Math.pow(a[0]-a[1],2));
		max[n-1]=max[0];
		min[n-1]=(int) Math.sqrt(Math.pow(a[n-2]-a[n-1],2));
		for(int i=1;i<n-1;i++){
			max[i]=0;min[i]=Integer.MAX_VALUE;
				long dis1=(long) Math.sqrt(Math.pow(a[i]-a[n-1],2));
				long dis2=(long) Math.sqrt(Math.pow(a[i]-a[0],2));
				long dis3=(long) Math.sqrt(Math.pow(a[i]-a[i-1],2));
				long dis4=(long) Math.sqrt(Math.pow(a[i]-a[i+1],2));
				max[i]=(int) Math.max(dis1,dis2);
				min[i]=(int) Math.min(dis3,dis4);
		}
		for(int i=0;i<n;i++){
			System.out.println(min[i]+" "+max[i]);
		}
	}
	public static void main(String args[]) throws IOException{ 
		try(A314 c=new A314()){
		c.solve();
		}
	}
	public void close() throws IOException {
	    reader.close();
	    writer.close();
	}


}
