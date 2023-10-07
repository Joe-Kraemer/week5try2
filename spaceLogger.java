package week05project.java.copy.copy;

public class spaceLogger implements logger {
	public void log(String entry) {
	String output = "";
	for(int i = 0; i < entry.length(); i++) {
		char c = entry.charAt(i);
		output += c + " ";
	}
	System.out.println(output);
	}
		
	public void error(String entry) {
	String output = "";
	for(int i = 0; i < entry.length(); i++) {
		char c = entry.charAt(i);
		output += c + " ";
	}
	System.out.println("ERROR: " + output);
	}
		
}
