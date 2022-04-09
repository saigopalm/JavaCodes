public class ProductApp {
	public static void main(String[] args) {
		Product p = null;
		Product array[] = new Product[10];
		int i = 0;
    	String option = "y";
	    // public int compareToIgnoreCase(String str) - returns 0 if strings are equal
	
		while( option.compareToIgnoreCase("y") == 0) {
	        
		    String code = Validator1.getString("\n Enter the Code of the product : ");
		    p = ProductDB.getProduct(code);
		    if(p != null) {
				array[i] = p;
		        i++;
		
                if(i == 10) {
			        System.out.println("\n Memory is full! :( " );					
                    break;
                }
            }
		    else System.out.println("\n No product matches this product code!");

            System.out.println("\n Product Count : " + Product.getCount());
       	    option = Validator1.getString("\n Do you want to enter some more product details (y / n) ? "); 
    	}
        
		for(i = 0; i < 10 && array[i] != null; ) {
            p = array[i];
            System.out.println("\n Product " + (++i) + " Details :\n");
			System.out.println(p);
        }				
   }
}