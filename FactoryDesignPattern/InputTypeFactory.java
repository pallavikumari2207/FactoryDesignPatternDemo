package start;

public class InputTypeFactory {
	
	public InputType getobject(String acceptValue){
		
		if (acceptValue==null)
			{
			return null;
			}
		
		   else if(acceptValue.equalsIgnoreCase("name")){
		
			return new name();
		}
		else if (acceptValue.equalsIgnoreCase("lastname")){
	
		return new lastname();
	    }
		return null;
	
}
}
