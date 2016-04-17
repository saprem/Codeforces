package codeForcesTry;

import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class B355_VasyaPublicTransport implements Closeable {
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
    	int c[]=new int[4];
    	for(int i=0;i<4;i++)
    		c[i]=nextInt();
    	int n=nextInt();
    	int m=nextInt();
    	int b[]=new int[n];
    	int t[]=new int[m];
    	
    	int bC[]=new int[n];
    	int tC[]=new int[m];
    	int tot0b=0,tot0t=0;
    	int tot1b=0,tot1t=0;
    	for(int i=0;i<n;i++){
    		b[i]=nextInt();
    		bC[i]=b[i]*c[0];
    		tot0b+=bC[i];
    		tot1b+=b[i]*c[1];
    	}
    	for(int i=0;i<m;i++){
    		t[i]=nextInt();
    		tC[i]=t[i]*c[0];
    		tot0t+=tC[i];
    		tot1t+=t[i]*c[1];
    	}
    	//System.out.println(tot0b+" "+tot1b+" "+tot0t+" "+tot1t);
    	long ans1=0,tempAns=0;
    	for(int i=0;i<n;i++){
    		if(bC[i]<c[1])
    			ans1+=bC[i];
    		else
    			ans1+=c[1];
    	}
    	//System.out.println(ans1);
    	ans1=Math.min(ans1,tot0b);
    	//System.out.println(ans1);
    	ans1=Math.min(ans1,tot1b);
    	//System.out.println(ans1);
    	ans1=Math.min(ans1,c[2]);
    	//System.out.println(ans1);
    	long ans2=0;
    	for(int i=0;i<m;i++){
    		if(tC[i]<c[1])
    			ans2+=tC[i];
    		else
    			ans2+=c[1];
    	}
    	ans2=Math.min(ans2,tot0t);
    	ans2=Math.min(ans2,tot1t);
    	ans2=Math.min(ans2,c[2]);
    	
    	long ans=Math.min(ans2+ans1,2*c[2]);
    	ans=Math.min(ans,c[3]);
    	writer.println(ans);
    }
    public static void main(String args[]) throws IOException{ 
    	try(B355_VasyaPublicTransport c=new B355_VasyaPublicTransport()){
    	c.solve();
    	}
    }
    public void close() throws IOException {
        reader.close();
        writer.close();
    }

}
//class Bus