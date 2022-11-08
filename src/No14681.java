import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No14681 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a=Integer.parseInt(br.readLine());
		int b=Integer.parseInt(br.readLine());
		
		if(a > 0 && b > 0) {
			System.out.println(1);
		}else if(a < 0 && b > 0) {
			System.out.println(2);
		}else if(a < 0 && b < 0) {
			System.out.println(3);
		}else if(a > 0 && b < 0) {
			System.out.println(4);
		}
		
	}

}
