package codeForcesTry;

import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class A58_ChatRoom implements Closeable {
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
    	String x=next();
    	char in[]={'h','e','l','l','o'};
    	LinkedList<Character> l=new LinkedList<Character>();
    	for(int i=0,j=0;i<x.length()&&j<5;i++){
    		if(x.charAt(i)==in[j]){
    			l.add(x.charAt(i));
    			j++;
    		}
    	}
    	String y="";
    	for(int i=0;i<l.size();i++){
    		y+=l.get(i);
    	}
    	if(y.contains("hello"))
    		writer.println("YES");
    	else
    		writer.println("NO");
    	/*int count=0;
    	 * 
    	for(int i=0;i<x.length();){
    		if(x.charAt(i)!=in[0]){
    			i++;
    		}
    		else{
    			count++;
    			while(x.charAt(i)==in[0]){
    				i++;
    				continue;
    			}
    			if(x.charAt(i)!=in[1])
    				break;
    			else{
    				count++;
    				while(x.charAt(i)==in[1]){
        				i++;
        				continue;
        			}
        			if(x.charAt(i)!=in[2])
        				break;
        			else{
        				count++;
        				i++;
        				if(x.charAt(i)!=in[3])
        					break;
        				else{
        					count++;
        					while(x.charAt(i)==in[3]){
        						i++;
        						continue;
        					}
        					if(x.charAt(i)!=in[4])
        						break;
        					else{
        						count++;
        						break;
        					}
        				}
        			}
    			}
    		}
    	}
    	if(count==5)
    		writer.println("YES");
    	else
    		writer.println("NO");*/
    }
    public static void main(String args[]) throws IOException{ 
    	try(A58_ChatRoom c=new A58_ChatRoom()){
    	c.solve();
    	}
    }
    public void close() throws IOException {
        reader.close();
        writer.close();
    }


}
