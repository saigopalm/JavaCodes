import java.util.*;

class TestCalc{
public static void main(String args[]){
try{
LinkedList<String> queue = new LinkedList<String>();
queue = Validator.getStringTokens("Input: ");//tokenising input throgh modified validator method

System.out.println("Output: "+PfCalculator.evaluate(queue));//evaluate method invoked
}
catch(NoSuchElementException e){//handling exceptions
System.out.println("Error (check if input is in postfix notation): "+e.getMessage());
}
catch(ArithmeticException e){
System.out.println("Arithmetic Exception caught: "+e.getMessage());
}
catch(RuntimeException e){
System.out.println("Caught an exception: "+e.getMessage());
}
}
}