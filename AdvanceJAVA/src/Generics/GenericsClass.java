package Generics;
public class GenericsClass<E>  {

private Object[] array;
public static final int DEFAULT_SIZE = 15;
private int size = 0;

public GenericsClass(){
    this(DEFAULT_SIZE);
}

public GenericsClass(int size){
    array = new Object[size];
}

public void add(E val){
    checkSize();
    array[size++] = val;
}

public E remove(int ind){
    if(ind>=size || ind < 0 ){throw new RuntimeException("Index does not exist");}
    E val = (E) array[ind];
    array[ind] = null;
    --size;
    compress();
    return val;
}

public E get(int ind){
    if(ind > size){throw new RuntimeException("Index does not exist");}
    E element = (E) array[ind];
    return element;
}

private void checkSize(){
    if(size < array.length){ return;}
    resize();
}

public int getSize(){
    return this.size;
}



private void resize(){
    Object[] temp = new Object[array.length*2];
    copy(array,temp);
    array = temp;
}

private void copy(Object[] source, Object[] destination){
    if(destination.length< source.length){throw new RuntimeException(source+ " cannot be copied into "+destination);}
    for(int i=0;i<source.length; i++){
    	destination[i] = source[i];
    }
}

private void compress(){
    int count =0;
    for(int i=0;i < size && i<array.length; i++){
        if(array[i]==null){
            ++count;                
        }
        array[i]=array[i+count];
    }
}

public static void main(String[] args) {
	GenericsClass<Integer> A =  new GenericsClass<Integer>();
	A.add(34);
	A.add(76);
	A.add(90);
	A.add(67);
	A.add(45);
	A.remove(1);
	System.out.println(A.get(0)+" "+A.get(1)+" "+A.get(2)+" "+A.get(3));
}
}
