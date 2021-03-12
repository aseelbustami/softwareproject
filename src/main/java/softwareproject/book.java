package softwareproject;

public class book {
private String title;
private String author;
private String signature;
private String ISBN;

public book (String ISBN,String title,String author,String signature) {
	
	
	this.ISBN=ISBN;
	
	this.title=title;
	this.author=author;
	this.signature=signature;
}

public String get_isbn()
{
	return ISBN;
}
public String get_author()
{
	return author;
}
public String get_signature()
{
	return signature;
}
public String get_title()
{
	return title;
}





}
