import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No2420 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		String a=br.readLine();
		StringTokenizer stk = new StringTokenizer(a);
		
		long b =Integer.parseInt(stk.nextToken());
		long c = Integer.parseInt(stk.nextToken());
		
		System.out.println(Math.abs(b-c));
	}

}
//if(b-c>0) {
//	System.out.println(b-c);
//}else {
//	System.out.println(c-b);
//}