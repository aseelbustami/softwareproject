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
			x=Integer.parseInt(books.get(i).getIsbn());
			if (((x)==(y) )|| (books.get(i).getSignature().equals(signature))) {
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
		return result%11==0  ;
	}
}





}