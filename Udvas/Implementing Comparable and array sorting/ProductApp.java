
public class ProductApp
{

public static void main(String args[])
{

String productCode;
String op;
do
{//do while loop to keep taking input until done

productCode = Validator.getString("Enter the product code: ");
Product p = ProductDB.getProduct(productCode);
if(p != null){// checking if a valid product code was entered
 System.out.println(p.toString());
    System.out.println("Product Count so far: "+Product.getCount());
}
else
{//prnting appropriate message when product not found
System.out.println("No product match the product Id");
}
op =Validator.getString("continue(y/n)?");//whether user wants to continue
}while(op.equals("y"));
return;
}//main() closes
}//class closes