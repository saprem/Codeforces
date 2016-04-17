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

public class A558 implements Closeable {
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
   ArrayList<PairA> P=new ArrayList<PairA>();
   ArrayList<PairA> N=new ArrayList<PairA>();
    int cN=0,cP=0,x,a;
    for(int i=0;i<n;i++){
    	x=nextInt();a=nextInt();
    	if(x<0){
    		N.add(new PairA(x,a));
    		cN++;
    	}
    	else{
    		P.add(new PairA(x,a));
    		cP++;
    	}
    }
    Collections.sort(P);
    Collections.sort(N);
    int sum=0;
    if(cP>cN){
    	int t=cN,i=0;
    	while(t!=0){
    		sum+=P.get(i).a;
        	sum+=N.get(i).a;
        	i++;t--;
    	}
    	sum+=P.get(i).a;
    }
    else if(cN>cP){
    	int t=cP,i=0;
    	while(t!=0){
    		sum+=P.get(i).a;
        	sum+=N.get(cN-i-1).a;
        	i++;t--;
    	}
    	sum+=N.get(cN-i-1).a;
    }
    else{
    	int t=cN,i=0;
    	while(t!=0){
    		sum+=P.get(i).a;
        	sum+=N.get(i).a;
        	i++;t--;
    	}
    }
    writer.println(sum);
    }
    public static void main(String args[]) throws IOException{ 
    	try(A558 c=new A558()){
    	c.solve();
    	}
    }
    public void close() throws IOException {
        reader.close();
        writer.close();
    }

}
class PairA implements Comparable{
	public PairA(int x, int a) {
		super();
		this.x = x;
		this.a = a;
	}
	int x;
	int a;
	@Override
	public int compareTo(Object arg0) {
		// TODO Auto-generated method stub
		PairA p=(PairA)arg0;
		if(p.x==x)
			return 0;
		else if(x>p.x)
			return 1;
		return -1;
	}
}