public class ProductDB
{
    public static Product getProduct(String productCode)
    {
        // In a more realistic application, this code would
        // get the data for the product from a file or database
        // For now, this code just uses if/else statements
        // to return the correct product data

        Product p = null;
        String description = "";
        double price = 0;
        String author = "";

        if (productCode.equalsIgnoreCase("java") ||
           productCode.equalsIgnoreCase("jsps") ||
           productCode.equalsIgnoreCase("mcb2"))
        {
           
            if (productCode.equalsIgnoreCase("java"))
            {
                
                description = "Murach's Beginning Java 2";
                price = 49.50;
                author = "Andrea Steelman";
            }
            else if (productCode.equalsIgnoreCase("jsps"))
            {
                 
                description = "Murach's Java Servlets and JSP";
                price = 49.50;
                author = "Andrea Steelman";
            }
            else if (productCode.equalsIgnoreCase("mcb2"))
            {
                 
                description = "Murach's Mainframe COBOL";
                price = 59.50;
                author = "Mike Murach";
            }
             Book b = new Book(productCode, description, price, author);
            p = b; // set Product object equal to the Book object
        }
        else if (productCode.equalsIgnoreCase("txtpd"))
        {
            Software s = new Software("txtpd", "TextPad", 27.00, "4.7.3");
            p = s; // set Product object equal to the Software object
        }
        else if (productCode.equalsIgnoreCase("wrdpd"))
		{
			Software s = new Software("wrdpd", "WordPad", 37.00, "6.3.3");
			p = s; // set Product object equal to the Software object
        }
        return p;
    }
}