package workingWithFiles;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Runable {
	
	private static final String FILENAME = "C:\\Users\\Admin\\Desktop\\Java workspace\\Level 2 - Intermediate\\src\\workingWithFiles\\output.txt";
	
	public static void main(String[] args) {
		
		String[] ary = "abc,def,g".split(",");
		
		for (int i = 0; i < ary.length; i++ ) {
			System.out.println(ary[i]);
		}
				
		Person p = new Person();
		FileWriter file = null;
		BufferedWriter buffer = null;
		
		p.addToPerson("Mike", "o", 1);
		p.addToPerson("Sam", "o1", 2);
		p.addToPerson("Tom", "o2", 3);
		p.addToPerson("Quentin", "o3", 4);
		p.addToPerson("Siv", "o4", 5);
		
		try {
			
			file = new FileWriter(FILENAME);
			buffer = new BufferedWriter(file);
			buffer.write(p.getPersonArray());
			
		} catch (IOException e) {
			
			e.printStackTrace();
			
		} finally {
			
			try {
				
				if (buffer != null) buffer.close();
				if (file != null) file.close();
				
			} catch (Exception e2) {
				
				e2.printStackTrace();
				
			}
		}
		
		
	}
}
