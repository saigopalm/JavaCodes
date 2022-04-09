import java.util.Arrays;
public class ProductAppArray
{

public static void main(String args[])
{

String productCode;
String op;
int i = 0;
Product productArray[] = new Product[10];
do
{//do while loop to keep taking input until done

productCode = Validator.getString("Enter the product code: ");
Product p = ProductDB.getProduct(productCode);
if(p != null){// checking if a valid product code was entered
 productArray[i] = p;//Storing the product into the array
 i++;
}
else
{//prnting appropriate message when product not found
System.out.println("No product match the product Id");
}
do{
op =Validator.getString("continue(y/n)?");//whether user wants to continue
}while(!(op.equalsIgnoreCase("y")||op.equalsIgnoreCase("n")));
}while(op.equals("y"));

int count = Product.getCount();//retrieving static count variable to use in array
for(i = 0; i<count; i++){
System.out.println(productArray[i].toString());
}
System.out.println("Count: "+count);

//sorting array
Arrays.sort(productArray, 0, count);
System.out.println("Printing sorted array: ");
for(i = 0; i<count; i++){
System.out.println(productArray[i].toString());
}

return;
}//main() closes
}//class closes