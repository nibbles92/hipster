package hipster.model;

public class Hipster 
{
	private String name;
	private String[] hipsterPhrases;
	private Book [] hipsterBooks;

	public Hipster()
	{
		this.name = "";
		this.hipsterPhrases = new String[6];
		this.hipsterBooks = new Book[3];
		setupArray();
		setupBooks();
	}

	private void setupArray()
	{
		hipsterPhrases[0] = "No one is doing it!!! ";
		hipsterPhrases[1] = "It's mainstream!";
		hipsterPhrases[2] = "I did it before it was cool!";
		hipsterPhrases[3] = "Lets NOT do it";
		hipsterPhrases[4] = "im better than everyone";
		hipsterPhrases[5] = "i look for attention";
	}
	
	private void setupBooks()
	{
		Book firstBook, secondBook, thirdBook;
		
		firstBook = new Book();
		firstBook.setAuthor("yourself");
		firstBook.setTitle("friends zone");
		firstBook.setSubject("lonely");
		firstBook.setPageCount(200);
		firstBook.setPrice(20);
		
		secondBook = new Book();
		secondBook.setAuthor("bethsda");
		secondBook.setTitle("fallout");
		secondBook.setSubject("games");
		secondBook.setPageCount(536);
		secondBook.setPrice(23);
		
		thirdBook = new Book();
		thirdBook.setAuthor("code");
		thirdBook.setTitle("billy");
		thirdBook.setSubject("code");
		thirdBook.setPageCount(1445);
		thirdBook.setPrice(78);
		
		hipsterBooks[0] = firstBook;
		hipsterBooks[1] = secondBook;
		hipsterBooks[2] = thirdBook;
		
	}

	public String getName() 
	{
		return name;
	}

	public void setName(String name) 
	{
		this.name = name;
	}

	public String[] getHipsterPhrases() 
	{
		return hipsterPhrases;
	}

	public void setHipsterPhrases(String[] hipsterPhrases) 
	{
		this.hipsterPhrases = hipsterPhrases;
	}

	public Book[] getHipsterBooks() {
		return hipsterBooks;
	}

	public void setHipsterBooks(Book[] hipsterBooks) {
		this.hipsterBooks = hipsterBooks;
	}
	
	
	
}

