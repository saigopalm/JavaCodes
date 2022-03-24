class TestSearcher{
public static void main(String args[]){
ArraySearcher array = null;
//need to pass the arguments in main
int bound = 0;
int key = 0;
try{
try{
if(args.length != 2){

throw new IllegalArgumentException();

}
}catch(IllegalArgumentException e){
System.out.println("Required to pass altleat one number as argument(max: 2)\n (Taking the first argument passed if available for key to search and the second for bound)");

}

if(args.length != 1){
bound = Integer.parseInt(args[1]);
array = new ArraySearcher(bound);
}
else{
array = new ArraySearcher();
}


System.out.println("Before sorting: \n"+array);
array.getSorted();
System.out.println("After sorting first 10 elements\n"+array);

key = Integer.parseInt(args[0]);
int pos = array.Search(key);//searching for key
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
array = null;//clearing array
System.gc();
}
}//main closes

}//class closes