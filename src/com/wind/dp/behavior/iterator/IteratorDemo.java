package com.wind.dp.behavior.iterator;

import com.wind.dp.behavior.iterator.core.Iterator;
import com.wind.dp.behavior.iterator.core.NameRepository;

/**
 * @author wind
 */
public class IteratorDemo {

    public static void main(String[] args) {

        NameRepository nameRepository = new NameRepository();
        Iterator iterator = nameRepository.getIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
