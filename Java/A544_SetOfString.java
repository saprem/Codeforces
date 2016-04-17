package codeForcesTry;

import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.StringTokenizer;

public class A544_SetOfString implements Closeable{
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
	int k=nextInt();
	String x=next();
	int i=0;
	HashMap<Character,Integer> hs=new HashMap<Character,Integer>();
	while(i<x.length()){
		hs.put(x.charAt(i),1);
		if(hs.containsKey(x.charAt(i))){
			int val=hs.get(x.charAt(i))+1;
			hs.replace(x.charAt(i),val);
		}
		i++;
	}
	/*i=0;int max=0,key=-1;
	while(i<hs.size()){
		if(max<hs.get(x.charAt(i))){
			max=Math.max(hs.get(x.charAt(i)),max);
			key=x.charAt(i);
		}
		i++;
	}*/
	if(hs.size()<k){
		System.out.println("NO");
		close();
	}
	else{
		ArrayList<Character> al=new ArrayList<Character>();
		System.out.println("YES");	
		int j=0;
		for(i=0;i<k;i++){
			al.add(x.charAt(j));
			while(true){
				if(x.length()==j||!al.contains(x.charAt(j)))
					break;
				System.out.print(x.charAt(j));
				//System.out.print(j+" ");
				j++;
				
			}
			if(i==k-1&&j!=x.length()){
				System.out.print(x.substring(j));
			}
			System.out.println();
		}
	}
	}
	public static void main(String args[]) throws IOException{ 
		try(A544_SetOfString c=new A544_SetOfString()){
		c.solve();
		}
	}
	public void close() throws IOException {
	    reader.close();
	    writer.close();
	}

}
