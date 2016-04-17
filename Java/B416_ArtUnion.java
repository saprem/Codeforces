package codeForcesTry;

import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class B416_ArtUnion implements Closeable{
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
	 int m,n;
	 m=nextInt();n=nextInt();
	 int maxT[][]=new int[m][n];
	 int time[][]=new int[m][n];
	 //int sumH[]=new int[n];
	 int sumV=0;
	 for(int i=0;i<m;i++){
		int sumH=0;
		 for(int j=0;j<n;j++){
			 time[i][j]=nextInt();
			 sumH+=time[i][j];
			 if(i==0){
				 maxT[0][j]=sumH;
				// System.out.println(maxT[0][j]);
			 }
			 if(j==0)
				 sumV+=time[i][0];
		 }
		 maxT[i][0]=sumV;
	}
	
	 for(int i=1;i<m;i++){
		 for(int j=1;j<n;j++){
			 maxT[i][j]=Math.max(maxT[i][j-1],maxT[i-1][j])+time[i][j];
		 }
	 }
	 for(int i=0;i<m;i++)
		 writer.print(maxT[i][n-1]+" ");
	}
	public static void main(String args[]) throws IOException{ 
		try(B416_ArtUnion c=new B416_ArtUnion()){
		c.solve();
		}
	}
	public void close() throws IOException {
	    reader.close();
	    writer.close();
	}

}
