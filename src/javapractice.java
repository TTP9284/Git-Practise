import java.util.HashMap;
import java.util.Map;

public class javapractice {

	public static void main(String[] args) {
 String X= "TANAY12PAWAR354  ";
 String Y= "";
  System.out.println(X.length());
		 int i;
		for(i=0;i<X.length();i++){
			if(Character.isDigit(X.charAt(i))) {
			 Y= Y+ X.charAt(i);
			 
		 }
  System.out.println(Y);
  
	}
		}
			
		}