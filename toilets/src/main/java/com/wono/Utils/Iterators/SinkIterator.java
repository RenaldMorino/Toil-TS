package com.wono.Utils.Iterators;

import java.util.ArrayList;
import java.util.Iterator;

import com.wono.Models.Sink;

/**
 * It implements the Iterator interface and returns the next sink in the list
 */
public class SinkIterator implements Iterator {
  private ArrayList<Sink> sinks;
  private int position = 0;

  // A constructor.
  public SinkIterator(ArrayList<Sink> pSinks) {
    this.sinks = pSinks;
  }

  /**
   * If the position is greater than or equal to the size of the sinks array, or the sink at the
   * current position is null, return false, otherwise return true.
   * 
   * @return The boolean value of the expression.
   */
  @Override
  public boolean hasNext() {
    return !(position >= sinks.size() || sinks.get(position) == null);
  }

  /**
   * It returns the next sink in the list.
   * 
   * @return The next sink in the list.
   */
  @Override
  public Object next() {
    return sinks.get(position++);
  }
}
