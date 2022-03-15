class TestSearcher{
public static void main(String args[]){
ArraySearcher array = null;
try{
try{
if(args.length != 2){
throw new IllegalArgumentException();
}
}catch(IllegalArgumentException e){
System.out.println("Required to pass exactly one number as argument\n (Taking the first argument passed if available for bound and the second for key to search)");
}

int bound = Integer.parseInt(args[0]);
array = new ArraySearcher(bound);



System.out.println("Before sorting: \n"+array);
array.getSorted();
System.out.println("After sorting first 10 elements\n"+array);

int key = Integer.parseInt(args[1]);
int pos = array.Search(key);
System.out.println("Completely sorted array: \n"+array);
if(pos>=0)
System.out.println("Key: "+key+" found at position: "+pos);
else
System.out.println("Key: "+key+" Not found in array");
}
catch(NumberFormatException e){
System.out.println("Atleast one of the passed argument cannot be converted to Integer");
}

catch(IllegalArgumentException e){
System.out.println("The entered number must be positive ");
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