package softwareproject;

import java.util.ArrayList;

public class login_code {
private ArrayList  <structure>  admin ;
private ArrayList  <structure2>  user ;

public login_code() {
	admin=new ArrayList<structure>();
	structure dd = new structure ("A" , "A",false);
	user=new ArrayList<structure2>();
	structure2 dda = new structure2 ("s" , "s",false);
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


	
}
