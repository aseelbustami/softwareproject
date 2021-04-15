package softwareproject;

public class TheBook {
private String title;
private String author;
private String signature;
private String isbn;

public TheBook (String isbn,String title,String author,String signature) {
	
	
	this.isbn=isbn;
	
	this.title=title;
	this.author=author;
	this.signature=signature;
}

public String getIsbn()
{
	return isbn;
}
public String getAuthor()
{
	return author;
}
public String getSignature()
{
	return signature;
}
public String getTitle()
{
	return title;
}





}
