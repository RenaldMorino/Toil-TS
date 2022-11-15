package com.wono.Utils.Iterators;

import java.util.ArrayList;
import java.util.Iterator;

import com.wono.Models.Toilet;

/**
 * The ToiletIterator class implements the Iterator interface and provides an implementation for the
 * hasNext() and next() methods
 */
public class ToiletIterator implements Iterator {
  private ArrayList<Toilet> toilets;
  private int position = 0;

  // A constructor.
  public ToiletIterator(ArrayList<Toilet> pToilet) {
    this.toilets = pToilet;
  }

  /**
   * If the position is greater than or equal to the size of the toilets array, or the position is
   * null, return false, otherwise return true.
   * 
   * @return The position of the toilet in the array.
   */
  @Override
  public boolean hasNext() {
    return !(position >= toilets.size() || toilets.get(position) == null);
  }

  /**
   * It returns the next element in the list.
   * 
   * @return The next object in the list.
   */
  @Override
  public Object next() {
    return toilets.get(position++);
  }
}
