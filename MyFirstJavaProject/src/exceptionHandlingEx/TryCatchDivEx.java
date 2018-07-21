package exceptionHandlingEx;

public class TryCatchDivEx {
	public static void main(String[] args) {
		int a = 10;
		int b = 200;
		
		try 
		{
           System.out.println(a / b);
		} 
		
		catch (Exception e) 
		{
			
           System.out.println(e.getMessage());
		}
	}

}
