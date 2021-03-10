package softwareproject;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class search_steps {
	private boolean flag1=false;
	private boolean flag2=false;
	private boolean flag3=false;
	private boolean flag4=false;
	private boolean flag_login_user=false;
	private boolean flag_login_admin=false;
	private boolean result=false;
	private add_book j=new add_book();
	private String SSSS;
	private ArrayList  <book>  oi;
	

	@Given("the user  is not logged in  and chooses the book to be searched by title")
	public void the_user_is_not_logged_in_and_chooses_the_book_to_be_searched_by_title() {
		this.flag_login_user=false;
		this.flag1 =true;
	}


	@Given("the user  is not logged in  and chooses the book to be searched by ISBN")
	public void the_user_is_not_logged_in_and_chooses_the_book_to_be_searched_by_isbn() {
		 this.flag2 =true;
		 this.flag_login_user=false;
	}

	@Given("the user  is not logged in  and chooses the book to be searched by author")
	public void the_user_is_not_logged_in_and_chooses_the_book_to_be_searched_by_author() {
		this.flag_login_user=false;
		 this.flag3 =true;
	}

	@Given("the user  is not logged in  and chooses the book to be searched by signature")
	public void the_user_is_not_logged_in_and_chooses_the_book_to_be_searched_by_signature() {
		 this.flag4 =true;
		 this.flag_login_user=false;
	}

	@Given("the user  is  logged in  and chooses the book to be searched by title")
	public void the_user_is_logged_in_and_chooses_the_book_to_be_searched_by_title() {
		 this.flag1 =true;
	}

	@Given("the user  is  logged in  and chooses the book to be searched by ISBN")
	public void the_user_is_logged_in_and_chooses_the_book_to_be_searched_by_isbn() {
		 this.flag2 =true;
		 this.flag_login_user=true;
	}

	@Given("the user  is  logged in  and chooses the book to be searched by author")
	public void the_user_is_logged_in_and_chooses_the_book_to_be_searched_by_author() {
		 this.flag3 =true;
		 this.flag_login_user=true;
	}

	@Given("the user  is  logged in  and chooses the book to be searched by signature")
	public void the_user_is_logged_in_and_chooses_the_book_to_be_searched_by_signature() {
		 this.flag4 =true;
		 this.flag_login_user=true;
		 
	}


	
	@Given("he wrote the substring  {int}  in the search engine")
	public void he_wrote_the_substring_in_the_search_engine(Integer isbn) {
		SSSS=isbn.toString();
	}
	
	@Given("he wrote the substring  {string}  in the search engine")
	public void he_wrote_the_substring_in_the_search_engine(String substring) {
		SSSS=substring;
	}
	
	
	
	
	
	@When("he calls the search function")
	public void he_calls_the_search_function() {
	   if(flag1) {
		   
	   
		  oi=j.search_by_titel(SSSS) ;
		
	   }
	   if(flag3) {
		 
		  oi= j.search_by_auther(SSSS) ;
		 
	   }
	   if(flag2) {
		   
		 
		  oi= j.search_by_ISBN(SSSS) ;
		 
	   }
	   if(flag4) {
		   
		  
		  oi= j.search_by_signature(SSSS) ;
		  
		   
	   }
	   if(oi.size()>0)result=true;
	
			   
	   
	}
	
	@Then("all the information related to the entered string will be shown on the screen")
	public void all_the_information_related_to_the_entered_string_will_be_shown_on_the_screen() {
		assertTrue(result==true);
		 System.out.print  ("******title**********");
		 System.out.print  ("******ISBN***********");
		 System.out.print  ("******author*********");
		 System.out.print  ("******signature******\n");
		 for(int i=0;i<oi.size();i++) {
			
		 System.out.print( oi.get(i).get_title()+"\t"+"\t");
		 System.out.print(oi.get(i).get_isbn()+"\t");
		 System.out.print(oi.get(i).get_author()+"\t");
		 System.out.print("   "+oi.get(i).get_signature()+"\n");
		 
		 }


	 
	 
	
	}
	@Given("the admin is not logged in  and chooses the book to be searched by title")
	public void the_admin_is_not_logged_in_and_chooses_the_book_to_be_searched_by_title() {
	    this.flag1=true;
	    this.flag_login_admin=false;
	}

	@Given("the admin is not logged in  and chooses the book to be searched by ISBN")
	public void the_admin_is_not_logged_in_and_chooses_the_book_to_be_searched_by_isbn() {
		 this.flag2=true;
		    this.flag_login_admin=false;
	}

	@Given("the admin is not logged in  and chooses the book to be searched by author")
	public void the_admin_is_not_logged_in_and_chooses_the_book_to_be_searched_by_author() {
		 this.flag3=true;
		    this.flag_login_admin=false;
	}

	@Given("the admin is not logged in  and chooses the book to be searched by signature")
	public void the_admin_is_not_logged_in_and_chooses_the_book_to_be_searched_by_signature() {
		 this.flag4=true;
		    this.flag_login_admin=false;
	}

	@Given("the admin is  logged in  and chooses the book to be searched by title")
	public void the_admin_is_logged_in_and_chooses_the_book_to_be_searched_by_title() {
		 this.flag1=true;
		    this.flag_login_admin=true;
	}

	@Given("the admin is  logged in  and chooses the book to be searched by ISBN")
	public void the_admin_is_logged_in_and_chooses_the_book_to_be_searched_by_isbn() {
		 this.flag2=true;
		    this.flag_login_admin=true;
	}

	@Given("the admin is  logged in  and chooses the book to be searched by author")
	public void the_admin_is_logged_in_and_chooses_the_book_to_be_searched_by_author() {
		 this.flag3=true;
		    this.flag_login_admin=true;
	}

	@Given("the admin is  logged in  and chooses the book to be searched by signature")
	public void the_admin_is_logged_in_and_chooses_the_book_to_be_searched_by_signature() {
		 this.flag4=true;
		    this.flag_login_admin=true;
	}
	@Given("a regular user chooses  the book to be searched by title")
	public void a_regular_user_chooses_the_book_to_be_searched_by_title() {
	  this.flag1=true;
	}

	@Given("a regular user chooses  the book to be searched by ISBN")
	public void a_regular_user_chooses_the_book_to_be_searched_by_isbn() {
		this.flag2=true;
	}

	@Given("a regular user chooses  the book to be searched by author")
	public void a_regular_user_chooses_the_book_to_be_searched_by_author() {
		this.flag3=true;
	}

	@Given("a regular user chooses  the book to be searched by signature")
	public void a_regular_user_chooses_the_book_to_be_searched_by_signature() {
		this.flag4=true;
	}
	@Then("no book has this criteria")
	public void no_book_has_this_criteria() {
	 assertTrue("no book found has this criteria",result==false);
	 System.out.println("no book found has this criteria");
	}



	
}
