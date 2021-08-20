package ibm.Training;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;

public class Secondques {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			 ArrayList<String> list= new ArrayList<String>();
			 File file =
				      new File("C:\\Users\\002CKZ744\\Desktop\\Tanya\\1.txt");
				    Scanner sc = null;
					try {
						sc = new Scanner(file);
					} catch (FileNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				  
				    while (sc.hasNextLine())
				      list.add(sc.next());
			
				    System.out.println(list);
					   
   }
	}

