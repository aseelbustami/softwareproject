package softwareproject;

public class book {
private String title;
private String author;
private String signature;
private Integer ISBN;

public book (Integer ISBN,String title,String author,String signature) {
	this.ISBN=ISBN;
	this.title=title;
	this.author=author;
	this.signature=signature;
}

public Integer get_isbn()
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
