package codeForcesTry;

import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class B525_PashaString implements Closeable {
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
    String sb=next();
    char []name=sb.toCharArray();
    int len=sb.length();
    int cnt[]=new int[len/2+1];
    int days=nextInt();
    while(days!=0){
    	int x=nextInt();
    	cnt[x]++;
    	days--;
    }
    for(int i=1,sum=0;i<cnt.length;i++){
    	sum+=cnt[i];
    	if(sum%2!=0){
    		char temp=name[i-1];
    		name[i-1]=name[len-i];
    		name[len-i]=temp;
    	}
    }
    String ans=String.valueOf(name);
    writer.println(ans);
    }
    public static void main(String args[]) throws IOException{ 
    	try(B525_PashaString c=new B525_PashaString()){
    	c.solve();
    	}
    }
    public void close() throws IOException {
        reader.close();
        writer.close();
    }


}
