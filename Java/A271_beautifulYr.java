package codeForcesTry;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.HashSet;

public class A271_beautifulYr {
	public static void main(String args[]) throws IOException{
		BufferedReader sIn=new BufferedReader(new InputStreamReader(System.in));
		PrintStream sOut=new PrintStream(System.out);
		HashSet<Character> hs=new HashSet<Character>();
		int x=Integer.parseInt(sIn.readLine());
		for(int i=x+1;i<=9012;i++){
			char[] c=Integer.toString(i).toCharArray();
			hs.add(c[0]);
			hs.add(c[1]);
			hs.add(c[2]);
			hs.add(c[3]);
			if(hs.size()==4){
				sOut.println(i);
				break;
			}
			hs.clear();
		}
		sIn.close();
		sOut.close();
	}
}
