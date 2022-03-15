class TestSorter{
public static void main(String args[]){
ArraySorter array = null;
try{
try{
if(args.length != 1){
throw new IllegalArgumentException();
}
}catch(IllegalArgumentException e){
System.out.println("Required to pass exactly one number as argument\n (Taking the first argument passed if available)");
}

int bound = Integer.parseInt(args[0]);
array = new ArraySorter(bound);

System.out.println("Before sorting: \n"+array);
array.getSorted();
System.out.println("After sorting first 10 elements\n"+array);
}
catch(NumberFormatException e){
System.out.println("The passed argument cannot be converted to Integer");
}

catch(IllegalArgumentException e){
System.out.println("The entered number must be positive"+ e.getMessage());
e.printStackTrace();
} 
catch(ArrayIndexOutOfBoundsException e){
System.out.println("Handling another exception from getSorted method: Illegal index.. array element not present");
}
catch(Exception e){
System.out.println("Exception Caught: "+e.getMessage());
}

finally{
System.out.println("Array disposed in finally");
array = null;
System.gc();
}
}//main closes

}//class closes