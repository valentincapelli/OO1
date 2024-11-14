package ar.edu.unlp.objetos.uno.ejercicio21;

import java.util.AbstractCollection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class BagImpl<T> extends AbstractCollection<T> implements Bag<T> {

    Map<T, Integer> elements;

    public BagImpl() {
    	this.elements = new HashMap<>();
        // TODO Completar con la instanciación adecuada
        // this.elements = ....
    }

    @Override
    public boolean add(T element) {
        Integer previousValue = this.elements.get(element);
        if (previousValue == null) {
        	this.elements.put(element, 1);
        } else
        	this.elements.put(element, previousValue + 1);
        return true;
    }

    @Override
    public int occurrencesOf(T element) {
        if (this.elements.containsKey(element)) {
        	return this.elements.get(element);
        }
        return 0;
    }

    @Override
    public void removeOccurrence(T element) {
    	Integer previousValue = this.elements.get(element);
        if (previousValue != null)
        	this.elements.put(element, previousValue - 1);
    }

    @Override
    public void removeAll(T element) {
        this.elements.remove(element);
    }

    @Override
    public int size() {
    	return this.elements.values().stream().mapToInt(Integer::intValue).sum();
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            private Iterator<Map.Entry<T, Integer>> entryIterator = elements.entrySet().iterator();
            private Map.Entry<T, Integer> currentEntry;
            private int remainingCount;

            @Override
            public boolean hasNext() {
                return remainingCount > 0 || entryIterator.hasNext();
            }

            @Override
            public T next() {
                if (remainingCount == 0) {
                    currentEntry = entryIterator.next();
                    remainingCount = currentEntry.getValue();
                }
                remainingCount--;
                return currentEntry.getKey();
            }

            @Override
            public void remove() {
                removeOccurrence(currentEntry.getKey());
            }
        };
    }
}
