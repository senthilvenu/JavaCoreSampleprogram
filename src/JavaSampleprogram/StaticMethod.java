package JavaSampleprogram;

class StaticMethod
{
	static int a=10;
	static int b=20;
	
			
    // This is a static method
    static void myMethod(int f, int d)
    {
    	int c=a+b;
    	int e= f*d;
    	System.out.println("Adding:"+c);  
    	System.out.println("multiply:"+e); 
        System.out.println("myMethod");
    }
 
    public static void main(String[] args)
    {
          /* You can see that we are calling this
           * method without creating any object. 
           */
    	System.out.println("Main method");
           myMethod(10,20);
           
           
    }
}