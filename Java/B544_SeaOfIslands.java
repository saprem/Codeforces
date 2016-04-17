package codeForcesTry;

import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class B544_SeaOfIslands implements Closeable{
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
	int n=nextInt();int k=nextInt();
	if(n%2==0){
		if(k>(n*n/2)){
			System.out.println("NO");
			close();
		}
	}
	else{
		if(k>((n+1)*(n+1)/4+(n-1)*(n-1)/4)){
			System.out.println("NO");
			close();
		}
	}
	System.out.println("YES");
	int cnt=0;
	for(int i=1;i<=n;i++){
		for(int j=1;j<=n;j++){
			if(i%2!=0&&j%2!=0&&cnt<k){
				System.out.print("L");
				cnt++;
			}
			else if(i%2==0&&j%2==0&&cnt<k){
				System.out.print("L");
				cnt++;
			}
			else
				System.out.print("S");
		}
		System.out.println();
	}
	//System.out.println(cnt);
	}
	public static void main(String args[]) throws IOException{ 
		try(B544_SeaOfIslands c=new B544_SeaOfIslands()){
		c.solve();
		}
	}
	public void close() throws IOException {
	    reader.close();
	    writer.close();
	}

}
