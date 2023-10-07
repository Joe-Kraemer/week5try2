package week05project.java.copy.copy;

public class App {
public static void main(String args[]) {
	logger logger1 = new asteriskLogger();
	logger logger2 = new spaceLogger();
	logger1.error("hello");
	logger1.log("hello");
	logger2.error("hello");
	logger2.log("hello");
}
}
