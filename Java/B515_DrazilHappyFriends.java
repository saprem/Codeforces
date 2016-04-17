package codeForcesTry;

import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class B515_DrazilHappyFriends implements Closeable {
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
    	int n,m,b,g;
    	n=nextInt();
    	m=nextInt();
    	b=nextInt();
    	boolean nB[]=new boolean[n];
    	boolean mG[]=new boolean[m];
    	 int hB[]=new int[b];
    	for(int i=0;i<b;i++){
    			//hB[i]=nextInt();
    			nB[nextInt()]=true;
    	}
    	g=nextInt();
    	int hG[]=new int[g];
    	for(int i=0;i<g;i++){
    			//hG[i]=nextInt();
    			mG[nextInt()]=true;
    	}
    	int min=Math.min(m,n);
    		boolean temp[]=new boolean[min];
    		int j=0,k=0;
    		for(int i=0;;i++){
    			//System.out.println(j+" "+k);
    			if(nB[j%n]==true||mG[k%m]==true){
    				temp[i%min]=true;	
    				nB[j%n]=true;
    				mG[k%m]=true;
    			}
    			j++;k++;
    			if(i!=0&&j%n==0&&k%m==0)
    				break;
    		}
    		boolean flag=true;
    		for(int i=0;i<min;i++){
    			if(temp[i]==false){
    				flag=false;
    				break;
    			}
    		}
    		if(flag==true)
    			writer.println("Yes");
    		else
    			writer.println("No");
    		
    		close();
    	
    	
    }
    public static void main(String args[]) throws IOException{ 
    	try(B515_DrazilHappyFriends c=new B515_DrazilHappyFriends()){
    	c.solve();
    	}
    }
    public void close() throws IOException {
        reader.close();
        writer.close();
    }
}
