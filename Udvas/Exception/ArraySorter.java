import java.util.*;
class ArraySorter{
int array[]= new int[20];
public ArraySorter(){
this(200);
}
public ArraySorter(int max){
Random randomNumber = new Random();
for(int i=0; i<20; i++)
array[i] = randomNumber.nextInt(max);
}

public String toString(){
String output= "";
for(int i=0; i<20; i++){
if(i==10){
output = output+"\n";}

output = output+array[i]+" ";
}
return output;

}

public void getSorted() throws IllegalArgumentException, ArrayIndexOutOfBoundsException{
Arrays.sort(array, 0, 10);
}
}