package week05project.java.copy.copy;

public class asteriskLogger implements logger{
	
	public void log(String entry) {
		 System.out.println( "***" + entry + "***");
	}

	public void error(String entry) {
		System.out.println("*********************"); 
		System.out.println( "***" + entry + "***");
		System.out.println("*********************"); 

	}
	
}
