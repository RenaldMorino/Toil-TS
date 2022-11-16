package com.wono.Utils.Iterators;

import java.util.ArrayList;
import java.util.Iterator;

import com.wono.Models.Urinal;

/**
 * It's an iterator for the urinals list
 */
public class UrinalIterator implements Iterator<Urinal> {
  private ArrayList<Urinal> urinals;
  private int position = 0;

  // A constructor.
  public UrinalIterator(ArrayList<Urinal> pUrinal) {
    this.urinals = pUrinal;
  }

  /**
   * If the position is greater than or equal to the size of the urinals list, or the urinal at the
   * current position is null, then return false, otherwise return true.
   * 
   * @return The boolean value of the statement.
   */
  @Override
  public boolean hasNext() {
    return !(position >= urinals.size() || urinals.get(position) == null);
  }

  /**
   * It returns the next urinal in the list.
   * 
   * @return The next urinal in the list.
   */
  @Override
  public Urinal next() {
    return urinals.get(position++);
  }
}
