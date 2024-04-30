package superkeywordpkg;

public class Author {
	String authorName;
	String bookName;
	Book b;//Reference variable of book
	public Author(String authorName, String bookName,Book b)
	{
		this.authorName=authorName;
		this.bookName=bookName;
		this.b=b;
	}
	public void display()
	{
		System.out.println(b.name+"  "+b.age);
		System.out.println(authorName + " "+bookName);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book c=new Book("Mary",20);
		Author a=new Author("Joseph","The world",c);
		a.display();

	}

}
