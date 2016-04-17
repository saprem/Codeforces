package codeForcesTry;

import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class A525_VitalityPie implements Closeable {
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
    int cnt[]=new int[130];
    String x=next();
    int ans=0;
    for(int i=0;i<x.length();i++){
    	if(i%2==0)
    		cnt[x.charAt(i)]++;
    	else{
    		char y=(char)(x.charAt(i)+32);
    		if(cnt[y]>0)
    			cnt[y]--;
    		else
    			ans++;
    	}
    }
    writer.println(ans);
  /*  for(int i=1;i<2*(n-1);i=i+2)
    	door+=x.charAt(i);
    
   
    for(int i=0,j=0;i<2*(n-1)-1;i=i+2,j++){

    	if(door.substring(j).contains(Character.toString((char) (x.charAt(i)-32)))&&Character.isLowerCase(x.charAt(i))){
    		temp+=x.charAt(i);
    	}
  
    }
    writer.println(door.length()-temp.length());*/
    }
    public static void main(String args[]) throws IOException{ 
    	try(A525_VitalityPie c=new A525_VitalityPie()){
    	c.solve();
    	}
    }
    public void close() throws IOException {
        reader.close();
        writer.close();
    }


}
