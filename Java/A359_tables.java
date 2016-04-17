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

public class A359_tables implements Closeable {
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
    int n,m,k=0;
    n=nextInt();
    m=nextInt();
    boolean cell[][]=new boolean[n][m];
    ArrayList<Cell> good=new ArrayList<Cell>();
    ArrayList<Integer> x=new ArrayList<Integer>();  
    for(int i=0;i<n;i++){
    	for(int j=0;j<m;j++){
    		if(nextInt()==1){
    			cell[i][j]=true;
    			good.add(new Cell(i,j));
    			int temp[]=good.get(k).getCornerDiff(n,m);
    			for(int l=0;l<4;l++)
    				x.add(temp[l]);
    			k++;
    		}
    	}
    }
    Collections.sort(x);
    
    }
    public static void main(String args[]) throws IOException{ 
    	try(A359_tables c=new A359_tables()){
    	c.solve();
    	}
    }
    public void close() throws IOException {
        reader.close();
        writer.close();
    }

}
class Cell {
	int x;
	int y;
	public Cell(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	public int[] getCornerDiff(int nR,int nC){
		int area[]=new int[4];
		area[0]=(x+1)*(y+1);
		area[1]=(x+1)*(nC-y+1);
		area[2]=(nR-x+1)*(y+1);
		area[3]=(nR-x+1)*(nC-y+1);
		Arrays.sort(area);
		return area;
	}
}