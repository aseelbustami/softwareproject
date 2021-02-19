package softwareproject;

import java.util.ArrayList;

public class add_book {
	public boolean flag=false;
	public ArrayList  <book>  books ;
	public add_book() {
		books=new ArrayList<book>();
		
		book dd = new book ("1524763160" , "promised land","Barack Obama ","Obama2020");
		
	books.add(dd);
	book dd2 = new book ("0241334144" , "Becoming","Michelle Obama ","Obama2018");
	
	books.add(dd2);
	book dd3 = new book ("1846045126" , "the choice","Edith Eger ","Eger2019");
	
	books.add(dd3);
	book dd4= new book ("0099511029" , "educated"," Tara Westover ","Westover2018");
	
	books.add(dd4);
	

	} 
public boolean add() {
	
book dd6= new book ("1509858636" , "this is going to hurt","Adam Kay ","Kay2018");
	
	books.add(dd6);
	flag=true;
	return flag;
	
}
}
