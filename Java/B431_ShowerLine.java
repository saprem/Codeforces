package codeForcesTry;
//Good
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class B431_ShowerLine implements Closeable{
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
    	int ans,k=0;
    	int hapIn[][]=new int[5][5];
    	int arr[]=new int[5];
    	arr[0]=1;arr[1]=2;arr[2]=3;arr[3]=4;arr[4]=5;
    	possibilities(arr,0,5);
    	for(int i=0;i<5;i++){
    		for(int j=0;j<5;j++){
    			hapIn[i][j]=nextInt();
    		}
       	}
    	for(int i=0;i<ll.size();i++)
    		System.out.println(ll.get(i));
    	int max=-1,calc;
    	int t[]=new int[5];
    	for(int i=0;i<120;i++){
    		calc=0;
    		for(int j=0;j<5;j++)
    			t[j]=Integer.parseInt(Character.toString(ll.get(i).charAt(j)))-1;
    		
    		calc=hapIn[t[0]][t[1]]+hapIn[t[1]][t[0]]+hapIn[t[1]][t[2]]+hapIn[t[2]][t[1]];
    		
    		calc+=2*(hapIn[t[2]][t[3]]+hapIn[t[3]][t[2]]+hapIn[t[3]][t[4]]+hapIn[t[4]][t[3]]);
    		
    		max=Math.max(calc, max);
    	}
    	writer.println(max);
    	close();
    	
    }
    
    static List<String> ll=new ArrayList<String>();
    public static List possibilities(int[] arr,int k,int n){
    	if(k==n){
    		String x="";
    		for(int i=0;i<5;i++){
    			x+=arr[i];
    		}
    		ll.add(x);
    	}		
    	else{
    		int temp;
    		for(int i=k;i<n;i++){
    			temp=arr[k];arr[k]=arr[i];arr[i]=temp;
    			possibilities(arr,k+1,n);
    			temp=arr[k];arr[k]=arr[i];arr[i]=temp;
    		}
    	}
		return ll;
    }
    public static void main(String args[]) throws IOException{ 
    	try(B431_ShowerLine c=new B431_ShowerLine()){
    	c.solve();
    	}
    }
    public void close() throws IOException {
        reader.close();
        writer.close();
    }
}
