package main.products;
import main.products.interfaces.Tagable;
import java.text.NumberFormat;


public class Product implements Comparable<Product>, Tagable
{
    private String code;
    private String description;
    private double price;
    public static int count = 0;
    private String tag = "";
    public Product()
    {
        code = "";
        description = "";
        price = 0;
        ++count;
    }
    //3 Argument constructor for Product
    public Product(String code, String description, double price){
    this();
    this.code = code;
    this.description = description;
    this.price = price;
    }
    
    public void setTag(String s){
    if (tag == ""){
    tag = s;
    }
    else{
    tag = tag+", "+s;
    }
    }
    
    public String getTag(){
    if(tag == ""){
    return "no tag";
    }
    return tag;
    }
    
   public int compareTo(Product p){
    return (this.code).compareTo(p.code);
    }

    public void setCode(String code)
    {
        this.code = code;
    }

    public String getCode(){
        return code;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    public String getDescription()
    {
        return description;
    }

    public void setPrice(double price)
    {
        this.price = price;
    }

    public double getPrice()
    {
        return price;
    }

    public String getFormattedPrice()
    {
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        return currency.format(price);
    }

    public String toString()
    {
        return "Code:        " + code + "\n" +
               "Description: " + description + "\n" +
               "Price:       " + this.getFormattedPrice()+"\n"+
               "Tags:        "+this.getTag()+"\n";
    }

    public static int getCount()
    {
        return count;
    }
}
