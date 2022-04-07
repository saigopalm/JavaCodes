import java.io.*;
public class StoreMyObject{
ObjectOutputStream out = null;
public StoreMyObject(String name)throws IOException{
out = new ObjectOutputStream(new FileOutputStream(name));
}
public void store(Invoice inv)throws IOException{
out.writeObject(inv);
}

public void close()throws IOException{
out.close();
}
}