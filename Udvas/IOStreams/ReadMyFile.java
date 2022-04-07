import java.io.*;
public class ReadMyFile {
//Invoice app uses this to read the text file provided
//Constructor accpeting file location/name
//readnext
//close

BufferedReader in = null;


public ReadMyFile(String name) throws IOException{
File file = new File(name);
in = new BufferedReader(new FileReader(file));
}

public String readNextCode()throws IOException{
String code = in.readLine();
return code;
}


public void close()throws IOException{
in.close();
}
}