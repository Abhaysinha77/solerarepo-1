package dayfour.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class FileIOExample {

	public static void main(String[] args) {

		File file = new File("D:\\output\\solera\\output2.txt");
	
		//FileInputStream fis = null ;
		try(FileInputStream fis = new FileInputStream(file);) {
			
			//Read single character from a file
			System.out.println(fis.read());
			int i = fis.read();
			System.out.println(i);
			System.out.println((char)i);
			
		} /**catch (FileNotFoundException e) {
		
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}**/
		catch(IOException e) {
		e.printStackTrace();	
		}/**
		finally {
			try {
				fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}**/
	}

}
