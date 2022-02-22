public class Student_run{
public static void main(String args[]){
//creating an instance of Student
Student student1 = new Student(1234, 67, "");
//adding comments
student1.setComment("Very Bright");
//creating new instance
Student student2;
student2 = student1;
student1.setComment("Follows lectures");
student2.setComment("This is new");
System.out.println("Student 1 details: ");
System.out.print(student1);
System.out.println("Student 2 details: ");
System.out.print(student2);
}
}