import java.util.*;
public class ProductAppArrayTag
{

public static void main(String args[])
{

String productCode;
String op;
int i = 0;
int j;
String tag;
Product productArray[] = new Product[10];
Scanner sc = new Scanner(System.in);
do
{//do while loop to keep taking input until done

productCode = Validator.getString("Enter the product code: ");
Product p = ProductDB.getProduct(productCode);
if(p != null){// checking if a valid product code was entered
 productArray[i] = p;
 for(j=0; j<i; j++){
    if(productArray[j].compareTo(p)==0){
    p = productArray[j];
    }
    }
    productArray[i] = p;//Storing the product into the array
 i++;
}
else
{//prnting appropriate message when product not found
System.out.println("No product match the product Id");
}

System.out.println("Enter tag(- to exit): ");
tag = "";
while(!tag.equals("-")){
if(tag!="")
p.setTag(tag);
tag = sc.nextLine();
}

do{
op =Validator.getString("continue(y/n)?");//whether user wants to continue
}while(!(op.equalsIgnoreCase("y")||op.equalsIgnoreCase("n")));
}while(op.equals("y"));
System.out.println("=================");
System.out.println("Order in which they were entered");
int count = Product.getCount();//retrieving static count variable to use in array
for(i = 0; i<count; i++){
System.out.println(productArray[i]);
System.out.println();
}
System.out.println("Count: "+count);

//sorting array
Arrays.sort(productArray, 0, count);
System.out.println("=====================");
System.out.println();
if(count!=0){
System.out.println("Printing sorted array: ");
}
for(i = 0; i<count; i++){
System.out.println(productArray[i]);
System.out.println();
}

return;
}//main() closes
}//class closes