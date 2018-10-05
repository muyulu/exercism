import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Robot {
	private static Set<String> robotNames = new HashSet<>();
	
	private String name;
	private String tmp;
	private String alphabet;
	private final Random random;
	
	public Robot() {
		alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		this.random = new Random();
		name = "";
		name += Character.toString(alphabet.charAt(random.nextInt(alphabet.length()))) 
				+
				Character.toString(alphabet.charAt(random.nextInt(alphabet.length())))
				+
				Integer.toString(random.nextInt(10))
				+
				Integer.toString(random.nextInt(10))
				+
				Integer.toString(random.nextInt(10))
				;
		
		while (robotNames.contains(name))
			reset();
		
		robotNames.add(name);
	}
	
	public String getName() {
		return this.name;
	}
	
	public void reset() {
		tmp = "";
		name = "";
		tmp += Character.toString(alphabet.charAt(random.nextInt(alphabet.length()))) 
				+
				Character.toString(alphabet.charAt(random.nextInt(alphabet.length())))
				+
				Integer.toString(random.nextInt(10))
				+
				Integer.toString(random.nextInt(10))
				+
				Integer.toString(random.nextInt(10))
				;
		while(tmp.equals(name))
			reset();
		name = tmp;
		
		while (robotNames.contains(name))
			reset();
		
		robotNames.add(name);
		
	}
	
}
