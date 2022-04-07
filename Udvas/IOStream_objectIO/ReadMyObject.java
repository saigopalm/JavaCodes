import java.io.*;
public class ReadMyObject{
ObjectInputStream in = null;
public ReadMyObject(String name)throws IOException{
in = new ObjectInputStream(new FileInputStream(name));
}
public Invoice read()throws IOException, ClassNotFoundException{
Invoice res = (Invoice)in.readObject();
return res;
}

public void close()throws IOException{
in.close();
}
}