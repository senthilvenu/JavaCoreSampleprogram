package collections;

import java.util.ArrayList;
import java.util.Iterator;
import JavaSampleprogram.Student;

public class ArrayListIterator {

	public static void main(String arg[]) {
		
		Student std =new Student(10,"Senthil","senthil@yahoo.com");
		Student std2 =new Student(12,"kumar","kumar@yahoo.com");
		Student std3 =new Student(13,"vskumar","vskumar@yahoo.com");
		
		ArrayList<Student> list =new ArrayList<Student>();
		list.add(std);
		list.add(std2);
		list.add(std3);
		Iterator<Student> itr=list.iterator();
		while(itr.hasNext()) {
			Student st=(Student)itr.next();
			System.out.println(st.rollno+" " +st.name+ " "+st.email);
			
		}
			
	  
	}
	
	

	}


