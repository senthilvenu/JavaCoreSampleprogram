package JavaSampleprogram;

class EncapsulationDemo{
    private int ssn;
    private String empName;
    private int empAge;
    
    //************************Setter methods****************************//
    
    public void setSsn(int ssn) {
		this.ssn = ssn;
	}
    public void setEmpAge(int newValue){
        empAge = newValue;
    }

    public void setEmpName(String newValue){
        empName = newValue;
    }
    
   	
  //************************Getter methods****************************//
  
    public int getSsn() {
		return ssn;
	}
   
    public String getEmpName(){
        return empName;
    }

    public int getEmpAge(){
        return empAge;
    }

      
//}
 
 //class EncapsTest{
    public static void main(String args[]){
         EncapsulationDemo obj = new EncapsulationDemo();
         obj.setEmpName("Mario");
         obj.setEmpAge(32);
         obj.setSsn(112233);
         //obj.getSsn(112233);
         System.out.println("Employee Name: " + obj.getEmpName());
         System.out.println("Employee SSN: " + obj.getSsn());
         System.out.println("Employee Age: " + obj.getEmpAge());
    } 
}