package codeForcesTry;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class A2_Winnes {
public static void main(String args[]) throws  IOException{
	BufferedReader sIn=new BufferedReader(new InputStreamReader(System.in));
	PrintStream sOut=new PrintStream(System.out);
	int n=Integer.parseInt(sIn.readLine());
	StringTokenizer st;
	//LinkedHashSet<String> hs=new LinkedHashSet<String>();
	ArrayList<String> arrL=new ArrayList<String>();
	Player p[]=new Player[n];
	String nam[]=new String[n];
	int poi[]=new int[n];
	int max=-1,k=0,i,overM=-1;
	String reqN="",overN="";
	ArrayList<String> maxN=new ArrayList<String>();
	for( i=0;i<n;i++){
		st=new StringTokenizer(sIn.readLine()," ");
		String name=st.nextToken();
		int points=Integer.parseInt(st.nextToken());
		if(!arrL.contains(name)){
			p[k]=new Player(name,points);
			k++;
		}
		else{
			for(int j=0;j<k;j++){
				if(p[j].name.equals(name)){
					p[j].points=p[j].points+points;
					break;
				}
			}
		}
		//max=p[0].points;
		for(int j=0;j<k;j++){
			if(overM<p[j].points){
				overM=p[j].points;
				overN=p[j].name;
			}
		}
		
		arrL.add(name);
		poi[i]=points;
	}
	
	//for(int j=0;j<k;j++)
		//sOut.println(p[j].name+" "+p[j].points);
	
	int count=0;
	for(int j=0;j<k;j++){	
		if(p[j].points>=max){
			max=p[j].points;
		}
	}
	for(int j=0;j<k;j++){
		if(p[j].points==max){
			maxN.add(p[j].name);
			count++;
		}
			
	}
	for(int j=0;j<k;j++){	
		if(p[j].points>=max){
			max=p[j].points;
		}
	}
	int index[]=new int[count];
	for(int j=0;j<count;j++){
		for(int m=n-1;m>=0;m--){
			if(maxN.get(j).equals(arrL.get(m))){
				index[j]=m;
				break;
			}
		}
		
	}
	
	int minInd=Integer.MAX_VALUE;
	for(int j=0;j<count;j++){
		minInd=Math.min(index[j],minInd);
		if(overM>max&&overN.equals(maxN.get(j))){
			sOut.println(arrL.get(minInd));
			System.exit(0);
		}
	}
	
	sOut.println(arrL.get(minInd));
}
}
class Player {
	String name;
	int points;
	public Player(String name, int points) {
		super();
		this.name = name;
		this.points = points;
	}
}	
