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

public class B558 implements Closeable {
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
    	int n,c=0;
    	n=nextInt();
    	//Number[] nL=new Number[n]; 
    	ArrayList<Integer> x=new ArrayList<Integer>();
    	ArrayList<Number> nL=new ArrayList<Number>();
    	int max=-1;
    	for(int i=0;c<n;){
    		int a=nextInt();
    		if(!x.contains(a)){
    			nL.add(new Number(a,c+1));
    			nL.get(i).setEnd(c+1);
    			x.add(a);
    			//nL.get(i).setCount();
    			max=Math.max(max,nL.get(i).count);
    			i++;
    		}
    		else{
    			int index=x.indexOf(a);
    			nL.get(index).setCount();
    			nL.get(index).setEnd(c+1);
    			max=Math.max(max,nL.get(index).count);
    		}
    		c++;
    		
    	}
    	//System.out.println(max);
    	int min=Integer.MAX_VALUE,j=0,sA=1,eA=1;
  
    	for(int i=x.toArray().length-1;i>=0;i--){
    			if(max==nL.get(i).count){
    				if(min>nL.get(i).end-nL.get(i).start){
    					min=Math.min(min,nL.get(i).end-nL.get(i).start);
    					sA=nL.get(i).start;eA=nL.get(i).end;
    				}
    			}
    		
    	}
    	writer.println(sA+" "+eA);
    	//Collections.sort(range);
    
    }	
    public static void main(String args[]) throws IOException{ 
    	try(B558 c=new B558()){
    	c.solve();
    	}
    }
    public void close() throws IOException {
        reader.close();
        writer.close();
    }

}
class Number{
	int num,start;
	int count=0;
	int end=0;
	public Number(int num, int start) {
		super();
		this.num = num;
		this.start = start;
		count=1;
	}
	public void setCount(){
		count++;
	}
	public int getCount(){
		return count;
	}
	public void setEnd(int i){
		end=i;
	}
}
/*
InputReader in = new InputReader(System.in);
PrintWriter w = new PrintWriter(System.out);

int n = in.nextInt();

int a[] = new int[n];
for (int i = 0; i < n; i++)
	a[i] = in.nextInt();

int m = 1000001;
int min[] = new int[m];
Arrays.fill(min, (int)1e7);
int max[] = new int[m];
Arrays.fill(max, -(int)1e7);
int cnt[] = new int[m];

for(int i=0;i<n;i++){
	cnt[a[i]]++;
	max[a[i]] = Math.max(max[a[i]],i);
	min[a[i]] = Math.min(min[a[i]],i);
}

int mc = 0;
for(int i=0;i<m;i++)
	mc = Math.max(mc, cnt[i]);

int ans = n;
int l = 1,r = n;
for(int i=0;i<m;i++)
	if(cnt[i] == mc){
		if(max[i] - min[i] + 1 < ans){
			ans = max[i] - min[i] + 1;
			l = min[i] + 1;
			r = max[i] + 1;
		}
	}

w.println(l + " " + r);
*/