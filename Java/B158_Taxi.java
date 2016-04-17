package codeForcesTry;

import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class B158_Taxi implements Closeable {
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
    int cnt[]=new int[5];
    for(int i=0;i<n;i++)
    	cnt[nextInt()]++;
    //writer.println(cnt[1]+" "+cnt[2]+" "+cnt[3]);
   	int t=Math.min(cnt[3],cnt[1]);	
    if(cnt[3]>=cnt[1]){
    	cnt[1]=0;
    	cnt[3]=cnt[3]-t;
    }
    else{
    	cnt[3]=0;
    	cnt[1]=cnt[1]-t;
    }
    t=t+cnt[3]+cnt[4];
    t=t+(int)Math.ceil((float)cnt[1]/4);
    if(cnt[1]%4!=0&&cnt[1]%4<3&&cnt[2]>0)
    	cnt[2]--;
    t=t+(int)Math.ceil((float)cnt[2]/2);
    writer.println(t);
    }
    public static void main(String args[]) throws IOException{ 
    	try(B158_Taxi c=new B158_Taxi()){
    	c.solve();
    	}
    }
    public void close() throws IOException {
        reader.close();
        writer.close();
    }


}
