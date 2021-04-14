package softwareproject;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
public class AddBook {
	private   ArrayList  <book>  books ;
	 public AddBook() {
        books=new ArrayList<book>();
		book dd5= new book ("1524763160" ," promised land  "," Barack Obama  " ,"Obama2020 " );
		books.add(dd5);
		book dd66= new book ("0099511029"," educated  " ,"Tara Westover","Westover2018" );
		books.add(dd66);
book dd77= new book ("0241334144"," becoming  " ,"Michelle Obama","Obama2018" );
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
		book dd6= new book (isbn , title,author,signature);
books.add(dd6);
 return true;}
		else {
			Logger logger = Logger.getLogger(AddBook.class.getSimpleName());
			logger.log(Level.INFO, "not valid isbn please be carefull");
	    return false;
	    }
		}
	private boolean checkIsbn(int y) {
	int u;
	int result=0;
	int i=1;boolean flag=false;
	while(y!=0) {
		 u=y%10;
		result+=u*i;
		i++;
		y/=10;
		}
	if(i>11)flag= false;
	else {
		if(result%11==0  )flag= true;
		else flag= false;}return flag;}
public  ArrayList  <book> search_by_titel(String sSSS) {
	 ArrayList  <book>  books22  = new ArrayList  <book>() ;
for (int i =0 ; i < books.size() ;i++)
{if (books.get(i).get_title().toUpperCase().contains(sSSS.trim().toUpperCase())) {
	books22.add(books.get(i)) ;
		}
	
}
return books22;
}

public  ArrayList  <book> search_by_auther(String sSSS) {
	ArrayList  <book>  books22  = new ArrayList  <book>() ;
for (int i =0 ; i < books.size() ;i++)
{
	if (books.get(i).get_author().toUpperCase().contains(sSSS.trim().toUpperCase())) {
	books22.add(books.get(i)) ;	
	}
}
return books22;
}


public ArrayList  <book> search_by_ISBN(String sSSS) {
	 
	ArrayList  <book>  books22  = new ArrayList  <book>() ;
for (int i =0 ; i < books.size() ;i++)
{
	if ((books.get(i).get_isbn()).toUpperCase().contains(sSSS.trim().toUpperCase())) {
	books22.add(books.get(i)) ;
	}
}
return books22;
}
public  ArrayList  <book> search_by_signature(String sSSS) {
	 ArrayList  <book>  books22  = new ArrayList  <book>() ;
for (int i =0 ; i < books.size() ;i++)
{
	if (books.get(i).get_signature().toUpperCase().contains(sSSS.trim().toUpperCase())) {
	books22.add(books.get(i)) ;
	}
}
return books22;
}
}
