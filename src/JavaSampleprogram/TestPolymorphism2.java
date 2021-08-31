package JavaSampleprogram;

class TestPolymorphism2{  
float getRateOfInterest(){return 0;}  
}  
class SBI extends TestPolymorphism2{  
float getRateOfInterest(){return 8.4f;}  
}  
class ICICI extends TestPolymorphism2{  
float getRateOfInterest(){return 7.3f;}  
}  
class AXIS extends TestPolymorphism2{  
float getRateOfInterest(){return 9.7f;}  

//class TestPolymorphism2{  
public static void main(String args[]){  
TestPolymorphism2 b;  
b=new TestPolymorphism2();
System.out.println("Bank Rate of Interest: "+b.getRateOfInterest());
b=new SBI();  
System.out.println("SBI Rate of Interest: "+b.getRateOfInterest());  
b=new ICICI();  
System.out.println("ICICI Rate of Interest: "+b.getRateOfInterest());  
b=new AXIS();  
System.out.println("AXIS Rate of Interest: "+b.getRateOfInterest());  
}  
}
//}  