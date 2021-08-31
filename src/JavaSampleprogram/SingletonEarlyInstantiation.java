package JavaSampleprogram;

class SingletonEarlyInstantiation{  
		
		 private static SingletonEarlyInstantiation obj=new SingletonEarlyInstantiation();//Early, instance will be created at load time  
		 public void doSomething(int a,int b){  
		 //write your code  
			 int c=a+b;
			 System.out.println("Sumof :" +c);
			 
		 }  
		 
		 public static void main(String arg[]) {
			 obj.doSomething(50, 50);
		 }
		}  
