import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.LinkedList;

public class Encrypt {
	
	private String message ;

	//constructor
	public Encrypt(String message) {
		this.message = message;
	}
	
	public String encryptText() {
	
		int n = 13;
		String lower = "abcedefghijklmnopqrstuvwxyz";
		String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	
		String src = lower + upper;
		String dst = lower.substring(n) + lower.substring(0, n) + upper.substring(n) + upper.substring(0, n);
		String[] line1 = src.split("");
		String[] line2 = dst.split("");
	
		Map<String, String> cipher = new HashMap<>() ;
		

		for (int i = 0; i < line2.length && i < line1.length; i++) {
			cipher.put(line1[i], line2[i]);

		}
		List<String> output = new LinkedList<>();
	
		for (int i = 0; i < message.length(); i++) {
			if (cipher.containsKey(message.substring(i,i+1))) {
				output.add(cipher.get(message.substring(i,i+1)));
			
			}
			else {
				output.add(message.substring(i,i+1));
			
			}	
		}

		String s = "";

		for (String c : output) {
			s += c;

		}
	
		return s;
		
	}

	
	
}
