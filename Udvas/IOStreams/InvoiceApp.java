import java.util.*;
import java.io.*;
public class InvoiceApp{
public static void main(String args[])throws IOException{
System.out.println("Reading product code and quantity from file:");
String code;
int quantity;
LinkedList<ProductOrder> orderList = new LinkedList<ProductOrder>();
ReadMyFile fp = new ReadMyFile("ProductCodes.txt");
Random rand = new Random();
while(true){
code = fp.readNextCode();
if(code == null)
break;
quantity = rand.nextInt(20);
try{
ProductOrder productOrder = new ProductOrder(code, quantity);
orderList.add(productOrder);}
catch(NullPointerException e){
System.out.println("Product Not found!");
}
}
fp.close();
Collections.sort(orderList);
String num= "";

for(int i= 0; i<10; i++){
num = num + Integer.toString(rand.nextInt(10));
}
Invoice invoice = new Invoice(num, orderList);
System.out.println(invoice); 
}
}