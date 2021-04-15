package softwareproject;

import java.util.ArrayList;

public class LoginCode {
private ArrayList  <TheAdmin>  admin ;
private ArrayList  <TheUser>  user ;

public LoginCode() {
	admin=new ArrayList<TheAdmin>();
	TheAdmin dd = new TheAdmin ("A" , "A",false);
	user=new ArrayList<TheUser>();
	TheUser dda = new TheUser ("s" , "s",false);
admin.add(dd);
user.add(dda);

} 


public boolean checkvalidAdmin( String username,String password) {
	
	for (int i=0;i<admin.size();i++) {
		if ((admin.get(i).usernme.equals(username))&&(admin.get(i).password.equals(password)))
		{
			
				
				admin.get(i).loggged=true;
				return true;
			
		}
		
	}

	return false ;
	
}
public boolean logout( String username,String password) {
	
	for (int i=0;i<admin.size();i++) {
		if (admin.get(i).usernme.equals(username))
		{
			if (admin.get(i).password.equals(password)) {
				
				admin.get(i).loggged=false;
				return true;
			}
		}
		
	}

	return false ;
	
}
public boolean checkvalidUser( String username,String password) {
	
	for (int i=0;i<user.size();i++) {
		if (user.get(i).usernme.equals(username))
		{
			if (user.get(i).password.equals(password)) {
				
				user.get(i).loggged=true;
				return true;
			}
		}
		
	}

	return false ;
	
}


	
}
