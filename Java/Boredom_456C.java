package codeForcesTry;

public class Boredom_456C {

}
/*import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class C {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		long[] nboxes = new long[n+1];
		long sboxes = 0L;
		
		int last = 0;
		st = new StringTokenizer(br.readLine());
		for (int i = 1; i <= n; i++) {
			nboxes[i] = Integer.parseInt(st.nextToken());
			sboxes += nboxes[i];
			if (nboxes[i] > 0)
				last = i;
		}
		
		long a = last + 1;
		long b = sboxes + n + 1;
		
		for (long t = (a+b-1)/2; a+1L < b; t = (a+b-1)/2) {
			if (valid(nboxes, m, t, last)){
				b = t+1;
			}
			else {
				a = t+1;
			}
		}
		
		System.out.println(a);
	}

	private static boolean valid(long[] nboxes, int m, long t, int last) {
		long[] test = new long[last+1];
		for (int i = 0; i < test.length; i++) {
			test[i] = nboxes[i];
		}
		for (int i = 0; i < m; i++) {
			long p = t-last;
			if (p < test[last]) {
				test[last] -= p;
			}
			else {
				p -= test[last];
				test[last--] = 0L;
				while (last > 0 && test[last] <= p) {
					p -= test[last];
					last--;
				}
				test[last] -= p;
				if (last == 0)
					return true;
			}
		}
		return false;
	}
}*/