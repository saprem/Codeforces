package codeForcesTry;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B433 {
public static void main(String args[]) throws IOException{
	BufferedReader sIn=new BufferedReader(new InputStreamReader(System.in));
	PrintStream sOut=new PrintStream(System.out);
	int n=Integer.parseInt(sIn.readLine());
	StringTokenizer st=new StringTokenizer(sIn.readLine());
	int arr[]=new int[n];
	
	for(int i=0;i<n;i++)
		arr[i]=Integer.parseInt(st.nextToken());
	
	int arrC[]=arr.clone();
	
	Arrays.sort(arrC);
	//for(int i=0;i<n;i++)
		//sOut.print(arrC[i]+" ");
	int m=Integer.parseInt(sIn.readLine());
	
	for(int i=0;i<m;i++){
		long sum=0;
		st=new StringTokenizer(sIn.readLine());
		int x=Integer.parseInt(st.nextToken());
		int start=Integer.parseInt(st.nextToken())-1;
		int end=Integer.parseInt(st.nextToken());
		if(x==1){
			for(int j=start;j<end;j++){
			sum+=arr[j];	
			}
		}
		else if(x==2){
			//System.out.println(Integer.parseInt(st.nextToken())-1+" "+(Integer.parseInt(st.nextToken())-1));
			for(int j=start;j<end;j++){
				sum=sum+arrC[j];	
				}
			//sOut.print("ad");
		}
		sOut.println(sum);
	}
	sIn.close();
	sOut.close();
}
}
