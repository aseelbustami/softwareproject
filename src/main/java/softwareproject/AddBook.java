package softwareproject;

import java.util.ArrayList;

public class AddBook {
	
	private   ArrayList  <TheBook>  books ;
	 
	public AddBook() {
	
		books=new ArrayList<TheBook>();
		
		TheBook dd5= new TheBook ("1524763160" ," promised land  "," Barack Obama  " ,"Obama2020 " );
		
		books.add(dd5);
		TheBook dd66= new TheBook ("0099511029"," educated  " ,"Tara Westover","Westover2018" );
		
		
		books.add(dd66);
TheBook dd77= new TheBook ("0241334144"," becoming  " ,"Michelle Obama","Obama2018" );
		
		
		books.add(dd77);
		
	}
	
  public boolean add(String title, String isbn, String author, String signature) {
	int x;
	    int y=Integer.parseInt(isbn);
	    boolean  falg = checkIsbn(y);
	
	if(falg) {
		for (int i =0 ; i < books.size() ;i++)
		{
			x=Integer.parseInt(books.get(i).get_isbn());
			if (((x)==(y) )|| (books.get(i).get_signature().equals(signature))) {
			falg=false;
				
			                                       }
		}
		}
	
		if(falg) {
		TheBook dd6= new TheBook (isbn , title,author,signature);

        books.add(dd6);

        return true;
                }
		
	else {
		
		System.out.println("not valid isbn please be carefull ");
		
	    return false;
	    }
		}
	

private boolean checkIsbn(int y) {
	int u;
	int result=0;
	int i=1;
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



public  ArrayList  <TheBook> searchTitle(String sSSS) {
	 
	ArrayList  <TheBook>  books22  = new ArrayList  <TheBook>() ;
for (int i =0 ; i < books.size() ;i++)
{
	if (books.get(i).get_title().toUpperCase().contains(sSSS.trim().toUpperCase())) {
	books22.add(books.get(i)) ;
		
	}
		


}
return books22;
}




public  ArrayList  <TheBook> searchAuthor(String sSSS) {
	 
	ArrayList  <TheBook>  books22  = new ArrayList  <TheBook>() ;
for (int i =0 ; i < books.size() ;i++)
{
	if (books.get(i).get_author().toUpperCase().contains(sSSS.trim().toUpperCase())) {
	books22.add(books.get(i)) ;
		
	}
		


}
return books22;
}


public ArrayList  <TheBook> searchIsbn(String sSSS) {
	 
	ArrayList  <TheBook>  books22  = new ArrayList  <TheBook>() ;
for (int i =0 ; i < books.size() ;i++)
{
	if ((books.get(i).get_isbn()).toUpperCase().contains(sSSS.trim().toUpperCase())) {
	books22.add(books.get(i)) ;
		
	}
		


}
return books22;
}
public  ArrayList  <TheBook> searchSignature(String sSSS) {
	 
	ArrayList  <TheBook>  books22  = new ArrayList  <TheBook>() ;
for (int i =0 ; i < books.size() ;i++)
{
	if (books.get(i).get_signature().toUpperCase().contains(sSSS.trim().toUpperCase())) {
	books22.add(books.get(i)) ;
		
	}
		


}
return books22;
}






}