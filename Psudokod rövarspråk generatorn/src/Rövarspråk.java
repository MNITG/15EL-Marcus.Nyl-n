import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class R�varspr�k {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String konsonanter = "bcdfghjklmnpqrstvwxz";
		String R�varspr�k = "";
		System.out.print("Skriv en text: ");
		String s = br.readLine();
		for(int i = 0, n = s.length() ; i < n ; i++) {
			char c = s.charAt(i);
			
			for(int l = 0, m = konsonanter.length() ; l < m ; l++) {
				char konsonant = konsonanter.charAt(l);
				if(c==konsonant){
					R�varspr�k += c + "o";
				
				}
			}
			R�varspr�k += c;
		}
		System.out.println(R�varspr�k);
	}

}
 