package JavaSampleprogram;

public class Stringusage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name = "Welcome to selenium Webdriver learing";
		String name2 = "welcome to selenium Webdriver learing";
		System.out.println(name.concat(name2));
		System.out.println(name);
		System.out.println(name.charAt(6));
		System.out.println(name.trim());		
		System.out.println(name.substring(0, 19));
		System.out.println(name.substring(19));
		String[] ar=name.split(" ");		
		System.out.println("Middle of String : " + ar[3]);
		for(int i=0;i<ar.length;i++) {
			System.out.println(ar[i]);
			
			if(ar[i].contains("Welcome")) {
				System.out.println("Test passed");
				break;
			}
			
		}
		boolean status=name.startsWith("Welcome");
		System.out.println(status);
		boolean endstatus=name.endsWith("learing");
		System.out.println(endstatus);
		boolean Stringcom=name.equalsIgnoreCase(name2);
		System.out.println(Stringcom);
		
				
	}

}
