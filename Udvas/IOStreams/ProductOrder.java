public class ProductOrder implements Comparable<ProductOrder>{
Product product;
int quantity;
double total;
static int orderObjectCount=0;

public ProductOrder(String code, int q)throws NullPointerException{
product = ProductDB.getProduct(code);
quantity = q;
total = product.getPrice()*quantity;
orderObjectCount++;
} 

public int compareTo(ProductOrder p2){
if(this.total < p2.total)
return -1;
else if(this.total > p2.total)
return 1;
else
return 0;
}

public String toString(){
return product.toString()+"\ntotal: "+total+"\nquantity: "+quantity+"\n";
}
}