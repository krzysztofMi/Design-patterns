package iterator;

import lombok.Data;

import java.util.ArrayList;
import java.util.Spliterator;
import java.util.function.Consumer;

@Data
public class Collection<T>{
    private T[] array;
    private int size;

    public Collection(T[] array){
        this.array = array;
        this.size = array.length;
    }

    public Iterator<T> iterator() {
        Iterator<T> it = new Iterator<T>() {
            private int currentIndex;

            @Override
            public boolean hasNext() {
                return currentIndex < size && array[currentIndex] != null;
            }

            @Override
            public T next() {
                return array[currentIndex++];
            }
        };
        return it;
    }

}
