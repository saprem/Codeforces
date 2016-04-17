package codeForcesTry;

import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class B448_CandyBoxes implements Closeable{
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
    void solve() throws IOException {
    	int n=nextInt();
    	int arr[]=new int[n];
    	int max=-1,min=Integer.MAX_VALUE,sum=0;
    	for(int i=0;i<n;i++){
    		arr[i]=nextInt();
    		max=Math.max(max, arr[i]);
    		min=Math.min(min, arr[i]);
    		sum=sum+arr[i];
    	}
    	if(n==0){
    		writer.println("YES");
    		writer.println(1);
    		writer.println(2);
    		writer.println(2);
    		writer.println(3);
    		close();
    	}
    	if(n==1){
    		writer.println("YES");
    		writer.println(2*arr[0]);
    		writer.println(2*arr[0]);
    		writer.println(3*arr[0]);
    		close();
    	}
    	if(n==4){
    		float avg=(float)sum/(float)4,med=(float)(sum-max-min)/(float)2;
    		int range=max-min;
    		if(avg==med&&med==range)
    			writer.println("YES");
    		else
    			writer.println("NO");
    		close();
    	}
    	if(n==2){
    		if(max<=3*min){
    			int diff=2*min-max;
    			writer.println("YES");
    			writer.println(2*min+diff);
        		writer.println(min*3);
    		}
    		else{
    			writer.println("NO");
    		}
    		close();
    	}
    	if(n==3){
    		/*boolean flag=false;
    		int t=0;
    		for(int i=0;i<3;i++){
    			t=0;
    			for(int j=0;j<3;j++){
    				if(i!=j&&(arr[i]+arr[j])%4==0){
    					t=2*(arr[i]+arr[j])-sum;
    					int arMin=Math.min(t, min);
    	    			int arMax=Math.max(t, max);
    	    			//writer.println(arMax+" "+arMin);
    	    			if(3*arMin==arMax){
    	    				t=2*(arr[i]+arr[j])-sum;
    	    				flag=true;
    	    				break;
    	    			}
    				}
    			}
    		}
    		if(flag==true){
    			writer.println("YES");
    			writer.println(t);
    		}
    		else
    			writer.println("NO");*/
    		int mid=sum-max-min;
    		if((max+min)%4==0){
    			writer.println("YES");
    			writer.println(2*(max+min)-sum);
    		}
    		else if((min+mid)%4==0&&(max/3+max==min+mid)){
    			writer.println("YES");
    			writer.println(max/3);
    		}
    		else if((max+mid)%4==0&&(min+min*3==max+mid)){
    			writer.println("YES");
    			writer.println(min*3);
    		}
    		else{
    			writer.println("NO");
    		}
    		close();
    	}
    }
    public static void main(String args[]) throws IOException{ 
		try(B448_CandyBoxes c=new B448_CandyBoxes()){
		c.solve();
		}
	}
	public void close() throws IOException {
	    reader.close();
	    writer.close();
	}
}
