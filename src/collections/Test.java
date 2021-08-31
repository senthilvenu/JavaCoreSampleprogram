package collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Test {

	public static void main(String arg[]) {
		
		Set<String> value=new HashSet<>();
		
		value.add("senthil");
		value.add("senthil");
		value.add("kumar");
		System.out.println("displayed Set Values:" +value);
		
		List<String> obj=new ArrayList<>();
		obj.add("senthil");
		obj.add("senthi");
		obj.add("Kumar");
		System.out.println("dispayed List Values: "+obj);
		
		/*Student std =new Student(10,"Senthil","senthil@yahoo.com");
		Student std2 =new Student(12,"Senthil","senthil@yahoo.com");
		Student std3 =new Student(13,"vskumar","vskumar@yahoo.com");
		
		List<String> list = new List();
		
		list.add(std);
		list.add(std2);
		list.add(std3);
		System.out.println(list);
		/*Iterator itr=list.iterator();
		while(itr.hasNext()) {
			Student st=(Student)itr.next();
			System.out.println(st.rollno+" " +st.name+ " "+st.email);
			
		}*/
			
	  

	}	
	}


