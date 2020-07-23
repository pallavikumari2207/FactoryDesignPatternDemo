package start;
public class LeapYear {
 public static String a="pallavi";
 
 public static String main(){
	return a;	 
 }
 
public static void main(String[] args) {
		int x= 2;
//	System.out.println("hello world");
//	System.out.println(main());
//	System.out.println(x);
	InputTypeFactory stf=new InputTypeFactory();
	
	InputType s=stf.getobject("name");
	s.accept();
	InputType s2=stf.getobject("lastname");
	s2.accept();

	
	}

}
