import java.util.*;

public class PfCalculator{
 
public PfCalculator(){
}
public static double evaluate(LinkedList<String> queue)throws RuntimeException{
LinkedList<Double> stack = new LinkedList<Double>();
double d1, d2, d3;
d1 = 0;
d2 = 0;
d3 = 0;
if(queue.isEmpty()){
System.out.println("Empty queue");
return 0;
}
for(String queueElement: queue){
try{
d1 = Double.parseDouble(queueElement);
stack.push(d1);
}
catch(NumberFormatException e){
d2 = stack.pop();
d3 = stack.pop();
if( queueElement.equals("+")){
stack.push(d2+d3);}
else if( queueElement.equals("-")){
stack.push(d3-d2);}
else if( queueElement.equals("/")){
if(d2 == 0)
throw new ArithmeticException("Division by 0 attempted!");
stack.push(d3/d2);}
else if( queueElement.equals("*")){
stack.push(d2*d3);}
else if( queueElement.equals("^")){
if(d3 == 0 && d2 < 0)
throw new ArithmeticException("Division by 0 attempted!");
stack.push(Math.pow(d3,d2));}
else if( queueElement.equals("%")){
stack.push(d3%d2);}
else{
System.out.println("Invalid element in queue : "+e.getMessage());
}

}
}
if(stack.size() != 1){
throw new NoSuchElementException("Non empty stack at the end!");
}
else{
return stack.pop();
}
//return 0;
}
}
