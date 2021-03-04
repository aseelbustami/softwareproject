package softwareproject;

import java.util.ArrayList;

public class login_code {
public ArrayList  <structure>  admin ;
boolean flag2=false;
boolean flag3=false;
 boolean  flag4=false;
public login_code() {
	admin=new ArrayList<structure>();
	structure dd = new structure ("A" , "A");
	
admin.add(dd);

} 

public boolean checkvalid( String username,String password) {
	
	for (int i=0;i<admin.size();i++) {
		if (admin.get(i).usernme.equals(username))
		{
		
			
			flag2=true;
			if (admin.get(i).password.equals(password)) {
				flag3=true;
			}
		}
	}
	if(flag2==true&& flag3==true) {
	//	System.out.println("successfully logged in!!");
		flag4=true;
	}
	if(flag2==true&& flag3==false) {
	//	System.out.println("wrong password!!");flag4=false;
	}
	if(flag2==false) {
		System.out.println("not correct username!!");flag4=false;
	}
	return flag4;
}


	
}
