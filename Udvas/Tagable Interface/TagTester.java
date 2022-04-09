import java.util.Scanner;
public class TagTester{
public static void main(String args[]){
String productCode = Validator.getString("Enter the product code: ");
Product p = ProductDB.getProduct(productCode);
String tag;
String op;
//dont want to make changes to Validator but want to read the entire line for tag
Scanner sc = new Scanner(System.in);
if(p==null){//prnting appropriate message when product not found
System.out.println("No product match the product Id");
return;
}
do{
System.out.print("Enter tag: ");
tag = sc.nextLine();
p.setTag(tag);//setting tag
do{
op =Validator.getString("continue(y/n)?");//whether user wants to continue
}while(!(op.equalsIgnoreCase("y")||op.equalsIgnoreCase("n")));
}while(op.equals("y"));

System.out.println(p.toString());
System.out.print("Tags: "+p.getTag());
}//main closes
}