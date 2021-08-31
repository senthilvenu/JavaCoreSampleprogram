package JavaSampleprogram;
class Stativblock{
	   static int num;
	   static String mystr;
	   static{
	      num = 97;
	      mystr = "Static keyword in Java";
	      System.out.println("Static block");	     
	      
	   }
	  public static void main(String args[])
	   {
	      System.out.println("Value of num: "+num);
	      System.out.println("Value of mystr: "+mystr);
	   }
}
