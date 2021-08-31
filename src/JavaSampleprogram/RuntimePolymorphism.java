package JavaSampleprogram;

class Polymorphism{  
	  void run(){System.out.println("running");}  
	 
}
	class Splender extends RuntimePolymorphism{  
	  void run(){System.out.println("running safely with 60km");}  
	  
	}	  
	  class RuntimePolymorphism
	  {
	  public static void main(String args[]){  
		  Polymorphism b1=new Polymorphism();
		  Splender b = new Splender();//upcasting  
		//Splender s= new Splender();
		  b.run();
	      b1.run();  
	    // s.run();
	  }
	  }  
	  