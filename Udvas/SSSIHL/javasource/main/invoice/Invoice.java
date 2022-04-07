package main.invoice;
import java.util.*;

public class Invoice{
String invoiceNumber;
Date date;
LinkedList<ProductOrder> orderList;
double total;

public Invoice(String num, LinkedList<ProductOrder> list){
invoiceNumber = num;
orderList = list;
date = new Date();
for(ProductOrder element: orderList){
total += element.total;
}
}

public String toString(){
String str= "";
for (ProductOrder element: orderList){
str = str+element.toString();
}
return "\nInvoice Number: "+ invoiceNumber+ "\n"+ str + "\nGrand total: "+total+"\ndate: "+date+"\n";
}
}