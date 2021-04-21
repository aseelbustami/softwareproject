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
		return validAdmin(username, password, true, admin);}

public boolean logout( String username,String password) {
	return validAdmin(username, password, false, admin);}

public boolean checkvalidUser( String username,String password) {
	return validAdmin(username, password, true, user);
	}

private boolean validAdmin(String username, String password, boolean f, ArrayList<TheAdmin> array) {
	for (int i=0;i<array.size();i++) {
		if ((array.get(i).usernme.equals(username))&&
				(array.get(i).password.equals(password)))
		{
				array.get(i).loggged=f;
				return true;		}
	}
return false ;
}	
}