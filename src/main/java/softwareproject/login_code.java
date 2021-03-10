package softwareproject;

import java.util.ArrayList;

public class login_code {
private ArrayList  <admins>  admin ;
private ArrayList  <users>  user ;

public login_code() {
	admin=new ArrayList<admins>();
	admins dd = new admins ("A" , "A",false);
	user=new ArrayList<users>();
	users dda = new users ("s" , "s",false);
admin.add(dd);
user.add(dda);

} 


public boolean checkvalid( String username,String password) {
	
	for (int i=0;i<admin.size();i++) {
		if (admin.get(i).usernme.equals(username))
		{
			if (admin.get(i).password.equals(password)) {
				
				admin.get(i).loggged=true;
				return true;
			}
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
public boolean checkvalid2( String username,String password) {
	
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
