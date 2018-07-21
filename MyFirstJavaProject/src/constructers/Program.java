package constructers;

public class Program {
	boolean value;
	String str;
	
	public void testing(){
		System.out.println("testing");
	
	}
	public Program(boolean x,String y){
		value=x;
		str=y;
	}
	
	public static void main(String[] args) {
		Program p=new Program(false,"Automation");
		System.out.println(p.value);
		System.out.println(p.str);
		Program p1=new Program(true,"Manual");
		System.out.println(p1.value);
		System.out.println(p1.str);
		
		
		
		
	}
	  

}
