package JavaSampleprogram;

import org.apache.commons.collections4.map.SingletonMap;

class SingletonlazyInstantiaiton{  
		 private static SingletonlazyInstantiaiton obj;  
		 private SingletonlazyInstantiaiton(){
			 System.out.println("Lazy Instantiaiton");
		 }  
		   
		 public static SingletonlazyInstantiaiton getA(){  
		   if (obj == null){  
		      synchronized(SingletonMap.class){  
		        if (obj == null){  
		            obj = new SingletonlazyInstantiaiton();//instance will be created at request time  
		        }  
		    }              
		    }  
		  return obj;  
		 }  
		  
		 public void doSomething(int a,int b){  
			 
			 int c=a+b;
			 System.out.println("Sumof :" +c);  
		 }  
		 public static void main(String arg[]) {
			 obj.doSomething(50, 50);
		 }
		}  


