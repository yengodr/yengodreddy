package exceptionHandlingEx;

import java.io.File;
import java.io.FileInputStream;

public class Ex1 {
	public static void main(String[] args) {
		File f = new File("C:\\Users\\yengod\\Desktop\\Music");
		try {
			
			FileInputStream fis = new FileInputStream(f);

		} catch (Exception e) {
			System.out.println(e.getMessage());

		}

	}

}
