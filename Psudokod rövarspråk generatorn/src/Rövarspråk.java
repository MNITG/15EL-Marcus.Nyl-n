import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Rövarspråk {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String konsonanter = "bcdfghjklmnpqrstvwxz";
		String Rövarspråk = "";
		System.out.print("Skriv en text: ");
		String s = br.readLine();
		for(int i = 0, n = s.length() ; i < n ; i++) {
			char c = s.charAt(i);
			
			for(int l = 0, m = konsonanter.length() ; l < m ; l++) {
				char konsonant = konsonanter.charAt(l);
				if(c==konsonant){
					Rövarspråk += c + "o";
				
				}
			}
			Rövarspråk += c;
		}
		System.out.println(Rövarspråk);
	}

}
 