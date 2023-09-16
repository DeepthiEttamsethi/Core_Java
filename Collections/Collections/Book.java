package Collections;

public class Book {
	public String bkid,bktitle, author;
	public float price;
	
	public Book(String id,String title, String author,float p) {
		bkid=id;
		bktitle=title;
		this.author=author;
		price=p;
	}
}