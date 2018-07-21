package exceptionHandlingEx;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Throwskeyword {

	public static void main(String[] args) throws FileNotFoundException
	{
		File f=new File("C:\\Users\\yengod\\Desktop\\abc.txt");
		try {
			FileInputStream fis=new FileInputStream(f);
			
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
