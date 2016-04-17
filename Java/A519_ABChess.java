package codeForcesTry;

import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.StringTokenizer;

public class A519_ABChess implements Closeable {
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
    	int i=0;
    	int cW=0,cB=0;
    	HashMap<Character,Integer> hp=new HashMap<Character,Integer>();
    	hp.put('q', 9);
    	hp.put('r', 5);
    	hp.put('b', 3);
    	hp.put('n', 3);
    	hp.put('p', 1);
    	while(i<8){
    		String x=next();
    		for(int j=0;j<8;j++){
    			if(hp.containsKey(x.charAt(j)))
    				cB+=hp.get(x.charAt(j));
    			else if(hp.containsKey(Character.toLowerCase(x.charAt(j)))){
    				cW+=hp.get(Character.toLowerCase(x.charAt(j)));
    			}
    		}
    		i++;
    	}
    	if(cB==cW)
    		writer.println("Draw");
    	else
    		writer.println(cW>cB?"White":"Black");
    	close();
    }
    public static void main(String args[]) throws IOException{ 
    	try(A519_ABChess c=new A519_ABChess()){
    	c.solve();
    	}
    }
    public void close() throws IOException {
        reader.close();
        writer.close();
    }

}
