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
	return validAdmin(username,password,true);
}
public boolean logout( String username,String password) {
	return validAdmin(username,password,false);
}
public boolean validAdmin(String username,String password,boolean flag) {
	for (int i=0;i<admin.size();i++) {
		if ((admin.get(i).usernme.equals(username))&&
				(admin.get(i).password.equals(password))) 
		{		
				admin.get(i).loggged=flag;
				return true;
			}
	}
return false ;
}
public boolean checkvalidUser( String username,String password) {
	
	for (int i=0;i<user.size();i++) {
		if (validUser(username, password, i))
		{
			
				
				user.get(i).loggged=true;
				return true;
			
		}
		
	}

	return false ;
	
}


private boolean validUser(String username, String password, int i) {
	return (user.get(i).usernme.equals(username))&&
			(user.get(i).password.equals(password));
}


	
}
