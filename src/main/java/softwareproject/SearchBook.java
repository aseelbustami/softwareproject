package softwareproject;

import java.util.ArrayList;
import java.util.List;

public class SearchBook {
	private   ArrayList  <TheBook>  books ;
	 
	public SearchBook() {
		books=new ArrayList<TheBook>();
		
		TheBook dd5= new TheBook ("1524763160" ," promised land  "," Barack Obama  " ,"Obama2020 " );
		
		books.add(dd5);
		TheBook dd66= new TheBook ("0099511029"," educated  " ,"Tara Westover","Westover2018" );
		
		
		books.add(dd66);
TheBook dd77= new TheBook ("0241334144"," becoming  " ,"Michelle Obama","Obama2018" );
		
		
		books.add(dd77);
	
		
		
	}
	public  List  <TheBook> searchTitle(String sSSS) {
		 
		List  <TheBook>k=	searchBy( sSSS, 0);
		return k;
	}




	public  List  <TheBook> searchAuthor(String sSSS) {
		 
		List  <TheBook>k=	searchBy( sSSS, 2);
		return k;
	}


	public List  <TheBook> searchIsbn(String sSSS) {
		 
		List  <TheBook>k=	searchBy( sSSS, 1);
		return k;
	}
	public  List  <TheBook> searchSignature(String sSSS) {
		 
		List  <TheBook>k=	searchBy( sSSS, 3);
		return k;
	
	}
	public  List  <TheBook> searchBy(String sSSS,int f) {
	
		List  <TheBook>  books22  = new ArrayList  <TheBook>() ;
	for (int i =0 ; i < books.size() ;i++)
	{
		if ((books.get(i).getSignature().toUpperCase().contains(sSSS.trim().toUpperCase()))&&(f==3)) {
		books22.add(books.get(i)) ;
			
		}
		if ((books.get(i).getTitle().toUpperCase().contains(sSSS.trim().toUpperCase()))&&(f==0)) {
			books22.add(books.get(i)) ;
				
			}	

		if (((books.get(i).getIsbn()).toUpperCase().contains(sSSS.trim().toUpperCase()))&&(f==1)) {
			books22.add(books.get(i)) ;
				
			}
		if ((books.get(i).getAuthor().toUpperCase().contains(sSSS.trim().toUpperCase()))&&(f==2)) {
			books22.add(books.get(i)) ;
				
			}
	}
	return books22;
	}


}
