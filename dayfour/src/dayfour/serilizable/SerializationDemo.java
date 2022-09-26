package dayfour.serilizable;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationDemo {

	public static void main(String[] args) {
		Student student = new Student();
		student.setStudentId(1);
		student.setStudentName("Rohit");
		
		System.out.println(student);
		//Serialize an object student1
		//Wrtie an object into a file system
		File file = new File ("D:\\output\\solera\\serializedObject.txt");
		FileOutputStream fos;
		
		try {
			fos= new FileOutputStream(file);
	
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(student);
		oos.close();
		fos.close();
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//Deserialize
		Student student1 ;
		try(FileInputStream fis = new FileInputStream(file);
			ObjectInputStream ois = new ObjectInputStream(fis);){
			student1 = (Student)  ois.readObject();
			System.out.println("Desrialized object ---"+student1);
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
