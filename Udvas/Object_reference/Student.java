
public class Student{
private int marks = 0;
private String comment = null;
private int roll = 0;

public Student(){
roll = 0;
marks = 0;
comment = null;
}

public Student(int rollnum, int a, String b){
roll = rollnum;
marks = a;
comment = b;
}

public void setComment(String b){
if(!comment.equals(""))
comment += ",";
comment+=b;
}

public String toString(){
return "roll number : "+roll+"\nmarks : "+marks+"\ncomments: "+comment+"\n";
}
}