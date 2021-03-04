package softwareproject;

import java.util.ArrayList;

public class add_book {
	
	static public   ArrayList  <book>  books ;
	public add_book() {
	
		books=new ArrayList<book>();
		
		book dd5= new book (1524763160 ," the choice  "," Barack Obama  " ,"Obama2020 " );
		
		books.add(dd5);
		book dd66= new book (0241334144 ," choice  " ," Michelle Obama ","Obama2018 " );
		
		books.add(dd66);
	} 
public boolean add(String title, Integer isbn, String author, String signature) {
	
	int y=isbn.intValue();
	boolean  falg= chech_isbn(y);
	if(falg) {
book dd6= new book (isbn , title,author,signature);
	
	books.add(dd6);
	
	return true;}
	else{System.out.println("not valid isbn");
	return false;}
	
}
private boolean chech_isbn(int y) {
	int u;int result=0;int i=1;
	while(y!=0) {
		 u=y%10;
		result+=u*i;
		i++;
		y/=10;
	}
	
	if(i>11)return false;
	else {
		if(result%11==0  )return true;
		else return false;}
}
public  ArrayList  <book> search_by_titel(String sSSS) {
	 
	ArrayList  <book>  books22  = new ArrayList  <book>() ;
for (int i =0 ; i < books.size() ;i++)
{
	if (books.get(i).title.contains(sSSS.trim())) {
	books22.add(books.get(i)) ;
		
	}
		


}
return books22;
}




public  ArrayList  <book> search_by_auther(String sSSS) {
	 
	ArrayList  <book>  books22  = new ArrayList  <book>() ;
for (int i =0 ; i < books.size() ;i++)
{
	if (books.get(i).author.contains(sSSS.trim())) {
	books22.add(books.get(i)) ;
		
	}
		


}
return books22;
}


public ArrayList  <book> search_by_ISBN(String sSSS) {
	 
	ArrayList  <book>  books22  = new ArrayList  <book>() ;
for (int i =0 ; i < books.size() ;i++)
{
	if (((books.get(i).ISBN)+"").contains(sSSS.trim())) {
	books22.add(books.get(i)) ;
		
	}
		


}
return books22;
}
public  ArrayList  <book> search_by_signature(String sSSS) {
	 
	ArrayList  <book>  books22  = new ArrayList  <book>() ;
for (int i =0 ; i < books.size() ;i++)
{
	if (books.get(i).signature.contains(sSSS.trim())) {
	books22.add(books.get(i)) ;
		
	}
		


}
return books22;
}






}
