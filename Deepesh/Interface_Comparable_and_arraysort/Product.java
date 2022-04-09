import java.text.NumberFormat;

public class Product implements Comparable<Product>, Tagable
{
    private String code;
    private String description;
    private double price;
    private String tag;
    private static int count = 0;

    public Product()
    {
        code = "";
        description = "";
        price = 0;
        tag = "";
        count++;
    }
    
     
    public Product(String c, String d, double pri) {
        this();
        code = c;
        description = d;
        price = pri;
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

    public static int getCount() {
        return count; 
    }

    public String getFormattedPrice()
    {
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        return currency.format(price);
    }

    public String toString()
    {
        return " Code:        " + code + "\n" +
               " Description: " + description + "\n" +
               " Price:       " + this.getFormattedPrice() + "\n"+
               " Tag :        " + tag + "\n";
    }

    public int compareTo(Product userProduct) {
        return code.compareTo(userProduct.code);
    }

    public String getTags() {
        return this.tag;
    }

    public void setTags(String userTag) {
        if(!"".equals(this.tag))
            this.tag += ",";
        this.tag += userTag;
    }
}