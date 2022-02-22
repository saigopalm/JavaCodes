public class Book extends Product {
    private String author;
	public Book() {
		author = "";
	}
	
    public Book(String a) {
        super();
        author = a;
    }
    
    public Book(String c, String a) {
        super(c);
        author = a;
    }
    
    public Book(String c, String des, String a) {
        super(c, des);
        author = a;
    }

    public Book(String c, String des, double pri, String a) {
        super(c, des, pri);
        author = a;
    }
    
	public void setAuthor(String s) {
		author = s;
	}
	
	public String getAuthor() {
		return author;
	}	

	public String toString()
    {
        return  super.toString() +
		" Author: 	 " + author + "\n";
    }

}
