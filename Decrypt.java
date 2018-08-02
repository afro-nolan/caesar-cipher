import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.LinkedList;


public class Decrypt {

	private String message; 
	private int n;

	//constructor
	public  Decrypt(String message, int n) {
		this.message = message;
		this.n  = n;

	}

	public String decryptText() {

		String lower = "abcedefghijklmnopqrstuvwxyz";
		String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

		if ( n > lower.length()) {
			n = n % lower.length();
		}
		else if (n == lower.length()) {
			n = lower.length() - n;
		}
	
		String src = lower + upper;
		String dst = lower.substring(n) + lower.substring(0, n) + upper.substring(n) + upper.substring(0, n);
		String[] line1 = src.split("");
		String[] line2 = dst.split("");

		Map<String, String> cipher = new HashMap<>() ;
		

		for (int i = 0; i < line2.length && i < line1.length; i++) {
			cipher.put(line1[i], line2[i]);

		}
		List<String> output = new LinkedList<>();

		for (int i=0; i < message.length(); i++) {
			for (Map.Entry<String, String> e : cipher.entrySet()) {
				String key = e.getKey();
				String value = e.getValue();

				if (value.equals(message.substring(i, i+1))) {
					output.add(key);
				}
			}
		}
		
		String s = "";

		for (String c : output) {
			s += c;
		}

		return s;
	}
}