package com.wono.Utils.Iterators;

import java.util.ArrayList;
import java.util.Iterator;
import com.wono.Models.HandDryer;

/**
 * The HandDryerIterator class implements the Iterator interface and is used to iterate through the
 * handDryers array
 */
public class HandDryerIterator implements Iterator<HandDryer> {
    private ArrayList<HandDryer> handDryers;
    private int position = 0;

    // A constructor.
    public HandDryerIterator(ArrayList<HandDryer> pHandDryers) {
      this.handDryers = pHandDryers;
    }

    /**
     * If the position is greater than or equal to the size of the handDryers array, or the handDryers
     * array at the position is null, then return false, otherwise return true.
     * 
     * @return The method is returning a boolean value.
     */
    @Override
    public boolean hasNext() {
        return !(position >= handDryers.size() || handDryers.get(position) == null);
    }

    /**
     * The next() function returns the next object in the handDryers array
     * 
     * @return The next object in the list.
     */
    @Override
    public HandDryer next() {
        return handDryers.get(position++);
    }
}
