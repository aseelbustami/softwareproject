package softwareproject;

import java.util.ArrayList;

public class LoginCode {
private ArrayList  <TheAdmin>  admin ;
private ArrayList  <TheAdmin>  user ;

public LoginCode() {
	admin=new ArrayList<TheAdmin>();
	TheAdmin dd = new TheAdmin ("A" , "A",false);
	user=new ArrayList<TheAdmin>();
	TheAdmin dda = new TheAdmin ("s" , "s",false);
admin.add(dd);
user.add(dda); 

} 


public boolean checkvalidAdmin( String username,String password) {
	
	return validAdmin(username, password, true);
	
}


private boolean validAdmin(String username, String password, boolean f) {
	for (int i=0;i<admin.size();i++) {
		if ((admin.get(i).usernme.equals(username))&&
				(admin.get(i).password.equals(password)))
		{
			
				
				admin.get(i).loggged=f;
				return true;
			
		}
		
	}

	return false ;
}
public boolean logout( String username,String password) {
	
	return validAdmin(username, password, false);
	
}
public boolean checkvalidUser( String username,String password) {
	
	
	for (int i=0;i<user.size();i++) {
		if ((user.get(i).usernme.equals(username))&&
				(user.get(i).password.equals(password)))
		{
			
				
				user.get(i).loggged=true;
				return true;
			
		}
		
	}

	return false ;
	
}


	
}