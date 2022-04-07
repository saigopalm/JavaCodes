package main;
import main.invoice.*;
import main.products.*;
import main.products.interfaces.*;
import main.products.db.*;
import main.utility.*;
import java.util.*;
public class InvoiceApp{
public static void main(String args[]){
System.out.println("Enter product code and quantity (enter done to end)");
String code;
int quantity;
LinkedList<ProductOrder> orderList = new LinkedList<ProductOrder>();

while(true){
code = Validator.getString("Product Code: ");
if(code.equals("done"))
break;


quantity = Validator.getInt("Quantity: ");

try{
ProductOrder productOrder = new ProductOrder(code, quantity);
orderList.add(productOrder);}
catch(NullPointerException e){
System.out.println("Product Not found!");
}
}
Collections.sort(orderList);
String num= "";
Random rand = new Random();
for(int i= 0; i<10; i++){
num = num + Integer.toString(rand.nextInt(10));
}
Invoice invoice = new Invoice(num, orderList);
System.out.println(invoice); 
}
}