package main.products;
public class Book extends Product{
private String author;
public Book(){
 author= "";
}
//Accepting 4 arguments in constructor
public Book(String code, String description, double price, String author){
super(code, description, price);
this.author = author;
}
public void setAuthor(String author){
this.author = author;
}

public String getAuthor(){
return author;
}

public String toString(){
    return super.toString()+"Author:      "+this.author;
}
}
