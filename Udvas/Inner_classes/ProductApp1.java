import java.util.*;
public class ProductApp1
{

public static void main(String args[])
{

String productCode;
String op;
int i = 0;
List<Product> list = new LinkedList<Product>();
do
{//do while loop to keep taking input until done

productCode = Validator.getString("Enter the product code: ");
Product p = ProductDB.getProduct(productCode);
if(p != null){// checking if a valid product code was entered
 list.add(p);//Storing the product into the collection
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
for(Product element : list){
System.out.println(element);
}
System.out.println("Count: "+count);

System.out.println("\n======Sorting based on price ascending=========");
Collections.sort(list, Product.getPriceComparator());
for(Product element : list){
System.out.println(element+"\n");
}
System.out.println();
System.out.println("\n======Sorting based on code=======");
Collections.sort(list, Product.getCodeComparator());
for(Product element : list){
System.out.println(element+"\n");
}
System.out.println();

System.out.println("=======Sorting based on price descending========");
Collections.sort(list, Product.getPriceComparatorDescending());
for(Product element : list){
System.out.println(element+"\n");
}
System.out.println();
return;
}//main() closes
}//class closes