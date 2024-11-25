import java.util.Iterator;

import it.unibo.inner.api.IterableWithPolicy;
import it.unibo.inner.api.Predicate;

public class UseIterableWithPolicy<T> implements IterableWithPolicy<T>{

    private T[] array;

    public UseIterableWithPolicy(final T[] array){
        this.array = array;
    }

    @Override
    public void setIterationPolicy(Predicate<T> filter) {
        return;        
    }

    @Override
    public Iterator<T> iterator() {
        return null;
    }
    
}