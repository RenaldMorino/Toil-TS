package com.wono.Utils.Iterators;

import java.util.ArrayList;
import java.util.Iterator;
import com.wono.Models.BrownPaperDispenser;

/**
 * This class implements the Iterator interface and is used to iterate through the brownPaperDispensers
 * array
 */
public class BrownPaperDispenserIterator implements Iterator<BrownPaperDispenser> {
    private ArrayList<BrownPaperDispenser> brownPaperDispensers;
    private int position = 0;

    // A constructor.
    public BrownPaperDispenserIterator(ArrayList<BrownPaperDispenser> pBrownPaperDispensers) {
        this.brownPaperDispensers = pBrownPaperDispensers;
    }

    /**
     * This function returns true if the position is less than the size of the brownPaperDispensers
     * array and the brownPaperDispensers array at the position is not null.
     * 
     * @return The boolean value of the statement.
     */
    @Override
    public boolean hasNext() {
        return !(position >= brownPaperDispensers.size()
                || brownPaperDispensers.get(position) == null);
    }

    /**
     * If the position is less than the size of the brownPaperDispensers array, then return the
     * object at the current position and increment the position by one.
     * 
     * @return The next brown paper dispenser in the list.
     */
    @Override
    public BrownPaperDispenser next() {
        return brownPaperDispensers.get(position++);
    }
}
