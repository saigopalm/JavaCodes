import java.text.NumberFormat;
import java.util.*;
public class Product
{
    private String code;
    private String description;
    private double price;
    public static int count = 0;

    public Product()
    {
        this("", "", 0.0);
        
    }
    //3 Argument constructor for Product
    public Product(String code, String description, double price){
    this.code = code;
    this.description = description;
    this.price = price;
    ++count;
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
               "Price:       " + this.getFormattedPrice()+"\n";
    }

    public static int getCount()
    {
        return count;
    }
    public static Comparator<Product> getPriceComparator(){
    return new Comparator<Product>(){//anonymous class
    public int compare(Product p1, Product p2){
    double comp = p1.price - p2.price;
    if(comp<0)
    return -1;
    else if(comp>0)
    return 1;
    else
    return 0;
    }
    };
    }
    
   public static class InnerClass implements Comparator<Product>{//static inner class to be called in getCodeComparator()
    public int compare(Product p1, Product p2){
    return (p1.code).compareTo(p2.code);
  }
}
    public static Comparator<Product> getCodeComparator(){//static method so inner class should be static
    return new InnerClass();
    }
    
    public static Comparator<Product> getPriceComparatorDescending(){
     
    class LocalInnerClass implements Comparator<Product>{//local inner class within static method
    public int compare(Product p1, Product p2){
     double comp = p2.price - p1.price;
    if(comp<0)
    return -1;
    else if(comp>0)
    return 1;
    else
    return 0;
    }
}
    LocalInnerClass ic = new LocalInnerClass();
    return ic;
    
    
   
    }
}