public class StackArray<T> {



private T[] array;

private int position = 0;


public StackArray() {

array = (T[]) new Object[10];

}


public T push(T element){

if (array.length == position){

//ensure capacity

}

else{

array[position] = element;


}

}


//pop


//peek


public int size(){

return position;

}


public boolean isEmpty(){

return (size() == 0);

}

}