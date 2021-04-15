package softwareproject;

public class TheBook {
private String title;
private String author;
private String signature;
private String isbn;

public TheBook (String ISBN,String title,String author,String signature) {
	
	
	this.isbn=ISBN;
	
	this.title=title;
	this.author=author;
	this.signature=signature;
}

public String get_isbn()
{
	return isbn;
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
