package JavaSampleprogram;

public class Thiskeywithinstance {

	
		int rollno;  
		String name;  
		float fee;  
		Thiskeywithinstance(int rollno,String name,float fee){  
		this.rollno=rollno;  
		this.name=name;  
		this.fee=fee;
		
		}  
		void display(){System.out.println(rollno+" "+name+" "+fee);}  
		}  
		class TestThis1{  
		public static void main(String args[]){  
		Thiskeywithinstance s1=new Thiskeywithinstance(111,"ankit",5000f);  
		Thiskeywithinstance s2=new Thiskeywithinstance(112,"sumit",6000f);  
		s1.display();  
		s2.display();  
		}}  
		