package codeForcesTry;

import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class B313_EquivString implements Closeable{
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
	 int a1,b1,a2,b2,a3,b3,min1;
	 a1=nextInt();b1=nextInt();
	 a2=nextInt();b2=nextInt(); a3=nextInt();b3=nextInt();
	 boolean flag=false;
	 if(a2+a3<=a1&&b2<=b1&&b3<=b1){
		 flag=true;
	 }
	 else if(a2+a3<=b1&&b2<=a1&&b3<=a1){
		 flag=true;
	 }
	 else if(a2+a3<=b1&&b2<=a1&&b3<=a1){
		 flag=true;
	 }
	 else if(a2+b3<=a1&&b2<=b1&&a3<=b1){
		 flag=true;
	 }
	 else if(a2+b3<=b1&&b2<=a1&&a3<=a1){
		 flag=true;
	 }
	 else if(b2+a3<=a1&&a2<=b1&&b3<=b1){
		 flag=true;
	 }
	 else if(b2+a3<=b1&&a2<=a1&&b3<=a1){
		 flag=true;
	 }
	 else if(b2+b3<=a1&&a2<=b1&&a3<=b1){
		 flag=true;
	 }
	 else if(b2+b3<=b1&&a2<=a1&&a3<=a1){
		 flag=true;
	 }
	 if(flag==false)
		 System.out.println("NO");
	 else
		 System.out.println("YES");
}
public static void main(String args[]) throws IOException{ 
	try(B313_EquivString c=new B313_EquivString()){
	c.solve();
	}
}
public void close() throws IOException {
    reader.close();
    writer.close();
}


}
