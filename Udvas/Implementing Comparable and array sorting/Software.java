public class Software extends Product{
private String version;
public Software(){
version = "";
}
//Accepting 4 arguments in constructor
public Software(String code, String description, double price, String version){
super(code, description, price);
this.version = version;
}
public void setVersion(String version){
this.version = version;
}

public String getVersion(){
return version;
}

public String toString(){
    return super.toString()+"Version:     "+this.version;
}
}