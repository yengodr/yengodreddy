package exceptionHandlingEx;

public class FinallyBlock {
	public static void main(String[] args) {
		try {

			System.out.println("Str.length()");

		} 
		catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("pgm complited");
		}
	}
}
